package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

class NumberActionListener implements ActionListener {
	private JLabel jlabel;
	private int number;

	public NumberActionListener(JLabel jlabel, int number) {
		this.jlabel = jlabel;
		this.number = number;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String curr = jlabel.getText();
		if (curr.equals(Integer.toString(0)))
			jlabel.setText(Integer.toString(number));
		else
			jlabel.setText(jlabel.getText() + Integer.toString(number));
	}
}
