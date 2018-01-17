package FacultyUtils;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import DatabaseHelper.Database;
import HallUtils.Hall;
import HallUtils.HallPanel;
import Utils.Menu;

import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FacultyPanel {

	private JFrame frame;
	private JTable table;
	private JTable table_1;
	private CardLayout cardLayout;
	private JPanel panel;
	private JPanel panel_1;
	private JButton btnNewButton;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FacultyPanel window = new FacultyPanel();
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
	public FacultyPanel() {
		initialize();
		showAllFaculty();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Faculty and Isntitute Profile !");
		frame.setBackground(Color.CYAN);
		frame.setBounds(100, 100, 1088, 780);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));

		panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		frame.getContentPane().add(panel, "name_11263673144920");
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("All Faculty and Institute Informations");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(69, 11, 587, 32);
		panel.add(lblNewLabel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new LineBorder(Color.GREEN, 2));
		scrollPane.setBounds(10, 68, 832, 305);
		panel.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Id", "Faculty Name", "Dean Name"}));
		table.getColumnModel().getColumn(0).setPreferredWidth(51);
		table.getColumnModel().getColumn(1).setPreferredWidth(330);
		table.getColumnModel().getColumn(2).setPreferredWidth(301);
		scrollPane.setViewportView(table);
		
		btnNewButton = new JButton("Back to the Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu.main(null);
				frame.setVisible(false); //you can't see me!
				frame.dispose(); 
			}
		});
		btnNewButton.setForeground(Color.MAGENTA);
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(351, 672, 232, 23);
		panel.add(btnNewButton);

		panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, "name3");
		panel_1.setLayout(null);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 80, 547, 86);
		panel_1.add(scrollPane_1);

		table_1 = new JTable();
		table_1.setModel(
				new DefaultTableModel(new Object[][] {}, new String[] { "ID", "Name", "Dean Name"}));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(41);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(330);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(306);
		scrollPane_1.setViewportView(table_1);
		table.setRowHeight(35);
		
		JButton btnNewButton_1 = new JButton("Mathematics and Physics ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MathPhysicsPanel.main(null);
				frame.setVisible(false); //you can't see me!
				frame.dispose(); 
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setBounds(351, 460, 232, 23);
		panel.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Social Science");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SocialSciencePanel.main(null);
				frame.setVisible(false); //you can't see me!
				frame.dispose(); 
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.setBackground(Color.GREEN);
		btnNewButton_2.setBounds(351, 494, 232, 23);
		panel.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Arts and Humanities");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ArtsPanel.main(null);
				frame.setVisible(false); //you can't see me!
				frame.dispose(); 
			}
		});
		btnNewButton_3.setForeground(Color.BLUE);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3.setBackground(Color.GREEN);
		btnNewButton_3.setBounds(351, 528, 232, 23);
		panel.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Biological Science");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BiologicalPanel.main(null);
				frame.setVisible(false); //you can't see me!
				frame.dispose(); 
			}
		});
		btnNewButton_4.setForeground(Color.BLUE);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_4.setBackground(Color.GREEN);
		btnNewButton_4.setBounds(351, 562, 232, 23);
		panel.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("Business Studies");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BusinessPanel.main(null);
				frame.setVisible(false); //you can't see me!
				frame.dispose(); 
			}
		});
		btnNewButton_5.setForeground(Color.BLUE);
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_5.setBackground(Color.GREEN);
		btnNewButton_5.setBounds(351, 596, 232, 23);
		panel.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("Law");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LawPanel.main(null);
				frame.setVisible(false); //you can't see me!
				frame.dispose(); 
			}
		});
		btnNewButton_6.setBackground(Color.GREEN);
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_6.setForeground(Color.BLUE);
		btnNewButton_6.setBounds(351, 630, 232, 23);
		panel.add(btnNewButton_6);
		
		JLabel lblNewLabel_1 = new JLabel("Click Faculty Name and Show Department List Under Faculty : ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel_1.setBackground(Color.MAGENTA);
		lblNewLabel_1.setBounds(20, 384, 968, 40);
		panel.add(lblNewLabel_1);
	}

	public void showAllFaculty() {
		Database db = new Database();
		try {
			db.connect();
			ArrayList<Faculty> list = db.facultyList();
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			Object[] row = new Object[4];
			for (int i = 0; i < list.size(); i++) {
				row[0] = list.get(i).getId();
				row[1] = list.get(i).getName();
				row[2] = list.get(i).getDeanName();
				model.addRow(row);
			}

		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, "Problem in Connection");
		}
	}
}
