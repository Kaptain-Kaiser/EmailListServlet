package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.SearchListener;
import model.SearchModel;

public class SearchView extends JFrame {
	private SearchModel searchModel;
	private JTextArea inputJTextArea;
	private JTextField keyJTextField, resultJTextField;
	private JButton searchJButton;
	private JLabel keyJLabel, inputJLabel, resultJLabel;

	public SearchView() {
		searchModel = new SearchModel();
		this.init();
		this.setVisible(true);
	}

	public void init() {
		this.setTitle("Wee Pùi Đẹp Trai");
		this.setSize(400, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(3, 1, 1, 1));

		SearchListener searchListener = new SearchListener(this);

		Font font = new Font("Times New Roman", Font.PLAIN, 14);

		inputJTextArea = new JTextArea(69, 69);
		inputJTextArea.setFont(font);

		JScrollPane jScrollPane = new JScrollPane(inputJTextArea);
		
		keyJTextField = new JTextField();
		keyJTextField.setFont(font);
		resultJTextField = new JTextField();
		resultJTextField.setFont(font);

		searchJButton = new JButton("Search");
		searchJButton.setFont(font);
		searchJButton.addActionListener(searchListener);

		keyJLabel = new JLabel("Keyword:");
		keyJLabel.setFont(font);
		inputJLabel = new JLabel("Enter the text:");
		inputJLabel.setFont(font);
		resultJLabel = new JLabel("Total keyword was found in the text:");
		resultJLabel.setFont(font);

		JPanel inputJPanel = new JPanel();
		inputJPanel.setLayout(new BorderLayout());
		JPanel searchComboJPanel = new JPanel();
		searchComboJPanel.setLayout(new BorderLayout());
		JPanel resultJPanel = new JPanel();
		resultJPanel.setLayout(new BorderLayout());
		
		searchComboJPanel.add(keyJTextField, BorderLayout.CENTER);
		searchComboJPanel.add(searchJButton, BorderLayout.EAST);
		searchComboJPanel.add(keyJLabel, BorderLayout.NORTH);

		inputJPanel.add(inputJLabel, BorderLayout.NORTH);
		inputJPanel.add(jScrollPane, BorderLayout.CENTER);

		resultJPanel.add(resultJLabel, BorderLayout.WEST);
		resultJPanel.add(resultJTextField, BorderLayout.CENTER);

		this.add(inputJPanel);
		this.add(searchComboJPanel);
		this.add(resultJPanel);
	}

	public void showResult() {
		searchModel.setInputString(inputJTextArea.getText());
		searchModel.setKeyString(keyJTextField.getText());
		searchModel.search();
		this.resultJTextField.setText(searchModel.getCounter() + "");
	}
}
