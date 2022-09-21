package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CounterView;

public class CounterListener implements ActionListener {
	private CounterView counterView;

	public CounterListener(CounterView counterView) {
		this.counterView = counterView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String acString = e.getActionCommand();
		if (acString.equals("+"))
			this.counterView.increase();
		else if (acString.equals("-")) {
			this.counterView.decrease();
		} else if (acString.equals("Reset")) {
			this.counterView.reset();
		}
	}

}
