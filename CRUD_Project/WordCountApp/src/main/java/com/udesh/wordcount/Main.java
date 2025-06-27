package com.udesh.wordcount;

import com.udesh.wordcount.controller.WordCountController;
import com.udesh.wordcount.model.WordCountDAO;
import com.udesh.wordcount.view.MainView;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainView view = new MainView();
            WordCountDAO dao = new WordCountDAO();
            new WordCountController(view, dao);
            view.setVisible(true);
        });
    }
}
