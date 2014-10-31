package com.Project.V;

import java.awt.Graphics;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class UI {

	public static void main(String args[]) {
		ETFrame frame = new ETFrame();
		frame.setVisible(true);
		frame.add(new ETLabel());
		frame.add(new ETBg());
	}
}
