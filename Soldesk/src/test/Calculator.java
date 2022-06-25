package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;

class Calculator {

	private JFrame frame;
	private String func = null;
	private int firstNum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 416, 562);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblResult = new JLabel("0");
		lblResult.setHorizontalAlignment(SwingConstants.RIGHT);
		lblResult.setBackground(Color.WHITE);
		lblResult.setFont(new Font("SansSerif", Font.PLAIN, 50));
		lblResult.setBounds(12, 10, 378, 132);
		frame.getContentPane().add(lblResult);

		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("SansSerif", Font.PLAIN, 40));
		btn1.setBounds(23, 152, 82, 82);
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("SansSerif", Font.PLAIN, 40));
		btn2.setBounds(117, 152, 82, 82);
		frame.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("SansSerif", Font.PLAIN, 40));
		btn3.setBounds(211, 152, 82, 82);
		frame.getContentPane().add(btn3);

		JButton btnPlus = new JButton("+");
		btnPlus.setFont(new Font("SansSerif", Font.PLAIN, 40));
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = lblResult.getText();
				firstNum = Integer.parseInt(curr);
				lblResult.setText(Integer.toString(0));
				func = "ADD";
			}
		});
		btnPlus.setBounds(305, 152, 82, 82);
		frame.getContentPane().add(btnPlus);

		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("SansSerif", Font.PLAIN, 40));
		btn4.setBounds(23, 244, 82, 82);
		frame.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("SansSerif", Font.PLAIN, 40));
		btn5.setBounds(117, 244, 82, 82);
		frame.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("SansSerif", Font.PLAIN, 40));
		btn6.setBounds(211, 244, 82, 82);
		frame.getContentPane().add(btn6);

		JButton btnMinus = new JButton("-");
		btnMinus.setFont(new Font("SansSerif", Font.PLAIN, 40));
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = lblResult.getText();
				firstNum = Integer.parseInt(curr);
				lblResult.setText(Integer.toString(0));
				func = "SUB";
			}
		});
		btnMinus.setBounds(305, 244, 82, 82);
		frame.getContentPane().add(btnMinus);

		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("SansSerif", Font.PLAIN, 40));
		btn7.setBounds(23, 336, 82, 82);
		frame.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("SansSerif", Font.PLAIN, 40));
		btn8.setBounds(117, 336, 82, 82);
		frame.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("SansSerif", Font.PLAIN, 40));
		btn9.setBounds(211, 336, 82, 82);
		frame.getContentPane().add(btn9);

		JButton btnMul = new JButton("*");
		btnMul.setFont(new Font("SansSerif", Font.PLAIN, 40));
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = lblResult.getText();
				firstNum = Integer.parseInt(curr);
				lblResult.setText(Integer.toString(0));
				func = "MUL";
			}
		});
		btnMul.setBounds(305, 336, 82, 82);
		frame.getContentPane().add(btnMul);

		JButton btnPoint = new JButton("C");
		btnPoint.setFont(new Font("SansSerif", Font.PLAIN, 40));
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblResult.setText(Integer.toString(0));
				firstNum = 0;
			}
		});
		btnPoint.setBounds(23, 428, 82, 82);
		frame.getContentPane().add(btnPoint);

		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("SansSerif", Font.PLAIN, 40));
		btn0.setBounds(117, 428, 82, 82);
		frame.getContentPane().add(btn0);

		JButton btnResult = new JButton("=");
		btnResult.setFont(new Font("SansSerif", Font.PLAIN, 40));
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch (func) {
				case "ADD": {
					int currVal = Integer.parseInt(lblResult.getText());
					lblResult.setText(Integer.toString(firstNum + currVal));
					break;
				}
				case "SUB": {
					int currVal = Integer.parseInt(lblResult.getText());
					lblResult.setText(Integer.toString(firstNum - currVal));
					break;
				}
				case "MUL": {
					int currVal = Integer.parseInt(lblResult.getText());
					lblResult.setText(Integer.toString(firstNum * currVal));
					break;
				}
				case "DIV": {
					int currVal = Integer.parseInt(lblResult.getText());
					lblResult.setText(Double.toString(firstNum / currVal));
					break;
				}
				}
			}
		});
		btnResult.setBounds(211, 428, 82, 82);
		frame.getContentPane().add(btnResult);

		JButton btnDiv = new JButton("/");
		btnDiv.setFont(new Font("SansSerif", Font.PLAIN, 40));
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = lblResult.getText();
				firstNum = Integer.parseInt(curr);
				lblResult.setText(Integer.toString(0));
				func = "DIV";
			}
		});
		btnDiv.setBounds(305, 428, 82, 82);
		frame.getContentPane().add(btnDiv);

		btn1.addActionListener(new NumberActionListener(lblResult, 1));
		btn2.addActionListener(new NumberActionListener(lblResult, 2));
		btn3.addActionListener(new NumberActionListener(lblResult, 3));
		btn4.addActionListener(new NumberActionListener(lblResult, 4));
		btn5.addActionListener(new NumberActionListener(lblResult, 5));
		btn6.addActionListener(new NumberActionListener(lblResult, 6));
		btn7.addActionListener(new NumberActionListener(lblResult, 7));
		btn8.addActionListener(new NumberActionListener(lblResult, 8));
		btn9.addActionListener(new NumberActionListener(lblResult, 9));
		btn0.addActionListener(new NumberActionListener(lblResult, 0));
	}
}
