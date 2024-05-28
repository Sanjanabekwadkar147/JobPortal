package jdbcjava;

import java.awt.EventQueue;

import java.util.regex.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Window;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Applicant_details{

	JFrame frmApplicant_details;
	private JTextField fu;
	private JTextField ad;
	private JTextField ge;
	private JTextField ed;
	private JTextField mo;
	private JTextField qu;
	private JTextField ex;
	private JTextField id;
	
	DBConnect connection = new DBConnect();
	private JTextField job;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Applicant_details window = new Applicant_details();
				window.frmApplicant_details.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Applicant_details() {
		initialize();
	}

	
	private void initialize() {
		frmApplicant_details = new JFrame();
		frmApplicant_details.getContentPane().setForeground(new Color(255, 255, 255));
		frmApplicant_details.setForeground(new Color(255, 255, 255));
		frmApplicant_details.getContentPane().setBackground(new Color(255, 255, 255));
		frmApplicant_details.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 7));
		frmApplicant_details.setTitle("Registration_user");
		frmApplicant_details.setBounds(100, 100, 1517, 1022);
		frmApplicant_details.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmApplicant_details.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Applicant Details");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 30));
		lblNewLabel.setBounds(548, 69, 228, 42);
		frmApplicant_details.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Full name");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Calibri", Font.BOLD, 25));
		lblNewLabel_2.setBounds(209, 215, 152, 28);
		frmApplicant_details.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Address");
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setFont(new Font("Calibri", Font.BOLD, 25));
		lblNewLabel_2_1.setBounds(209, 269, 152, 28);
		frmApplicant_details.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Gender");
		lblNewLabel_2_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_2.setFont(new Font("Calibri", Font.BOLD, 25));
		lblNewLabel_2_2.setBounds(209, 329, 152, 28);
		frmApplicant_details.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Email Id");
		lblNewLabel_2_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_3.setFont(new Font("Calibri", Font.BOLD, 25));
		lblNewLabel_2_3.setBounds(209, 385, 152, 28);
		frmApplicant_details.getContentPane().add(lblNewLabel_2_3);
		
		JLabel mlab = new JLabel("");
		mlab.setForeground(new Color(255, 0, 0));
		mlab.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 32));
		mlab.setBounds(1040, 452, 303, 28);
		frmApplicant_details.getContentPane().add(mlab);
		
		JLabel nlab = new JLabel("");
		nlab.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 34));
		nlab.setForeground(new Color(255, 0, 0));
		nlab.setBounds(973, 222, 338, 28);
		frmApplicant_details.getContentPane().add(nlab);
		
		
		
		
		
		JLabel lblNewLabel_2_4 = new JLabel("Mobile No.");
		lblNewLabel_2_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_4.setFont(new Font("Calibri", Font.BOLD, 25));
		lblNewLabel_2_4.setBounds(209, 452, 152, 28);
		frmApplicant_details.getContentPane().add(lblNewLabel_2_4);
		
		fu = new JTextField();
		fu.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				String PATTERN="[a-zA-Z]+\\.?";

				Pattern patt=Pattern.compile(PATTERN);

				Matcher match=patt.matcher(fu.getText());

				if(!match.matches()) {

			 nlab.setText("Naming is incorrect!");
				
				}

				else{


					nlab.setText (null);
				
		
				}	
				
			}
			
		});
		fu.setFont(new Font("Dialog", Font.BOLD, 13));
		fu.setForeground(new Color(0, 0, 0));
		fu.setBounds(461, 215, 450, 28);
		frmApplicant_details.getContentPane().add(fu);
		fu.setColumns(10);
		
		ad = new JTextField();
		ad.setFont(new Font("Dialog", Font.BOLD, 13));
		ad.setForeground(new Color(0, 0, 0));
		ad.setColumns(10);
		ad.setBounds(461, 273, 450, 28);
		frmApplicant_details.getContentPane().add(ad);
		
		
		
		JLabel elab = new JLabel("");
		elab.setForeground(new Color(255, 0, 0));
		elab.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 33));
		elab.setBounds(1004, 385, 323, 28);
		frmApplicant_details.getContentPane().add(elab);
		
		ge = new JTextField();
		ge.setFont(new Font("Dialog", Font.BOLD, 13));
		ge.setForeground(new Color(0, 0, 0));
		ge.setColumns(10);
		ge.setBounds(461, 333, 450, 28);
		frmApplicant_details.getContentPane().add(ge);
		
		
		ed = new JTextField();
		ed.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				
				
				String PATTERN ="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

				Pattern patt=Pattern.compile(PATTERN);

				Matcher match=patt.matcher(ed.getText());

				if(!match.matches()) {

			 elab.setText("email is incorrect...!");
				
				}

				else{


				elab.setText (null);
				
		
				}
				
				
				
				
				
				
				
				
				
			}
		});
		ed.setFont(new Font("Dialog", Font.BOLD, 13));
		ed.setForeground(new Color(0, 0, 0));
		ed.setColumns(10);
		ed.setBounds(461, 389, 450, 28);
		frmApplicant_details.getContentPane().add(ed);
		
		mo = new JTextField();
		mo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				String PATTERN="^[0-9]{0,10}$";

				Pattern patt=Pattern.compile(PATTERN);

				Matcher match=patt.matcher(mo.getText());

				if(!match.matches()) {

			 mlab.setText("Number is incorrect!");
				
				}

				else{


					mlab.setText (null);
				
		
				}
			}
		});
		mo.setFont(new Font("Dialog", Font.BOLD, 13));
		mo.setForeground(new Color(0, 0, 0));
		mo.setColumns(10);
		mo.setBounds(461, 452, 450, 28);
		frmApplicant_details.getContentPane().add(mo);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("Qualification");
		lblNewLabel_2_4_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_4_1.setFont(new Font("Calibri", Font.BOLD, 25));
		lblNewLabel_2_4_1.setBounds(209, 519, 152, 28);
		frmApplicant_details.getContentPane().add(lblNewLabel_2_4_1);
		
		JLabel lblNewLabel_2_4_2 = new JLabel("Experience");
		lblNewLabel_2_4_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_4_2.setFont(new Font("Calibri", Font.BOLD, 25));
		lblNewLabel_2_4_2.setBounds(209, 580, 152, 28);
		frmApplicant_details.getContentPane().add(lblNewLabel_2_4_2);
		
		
		
		qu = new JTextField();
		qu.setFont(new Font("Dialog", Font.BOLD, 13));
		qu.setForeground(new Color(0, 0, 0));
		qu.setColumns(10);
		qu.setBounds(461, 519, 450, 28);
		frmApplicant_details.getContentPane().add(qu);
		
		ex = new JTextField();
		ex.setFont(new Font("Dialog", Font.BOLD, 13));
		ex.setForeground(new Color(0, 0, 0));
		ex.setColumns(10);
		ex.setBounds(461, 580, 450, 28);
		frmApplicant_details.getContentPane().add(ex);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					
					
					

					String id1,name,address,gender,email,moblie,qualification,experince,job1;

					if	(!id.getText().isEmpty()	&&	!fu.getText().isEmpty()	&&
					!ad.getText().isEmpty() && !ge.getText().isEmpty() && !ed.getText().isEmpty() && !mo.getText().isEmpty() && !qu.getText().isEmpty()&& !job.getText().isEmpty()&& ex.getText()!= null)
											{
				

						id1= id.getText(); 
						name  = fu.getText(); 
						address= ad.getText(); 
						gender = ge.getText();

						email = ed.getText(); 
						moblie = mo.getText();
						qualification =qu.getText();
						experince=ex.getText();
					    job1=job.getText();
			
			
			

				try{
					
					
					
					Connection con = connection.getConnection(); 
					Statement stmt = con.createStatement();

				

			//	System.out.println("Connection Established Successfull and the DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());
				 


				String query = " insert into applicant (u_id, u_name,Adderss, gender, email,moblie,qualification,experince,job_apllied)" + " values (?,?, ?, ?, ?, ?,?,?, ?)";

				PreparedStatement preparedStmt = con.prepareStatement(query); 
				preparedStmt.setString (1, id1);
				preparedStmt.setString (2, name);
				preparedStmt.setString (3, address);
				preparedStmt.setString (4, gender);

				preparedStmt.setString (5, email);
				preparedStmt.setString (6, moblie);
				preparedStmt.setString (7, qualification);
				preparedStmt.setString (8, experince);
				preparedStmt.setString (9, job1);



				
				preparedStmt.execute(); 
							
				userhome frame1 = new userhome();
				frame1.setVisible(true);
				// execute the preparedstatement preparedStmt.execute(); 
				System.out.println("All data filled...");

				frmApplicant_details.dispose();

				}
				catch (Exception dbe)
				{
				System.out.println("Got an exception: "+dbe.getMessage());
				}
				}
				else
				{
					
					
				//error.setText("Enter All Details..."); 
				System.out.println("Enter All Details...");
				}
				}

				catch(Exception ee)
				
				
				{
					
										System.out.println("Error:"+ee);}
				}
				
				
				
				
			
		});
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 25));
		btnNewButton.setBounds(768, 697, 143, 42);
		frmApplicant_details.getContentPane().add(btnNewButton);
		
		JLabel id1 = new JLabel("");
		id1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		id1.setForeground(Color.RED);
		id1.setBounds(1040, 161, 271, 20);
		frmApplicant_details.getContentPane().add(id1);
		
		
		JLabel lblNewLabel_1 = new JLabel("Create your ID");
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 25));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(209, 161, 152, 28);
		frmApplicant_details.getContentPane().add(lblNewLabel_1);
		
		id = new JTextField();
		id.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
			
				
				String PATTERN="^[0-9]{0,1}$";

				Pattern patt=Pattern.compile(PATTERN);

				Matcher match=patt.matcher(id.getText());

				if(!match.matches()) {

			 id1.setText("Number is incorrect!");
				
				}

				else{


					id1.setText (null);
				
		
				}
			
					
				
				
			}
		});
		id.setFont(new Font("Dialog", Font.BOLD, 13));
		id.setForeground(new Color(0, 0, 0));
		id.setColumns(10);
		id.setBounds(461, 162, 450, 28);
		frmApplicant_details.getContentPane().add(id);
		
		JLabel lblNewLabel_3 = new JLabel("Job Applied");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Calibri", Font.BOLD, 25));
		lblNewLabel_3.setBounds(209, 631, 140, 25);
		frmApplicant_details.getContentPane().add(lblNewLabel_3);
		
		job = new JTextField();
		job.setFont(new Font("Dialog", Font.BOLD, 13));
		job.setForeground(new Color(0, 0, 0));
		job.setColumns(10);
		job.setBounds(461, 633, 450, 28);
		frmApplicant_details.getContentPane().add(job);
		
		JLabel img = new JLabel("");
		img.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 26));
		img.setForeground(new Color(255, 255, 255));
		img.setIcon(new ImageIcon("C:\\Users\\Veyktesh Khemlapure\\Pictures\\jobportal\\img8.png"));
		img.setBounds(0, 0, 1607, 910);
		frmApplicant_details.getContentPane().add(img);
		
		
		
		
	
	}
}
