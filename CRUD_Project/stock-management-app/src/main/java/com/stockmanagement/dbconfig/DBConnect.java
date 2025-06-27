package com.stockmanagement.dbconfig;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Database Connection Manager for Stock Management System
 * Singleton pattern implementation for reusable database connections
 */
public class DBConnect {
    
    private static final Logger LOGGER = Logger.getLogger(DBConnect.class.getName());
    private static DBConnect instance;
    private static Connection connection;
    
    // Database configuration variables
    private String dbHost;
    private String dbPort;
    private String dbName;
    private String dbUsername;
    private String dbPassword;
    private String dbDriver;
    private String connectionUrl;
    private int connectionTimeout;
    
    // Private constructor to prevent instantiation
    private DBConnect() {
        loadConfiguration();
        initializeConnection();
    }
    
    /**
     * Get singleton instance of DBConnect
     * @return DBConnect instance
     */
    public static synchronized DBConnect getInstance() {
        if (instance == null) {
            instance = new DBConnect();
        }
        return instance;
    }
    
    /**
     * Load database configuration from .env file
     */
    private void loadConfiguration() {
        try {
            Dotenv dotenv = Dotenv.configure()
                    .directory("./")
                    .filename(".env")
                    .load();
            
            this.dbHost = dotenv.get("DB_HOST", "localhost");
            this.dbPort = dotenv.get("DB_PORT", "3306");
            this.dbName = dotenv.get("DB_NAME");
            this.dbUsername = dotenv.get("DB_USERNAME");
            this.dbPassword = dotenv.get("DB_PASSWORD");
            this.dbDriver = dotenv.get("DB_DRIVER", "com.mysql.cj.jdbc.Driver");
            this.connectionTimeout = Integer.parseInt(dotenv.get("DB_CONNECTION_TIMEOUT", "30000"));
            
            // Build connection URL
            this.connectionUrl = String.format("jdbc:mysql://%s:%s/%s?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC", 
                    dbHost, dbPort, dbName);
            
            // Validate required fields
            if (dbName == null || dbUsername == null || dbPassword == null) {
                throw new IllegalArgumentException("Missing required database configuration in .env file");
            }
            
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Failed to load database configuration: " + e.getMessage(), e);
            throw new RuntimeException("Database configuration error", e);
        }
    }
    
    /**
     * Initialize database connection
     */
    private void initializeConnection() {
        try {
            Class.forName(dbDriver);
            DriverManager.setLoginTimeout(connectionTimeout / 1000);
            
        } catch (ClassNotFoundException e) {
            LOGGER.log(Level.SEVERE, "Database driver not found: " + e.getMessage(), e);
            throw new RuntimeException("Database driver error", e);
        }
    }
    
    /**
     * Get database connection
     * @return Connection object
     * @throws SQLException if connection fails
     */
    public Connection getConnection() throws SQLException {
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(connectionUrl, dbUsername, dbPassword);
                LOGGER.info("Database connection established successfully");
            }
            return connection;
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Failed to establish database connection: " + e.getMessage(), e);
            throw e;
        }
    }
    
    /**
     * Test database connection
     * @return true if connection is successful, false otherwise
     */
    public boolean testConnection() {
        try (Connection testConn = getConnection()) {
            return testConn != null && !testConn.isClosed();
        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, "Database connection test failed: " + e.getMessage(), e);
            return false;
        }
    }
    
    /**
     * Close database connection
     */
    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                LOGGER.info("Database connection closed successfully");
            }
        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, "Error closing database connection: " + e.getMessage(), e);
        }
    }
    
    // Getter methods for configuration access
    public String getDbHost() {
        return dbHost;
    }
    
    public String getDbPort() {
        return dbPort;
    }
    
    public String getDbName() {
        return dbName;
    }
    
    public String getDbUsername() {
        return dbUsername;
    }
    
    public String getConnectionUrl() {
        return connectionUrl;
    }
    
    public int getConnectionTimeout() {
        return connectionTimeout;
    }
    
    /**
     * Get connection status
     * @return connection status string
     */
    public String getConnectionStatus() {
        try {
            if (connection != null && !connection.isClosed()) {
                return "Connected to: " + dbName + " on " + dbHost + ":" + dbPort;
            } else {
                return "Not connected";
            }
        } catch (SQLException e) {
            return "Connection status unknown: " + e.getMessage();
        }
    }
}
