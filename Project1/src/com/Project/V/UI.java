package com.Project.V;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Image;
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
		JPanel panel = new JPanel();
		frame.setContentPane(panel);
		frame.setVisible(true);
		//frame.pack();

//		frame.setLayout();
		//frame.add(new ETLabel());
		//frame.add(new ETBg());
		String[] s = {"美国","日本","大陆","英国","法国","意大利","澳洲","韩国"};
		JComboBox box = new JComboBox(s);
		box.addItem("a");
		box.addItem("b");
		//box.setBorder(BorderFactory.createTitledBorder("你呢?"));
		box.setVisible(true);
	
		
		JComboBox box2 = new JComboBox(s);
		box2.addItem("a");
		box2.addItem("b");
		//box2.setBorder(BorderFactory.createTitledBorder("你最喜玩呢2?"));
		box2.setVisible(true);
		
		
		JComboBox box3 = new JComboBox(s);
		box3.addItem("a");
		box3.addItem("b");
		//box3.setBorder(BorderFactory.("呢3?"));
		box3.setVisible(true);
		BorderLayout ly = new BorderLayout();
		frame.setLayout(new BorderLayout());
		Panel nPanel = new Panel();
		//nPanel.setLayout(ly);

		nPanel.add(new ETBoxClass());
		
		//frame.getContentPane().add(box2, "North");
		//frame.getContentPane().add(box3, "North");
		//frame.getContentPane().add(box, "North");
		frame.getContentPane().add(nPanel, "North");
		
		//Panel cPanel = new Panel();
		//cPanel.add(new ETLabel());
		//cPanel.setSize(width, height);
		frame.getContentPane().add(new ETLabel(), "Center");
		Button button = new Button("st");
		//button.setVisible(false);
		frame.getContentPane().add(button, "South");
		frame.pack();
		
	}
}
