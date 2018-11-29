package com.group5;

import javax.swing.*;
import java.awt.*;

public class App
{
    private JPanel mainPanel;
    private JTabbedPane tabbedPane;
    private JPanel searchPane;
    private JPanel loadPane;
    private JPanel summarizePane;
    
    public static void main(String[] argv)
    {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().mainPanel);
        frame.getContentPane().setPreferredSize(new Dimension(800, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
