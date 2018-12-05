package com.group5;
import javax.swing.*;
import java.awt.*;

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
		File.add(new JMenuItem("Load Query"));
		File.addSeparator();
		File.add(Options_Sub);
		File.addSeparator();
		Export = new JMenuItem("Export");
		File.add(Export);
		menuBar.add(File);
		setJMenuBar(menuBar);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setSize(800, 600);

		Container contentPane = getContentPane();

		TabView tabView = new TabView();

		contentPane.add(tabView);
	}
}
