package com.stockmanagement.models.interfaces;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * User Model Interface for Stock Management System
 * Defines the contract for user-related operations and data structure
 */
public interface User {
    
    // User Properties Getters
    Long getUserId();
    String getFirstName();
    String getLastName();
    String getEmail();
    String getPhoneNo();
    LocalDate getDateOfBirth();
    String getSecretThing();
    String getAddress();
    String getPassword();
    LocalDateTime getCreatedAt();
    LocalDateTime getUpdatedAt();
    boolean isActive();
    
    // User Properties Setters
    void setUserId(Long userId);
    void setFirstName(String firstName);
    void setLastName(String lastName);
    void setEmail(String email);
    void setPhoneNo(String phoneNo);
    void setDateOfBirth(LocalDate dateOfBirth);
    void setSecretThing(String secretThing);
    void setAddress(String address);
    void setPassword(String password);
    void setCreatedAt(LocalDateTime createdAt);
    void setUpdatedAt(LocalDateTime updatedAt);
    void setActive(boolean active);
    
    // User Authentication Methods
    boolean authenticateWithEmail(String email, String password);
    boolean authenticateWithPhone(String phoneNo, String password);
    
    // Password Recovery Methods
    boolean verifyIdentityForPasswordRecovery(String secretThing, String address, LocalDate dateOfBirth);
    boolean sendPasswordRecoveryOTP();
    boolean verifyPasswordRecoveryOTP(String otp);
    boolean changePassword(String newPassword);
    
    // User Registration Methods
    boolean registerUser(String firstName, String lastName, String email, String phoneNo, 
                        LocalDate dateOfBirth, String secretThing, String address, String password);
    
    // User Profile Management Methods
    boolean updateProfile();
    String getFullName();
    boolean isAccountLocked();
    boolean lockAccount();
    boolean unlockAccount();
    
    // Validation Methods
    boolean isValidEmail(String email);
    boolean isValidPhoneNumber(String phoneNo);
    boolean isValidPassword(String password);
    boolean emailExists(String email);
    boolean phoneNumberExists(String phoneNo);
    
    // Utility Methods
    String toString();
    boolean equals(Object obj);
    int hashCode();
    String getFormattedCreationDate();
    String getFormattedUpdateDate();
}
