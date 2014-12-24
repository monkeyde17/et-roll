package com.Project.V;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;

import com.Project.M.ETDataManager;
import com.Project.M.ETLog;

public class ETBoxWay extends JComboBox<String> implements ItemListener {

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
		ETDataManager.getInstant().setRandWay(RAND_STRING);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if (e.getStateChange() == ItemEvent.SELECTED) {

			String string = e.getItem().toString();
			int id = getSelectedIndex();

			ETLog.debug(id + ":" + string);
			ETDataManager.getInstant().setRandWay(string);
		}
	}
}
