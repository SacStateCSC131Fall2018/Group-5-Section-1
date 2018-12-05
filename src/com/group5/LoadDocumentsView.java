package com.group5;

import javax.swing.*;
import java.awt.*;

public class LoadDocumentsView extends JPanel
{
	public LoadDocumentsView()
    {
		super();
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		setAlignmentX(LEFT_ALIGNMENT);

		// Build text file prompt panel
        {
            JPanel panel = buildFlowPanel();

            addPromptField("Text File", 600, panel);

            panel.add(new JButton("Browse"));

            add(panel);
        }

        // Build file type panel
        {
            JPanel panel = buildFlowPanel();

            panel.add(new JLabel("Text File Type: "));

            // Add pull-down menu
            String[] choices = { "Project Gutenberg File" };
            JComboBox<String> pullDown = new JComboBox<>(choices);
            pullDown.setPreferredSize(new Dimension(650, 25));
            pullDown.setBackground(Color.WHITE);
            panel.add(pullDown);

            add(panel);
        }

		// Create Title and Author prompts
        {
            JPanel panel = buildFlowPanel();
            addPromptField("Title", 300, panel);
            addPromptField("Author", 300, panel);
            add(panel);
        }

        // Create horizontal separator line
        {
            JPanel panel = buildFlowPanel();
            String underscores = new String(new char[130]).replace("\0", "_");
            JLabel line = new JLabel(underscores);
            line.setPreferredSize(new Dimension(900, 25));
            panel.add(line);
            add(panel);
        }

        // Add process button
        {
            JPanel panel = buildFlowPanel();
            panel.add(new JButton("Process"));
            add(panel);
        }

        // Build text area
        {
            // TODO: Text area needs more space on border
            JTextArea textArea = new JTextArea();
            textArea.setLineWrap(true);
            textArea.setBorder(BorderFactory.createEtchedBorder());
            add(textArea);
        }
	}

	private JPanel buildFlowPanel()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        return panel;
    }

    /**
     * Builds a prompt field and adds it to the given panel
     * @param promptText The text to display at the prompt
     * @param panel The panel to add the prompt to
     */
	private void addPromptField(String promptText, int size, JPanel panel)
    {
        panel.add(new JLabel(promptText + ": "));
        JTextField promptSpace = new JTextField();
        promptSpace.setPreferredSize(new Dimension(size, 25));
        panel.add(promptSpace);
    }
}