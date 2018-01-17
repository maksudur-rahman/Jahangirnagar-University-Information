package Utils;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;

import HallUtils.HallPanel;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JuInfo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JuInfo window = new JuInfo();
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
	public JuInfo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Welcome To JU History !");
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBackground(Color.CYAN);
		frame.setBounds(100, 100, 1323, 685);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon("F:\\android Icon\\julogo.png"));
		lblNewLabel.setBounds(550, 0, 242, 250);
		frame.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Tahoma", Font.BOLD, 18));
		textArea.setForeground(Color.BLACK);
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setBounds(78, 261, 1144, 223);
		frame.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("Main Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu.main(null);
				frame.setVisible(false); //you can't see me!
				frame.dispose();
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(583, 551, 188, 46);
		frame.getContentPane().add(btnNewButton);
		  String fileName = "ju_history.txt";
	        String line = null;

	        try {
	            FileReader fileReader = new FileReader(fileName);
	            BufferedReader bufferedReader =  new BufferedReader(fileReader);
	            while((line = bufferedReader.readLine()) != null) {
	                System.out.println(line);
	                textArea.append(" "+"\n"+line+"\n");
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
