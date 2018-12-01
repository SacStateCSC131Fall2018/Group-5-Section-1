package com.group5;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame
{
    public MainWindow()
    {
        super();

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setSize(800, 600);

        Container contentPane = getContentPane();

        TabView tabView = new TabView();

        contentPane.add(tabView);
    }
}
