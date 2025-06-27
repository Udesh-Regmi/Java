package com.udesh.wordcount.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class MainView extends JFrame{
    private JTextArea textArea;
    private JButton countButton, saveButton;
    private JLabel resultLabel;

    public MainView(){
        setTitle("Word Count Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,400);
        setLocationRelativeTo(null);

        initComponents();

    }
    public void initComponents(){
        textArea = new JTextArea(10, 40);
        countButton = new JButton("Count Words");
        saveButton = new JButton("Save to DB");
        resultLabel = new JLabel("No of Words:");

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JScrollPane(textArea), BorderLayout.CENTER);

        JPanel southPanel= new JPanel();
        southPanel.add(countButton);
        southPanel.add(saveButton);
        southPanel.add(resultLabel);

        panel.add(southPanel, BorderLayout.SOUTH);
        add(panel);

    }

    public String getInputText(){
        return textArea.getText();

    }

    public void setWordCountResult(int count) {
        resultLabel.setText("Word Count: " + count);
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public void addCountButtonListener(ActionListener listener) {
        countButton.addActionListener(listener);
    }

    public void addSaveButtonListener(ActionListener listener) {
        saveButton.addActionListener(listener);
    }
}