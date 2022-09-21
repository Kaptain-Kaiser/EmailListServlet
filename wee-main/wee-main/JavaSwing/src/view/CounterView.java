package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CounterListener;
import model.CounterModel;

public class CounterView extends JFrame {
	private CounterModel counterModel;
	private JButton increJButton;
	private JButton decreJButton;
	private JButton resetJButton;
	private JLabel showJLabel;
	private JPanel jPanel;
	
	public CounterView() {
		this.counterModel = new CounterModel();
		this.init();
		this.setVisible(true);
	}

	public void init() {
		this.setTitle("Bùi Đẹp Trai");
		this.setLocationRelativeTo(null);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());

		ActionListener actionListener = new CounterListener(this);

		this.increJButton = new JButton("+");
		this.increJButton.addActionListener(actionListener);
		this.decreJButton = new JButton("-");
		this.decreJButton.addActionListener(actionListener);
		this.resetJButton = new JButton("Reset");
		this.resetJButton.addActionListener(actionListener);

		this.showJLabel = new JLabel(counterModel.getValue() + "", JLabel.CENTER);

		this.jPanel = new JPanel();
		this.jPanel.setLayout(new BorderLayout());
		this.jPanel.add(increJButton, BorderLayout.EAST);
		this.jPanel.add(decreJButton, BorderLayout.WEST);
		this.jPanel.add(resetJButton, BorderLayout.SOUTH);
		this.jPanel.add(showJLabel, BorderLayout.CENTER);

		this.add(jPanel, BorderLayout.CENTER);
	}

	public void increase() {
		this.counterModel.increment();
		this.showJLabel.setText(this.counterModel.getValue() + "");
	}

	public void decrease() {
		this.counterModel.decrement();
		this.showJLabel.setText(this.counterModel.getValue() + "");

	}

	public void reset() {
		this.counterModel.reset();
		this.showJLabel.setText(this.counterModel.getValue() + "");
	}
}
