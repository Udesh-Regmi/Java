package com.udesh.wordcount.model;

import com.udesh.wordcount.config.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class WordCountDAO {

    private static final String INSERT_SQL = "INSERT INTO word_entries (text, word_count, created_at) VALUES (?, ?, ?)";

    public boolean saveRecord(WordCountRecord record) {
        try (Connection conn = DBConnection.getInstance().getConnection();
             PreparedStatement stmt = conn.prepareStatement(INSERT_SQL)) {

            stmt.setString(1, record.getText());
            stmt.setInt(2, record.getWordCount());
            stmt.setTimestamp(3, java.sql.Timestamp.valueOf(record.getCreatedAt()));

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error saving record: " + e.getMessage());
            return false;
        }
    }
}
