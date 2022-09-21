package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.ReadButtonListener;

public class ReadButtonView extends JFrame {
	private JButton no1JButton;
	private JButton no2JButton;
	private JButton no3JButton;
	private JButton no4JButton;
	private JLabel jLabel;
	private JPanel showJPanel;
	private JPanel buttonJPanel;

	public ReadButtonView() {
		this.init();
		this.setVisible(true);
	}

	public void init() {
		this.setTitle("Wee Pùi đẹp trai");
		this.setLocationRelativeTo(null);
		this.setSize(300, 300);
		this.setLayout(new BorderLayout());

		ActionListener actionListener = new ReadButtonListener(this);

		no1JButton = new JButton("1");
		no1JButton.addActionListener(actionListener);
		no2JButton = new JButton("2");
		no2JButton.addActionListener(actionListener);
		no3JButton = new JButton("3");
		no3JButton.addActionListener(actionListener);
		no4JButton = new JButton("4");
		no4JButton.addActionListener(actionListener);
		
		jLabel = new JLabel();
		jLabel.setFont(new Font("Arial", Font.PLAIN, 14));

		showJPanel = new JPanel();
		showJPanel.setLayout(new FlowLayout());
		showJPanel.add(jLabel);
		buttonJPanel = new JPanel();
		buttonJPanel.setLayout(new GridLayout(2, 2));
		buttonJPanel.add(no1JButton);
		buttonJPanel.add(no2JButton);
		buttonJPanel.add(no3JButton);
		buttonJPanel.add(no4JButton);
				
		this.add(showJPanel, BorderLayout.SOUTH);
		this.add(buttonJPanel, BorderLayout.CENTER);
	}
	public void showButtonPushed(String string) {
		jLabel.setText("Last button pushed was no." + string);
	}
}
