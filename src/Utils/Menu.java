package Utils;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

import FacultyUtils.FacultyPanel;
import HallUtils.FHallPanel;
import HallUtils.HallPanel;
import LoginSignup.LoginActivity;
import OfficialBuilding.OfficialBuildingPanel;
import VisitingPlace.PlacePanel;

public class Menu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.PINK);
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 616, 494);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setForeground(Color.PINK);
		panel.setBorder(new LineBorder(Color.GREEN));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		int width,height;
		width=200;
		height=60;
		panel.setLayout(null);
		JLabel lblOptionMenu = new JLabel("Option Menu");
		lblOptionMenu.setLabelFor(frame);
		lblOptionMenu.setBounds(143, 6, 320, 60);
		lblOptionMenu.setBorder(new TitledBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "", TitledBorder.LEADING, TitledBorder.BELOW_BOTTOM, null, Color.RED));
		lblOptionMenu.setForeground(Color.GREEN);
		lblOptionMenu.setBackground(Color.DARK_GRAY);
		lblOptionMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblOptionMenu.setVerticalAlignment(SwingConstants.CENTER);
		lblOptionMenu.setPreferredSize(new Dimension(width, height));
		lblOptionMenu.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel.add(lblOptionMenu);
		
		JButton btnNewButton = new JButton("Male Hall");
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HallPanel.main(null);
				frame.setVisible(false); //you can't see me!
				frame.dispose(); 
			}
		});
		btnNewButton.setBounds(200, 107, 200, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Female Hall");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FHallPanel.main(null);
				frame.setVisible(false); //you can't see me!
				frame.dispose(); 
			}
		});
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(200, 152, 200, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Faculty and Institute");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FacultyPanel.main(null);
				frame.setVisible(false); //you can't see me!
				frame.dispose(); 
			}
		});
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.setBackground(Color.GREEN);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(200, 197, 200, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Official Building");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				OfficialBuildingPanel.main(null);
				frame.setVisible(false); //you can't see me!
				frame.dispose(); 
			}
		});
		btnNewButton_3.setForeground(Color.BLUE);
		btnNewButton_3.setBackground(Color.GREEN);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3.setBounds(200, 241, 200, 23);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Visiting Place");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlacePanel.main(null);
				frame.setVisible(false); //you can't see me!
				frame.dispose();
			}
		});
		btnNewButton_4.setForeground(Color.BLUE);
		btnNewButton_4.setBackground(Color.GREEN);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_4.setBounds(200, 283, 200, 23);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Logout");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginActivity.main(null);
				frame.setVisible(false); //you can't see me!
				frame.dispose(); 
			}
		});
		btnNewButton_5.setForeground(Color.GREEN);
		btnNewButton_5.setBackground(Color.RED);
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_5.setBounds(224, 402, 140, 23);
		panel.add(btnNewButton_5);
	}
}
