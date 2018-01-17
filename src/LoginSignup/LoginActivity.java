package LoginSignup;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

import DatabaseHelper.Database;
import FacultyUtils.FacultyPanel;
import HallUtils.FHallPanel;
import HallUtils.HallPanel;
import Utils.JuInfo;
import Utils.Menu;

import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class LoginActivity {
	public LoginActivity() {
	}

	// a separate class for processing database connection and authentication
	Database db;
	private static JButton btnGuest;
	private static JButton loginButton;
	private static JButton registerButton;
	private static JPasswordField passwordText;
	private static JTextField userText;

	static JFrame frame = new JFrame();

	public static void main(String[] args) {
		frame = new JFrame("WelCome To Jahangirnagar University !");
		frame.setBackground(Color.CYAN);
		frame.setSize(630, 518);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setForeground(Color.CYAN);
		frame.getContentPane().add(panel, "name_489342601993124");
		placeComponents(panel);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		btnGuest = new JButton("Guest");
		btnGuest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnGuest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JuInfo.main(null);
				frame.setVisible(false); //you can't see me!
				frame.dispose(); 

			}
		});
		btnGuest.setBounds(69, 393, 105, 23);
		panel.add(btnGuest);
		JLabel label = new JLabel(
				"\u09AA\u09CD\u09B0\u09BE\u0995\u09C3\u09A4\u09BF\u0995 \u09B8\u09CC\u09A8\u09CD\u09A6\u09B0\u09CD\u09AF\u09C7\u09B0 \u09B2\u09C0\u09B2\u09BE\u09AD\u09C2\u09AE\u09BF \u099C\u09BE\u09B9\u09BE\u0999\u09CD\u0997\u09C0\u09B0\u09A8\u0997\u09B0 \u09AC\u09BF\u09B6\u09CD\u09AC\u09AC\u09BF\u09A6\u09CD\u09AF\u09BE\u09B2\u09DF \u098F \u0986\u09AA\u09A8\u09BE\u0995\u09C7 \u09B8\u09CD\u09AC\u09BE\u0997\u09A4\u09AE !");
		label.setIcon(null);
		label.setBorder(UIManager.getBorder("TextField.border"));
		label.setForeground(Color.BLACK);
		label.setBackground(Color.CYAN);
		label.setFont(new Font("Kalpurush", Font.PLAIN, 20));
		label.setBounds(21, 115, 583, 64);
		panel.add(label);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Mac\\Desktop\\jahangirnagar-university-logo.png"));
		lblNewLabel.setBounds(106, 23, 394, 81);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				//frame.setVisible(false);
				//frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(194, 445, 129, 23);
		panel.add(btnNewButton);

		frame.setVisible(true);
	}

	private static void placeComponents(JPanel panel) {

		panel.setLayout(null);

		JLabel userLabel = new JLabel("User Name");
		userLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		userLabel.setBounds(78, 226, 80, 25);
		panel.add(userLabel);

		userText = new JTextField(20);
		userText.setFont(new Font("Tahoma", Font.PLAIN, 14));
		userText.setBounds(180, 226, 160, 25);
		panel.add(userText);

		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordLabel.setBounds(78, 279, 80, 25);
		panel.add(passwordLabel);

		passwordText = new JPasswordField(20);
		passwordText.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordText.setBounds(180, 279, 160, 25);
		panel.add(passwordText);

		loginButton = new JButton("Login");
		loginButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		loginButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				String userName, password;
				userName = userText.getText();
				password = passwordText.getText();
				Database db = new Database();
				try {
					db.connect();
					String check = db.login(userName, password);
					if (check == "Connected") {
						// new MainFrame();
						JOptionPane.showMessageDialog(null, "You have logged in successfully", "Success",
								JOptionPane.INFORMATION_MESSAGE);
						JuInfo.main(null);
						frame.setVisible(false); //you can't see me!
						frame.dispose(); 

						db.disconnect();
					} else {
						JOptionPane.showMessageDialog(null, "Login failed!", "Failed!!", JOptionPane.ERROR_MESSAGE);

					}

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Problem in Connection");
				}
			}
		});
		loginButton.setBounds(194, 345, 129, 25);
		panel.add(loginButton);

		registerButton = new JButton("Registration");
		registerButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrationPanel.main(null);
				frame.setVisible(false); //you can't see me!
				frame.dispose(); 
			};
		});
		registerButton.setBounds(343, 392, 118, 25);
		panel.add(registerButton);

	}
}