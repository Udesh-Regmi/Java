package com.stockmanagement;

import com.stockmanagement.dbconfig.DBConnect;
import java.util.logging.Logger;

/**
 * Main Application Class for Stock Management System
 */
public class Application {
    
    private static final Logger LOGGER = Logger.getLogger(Application.class.getName());
    
    public static void main(String[] args) {
        LOGGER.info("Starting Stock Management Application...");
        
        // Test database connection
        DBConnect dbConnect = DBConnect.getInstance();
        if (dbConnect.testConnection()) {
            LOGGER.info("Database connection successful!");
            LOGGER.info(dbConnect.getConnectionStatus());
        } else {
            LOGGER.severe("Database connection failed!");
            return;
        }
        
        LOGGER.info("Stock Management Application started successfully!");
    }
}
