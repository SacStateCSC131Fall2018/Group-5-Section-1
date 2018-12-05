package com.group5;

import javax.swing.*;
import java.awt.*;

public class LoadDocumentsView extends JPanel {
	public LoadDocumentsView(){
		super();
		setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
		setAlignmentX(LEFT_ALIGNMENT);
		buildTextFilePanel();
		buildFileTypePanel();
		buildTitleAuthorPanel();
		addLine();
		addProcess();
		buildTextArea();
	}
	
	private void buildTextFilePanel() {//field to take in file path
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
	
	private void buildFileTypePanel() {//pull down for file type
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		JTextField prompt = new JTextField("Text File Type: ");
		prompt.setBorder(null);
    	prompt.setBackground(null);
    	panel.add(prompt);
    	String [] choices = {"Project Gutenburg File"};
    	JComboBox<String> pullDown = new JComboBox<String>(choices);
    	pullDown.setPreferredSize(new Dimension(650, 25));
    	pullDown.setBackground(Color.WHITE);
    	panel.add(pullDown);
    	add(panel);
	}
	
	private void buildTitleAuthorPanel() {//sets up the author and title input field
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
	
	private void addLine() {//adds a line seperator
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		JTextField line = new JTextField("_____________________________________________________________________________________________________");
		line.setPreferredSize(new Dimension(700, 25));
		line.setBackground(null);
		line.setBorder(null);
		panel.add(line);
		add(panel);
	}
	
	private void addProcess() {//adds the process button
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		JButton process = new JButton("Process");
		panel.add(process);
		add(panel);
	}
	
	private void buildTextArea() {//text area needs more buffer space on the border
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setBorder(BorderFactory.createEtchedBorder());
		add(textArea);
	}
}