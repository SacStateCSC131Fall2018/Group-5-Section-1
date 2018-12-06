
package com.group5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends JFrame {
	public MainWindow() {
		super();
		this.setIconImage(new ImageIcon(getClass().getResource("P.png")).getImage());
		JMenuBar menuBar;
		JMenu help, File;
		JMenuItem Export;
		JMenu options;

		options = new JMenu("Options");
		options.add(new JMenuItem("Documents"));
		options.add(new JMenuItem("Sources"));
		menuBar = new JMenuBar();
		File = new JMenu("File");

		File.add(new JMenuItem("Save Query"));
		
		File.add(new JMenuItem("Load Query"));
		Export = new JMenuItem("Export");
		File.add(Export);
		menuBar.add(File);
		menuBar.add(options);
		//HELP MENU ITEM
		help = new JMenu("Help");
		JMenuItem JAbout = new JMenuItem("About");
		JAbout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	JOptionPane.showMessageDialog(null, "PIREX - Made by Group 5: Daniel Kuzmin, David Liu, "
        				+ "David Ray, Lonnie Spann Jr, Michael Dorst, Ruthvik Chowdary, Timothy Darrow.");

            }

		});
		help.add(JAbout);
		menuBar.add(help);
		//END HELP MENU ITEM
		
		//EXIT MENU ITEM
		File.addSeparator();
		JMenuItem JExit = new JMenuItem("Exit");
		File.add(JExit);
		JExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	System.exit(0);

            }

		});
		//END EXIT MENU ITEM
		
		setJMenuBar(menuBar);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);
		Container contentPane = getContentPane();

		TabView tabView = new TabView();

		contentPane.add(tabView);
	}
}

