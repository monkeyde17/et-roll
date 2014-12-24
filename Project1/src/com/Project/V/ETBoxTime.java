package com.Project.V;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;

import com.Project.M.ETDataManager;
import com.Project.M.ETLog;

public class ETBoxTime extends JComboBox<String> implements ItemListener {

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
		
		ETDataManager.getInstant().setRandSecond(-1);
		addItemListener(this);

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if (e.getStateChange() == ItemEvent.SELECTED) {

			String string = e.getItem().toString();
			int id = getSelectedIndex();

			ETLog.debug(id + ":" + string);
			if (id == 0) {
				ETDataManager.getInstant().setRandSecond(-1);
			} else {
				ETDataManager.getInstant().setRandSecond(id);
			}
		}
	}
}
