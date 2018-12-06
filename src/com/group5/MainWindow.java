package com.group5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends JFrame {
	public MainWindow() {
		super();
		JMenuBar menuBar;
		JMenu help, File;
		JMenuItem Export;
		JMenu Options_Sub;

		Options_Sub = new JMenu("Options");
		Options_Sub.add(new JMenuItem("Documents"));
		Options_Sub.add(new JMenuItem("Sources"));
		menuBar = new JMenuBar();
		File = new JMenu("File");

		File.add(new JMenuItem("Save Query"));
		
		File.add(new JMenuItem("Load Query"));
		File.addSeparator();
		File.add(Options_Sub);
		File.addSeparator();
		Export = new JMenuItem("Export");
		File.add(Export);
		menuBar.add(File);
		
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
		
		setJMenuBar(menuBar);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setSize(800, 600);

		Container contentPane = getContentPane();

		TabView tabView = new TabView();

		contentPane.add(tabView);
	}
}
