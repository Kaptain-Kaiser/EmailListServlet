package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.security.interfaces.XECPrivateKey;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.ColorListener;
import model.ColorModel;

public class ColorView extends JFrame {
	private ColorModel colorModel;
	private JButton redJButton;
	private JButton yellowJButton;
	private JButton blueJButton;
	private JButton blackJButton;
	private JButton orangeJButton;
	private JButton greenJButton;
	private JPanel labelJPanel;
	private JPanel buttonJPanel;
	private JLabel jLabel;

	public ColorView() {
		ColorModel colorModel = new ColorModel();
		this.init();
		this.setVisible(true);
	}

	public void init() {
		this.setTitle("Bùi Đẹp Trai VCL");
		this.setSize(180, 180);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());

		ColorListener colorListener = new ColorListener(this);

		this.redJButton = new JButton("1");
		this.redJButton.setBackground(Color.RED);
		this.redJButton.setForeground(Color.RED);
		this.redJButton.addActionListener(colorListener);
		this.yellowJButton = new JButton("2");
		this.yellowJButton.setBackground(Color.YELLOW);
		this.yellowJButton.setForeground(Color.YELLOW);
		this.yellowJButton.addActionListener(colorListener);
		this.blueJButton = new JButton("3");
		this.blueJButton.setBackground(Color.BLUE);
		this.blueJButton.setForeground(Color.BLUE);
		this.blueJButton.addActionListener(colorListener);
		this.blackJButton = new JButton("4");
		this.blackJButton.setBackground(Color.BLACK);
		this.blackJButton.setForeground(Color.BLACK);
		this.blackJButton.addActionListener(colorListener);
		this.orangeJButton = new JButton("5");
		this.orangeJButton.setBackground(Color.ORANGE);
		this.orangeJButton.setForeground(Color.ORANGE);
		this.orangeJButton.addActionListener(colorListener);
		this.greenJButton = new JButton("6");
		this.greenJButton.setBackground(Color.GREEN);
		this.greenJButton.setForeground(Color.GREEN);
		this.greenJButton.addActionListener(colorListener);

		this.jLabel = new JLabel("Wee Pùi Đẹp Trai", JLabel.CENTER);
		this.jLabel.setFont(new Font("ARIAL", Font.BOLD, 14));

		this.labelJPanel = new JPanel();
		this.labelJPanel.setLayout(new FlowLayout());
		//this.labelJPanel.add(jLabel);
		this.buttonJPanel = new JPanel();
		this.buttonJPanel.setLayout(new GridLayout(2, 3));
		this.buttonJPanel.add(redJButton);
		this.buttonJPanel.add(yellowJButton);
		this.buttonJPanel.add(blueJButton);
		this.buttonJPanel.add(blackJButton);
		this.buttonJPanel.add(orangeJButton);
		this.buttonJPanel.add(greenJButton);

		this.add(jLabel, BorderLayout.NORTH);
		this.add(buttonJPanel, BorderLayout.CENTER);
	}

	public void setColor(Color color) {
		//this.colorModel.setAll(color, color, true);
		this.jLabel.setForeground(color);
		this.jLabel.setBackground(color);
	}
}
