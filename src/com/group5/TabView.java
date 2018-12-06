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
        JPanel loadDocsPanel = new LoadDocumentsView();
        JPanel summaryPanel = new SummaryView();
        
        tabbedPane.addTab("Search Documents", searchPanel);
        tabbedPane.addTab("Load Documents", loadDocsPanel);
        tabbedPane.addTab("Summarize Documents", summaryPanel);
        
        add(tabbedPane);
    }
}