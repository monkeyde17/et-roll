package com.Project.V;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComboBox;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

import com.Project.M.ETDataManager;
import com.Project.M.ETFile;
import com.Project.M.ETLog;

public class ETBoxClass extends JComboBox<Object> implements ItemListener, PopupMenuListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public ETBoxClass() {
		// TODO Auto-generated constructor stub
		super();
		
		updateItems();
		
		addItemListener(this);
		addPopupMenuListener(this);
	}
	
	private void updateItems() {
		removeAllItems();
		for (String item : ETFile.getCSVFile()) {
			addItem(item);
		}
		
		ETDataManager.getInstant().setClassFileUrl(getItemAt(0).toString());
	}


	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if (e.getStateChange() == ItemEvent.SELECTED) {

			String string = e.getItem().toString();
			int id = getSelectedIndex();
			
			ETLog.debug(id + " " + string);
			ETDataManager.getInstant().setClassFileUrl(string);
		}
	}



	@Override
	public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
		// TODO Auto-generated method stub
		ETLog.debug("reload the csv file");
		updateItems();
	}

	@Override
	public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void popupMenuCanceled(PopupMenuEvent e) {
		// TODO Auto-generated method stub
		
	}
}
