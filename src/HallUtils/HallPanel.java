package HallUtils;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import DatabaseHelper.Database;
import Utils.Menu;

import java.awt.Color;
import javax.swing.border.LineBorder;

public class HallPanel extends Hall{

	private JFrame frame;
	private JTable table;
	private JTable table_1;
	private CardLayout cardLayout;
	private JPanel panel;
	private JPanel panel_1;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HallPanel window = new HallPanel();
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
	public HallPanel() {
		initialize();
		showAllHall();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Male Hall Profile !");
		frame.setBackground(Color.CYAN);
		frame.setBounds(100, 100, 913, 562);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));

		panel = new JPanel();
		panel.setBackground(Color.MAGENTA);
		frame.getContentPane().add(panel, "name_11263673144920");
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("All Hall Informations");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBackground(Color.GREEN);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(105, 11, 323, 32);
		panel.add(lblNewLabel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new LineBorder(new Color(0, 255, 0), 2));
		scrollPane.setBounds(10, 68, 865, 315);
		panel.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Hall Id", "Hall Name", "Provost Name", "Telephone" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(51);
		table.getColumnModel().getColumn(1).setPreferredWidth(298);
		table.getColumnModel().getColumn(2).setPreferredWidth(301);
		table.getColumnModel().getColumn(3).setPreferredWidth(255);
		scrollPane.setViewportView(table);
		table.setRowHeight(35);
		
		btnNewButton = new JButton("Back to the Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu.main(null);
				frame.setVisible(false); //you can't see me!
				frame.dispose(); 
			}
		});
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(337, 467, 193, 32);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add New Hall");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setBounds(337, 418, 193, 32);
		panel.add(btnNewButton_1);
		panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, "name3");
		panel_1.setLayout(null);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 80, 547, 86);
		panel_1.add(scrollPane_1);

		table_1 = new JTable();
		table_1.setModel(
				new DefaultTableModel(new Object[][] {}, new String[] { "Hall ID", "Name", "Provost", "Telephone" }));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(41);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(322);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(306);
		table_1.getColumnModel().getColumn(3).setPreferredWidth(244);
		scrollPane_1.setViewportView(table_1);
	}

	public void showAllHall() {
		Database db = new Database();
		try {
			db.connect();
			ArrayList<Hall> list = db.hallList();
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			Object[] row = new Object[4];
			for (int i = 0; i < list.size(); i++) {
				row[0] = list.get(i).getHid();
				row[1] = list.get(i).getHname();
				row[2] = list.get(i).getHprovostname();
				row[3] = list.get(i).getHtelephone();
				model.addRow(row);
			}

		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, "Problem in Connection");
		}
	}
}
