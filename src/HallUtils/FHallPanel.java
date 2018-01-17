package HallUtils;

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
import Utils.Menu;

import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FHallPanel extends FHall{
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
					FHallPanel window = new FHallPanel();
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
	public FHallPanel() {
		initialize();
		showAllHall();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Female Hall Profile !");
		frame.setBackground(Color.CYAN);
		frame.setBounds(100, 100, 827, 562);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));

		panel = new JPanel();
		panel.setBackground(Color.GREEN);
		frame.getContentPane().add(panel, "name_11263673144920");
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("All Hall Informations");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(109, 11, 375, 32);
		panel.add(lblNewLabel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setToolTipText("");
		scrollPane.setViewportBorder(new CompoundBorder(new LineBorder(new Color(255, 0, 0), 2), new LineBorder(new Color(0, 0, 0), 2)));
		scrollPane.setBounds(0, 70, 801, 311);
		panel.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Hall Id", "Hall Name", "Provost Name", "Telephone" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(60);
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
		btnNewButton.setForeground(Color.MAGENTA);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(272, 444, 196, 32);
		panel.add(btnNewButton);
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
			ArrayList<FHall> list = db.fhallList();
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
