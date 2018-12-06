package package1;

import javax.swing.*;
import java.awt.*;

public class SummaryView extends JPanel {
	private JTextArea summaryText;
	
	public SummaryView() {
		super();
		setLayout(new BoxLayout(this, 1));
		buildSummaryText();
	}
	
	private void buildSummaryText() {
		String output = String.format("%-8s %-40s\n","Opus 0: ","Charles Dickens   Bleak House   7312 documents");
		output += String.format("%-16s %40s\n"," ","/Users/whatever/Programs/java/data/bleakhouse.txt");
		output += String.format("%-14s %-10s\n","Index terms: ","99999");
		output += String.format("%-12s %-10s\n", "Postings: ","55555");
		summaryText = new JTextArea();
		summaryText.setText(output);
		summaryText.setEditable(false);
		summaryText.setBorder(BorderFactory.createEtchedBorder());
		add(summaryText);
	}
}