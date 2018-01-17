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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class Register {
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register window = new Register();
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
	public Register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Welcome To Central Register Building !");
		frame.setBounds(100, 100, 850, 780);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new LineBorder(Color.GREEN, 2));
		scrollPane.setBounds(10, 265, 802, 335);
		frame.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.CYAN);
		textArea.setForeground(Color.BLACK);
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textArea.setBounds(5,5,633,335);
		scrollPane.setViewportView(textArea);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(169, 0, 240, 254);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("F:\\android Icon\\julogo.png"));
		
		JButton btnNewButton = new JButton("Back To The Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OfficialBuildingPanel.main(null);
				frame.setVisible(false); //you can't see me!
				frame.dispose();
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(268, 626, 173, 43);
		frame.getContentPane().add(btnNewButton);
		
		

		 String fileName = "register.txt";
		    String line = null;

		    try {
		        FileReader fileReader = new FileReader(fileName);
		        BufferedReader bufferedReader =  new BufferedReader(fileReader);

		        while((line = bufferedReader.readLine()) != null) {
		            //System.out.println(line);
		        	textArea.append("\n"+line);
		        }   
		        bufferedReader.close();         
		    }
		    catch(FileNotFoundException ex) {
		        System.out.println("Unable to open file '" + fileName + "'");                
		    }
		    catch(IOException ex) {
		        System.out.println("Error reading file '" + fileName + "'");                  
		    }
		
		
	}
}
