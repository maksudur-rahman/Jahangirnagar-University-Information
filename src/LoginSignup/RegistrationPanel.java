package LoginSignup;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import DatabaseHelper.Database;

public class RegistrationPanel{

	private static JFrame frame;
	private static JTextField userText;
	private static JPasswordField passwordText;
	Connection connection;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationPanel window = new RegistrationPanel();
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
	public RegistrationPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private static void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBackground(Color.CYAN);
		frame.setForeground(Color.CYAN);
		frame.getContentPane().setForeground(new Color(0, 128, 0));
		frame.setBounds(100, 100, 649, 534);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblWelcomeToRegistration = new JLabel("Welcome To Registration Panel");
		lblWelcomeToRegistration.setForeground(new Color(0, 0, 255));
		lblWelcomeToRegistration.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblWelcomeToRegistration.setBackground(Color.BLUE);
		lblWelcomeToRegistration.setBounds(42, 11, 483, 33);
		frame.getContentPane().add(lblWelcomeToRegistration);

		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUserName.setBounds(79, 109, 89, 30);
		frame.getContentPane().add(lblUserName);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(79, 164, 89, 30);
		frame.getContentPane().add(lblPassword);

		userText = new JTextField();
		userText.setFont(new Font("Tahoma", Font.BOLD, 14));
		userText.setBackground(Color.GREEN);
		userText.setBounds(196, 106, 187, 33);
		frame.getContentPane().add(userText);
		userText.setColumns(10);

		passwordText = new JPasswordField();
		passwordText.setBackground(Color.GREEN);
		passwordText.setFont(new Font("Tahoma", Font.BOLD, 14));
		passwordText.setBounds(196, 161, 187, 33);
		frame.getContentPane().add(passwordText);

		JButton btnRegister = new JButton("Register");
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnRegister.setForeground(Color.MAGENTA);
		btnRegister.setBackground(Color.GREEN);
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String userName, password;
				userName = userText.getText();
				password = passwordText.getText();
				UserRegistration userRegistration = new UserRegistration(userName, password);
				Database db = new Database();
				try {
					db.connect();
					// JOptionPane.showMessageDialog(null, "hudai");
					db.addUser(userRegistration);
					JOptionPane.showMessageDialog(null, "User Added OK !!!");
					LoginActivity.main(null);
					frame.setVisible(false); //you can't see me!
					frame.dispose(); 

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}
				userText.setText("");
				passwordText.setText("");
			}
		});
		btnRegister.setBounds(196, 259, 187, 45);
		frame.getContentPane().add(btnRegister);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginActivity.main(null);
				frame.setVisible(false); //you can't see me!
				frame.dispose(); 
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(42, 446, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
