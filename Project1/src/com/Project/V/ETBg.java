package com.Project.V;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ETBg extends JLabel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ETBg() {
		// TODO Auto-generated constructor stub
		super();
		
		setIcon(new ImageIcon("icon.gif"));		
		setSize(getIcon().getIconHeight(), getIcon().getIconHeight());
	}
}
