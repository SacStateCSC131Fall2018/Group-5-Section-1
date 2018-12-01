package com.group5;

import javax.swing.*;
import java.awt.*;

public class SearchView extends JPanel
{
    public SearchView()
    {
        // TODO: Add GUI elements for searching

        // Temporary:
        JLabel placeholderLabel = new JLabel("Search Documents");
        placeholderLabel.setHorizontalAlignment(JLabel.CENTER);
        setLayout(new GridLayout(1, 1));
        add(placeholderLabel);
    }
}
