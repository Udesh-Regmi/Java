package com.udesh.wordcount.util;

public class WordCounter {
    public static int countWords(String text) {
        if (text == null || text.trim().isEmpty()) return 0;
        return text.trim().split("\\s+").length;
    }
}
