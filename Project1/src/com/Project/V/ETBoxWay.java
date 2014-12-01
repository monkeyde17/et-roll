package com.Project.V;

import javax.swing.JComboBox;

public class ETBoxWay extends JComboBox<String> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final String RAND_STRING = "rand";
	private static final String ROLL_STRING = "roll";
	
	public ETBoxWay() {
		// TODO Auto-generated constructor stub
		addItem(RAND_STRING);
		addItem(ROLL_STRING);
	}
}
