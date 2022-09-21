
package view;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.management.loading.PrivateClassLoader;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.CalcListener;
import model.CalcModel;

public class CalcView extends JFrame {
	private CalcModel calcModel;
	private JTextField no1JTextField;
	private JTextField no2JTextField;
	private JTextField resultJTextField;
	private JButton addJButton, subJButton, mulJButton, divJButton, powJButton, modJButton;
	private JLabel no1JLabel, no2JLabel, ansJLabel;
	private JPanel textFieldJPanel, buttonJPanel;

	public CalcView() {
		calcModel = new CalcModel();
		this.init();
		this.setVisible(true);
	}

	private void init() {
		this.setTitle("Wee Pùi đẹp trai số 1 thế giới");
		this.setLocationRelativeTo(null);
		this.setSize(200, 400);
		this.setLayout(new GridLayout(2, 1));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		CalcListener calcListener = new CalcListener(this);

		no1JTextField = new JTextField(50);
		no2JTextField = new JTextField(50);
		resultJTextField = new JTextField(50);
		resultJTextField.enable(false);

		addJButton = new JButton("+");
		addJButton.addActionListener(calcListener);
		subJButton = new JButton("-");
		subJButton.addActionListener(calcListener);
		mulJButton = new JButton("*");
		mulJButton.addActionListener(calcListener);
		divJButton = new JButton("/");
		divJButton.addActionListener(calcListener);
		powJButton = new JButton("^");
		powJButton.addActionListener(calcListener);
		modJButton = new JButton("MOD");
		modJButton.setFont(new Font("Time New Roman", Font.PLAIN, 12));
		modJButton.setSize(40, 40);
		modJButton.addActionListener(calcListener);

		no1JLabel = new JLabel("First Number:");
		no2JLabel = new JLabel("Second Number:");
		ansJLabel = new JLabel("Answer");

		textFieldJPanel = new JPanel();
		textFieldJPanel.setLayout(new GridLayout(3, 3));
		buttonJPanel = new JPanel();
		buttonJPanel.setLayout(new GridLayout(3, 2));

		textFieldJPanel.add(no1JLabel);
		textFieldJPanel.add(no1JTextField);
		textFieldJPanel.add(no2JLabel);
		textFieldJPanel.add(no2JTextField);
		textFieldJPanel.add(ansJLabel);
		textFieldJPanel.add(resultJTextField);

		buttonJPanel.add(addJButton);
		buttonJPanel.add(subJButton);
		buttonJPanel.add(mulJButton);
		buttonJPanel.add(divJButton);
		buttonJPanel.add(powJButton);
		buttonJPanel.add(modJButton);

		this.add(textFieldJPanel);
		this.add(buttonJPanel);
	}

	public void add() {
		double a = new Double(no1JTextField.getText());
		double b = new Double(no2JTextField.getText());
		calcModel = new CalcModel(a, b);
		calcModel.add();
		resultJTextField.setText(calcModel.getResultValue() + "");
	}

	public void sub() {
		double a = new Double(no1JTextField.getText());
		double b = new Double(no2JTextField.getText());
		calcModel = new CalcModel(a, b);
		calcModel.sub();
		resultJTextField.setText(calcModel.getResultValue() + "");
	}

	public void mul() {
		double a = new Double(no1JTextField.getText());
		double b = new Double(no2JTextField.getText());
		calcModel = new CalcModel(a, b);
		calcModel.mul();
		resultJTextField.setText(calcModel.getResultValue() + "");
	}

	public void div() {
		double a = new Double(no1JTextField.getText());
		double b = new Double(no2JTextField.getText());
		calcModel = new CalcModel(a, b);
		calcModel.div();
		resultJTextField.setText((double)Math.round(calcModel.getResultValue() * 10) / 10 + "");
	}

	public void pow() {
		double a = new Double(no1JTextField.getText());
		double b = new Double(no2JTextField.getText());
		calcModel = new CalcModel(a, b);
		calcModel.pow();
		resultJTextField.setText(calcModel.getResultValue() + "");
	}

	public void mod() {
		double a = new Double(no1JTextField.getText());
		double b = new Double(no2JTextField.getText());
		calcModel = new CalcModel(a, b);
		calcModel.mod();
		resultJTextField.setText(calcModel.getResultValue() + "");
	}
}
