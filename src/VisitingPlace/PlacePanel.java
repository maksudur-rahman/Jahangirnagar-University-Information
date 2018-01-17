package VisitingPlace;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import FacultyUtils.FacultyPanel;
import HallUtils.FHallPanel;
import HallUtils.HallPanel;
import OfficialBuilding.OfficialBuildingPanel;
import Utils.Menu;

public class PlacePanel {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlacePanel window = new PlacePanel();
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
	public PlacePanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.PINK);
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 616, 592);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setForeground(Color.GRAY);
		panel.setBorder(new LineBorder(Color.GREEN));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		int width,height;
		width=200;
		height=60;
		panel.setLayout(null);
		JLabel lblOptionMenu = new JLabel("Visiting Place");
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
		
		JButton btnNewButton = new JButton("Shahid Minar");
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
		btnNewButton.setBounds(143, 107, 320, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Pitha Chattar");
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
		btnNewButton_1.setBounds(143, 152, 320, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Tarzan Point");
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
		btnNewButton_2.setBounds(143, 197, 320, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Swimming pool");
		btnNewButton_3.setForeground(Color.BLUE);
		btnNewButton_3.setBackground(Color.GREEN);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3.setBounds(143, 241, 320, 23);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Switzerland");
		btnNewButton_4.setForeground(Color.BLUE);
		btnNewButton_4.setBackground(Color.GREEN);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_4.setBounds(143, 283, 320, 23);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Back To The Menu");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu.main(null);
				frame.setVisible(false); //you can't see me!
				frame.dispose(); 
			}
		});
		btnNewButton_5.setForeground(Color.GREEN);
		btnNewButton_5.setBackground(Color.RED);
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_5.setBounds(226, 484, 176, 23);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Bottola");
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_6.setForeground(Color.BLUE);
		btnNewButton_6.setBackground(Color.GREEN);
		btnNewButton_6.setBounds(143, 322, 320, 23);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Botanical Garden");
		btnNewButton_7.setForeground(Color.BLUE);
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_7.setBackground(Color.GREEN);
		btnNewButton_7.setBounds(143, 368, 320, 23);
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Brindaban");
		btnNewButton_8.setForeground(Color.BLUE);
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_8.setBackground(Color.GREEN);
		btnNewButton_8.setBounds(143, 410, 320, 23);
		panel.add(btnNewButton_8);
	}
}
