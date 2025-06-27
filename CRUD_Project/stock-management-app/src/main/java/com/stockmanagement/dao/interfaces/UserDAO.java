package com.stockmanagement.dao.interfaces;

import com.stockmanagement.models.interfaces.User;

import java.util.List;
import java.util.Optional;

/**
 * UserDAO interface for Stock Management System
 * Defines data access methods related to User entity.
 */
public interface UserDAO {

    // Create
    boolean registerUser(User user);

    // Read
    Optional<User> getUserById(Long userId);
    Optional<User> getUserByEmail(String email);
    Optional<User> getUserByPhoneNumber(String phoneNo);
    List<User> getAllUsers();

    // Update
    boolean updateUserProfile(User user);
    boolean changeUserPassword(Long userId, String oldPassword, String newPassword);

    // Delete or deactivate
    boolean deactivateUser(Long userId);
    boolean activateUser(Long userId);

    // Authentication and Authorization
    Optional<User> authenticateByEmail(String email, String password);
    Optional<User> authenticateByPhone(String phoneNo, String password);

    // Account Locking
    boolean lockUserAccount(Long userId);
    boolean unlockUserAccount(Long userId);
    boolean isUserAccountLocked(Long userId);

    // Password Recovery
    boolean sendPasswordRecoveryOTP(Long userId);
    boolean verifyPasswordRecoveryOTP(Long userId, String otp);
    boolean verifyUserIdentityForPasswordRecovery(Long userId, String secretThing, String address, LocalDate dateOfBirth);

    // Utility
    List<User> getUsersLoggedInToday();
    boolean isEmailExists(String email);
    boolean isPhoneNumberExists(String phoneNo);
}
