package jdbcjava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Registration extends JFrame {


	DBConnect connection = new DBConnect();
	private JPanel contentPane;
	private JTextField namee;
	private JTextField eduu;
	private JTextField emaill;
	private JTextField password;
	

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	
	
	public Registration() {
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1568, 834);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Cancle");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				home frame = new home();
				frame.setVisible(true);
			}
		});
		
		password = new JTextField();
		password.setFont(new Font("Times New Roman", Font.BOLD, 17));
		password.setColumns(10);
		password.setBounds(606, 470, 508, 39);
		contentPane.add(password);
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 24));
		btnNewButton.setBounds(933, 582, 168, 39);
		contentPane.add(btnNewButton);
		
		JLabel pass = new JLabel("Enter Password :");
		pass.setForeground(new Color(255, 255, 255));
		pass.setFont(new Font("Calibri", Font.BOLD, 28));
		pass.setBounds(328, 458, 237, 43);
		contentPane.add(pass);
		
		JLabel qual = new JLabel("Enter Qualification :");
		qual.setForeground(new Color(255, 255, 255));
		qual.setFont(new Font("Calibri", Font.BOLD, 28));
		qual.setBounds(328, 270, 252, 43);
		contentPane.add(qual);
		
		
		JLabel nn = new JLabel("");
		nn.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 28));
		nn.setForeground(Color.RED);
		nn.setBounds(1184, 195, 323, 23);
		contentPane.add(nn);
		
		
		
		eduu = new JTextField();
		eduu.setFont(new Font("Times New Roman", Font.BOLD, 17));
		eduu.setColumns(10);
		eduu.setBounds(606, 274, 508, 39);
		contentPane.add(eduu);
		
		namee = new JTextField();
		namee.setFont(new Font("Times New Roman", Font.BOLD, 18));
		namee.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				
				String PATTERN="[a-zA-Z]+\\.?";

				Pattern patt=Pattern.compile(PATTERN);

				Matcher match=patt.matcher(namee.getText());

				if(!match.matches()) {

			 nn.setText("Naming is incorrect!");
				
				}

				else{


					nn.setText (null);
				
		
				}	
			}
		});
		namee.setBounds(606, 182, 508, 39);
		contentPane.add(namee);
		namee.setColumns(10);
		
		

		
		JLabel name1 = new JLabel("Enter Name :");
		name1.setForeground(new Color(255, 255, 255));
		name1.setFont(new Font("Calibri", Font.BOLD, 28));
		name1.setBounds(328, 180, 168, 43);
		contentPane.add(name1);
		
		JButton reg_btn = new JButton("Register");
		reg_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			
					

					
					
				try{

					String name1,emaill1,edu1,pass1;

					if	(
					!namee.getText().isEmpty() && !emaill.getText().isEmpty() && !eduu.getText().isEmpty() && password.getText() != null)
					{
				

					name1 =namee.getText(); 
				    emaill1  = emaill.getText(); 
				    edu1 = eduu.getText(); 
					pass1 = password.getText();
					
				
					

					
			
			
			

				try{
					
					
					
					Connection con = connection.getConnection(); 
					Statement stmt = con.createStatement();

				

			//	System.out.println("Connection Established Successfull and the DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());
				 


				String query = " insert into Register (username, qualification,email, passwordd)" + " values (?, ?, ?, ?)";

				PreparedStatement preparedStmt = con.prepareStatement(query); 
				preparedStmt.setString (1,name1 );
				preparedStmt.setString (2, emaill1);
				preparedStmt.setString (3, edu1);
				preparedStmt.setString (4, pass1);

				
				preparedStmt.execute(); 
				// execute the preparedstatement preparedStmt.execute(); System.out.println("All data filled...");

				dispose();
				login frame = new login();
				frame.setVisible(true);

				}
				catch (Exception dbe)
				{
				System.out.println("Got an exception: "+dbe.getMessage());
				}
				}
				else
				{
				//error.setText("Enter All Details..."); System.out.println("Enter All Details...");
				}
				}

				catch(Exception ee)
				{System.out.println("Error:"+ee);}
				}
				});	
					
					
					

				
				
				
			
	
		reg_btn.setFont(new Font("Calibri", Font.BOLD, 24));
		reg_btn.setBounds(606, 582, 189, 39);
		contentPane.add(reg_btn);
		
		
		JLabel em = new JLabel("");
		em.setForeground(Color.RED);
		em.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		em.setBounds(1184, 356, 323, 23);
		contentPane.add(em);
		
		JLabel mail = new JLabel("Enter Email :");
		mail.setForeground(new Color(255, 255, 255));
		mail.setFont(new Font("Calibri", Font.BOLD, 28));
		mail.setBounds(328, 365, 168, 43);
		contentPane.add(mail);
		
		emaill = new JTextField();
		emaill.setFont(new Font("Times New Roman", Font.BOLD, 17));
		emaill.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				

				String PATTERN ="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

				Pattern patt=Pattern.compile(PATTERN);

				Matcher match=patt.matcher(emaill.getText());

				if(!match.matches()) {

			 em.setText("email is incorrect...!");
				
				}

				else{


				em.setText (null);
				
		
				}
				
			}
		});
		emaill.setColumns(10);
		emaill.setBounds(606, 356, 508, 39);
		contentPane.add(emaill);
		
		JLabel reg = new JLabel("Registration");
		reg.setForeground(new Color(255, 255, 255));
		reg.setFont(new Font("Calibri", Font.BOLD, 45));
		reg.setBounds(668, 41, 309, 57);
		contentPane.add(reg);
		
		JLabel pass1 = new JLabel("");
		pass1.setIcon(new ImageIcon("C:\\Users\\Veyktesh Khemlapure\\Pictures\\jobportal\\img8.png"));
		pass1.setBounds(0, 0, 1707, 800);
		contentPane.add(pass1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(1191, 195, 237, 13);
		contentPane.add(lblNewLabel);
		
		JLabel nm = new JLabel("");
		nm.setForeground(Color.RED);
		nm.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		nm.setBounds(1176, 185, 285, 23);
		contentPane.add(nm);
		
		
		
	}
	}
