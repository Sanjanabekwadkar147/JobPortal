package jdbcjava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class login extends JFrame {

	
	private JPanel contentPane;
	private JTextField userr;
	private JPasswordField pwd;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	DBConnect connection = new DBConnect();
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1487, 1020);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				home frame = new home();
				frame.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(964, 467, 137, 40);
		contentPane.add(btnNewButton);
		
		JLabel i = new JLabel("");
		i.setForeground(Color.RED);
		i.setFont(new Font("Times New Roman", Font.BOLD, 33));
		i.setBounds(452, 574, 605, 33);
		contentPane.add(i);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton log_btn = new JButton("Submit");
		log_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = userr.getText();
			String Pass =String.valueOf(pwd.getPassword());
			
			
		

			  
			
				
				
			try {
				
				Connection con = connection.getConnection(); 
	            Statement stmt = con.createStatement();
				Statement statement;
				
				ResultSet resultSet;

				//System.out.println("Connection	Established	Successfull	and	the DATABASE NAME IS:"+ con.getMetaData().getDatabaseProductName());

				String query = "select username, passwordd from Register where username='" + user + "' and passwordd='" + Pass+ "'";
				PreparedStatement preparedStmt = con.prepareStatement(query); 
				resultSet = preparedStmt.executeQuery();

				while (resultSet.next()) {
				if	(user.equals(resultSet.getString("username"))	&& Pass.equals(resultSet.getString("passwordd"))) {
				//new logedin(user, Pass); 

					dispose();
					userhome frame1 = new userhome();
					frame1.setVisible(true);
				
				System.out.println("User found"); 

				
				}
				}
				if (resultSet.next() == false) { 
					//System.out.println("Invalid username or password"); 
				     i.setText("Incorrect Id or Password.......! ");
				}
				
				else {
					 i.setText("Sucess ");
				}
				 

				} catch (Exception dbe) { System.out.println("Got an Exception..."); 
				System.out.println(dbe.getMessage());
				}
				}
		
			
			
		});
		
		
		log_btn.setBounds(646, 467, 175, 48);
		log_btn.setFont(new Font("Calibri", Font.BOLD, 30));
		contentPane.add(log_btn);
		
		JLabel login = new JLabel("Login Page");
		login.setForeground(new Color(255, 255, 255));
		login.setBounds(709, 101, 234, 40);
		login.setFont(new Font("Calibri", Font.BOLD, 40));
		contentPane.add(login);
		
		userr = new JTextField();
		userr.setBounds(641, 232, 447, 40);
		contentPane.add(userr);
		userr.setColumns(10);
		
		JLabel passwd = new JLabel("Enter Password : ");
		passwd.setForeground(new Color(255, 255, 255));
		passwd.setBounds(377, 320, 216, 48);
		passwd.setFont(new Font("Calibri", Font.BOLD, 28));
		contentPane.add(passwd);
		
		JLabel mail1 = new JLabel("Enter Username : ");
		mail1.setForeground(new Color(255, 255, 255));
		mail1.setBounds(377, 227, 216, 48);
		mail1.setFont(new Font("Calibri", Font.BOLD, 28));
		contentPane.add(mail1);
		
		pwd = new JPasswordField();
		pwd.setBounds(641, 328, 447, 40);
		contentPane.add(pwd);
		
		JLabel img1 = new JLabel("");
		img1.setBounds(0, -288, 1705, 1455);
		img1.setIcon(new ImageIcon("C:\\Users\\Veyktesh Khemlapure\\Pictures\\jobportal\\img8.png"));
		contentPane.add(img1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 0, 5, 22);
		contentPane.add(textArea);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(-121, 10, 1414, 853);
		contentPane.add(lblNewLabel);
		
		
	}
}
