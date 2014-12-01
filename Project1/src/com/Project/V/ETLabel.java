package com.Project.V;

import java.awt.Color;
import java.awt.Label;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.Timer;
import java.util.TimerTask;

import com.Project.M.ETCore;

public class ETLabel extends Label implements MouseListener, MouseWheelListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Timer timer = null;
	
	private final int HEIGHT = 100;
	private final int WIDTH = 200;
	
	private boolean STATFLAG = true;
	
	public ETLabel() {
		// TODO Auto-generated constructor stub
		super();
		
		setSize(WIDTH, HEIGHT);
		setAlignment(Label.CENTER);
		setLocation(50, 0);
		setBackground(Color.pink);
		
		addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		STATFLAG = !STATFLAG;
		if (STATFLAG) {
			try {
				timer.cancel();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		} else {
			timer = new Timer();
			timer.schedule(new TimerTask() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					setText(String.valueOf(ETCore.Next(10000)));
				}
			}, 0, 30);
		}
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

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		// TODO Auto-generated method stub
		
	}
}
