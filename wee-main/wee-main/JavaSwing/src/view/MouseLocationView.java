package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.MouseLocationListener;
import model.MouseLocationModel;

public class MouseLocationView extends JFrame {
	private JPanel blankJPanel;
	private JPanel resultJPanel;
	private JLabel cordinateJLabel, numOfClickJLabel, isInCompJLabel;
	private MouseLocationModel mouseLocationModel;

	public MouseLocationView() {
		mouseLocationModel = new MouseLocationModel();
		this.init();
		this.setVisible(true);
	}

	private void init() {
		this.setTitle("Wee Pùi đẹp trai");
		this.setLocationRelativeTo(null);
		this.setSize(350, 550);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());

		MouseLocationListener mll = new MouseLocationListener(this);

		blankJPanel = new JPanel();
		blankJPanel.setSize(300, 300);

		resultJPanel = new JPanel();
		resultJPanel.setLayout(new GridLayout(3, 1));

		cordinateJLabel = new JLabel("Cordinate: ");
		numOfClickJLabel = new JLabel("Number of click: ");
		isInCompJLabel = new JLabel("Mouse is in component: ");

		blankJPanel.addMouseListener(mll);
		blankJPanel.addMouseMotionListener(mll);

		resultJPanel.add(cordinateJLabel);
		resultJPanel.add(numOfClickJLabel);
		resultJPanel.add(isInCompJLabel);

		this.add(blankJPanel, BorderLayout.CENTER);
		this.add(resultJPanel, BorderLayout.SOUTH);
	}

	public void numOfClickIncrease() {
		mouseLocationModel.increaseNumOfClick();
		numOfClickJLabel
				.setText("Number of click: " + mouseLocationModel.getCounterClick());
	}

	public void isInComponent(boolean isIn) {
		mouseLocationModel.setInComponent(isIn);
		isInCompJLabel.setText("Mouse is in component: " + mouseLocationModel.isInComponent());
	}

	public void showCordinate(int x, int y) {
		mouseLocationModel.setX(x);
		mouseLocationModel.setY(y);
		cordinateJLabel.setText("Cordinate: " + "x=" + mouseLocationModel.getX() + " y=" + mouseLocationModel.getY());
	}
}
