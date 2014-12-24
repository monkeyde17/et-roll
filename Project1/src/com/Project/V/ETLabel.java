package com.Project.V;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;

import com.Project.M.ETCore;
import com.Project.M.ETDataManager;

public class ETLabel extends Label implements MouseListener, MouseWheelListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Timer timer = null;
	
	private final int HEIGHT = 100;
	private final int WIDTH = 300;
	
	private boolean STATFLAG = true;
	
	private Image bgImage = null;
	private String bgUrl = null;
	
	public ETLabel() {
		// TODO Auto-generated constructor stub
		super();
		
		setSize(WIDTH, HEIGHT);
		setAlignment(Label.CENTER);
		setLocation(50, 0);
		setBackground(Color.pink);
		
		updateImage();
		
		addMouseListener(this);
		
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		try {
			bgImage = ImageIO.read(new File(bgUrl));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		g.drawImage(bgImage, 0, 0, null);
	}

	private void updateImage() {
		bgUrl = ETCore.Rand(2, 1) + ".jpg";
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
					setText(ETDataManager.getInstant().getRandName());
					updateImage();
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
