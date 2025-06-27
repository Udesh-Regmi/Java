package com.udesh.wordcount.controller;

import com.udesh.wordcount.model.WordCountDAO;
import com.udesh.wordcount.model.WordCountRecord;
import com.udesh.wordcount.util.WordCounter;
import com.udesh.wordcount.view.MainView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

public class WordCountController {
    private MainView view;
    private WordCountDAO dao;

    public WordCountController(MainView view, WordCountDAO dao) {
        this.view = view;
        this.dao = dao;

        this.view.addCountButtonListener(new CountListener());
        this.view.addSaveButtonListener(new SaveListener());
    }

    class CountListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String input = view.getInputText();
            int count = WordCounter.countWords(input);
            view.setWordCountResult(count);
        }
    }

    class SaveListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String input = view.getInputText();
            int count = WordCounter.countWords(input);
            WordCountRecord record = new WordCountRecord(input, count, LocalDateTime.now());

            boolean success = dao.saveRecord(record);
            view.showMessage(success ? "Saved to DB successfully!" : "Failed to save.");
        }
    }
}
