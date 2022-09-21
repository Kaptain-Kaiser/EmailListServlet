package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.ColorView;

public class ColorListener implements ActionListener {
	private ColorView colorView;

	public ColorListener(ColorView colorView) {
		this.colorView = colorView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		//int color = Integer.parseInt(src);
		if (src.equals("1")) {
			this.colorView.setColor(Color.RED);
		}
		else if (src.equals("2")) {
			this.colorView.setColor(Color.YELLOW);
		}
		else if (src.equals("3")) {
			this.colorView.setColor(Color.BLUE);
		}
		else if (src.equals("4")) {
			this.colorView.setColor(Color.BLACK);
		}
		else if (src.equals("5")) {
			this.colorView.setColor(Color.ORANGE);
		}
		else if (src.equals("6")) {
			this.colorView.setColor(Color.GREEN);
		}
	}
}
