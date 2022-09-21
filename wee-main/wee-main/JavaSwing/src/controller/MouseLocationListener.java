package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import view.MouseLocationView;

public class MouseLocationListener implements MouseListener, MouseMotionListener{
	private MouseLocationView mouseLocationView;

	public MouseLocationListener(MouseLocationView mouseLocationView) {
		this.mouseLocationView = mouseLocationView;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		mouseLocationView.numOfClickIncrease();
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
		mouseLocationView.isInComponent(true);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseLocationView.isInComponent(false);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseLocationView.showCordinate(e.getX(), e.getY());
	}

}
