package com.Project.V;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;

import com.Project.M.ETDataManager;
import com.Project.M.ETLog;

public class ETBoxShow extends JComboBox<String> implements ItemListener {
	
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
		
		ETDataManager.getInstant().setShowWay(0);
		addItemListener(this);

	}



	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if (e.getStateChange() == ItemEvent.SELECTED) {
			String string = e.getItem().toString();
			int id = getSelectedIndex();

			ETLog.debug(id + ":" + string);
			ETDataManager.getInstant().setShowWay(id);
		}
	}
}
