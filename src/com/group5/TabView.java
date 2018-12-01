package com.group5;

import javax.swing.*;
import java.awt.*;

public class TabView extends JPanel
{
    public TabView()
    {
        super(new GridLayout(1, 1));

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel searchPanel = new SearchView();
        tabbedPane.addTab("Search Documents", searchPanel);
        add(tabbedPane);
    }
}
