package com.Project.V;

import javax.swing.JComboBox;

public class ETBoxWay extends JComboBox<String> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String RAND_STRING = "rand";
	public static final String ROLL_STRING = "roll";
	public static final String RANDPOW_STRING = "rand+pow";
	
	public ETBoxWay() {
		// TODO Auto-generated constructor stub
		addItem(RAND_STRING);
		addItem(ROLL_STRING);
		addItem(RANDPOW_STRING);
	}
}
