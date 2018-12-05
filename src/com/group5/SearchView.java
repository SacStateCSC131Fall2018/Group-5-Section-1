package com.group5;

import javax.swing.*;
import java.awt.*;

public class SearchView extends JPanel
{
	/**
	 * The top bar that will hld the user query and clear button
	 */
	private JPanel queryBar;
	/**
	 * Displays the number of results found
	 */
	private JTextField resultsFound;
	private JTextArea summaryText;
	private JTextArea opusText;

	public SearchView()
    {
    	super();
    	setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    	buildQueryBar();
    	buildSummaryText();
    	buildResultsFound();
    	buildOpusText();
    	JButton remove = new JButton("Remove Opus");
    	add(remove);
    }
    
    private void buildSummaryText()
	{
    	String output = String.format("%-30s %-22s %-8s %-50s\n",
									  "Author", "Title", "Page", "Summary");
    	output += String.format("%-20s %-12s %-10s %-50s\n",
								"Charles Dickens", "Bleak House", "276",
								"Blah blah blah");
    	summaryText = new JTextArea();
    	summaryText.setText(output);
    	summaryText.setEditable(false);
    	summaryText.setBorder(BorderFactory.createEtchedBorder());
    	add(summaryText);
    }
    
    
    private void buildResultsFound()
	{
    	JPanel panel = new JPanel();
    	panel.setLayout(new FlowLayout());
    	resultsFound = new JTextField("Retrieved 1 document");
    	resultsFound.setBorder(null);
    	resultsFound.setBackground(null);
    	resultsFound.setPreferredSize(new Dimension(750, 50));
    	resultsFound.setMaximumSize( resultsFound.getPreferredSize() );
    	resultsFound.setEditable(false);

    	panel.add(resultsFound);
    	
    	add(panel);
    	
    }

	/**
	 * Builds the opus text field
	 */
	private void buildOpusText()
	{
    	opusText = new JTextArea();
    	JScrollPane scrollPane = new JScrollPane(opusText);
    	scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    	scrollPane.setPreferredSize(new Dimension(750, 250));
    	opusText.setLineWrap(true);
    	scrollPane.setBorder(BorderFactory.createEtchedBorder());
    	opusText.setEditable(false);
    	add(scrollPane);
    }

	/**
	 * Builds the query bar
	 */
	private void buildQueryBar()
	{
    	queryBar = new JPanel();
    	queryBar.setLayout(new FlowLayout(FlowLayout.LEFT));
    	JTextField prompt = new JTextField("Query: ");
    	prompt.setBorder(null);
    	prompt.setBackground(null);
    	queryBar.add(prompt);
    	JTextField query = new JTextField();
    	query.setPreferredSize(new Dimension(600, 25));
    	queryBar.add(query);
    	JButton clear = new JButton("Clear");
    	queryBar.add(clear);
    	prompt.setEditable(false);
    	add(queryBar);
    }
}