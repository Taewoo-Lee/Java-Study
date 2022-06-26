package customerdata;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Customer_App {

	private JFrame frame;
	private JTextField txtEnterId;
	private JTextField txtEnterPw;
	private JLabel lblID;
	private JLabel lblPW;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_App window = new Customer_App();
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
	public Customer_App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		ImagePanel welcomePanel = new ImagePanel(new ImageIcon("./image/welcome.jpg").getImage());
		frame.setSize(welcomePanel.getWidth(), welcomePanel.getHeight());
		frame.setResizable(false);
		frame.getContentPane().add(welcomePanel, BorderLayout.NORTH);
		
		JLabel lblLogIn = new JLabel("Log In");
		lblLogIn.setFont(new Font("Lucida Sans", Font.BOLD, 30));
		lblLogIn.setBounds(380, 36, 100, 39);
		welcomePanel.add(lblLogIn);
		
		txtEnterId = new JTextField();
		txtEnterId.setText("Enter ID");
		txtEnterId.setToolTipText("ID");
		txtEnterId.setBounds(336, 95, 188, 39);
		welcomePanel.add(txtEnterId);
		txtEnterId.setColumns(10);
		
		txtEnterPw = new JTextField();
		txtEnterPw.setText("Enter PW");
		txtEnterPw.setToolTipText("PWD");
		txtEnterPw.setColumns(10);
		txtEnterPw.setBounds(336, 144, 188, 39);
		welcomePanel.add(txtEnterPw);
		
		lblID = new JLabel("ID: ");
		lblID.setFont(new Font("Lucida Sans", Font.PLAIN, 20));
		lblID.setBounds(279, 100, 47, 28);
		welcomePanel.add(lblID);
		
		lblPW = new JLabel("PW:");
		lblPW.setFont(new Font("Lucida Sans", Font.PLAIN, 20));
		lblPW.setBounds(277, 144, 47, 28);
		welcomePanel.add(lblPW);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.setFont(new Font("Lucida Sans", Font.BOLD, 30));
		btnLogIn.setBounds(279, 193, 277, 46);
		welcomePanel.add(btnLogIn);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
