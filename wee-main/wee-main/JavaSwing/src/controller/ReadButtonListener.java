package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.ReadButtonView;

public class ReadButtonListener implements ActionListener{
	private ReadButtonView readButtonView;
	public ReadButtonListener(ReadButtonView readButtonView) {
		this.readButtonView = readButtonView;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String srcString = e.getActionCommand();
		int a = new Integer(srcString);
		readButtonView.showButtonPushed(srcString);
	}
	
}
