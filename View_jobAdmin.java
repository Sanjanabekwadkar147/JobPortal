package jdbcjava;

//package project1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class View_jobAdmin extends JFrame {

	private JPanel contentPane;
	private JTextField jobid;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_jobAdmin frame = new View_jobAdmin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public View_jobAdmin() {
		
		DBConnect connection = new DBConnect();

		setTitle("View_jobs");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1471, 867);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		jobid = new JTextField();
		jobid.setBounds(945, 10, 96, 19);
		contentPane.add(jobid);
		jobid.setColumns(10);
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("delete");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String takenid = jobid.getText();
				System.out.print(takenid);
				
				
				try(Connection con = connection.getConnection(); 
						
			            Statement stmt = con.createStatement();) {
			            //query
			            stmt.executeUpdate("DELETE FROM jobportal.postjob WHERE j_id= '"+takenid+"';");
			            
			            dispose();
			            AdminHome frame = new AdminHome();
						frame.setVisible(true);
			           
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_1.setBounds(1074, 10, 85, 19);
		contentPane.add(btnNewButton_1);
	
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setForeground(new Color(255, 128, 128));
		panel_4.setBounds(69, 643, 1300, 120);
		contentPane.add(panel_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Job ID: ");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_5.setBounds(10, 10, 56, 13);
		panel_4.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_1_8 = new JLabel("Job Title :");
		lblNewLabel_1_1_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_8.setBounds(10, 37, 56, 13);
		panel_4.add(lblNewLabel_1_1_8);
		
		JLabel lblNewLabel_1_1_1_4 = new JLabel(" Location :");
		lblNewLabel_1_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1_4.setBounds(10, 60, 60, 13);
		panel_4.add(lblNewLabel_1_1_1_4);
		
		JLabel lblNewLabel_1_1_2_4 = new JLabel("Category :");
		lblNewLabel_1_1_2_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_2_4.setBounds(355, 60, 60, 13);
		panel_4.add(lblNewLabel_1_1_2_4);
		
		JLabel lblNewLabel_1_1_3_4 = new JLabel("Status :");
		lblNewLabel_1_1_3_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_3_4.setBounds(716, 60, 60, 13);
		panel_4.add(lblNewLabel_1_1_3_4);
		
		JLabel lblNewLabel_1_1_4_4 = new JLabel("Job Description :");
		lblNewLabel_1_1_4_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_4_4.setBounds(10, 87, 100, 13);
		panel_4.add(lblNewLabel_1_1_4_4);
		
		JLabel id_4 = new JLabel("null");
		id_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		id_4.setBounds(65, 2, 85, 24);
		panel_4.add(id_4);
		
		JLabel title_4 = new JLabel("null");
		title_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		title_4.setBounds(76, 29, 203, 24);
		panel_4.add(title_4);
		
		JLabel dess_4 = new JLabel("null");
		dess_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		dess_4.setBounds(124, 79, 412, 24);
		panel_4.add(dess_4);
		
		JLabel cat_4 = new JLabel("null");
		cat_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		cat_4.setBounds(424, 52, 198, 24);
		panel_4.add(cat_4);
		
		JLabel locc_4 = new JLabel("null");
		locc_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		locc_4.setBounds(80, 52, 85, 24);
		panel_4.add(locc_4);
		
		JLabel st_4 = new JLabel("null");
		st_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		st_4.setBounds(786, 52, 85, 24);
		panel_4.add(st_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setForeground(new Color(255, 128, 128));
		panel_3.setBounds(69, 498, 1300, 120);
		contentPane.add(panel_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Job ID: ");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_4.setBounds(10, 10, 56, 13);
		panel_3.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_1_7 = new JLabel("Job Title :");
		lblNewLabel_1_1_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_7.setBounds(10, 37, 56, 13);
		panel_3.add(lblNewLabel_1_1_7);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel(" Location :");
		lblNewLabel_1_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1_3.setBounds(10, 60, 60, 13);
		panel_3.add(lblNewLabel_1_1_1_3);
		
		JLabel lblNewLabel_1_1_2_3 = new JLabel("Category :");
		lblNewLabel_1_1_2_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_2_3.setBounds(355, 60, 60, 13);
		panel_3.add(lblNewLabel_1_1_2_3);
		
		JLabel lblNewLabel_1_1_3_3 = new JLabel("Status :");
		lblNewLabel_1_1_3_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_3_3.setBounds(716, 60, 60, 13);
		panel_3.add(lblNewLabel_1_1_3_3);
		
		JLabel lblNewLabel_1_1_4_3 = new JLabel("Job Description :");
		lblNewLabel_1_1_4_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_4_3.setBounds(10, 87, 100, 13);
		panel_3.add(lblNewLabel_1_1_4_3);
		
		JLabel id_3 = new JLabel("null");
		id_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		id_3.setBounds(65, 2, 85, 24);
		panel_3.add(id_3);
		
		JLabel title_3 = new JLabel("null");
		title_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		title_3.setBounds(76, 29, 177, 24);
		panel_3.add(title_3);
		
		JLabel dess_3 = new JLabel("null");
		dess_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		dess_3.setBounds(124, 79, 354, 24);
		panel_3.add(dess_3);
		
		JLabel cat_3 = new JLabel("null");
		cat_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		cat_3.setBounds(424, 52, 177, 24);
		panel_3.add(cat_3);
		
		JLabel locc_3 = new JLabel("null");
		locc_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		locc_3.setBounds(80, 52, 85, 24);
		panel_3.add(locc_3);
		
		JLabel st_3 = new JLabel("null");
		st_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		st_3.setBounds(786, 52, 85, 24);
		panel_3.add(st_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setForeground(new Color(255, 128, 128));
		panel_2.setBounds(69, 348, 1300, 120);
		contentPane.add(panel_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Job ID: ");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_3.setBounds(10, 10, 56, 13);
		panel_2.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_6 = new JLabel("Job Title :");
		lblNewLabel_1_1_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_6.setBounds(10, 37, 56, 13);
		panel_2.add(lblNewLabel_1_1_6);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel(" Location :");
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1_2.setBounds(10, 60, 60, 13);
		panel_2.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_2_2 = new JLabel("Category :");
		lblNewLabel_1_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_2_2.setBounds(355, 60, 60, 13);
		panel_2.add(lblNewLabel_1_1_2_2);
		
		JLabel lblNewLabel_1_1_3_2 = new JLabel("Status :");
		lblNewLabel_1_1_3_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_3_2.setBounds(716, 60, 60, 13);
		panel_2.add(lblNewLabel_1_1_3_2);
		
		JLabel lblNewLabel_1_1_4_2 = new JLabel("Job Description :");
		lblNewLabel_1_1_4_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_4_2.setBounds(10, 87, 100, 13);
		panel_2.add(lblNewLabel_1_1_4_2);
		
		JLabel id_2 = new JLabel("null");
		id_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		id_2.setBounds(65, 2, 85, 24);
		panel_2.add(id_2);
		
		JLabel title_2 = new JLabel("null");
		title_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		title_2.setBounds(76, 29, 275, 24);
		panel_2.add(title_2);
		
		JLabel dess_2 = new JLabel("null");
		dess_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		dess_2.setBounds(124, 79, 291, 24);
		panel_2.add(dess_2);
		
		JLabel cat_2 = new JLabel("null");
		cat_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		cat_2.setBounds(424, 52, 176, 24);
		panel_2.add(cat_2);
		
		JLabel locc_2 = new JLabel("null");
		locc_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		locc_2.setBounds(80, 52, 85, 24);
		panel_2.add(locc_2);
		
		JLabel st_2 = new JLabel("null");
		st_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		st_2.setBounds(786, 52, 85, 24);
		panel_2.add(st_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(new Color(255, 128, 128));
		panel_1.setBounds(69, 206, 1300, 120);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Job ID: ");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(10, 10, 56, 13);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_5 = new JLabel("Job Title :");
		lblNewLabel_1_1_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_5.setBounds(10, 37, 56, 13);
		panel_1.add(lblNewLabel_1_1_5);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel(" Location :");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1_1.setBounds(10, 60, 60, 13);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Category :");
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_2_1.setBounds(355, 60, 60, 13);
		panel_1.add(lblNewLabel_1_1_2_1);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("Status :");
		lblNewLabel_1_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_3_1.setBounds(716, 60, 60, 13);
		panel_1.add(lblNewLabel_1_1_3_1);
		
		JLabel lblNewLabel_1_1_4_1 = new JLabel("Job Description :");
		lblNewLabel_1_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_4_1.setBounds(10, 87, 100, 13);
		panel_1.add(lblNewLabel_1_1_4_1);
		
		JLabel id_1 = new JLabel("null");
		id_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		id_1.setBounds(65, 2, 85, 24);
		panel_1.add(id_1);
		
		JLabel title_1 = new JLabel("null");
		title_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		title_1.setBounds(76, 29, 196, 24);
		panel_1.add(title_1);
		
		JLabel dess_1 = new JLabel("null");
		dess_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		dess_1.setBounds(124, 79, 291, 24);
		panel_1.add(dess_1);
		
		JLabel cat_1 = new JLabel("null");
		cat_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		cat_1.setBounds(424, 52, 171, 24);
		panel_1.add(cat_1);
		
		JLabel locc_1 = new JLabel("null");
		locc_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		locc_1.setBounds(80, 52, 85, 24);
		panel_1.add(locc_1);
		
		JLabel st_1 = new JLabel("null");
		st_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		st_1.setBounds(786, 52, 85, 24);
		panel_1.add(st_1);
		
		JLabel lblNewLabel = new JLabel("View Jobs");
		lblNewLabel.setBounds(570, 10, 184, 41);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(69, 61, 1300, 120);
		panel.setForeground(new Color(255, 128, 128));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Job ID: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 10, 56, 13);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Job Title :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(10, 37, 56, 13);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel(" Location :");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1.setBounds(10, 60, 60, 13);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Category :");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_2.setBounds(355, 60, 60, 13);
		panel.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Status :");
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_3.setBounds(716, 60, 60, 13);
		panel.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("Job Description :");
		lblNewLabel_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_4.setBounds(10, 87, 100, 13);
		panel.add(lblNewLabel_1_1_4);
		
		JLabel id = new JLabel("null");
		id.setFont(new Font("Tahoma", Font.BOLD, 14));
		id.setBounds(65, 2, 85, 24);
		panel.add(id);
		
		JLabel title = new JLabel("null");
		title.setFont(new Font("Tahoma", Font.BOLD, 14));
		title.setBounds(76, 29, 227, 24);
		panel.add(title);
		
		JLabel dess = new JLabel("null");
		dess.setFont(new Font("Tahoma", Font.BOLD, 14));
		dess.setBounds(124, 79, 279, 24);
		panel.add(dess);
		
		JLabel cat = new JLabel("null");
		cat.setFont(new Font("Tahoma", Font.BOLD, 14));
		cat.setBounds(424, 52, 175, 24);
		panel.add(cat);
		
		JLabel locc = new JLabel("null");
		locc.setFont(new Font("Tahoma", Font.BOLD, 14));
		locc.setBounds(80, 52, 85, 24);
		panel.add(locc);
		
		JLabel st = new JLabel("null");
		st.setFont(new Font("Tahoma", Font.BOLD, 14));
		st.setBounds(786, 52, 85, 24);
		panel.add(st);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(0, 0, 1700, 800);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Veyktesh Khemlapure\\Pictures\\jobportal\\img8.png"));
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("View jobs");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
				try(
						Connection con = connection.getConnection(); 
			            Statement stmt = con.createStatement();) {
			            //query
			            String query = "SELECT * FROM jobportal.postjob where j_id =1";
			           
			            try (ResultSet rs = stmt.executeQuery(query)) {
			                if (rs.next()) {
			                    String clgid = rs.getString("j_id"); 
			                    String owner = rs.getString("j_name");
			                    String tseget = rs.getString("location");
			                    String yer = rs.getString("category");
			                    String tt = rs.getString("satatus");
			                    String app=rs.getString("Descption");
			                    
			                    
			                    
			                    
			                    // for seting text
			                    id.setText(clgid);
			                    title.setText(owner);
			                    locc.setText(tseget);
			                    dess.setText(app);
			                    cat.setText(yer);
			                    st.setText(tt);
			                    
			                } else {
			                 // JOptionPane.showMessageDialog(View_Jobs, "Wrong Collage ID \n Data Not Found...!", "Alert", JOptionPane.WARNING_MESSAGE);
			                }
			            rs.close();
			            }
			            stmt.close();
			            con.close();
			        } catch (ClassNotFoundException | SQLException e1) {
			            //JOptionPane.showMessageDialog(View_Jobs, e1);
			        }
				
				
			
			try(
					Connection con = connection.getConnection(); 
		            Statement stmt = con.createStatement();) {
		            //query
		            String query = "SELECT * FROM jobportal.postjob where j_id =2";
		           
		            try (ResultSet rs = stmt.executeQuery(query)) {
		                if (rs.next()) {
		                    String clgi = rs.getString("j_id"); 
		                    String owne = rs.getString("j_name");
		                    String tsege = rs.getString("location");
		                    String ye = rs.getString("category");
		                    String t = rs.getString("satatus");
		                    String ap=rs.getString("Descption");
		                    
		                    
		                    
		                    
		                    // for seting text
		                    id_1.setText(clgi);
		                    title_1.setText(owne);
		                    locc_1.setText(tsege);
		                    dess_1.setText(ap);
		                    cat_1.setText(ye);
		                    st_1.setText(t);
		                    
		                } else {
		                 // JOptionPane.showMessageDialog(View_Jobs, "Wrong Collage ID \n Data Not Found...!", "Alert", JOptionPane.WARNING_MESSAGE);
		                }
		            rs.close();
		            }
		            stmt.close();
		            con.close();
		        } catch (ClassNotFoundException | SQLException e1) {
		            //JOptionPane.showMessageDialog(View_Jobs, e1);
		        }
			
			
			
			
			try(
					Connection con = connection.getConnection(); 
		            Statement stmt = con.createStatement();) {
		            //query
		            String query = "SELECT * FROM jobportal.postjob where j_id =3";
		           
		            try (ResultSet rs = stmt.executeQuery(query)) {
		                if (rs.next()) {
		                    String clg = rs.getString("j_id"); 
		                    String own = rs.getString("j_name");
		                    String tseg = rs.getString("location");
		                    String yea = rs.getString("category");
		                    String ta = rs.getString("satatus");
		                    String ap=rs.getString("Descption");
		                    
		                    
		                    
		                    
		                    // for seting text
		                    id_2.setText(clg);
		                    title_2.setText(own);
		                    locc_2.setText(tseg);
		                    dess_2.setText(ap);
		                    cat_2.setText(yea);
		                    st_2.setText(ta);
		                    
		                } else {
		                 // JOptionPane.showMessageDialog(View_Jobs, "Wrong Collage ID \n Data Not Found...!", "Alert", JOptionPane.WARNING_MESSAGE);
		                }
		            rs.close();
		            }
		            stmt.close();
		            con.close();
		        } catch (ClassNotFoundException | SQLException e1) {
		            //JOptionPane.showMessageDialog(View_Jobs, e1);
		        }
			
			
			
			try(
					Connection con = connection.getConnection(); 
		            Statement stmt = con.createStatement();) {
		            //query
		            String query = "SELECT * FROM jobportal.postjob where j_id =4";
		           
		            try (ResultSet rs = stmt.executeQuery(query)) {
		                if (rs.next()) {
		                    String clg1 = rs.getString("j_id"); 
		                    String own1 = rs.getString("j_name");
		                    String tseg1 = rs.getString("location");
		                    String yea1= rs.getString("category");
		                    String ta1 = rs.getString("satatus");
		                    String ap1=rs.getString("Descption");
		                    
		                    
		                    
		                    
		                    // for seting text
		                    id_3.setText(clg1);
		                    title_3.setText(own1);
		                    locc_3.setText(tseg1);
		                    dess_3.setText(ap1);
		                    cat_3.setText(yea1);
		                    st_3.setText(ta1);
		                    
		                } else {
		                 // JOptionPane.showMessageDialog(View_Jobs, "Wrong Collage ID \n Data Not Found...!", "Alert", JOptionPane.WARNING_MESSAGE);
		                }
		            rs.close();
		            }
		            stmt.close();
		            con.close();
		        } catch (ClassNotFoundException | SQLException e1) {
		            //JOptionPane.showMessageDialog(View_Jobs, e1);
		        }
			
			
		
			

			
			try(
					Connection con = connection.getConnection(); 
		            Statement stmt = con.createStatement();) {
		            //query
		            String query = "SELECT * FROM jobportal.postjob where j_id =5";
		           
		            try (ResultSet rs = stmt.executeQuery(query)) {
		                if (rs.next()) {
		                    String clg1 = rs.getString("j_id"); 
		                    String own1 = rs.getString("j_name");
		                    String tseg1 = rs.getString("location");
		                    String yea1= rs.getString("category");
		                    String ta1 = rs.getString("satatus");
		                    String ap1=rs.getString("Descption");
		                    
		                    
		                    
		                    
		                    // for seting text
		                    id_4.setText(clg1);
		                    title_4.setText(own1);
		                    locc_4.setText(tseg1);
		                    dess_4.setText(ap1);
		                    cat_4.setText(yea1);
		                    st_4.setText(ta1);
		                    
		                } else {
		                 // JOptionPane.showMessageDialog(View_Jobs, "Wrong Collage ID \n Data Not Found...!", "Alert", JOptionPane.WARNING_MESSAGE);
		                }
		            rs.close();
		            }
		            stmt.close();
		            con.close();
		        } catch (ClassNotFoundException | SQLException e1) {
		            //JOptionPane.showMessageDialog(View_Jobs, e1);
		        }
			
			
		
			
			
			}
			
		});
		btnNewButton.setBounds(219, 10, 105, 30);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("New label");
		label.setBounds(897, 19, 45, 13);
		contentPane.add(label);
	}
}
