package com.Project.V;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComboBox;

public class ETBoxClass extends JComboBox<Object> implements ItemListener, MouseListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public ETBoxClass() {
		// TODO Auto-generated constructor stub
		super();
		
		for (int i = 0; i < 10; i++) {
			addItem('a' + i);
		}
		
		addItemListener(this);
		
		loadConfig();
	}
	
	private void loadConfig() {
		getSelectedIndex();
	}
	
	
	
	

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if (e.getStateChange() == ItemEvent.SELECTED) {
			//e.getItemSelectable();
			//int id = e.getID();
			String string = e.getItem().toString();
			int id = getSelectedIndex();
			getSelectedItem();
			
			System.out.println(id + " " + string);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		loadConfig();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
