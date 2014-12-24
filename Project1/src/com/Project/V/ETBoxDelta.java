package com.Project.V;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;

import com.Project.M.ETDataManager;
import com.Project.M.ETLog;

public class ETBoxDelta extends JComboBox<String> implements ItemListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ETBoxDelta() {
		// TODO Auto-generated constructor stub
		
		for (int i = 0; i < 10; i++) {
			addItem(String.valueOf(30 + i * 70));
		}
		
		ETDataManager.getInstant().setDeltaTime(30);
		addItemListener(this);

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if (e.getStateChange() == ItemEvent.SELECTED) {

			String string = e.getItem().toString();
			int id = getSelectedIndex();

			ETLog.debug(id + ":" + string);
		
			ETDataManager.getInstant().setDeltaTime(Integer.valueOf(string));
		}
	}
}
