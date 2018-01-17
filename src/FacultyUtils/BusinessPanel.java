package FacultyUtils;

import java.awt.CardLayout;
import java.awt.Color;
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
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import DatabaseHelper.Database;
import HallUtils.Hall;
import HallUtils.HallPanel;
import Utils.Menu;

public class BusinessPanel {


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
					BusinessPanel window = new BusinessPanel();
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
	public BusinessPanel() {
		initialize();
		showAllHall();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Faculty of Business Studies Profile !");
		frame.setBackground(Color.CYAN);
		frame.setBounds(100, 100, 913, 562);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));

		panel = new JPanel();
		frame.setBackground(Color.CYAN);
		panel.setBackground(Color.MAGENTA);
		frame.getContentPane().add(panel, "name_11263673144920");
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Faculty of Business Studies : ");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBackground(Color.GREEN);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(105, 11, 454, 32);
		panel.add(lblNewLabel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new LineBorder(new Color(0, 255, 0), 2));
		scrollPane.setBounds(10, 68, 865, 315);
		panel.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Department Id", "Department Name"}));
		table.getColumnModel().getColumn(0).setPreferredWidth(51);
		table.getColumnModel().getColumn(1).setPreferredWidth(298);
		scrollPane.setViewportView(table);
		table.setRowHeight(35);
		
		btnNewButton = new JButton("Back to the Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FacultyPanel.main(null);
				frame.setVisible(false); //you can't see me!
				frame.dispose(); 
			}
		});
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(340, 452, 193, 32);
		panel.add(btnNewButton);
		panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, "name3");
		panel_1.setLayout(null);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 80, 547, 86);
		panel_1.add(scrollPane_1);

		table_1 = new JTable();
		table_1.setModel(
				new DefaultTableModel(new Object[][] {}, new String[] { "Department ID", "Department Name"}));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(41);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(322);
		scrollPane_1.setViewportView(table_1);
	}

	public void showAllHall() {
		Database db = new Database();
		try {
			db.connect();
			ArrayList<facultylist> list = db.business();
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			Object[] row = new Object[4];
			for (int i = 0; i < list.size(); i++) {
				row[0] = list.get(i).getId();
				row[1] = list.get(i).getName();
				model.addRow(row);
			}

		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, "Problem in Connection");
		}
	}

}
