package com.Project.V;

import java.awt.Dimension;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.RenderingHints.Key;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRootPane;
import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

public class ETFrame extends JFrame implements MouseListener, MouseMotionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final int WIDTH = 300;
	private final int HEIGHT = 100;
	
	private Point point;
	
	private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	public ETFrame() {
		// TODO Auto-generated constructor stub
		super();
		
		//setSize(WIDTH, HEIGHT);
		setLocation( (screenSize.width - WIDTH) / 2, (screenSize.height - HEIGHT) / 2);
		setResizable(false);
		setUndecorated(true);
		
		/* get the location */
		point = getLocation();
		
		/* bind the listener */
		addMouseListener(this);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		point = MouseInfo.getPointerInfo().getLocation();
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
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		Point tPoint = getLocation();
		Point mPoint = MouseInfo.getPointerInfo().getLocation();
		setLocation(tPoint.x + mPoint.x - point.x, tPoint.y + mPoint.y - point.y);
		point = mPoint;
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
