package com.Project.V;

import javax.swing.JComboBox;

public class ETBoxTime extends JComboBox<String> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ETBoxTime() {
		// TODO Auto-generated constructor stub
		
		addItem("inf");
		
		for (int i = 1; i <= 10; i++) {
			addItem(String.valueOf(i));
		}
	}

}
