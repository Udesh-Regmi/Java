package com.stockmanagement.dao.impl;

import com.stockmanagement.dao.interfaces.UserDAO;
import com.stockmanagement.models.interfaces.User;
import com.stockmanagement.models.UserImpl; // Your concrete User class

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * UserDAOImpl class for Stock Management System using JDBC
 */
public class UserDAOImpl implements UserDAO {

    private final DataSource dataSource;

    public UserDAOImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public boolean registerUser(User user) {
        String sql = "INSERT INTO users (first_name, last_name, email, phone_no, date_of_birth, secret_thing, address, password, created_at, updated_at, active) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, user.getFirstName());
            ps.setString(2, user.getLastName());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getPhoneNo());
            ps.setDate(5, Date.valueOf(user.getDateOfBirth()));
            ps.setString(6, user.getSecretThing());
            ps.setString(7, user.getAddress());

            // Password hashing must be done before saving
            ps.setString(8, user.getPassword());

            LocalDateTime now = LocalDateTime.now();
            ps.setTimestamp(9, Timestamp.valueOf(now));
            ps.setTimestamp(10, Timestamp.valueOf(now));
            ps.setBoolean(11, user.isActive());

            int affectedRows = ps.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Creating user failed, no rows affected.");
            }

            // Optionally, retrieve generated ID
            try (ResultSet generatedKeys = ps.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    user.setUserId(generatedKeys.getLong(1));
                } else {
                    throw new SQLException("Creating user failed, no ID obtained.");
                }
            }
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            // Proper logging and error handling should be here
            return false;
        }
    }

    @Override
    public Optional<User> getUserById(Long userId) {
        String sql = "SELECT * FROM users WHERE user_id = ?";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setLong(1, userId);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return Optional.of(mapResultSetToUser(rs));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public Optional<User> getUserByEmail(String email) {
        String sql = "SELECT * FROM users WHERE email = ?";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, email);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return Optional.of(mapResultSetToUser(rs));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public Optional<User> getUserByPhoneNumber(String phoneNo) {
        String sql = "SELECT * FROM users WHERE phone_no = ?";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, phoneNo);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return Optional.of(mapResultSetToUser(rs));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM users";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                users.add(mapResultSetToUser(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public boolean updateUserProfile(User user) {
        String sql = "UPDATE users SET first_name = ?, last_name = ?, email = ?, phone_no = ?, date_of_birth = ?, secret_thing = ?, address = ?, updated_at = ?, active = ? WHERE user_id = ?";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, user.getFirstName());
            ps.setString(2, user.getLastName());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getPhoneNo());
            ps.setDate(5, Date.valueOf(user.getDateOfBirth()));
            ps.setString(6, user.getSecretThing());
            ps.setString(7, user.getAddress());
            ps.setTimestamp(8, Timestamp.valueOf(LocalDateTime.now()));
            ps.setBoolean(9, user.isActive());
            ps.setLong(10, user.getUserId());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean changeUserPassword(Long userId, String oldPassword, String newPassword) {
        // You must verify the old password first (fetch the user, verify hash)
        Optional<User> userOpt = getUserById(userId);
        if (userOpt.isEmpty()) {
            return false;
        }
        User user = userOpt.get();

        // TODO: verify oldPassword with hashed password in user.getPassword()
        boolean oldPasswordMatches = verifyPassword(oldPassword, user.getPassword());
        if (!oldPasswordMatches) {
            return false;
        }

        String hashedNewPassword = hashPassword(newPassword);

        String sql = "UPDATE users SET password = ?, updated_at = ? WHERE user_id = ?";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, hashedNewPassword);
            ps.setTimestamp(2, Timestamp.valueOf(LocalDateTime.now()));
            ps.setLong(3, userId);

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deactivateUser(Long userId) {
        return setUserActiveStatus(userId, false);
    }

    @Override
    public boolean activateUser(Long userId) {
        return setUserActiveStatus(userId, true);
    }

    private boolean setUserActiveStatus(Long userId, boolean active) {
        String sql = "UPDATE users SET active = ?, updated_at = ? WHERE user_id = ?";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setBoolean(1, active);
            ps.setTimestamp(2, Timestamp.valueOf(LocalDateTime.now()));
            ps.setLong(3, userId);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Optional<User> authenticateByEmail(String email, String password) {
        Optional<User> userOpt = getUserByEmail(email);
        if (userOpt.isEmpty()) {
            return Optional.empty();
        }
        User user = userOpt.get();

        if (verifyPassword(password, user.getPassword()) && user.isActive() && !isUserAccountLocked(user.getUserId())) {
            return Optional.of(user);
        }
        return Optional.empty();
    }

    @Override
    public Optional<User> authenticateByPhone(String phoneNo, String password) {
        Optional<User> userOpt = getUserByPhoneNumber(phoneNo);
        if (userOpt.isEmpty()) {
            return Optional.empty();
        }
        User user = userOpt.get();

        if (verifyPassword(password, user.getPassword()) && user.isActive() && !isUserAccountLocked(user.getUserId())) {
            return Optional.of(user);
        }
        return Optional.empty();
    }

    @Override
    public boolean lockUserAccount(Long userId) {
        return setAccountLockStatus(userId, true);
    }

    @Override
    public boolean unlockUserAccount(Long userId) {
        return setAccountLockStatus(userId, false);
    }

    @Override
    public boolean isUserAccountLocked(Long userId) {
        String sql = "SELECT account_locked FROM users WHERE user_id = ?";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setLong(1, userId);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getBoolean("account_locked");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    private boolean setAccountLockStatus(Long userId, boolean locked) {
        String sql = "UPDATE users SET account_locked = ?, updated_at = ? WHERE user_id = ?";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setBoolean(1, locked);
            ps.setTimestamp(2, Timestamp.valueOf(LocalDateTime.now()));
            ps.setLong(3, userId);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Stub implementations for password recovery - expand as needed
    @Override
    public boolean sendPasswordRecoveryOTP(Long userId) {
        // Generate OTP, save it securely (e.g., in DB), and send via email/SMS
        // This is out of scope for a simple DAO - typically handled by service layer
        return false;
    }

    @Override
    public boolean verifyPasswordRecoveryOTP(Long userId, String otp) {
        // Validate OTP from database
        return false;
    }

    @Override
    public boolean verifyUserIdentityForPasswordRecovery(Long userId, String secretThing, String address, LocalDate dateOfBirth) {
        Optional<User> userOpt = getUserById(userId);
        if (userOpt.isEmpty()) return false;
        User user = userOpt.get();

        return user.getSecretThing().equals(secretThing)
                && user.getAddress().equals(address)
                && user.getDateOfBirth().equals(dateOfBirth);
    }

    @Override
    public List<User> getUsersLoggedInToday() {
        // This requires a login audit table to track login timestamps
        // Not implemented here - return empty list
        return new ArrayList<>();
    }

    @Override
    public boolean isEmailExists(String email) {
        return getUserByEmail(email).isPresent();
    }

    @Override
    public boolean isPhoneNumberExists(String phoneNo) {
        return getUserByPhoneNumber(phoneNo).isPresent();
    }

    /**
     * Helper method to map a ResultSet row to a User object
     */
    private User mapResultSetToUser(ResultSet rs) throws SQLException {
        UserDAOImpl user = new UserDAOImpl();
        user.setUserId(rs.getLong("user_id"));
        user.setFirstName(rs.getString("first_name"));
        user.setLastName(rs.getString("last_name"));
        user.setEmail(rs.getString("email"));
        user.setPhoneNo(rs.getString("phone_no"));
        user.setDateOfBirth(rs.getDate("date_of_birth").toLocalDate());
        user.setSecretThing(rs.getString("secret_thing"));
        user.setAddress(rs.getString("address"));
        user.setPassword(rs.getString("password"));
        user.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
        user.setUpdatedAt(rs.getTimestamp("updated_at").toLocalDateTime());
        user.setActive(rs.getBoolean("active"));
        // Assuming there's an account_locked boolean column
        // user.setAccountLocked(rs.getBoolean("account_locked")); // if your User model supports this
        return user;
    }

    /**
     * Placeholder for password hashing
     */
    private String hashPassword(String password) {
        // Implement with bcrypt or other hashing library
        return password;
    }

    /**
     * Placeholder for password verification
     */
    private boolean verifyPassword(String rawPassword, String hashedPassword) {
        // Implement with bcrypt or other verification logic
        return rawPassword.equals(hashedPassword);
    }
}
