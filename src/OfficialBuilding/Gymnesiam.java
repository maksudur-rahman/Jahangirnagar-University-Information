package OfficialBuilding;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Gymnesiam {
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gymnesiam window = new Gymnesiam();
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
	public Gymnesiam() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Welcome To Central Cafeteria !");
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(256, 11, 1320, 741);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("F:\\android Icon\\julogo.png"));
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBackground(Color.GREEN);
		lblNewLabel.setBounds(516, 11, 198, 250);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(55, 272, 1216, 355);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Tahoma", Font.BOLD, 17));
		textArea.setForeground(Color.BLACK);
		textArea.setBounds(0, 0, 1176, 356);
		textArea.append("The university has a gymnasium, It is well-equipped.");
		panel_1.add(textArea);
		
		JButton btnNewButton = new JButton("Back To The Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OfficialBuildingPanel.main(null);
				frame.setVisible(false); //you can't see me!
				frame.dispose();
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(567, 665, 263, 44);
		panel.add(btnNewButton);
		frame.setBackground(Color.CYAN);
		frame.setBounds(100, 100, 1323, 832);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
