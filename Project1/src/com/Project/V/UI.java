package com.Project.V;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.Panel;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class UI {

	public static void main(String args[]) {
		ETFrame frame = new ETFrame();
		frame.setContentPane(new JPanel());
		
		frame.setVisible(true);
		
		frame.setLayout(new BorderLayout());
		
		Panel nPanel = new Panel();
		
		nPanel.add(new Label("class"));
		nPanel.add(new ETBoxClass());
		
		nPanel.add(new ETBoxShow());
		nPanel.add(new Label("   "));

		nPanel.add(new Label("way"));
		nPanel.add(new ETBoxWay());
		
		nPanel.add(new ETBoxTime());
		nPanel.add(new Label("s"));
		
		frame.getContentPane().add(nPanel, "North");

		frame.getContentPane().add(new ETLabel(), "Center");
		
		Button button = new Button("=。=");
		frame.getContentPane().add(button, "South");
		frame.pack();
	}
}
