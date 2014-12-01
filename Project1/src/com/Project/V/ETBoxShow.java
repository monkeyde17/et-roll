package com.Project.V;

import javax.swing.JComboBox;

public class ETBoxShow extends JComboBox<String> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final String ID_STRING = "id";
	private static final String NAME_STRING = "name";
	

	
	public ETBoxShow() {
		// TODO Auto-generated constructor stub
		addItem(ID_STRING);
		addItem(NAME_STRING);
		addItem(ID_STRING + "+" + NAME_STRING);
	}

}
