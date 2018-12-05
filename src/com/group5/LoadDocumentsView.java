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
		buildTextFilePanel();
		buildFileTypePanel();
		buildTitleAuthorPanel();
		addLine();
		addProcess();
		buildTextArea();
	}

    /**
     * Builds a field to take in the file path
     */
	private void buildTextFilePanel()
    {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		JTextField prompt = new JTextField("Text File: ");
		prompt.setBorder(null);
    	prompt.setBackground(null);
    	panel.add(prompt);
    	JTextField file = new JTextField();
    	file.setPreferredSize(new Dimension(600, 25));
    	panel.add(file);
    	JButton browse = new JButton("Browse");
    	panel.add(browse);
    	add(panel);
	}

    /**
     * Builds a pull down menu for the file type
     */
    private void buildFileTypePanel()
    {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		JTextField prompt = new JTextField("Text File Type: ");
		prompt.setBorder(null);
    	prompt.setBackground(null);
    	panel.add(prompt);
    	String [] choices = {"Project Gutenburg File"};
    	JComboBox<String> pullDown = new JComboBox<>(choices);
    	pullDown.setPreferredSize(new Dimension(650, 25));
    	pullDown.setBackground(Color.WHITE);
    	panel.add(pullDown);
    	add(panel);
	}

    /**
     * Builds title and author input fields
     */
	private void buildTitleAuthorPanel()
    {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		JTextField prompt = new JTextField("Title: ");
		prompt.setBorder(null);
    	prompt.setBackground(null);
    	panel.add(prompt);
    	JTextField titleSpace = new JTextField();
    	titleSpace.setPreferredSize(new Dimension(300, 25));
    	panel.add(titleSpace);
    	JTextField prompt2 = new JTextField("Author: ");
		prompt2.setBorder(null);
    	prompt2.setBackground(null);
    	panel.add(prompt2);
    	JTextField authorSpace = new JTextField();
    	authorSpace.setPreferredSize(new Dimension(300, 25));
    	panel.add(authorSpace);
    	//panel.setAlignmentX(RIGHT_ALIGNMENT);
    	add(panel);
	}

    /**
     * Adds a line separator
     */
	private void addLine()
    {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		String _101underscores = new String(new char[101]).replace("\0", "_");
		JTextField line = new JTextField(_101underscores);
		line.setPreferredSize(new Dimension(700, 25));
		line.setBackground(null);
		line.setBorder(null);
		panel.add(line);
		add(panel);
	}

    /**
     * Add a process button
     */
	private void addProcess()
    {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		JButton process = new JButton("Process");
		panel.add(process);
		add(panel);
	}

    /**
     * Creates a text area
     */
	private void buildTextArea()
    {
        // TODO: Text area needs more space on the border
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setBorder(BorderFactory.createEtchedBorder());
		add(textArea);
	}
}