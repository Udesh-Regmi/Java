package com.udesh.wordcount.model;

import java.time.LocalDateTime;

public class WordCountRecord {
    private String text;
    private int wordCount;
    private LocalDateTime createdAt;

    public WordCountRecord(String text, int wordCount, LocalDateTime createdAt) {
        this.text = text;
        this.wordCount = wordCount;
        this.createdAt = createdAt;
    }

    public String getText() {
        return text;
    }

    public int getWordCount() {
        return wordCount;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
