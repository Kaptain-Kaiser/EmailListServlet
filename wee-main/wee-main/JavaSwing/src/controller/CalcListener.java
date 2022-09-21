package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.CalcModel;
import view.CalcView;

public class CalcListener implements ActionListener {
	private CalcView calcView;

	public CalcListener(CalcView calcView) {
		this.calcView = calcView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String srcString = e.getActionCommand();
		if (srcString.equals("+"))
			calcView.add();
		if (srcString.equals("-"))
			calcView.sub();
		if (srcString.equals("*"))
			calcView.mul();
		if (srcString.equals("/"))
			calcView.div();
		if (srcString.equals("^"))
			calcView.pow();
		if (srcString.equals("MOD"))
			calcView.mod();
	}

}
