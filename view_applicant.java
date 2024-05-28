package jdbcjava;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class view_applicant extends JFrame {

	private JPanel contentPane;
	private JTable table_1;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view_applicant frame = new view_applicant();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public view_applicant() {
		
		DBConnect connection = new DBConnect();

		setTitle("View Applicant");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1380, 805);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("View");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
				
				
				
				
				
				
				try 
		        {
		      
		            try (
		            		Connection con = connection.getConnection()) 
		            {
		            	String query4 = "SELECT * FROM jobportal.applicant";
				           
		                try (Statement stmt4 = con.createStatement(); 
		                    ResultSet rs4 = stmt4.executeQuery(query4)) 
		                {
		                    DefaultTableModel model = (DefaultTableModel)table_1.getModel();
		                    model.setRowCount(0);
		                    while (rs4.next())
		                    {
		                    	
		                        String pa = rs4.getString("u_id");
		                        String partiu = rs4.getString("u_name");
		                        String ava = rs4.getString("Adderss");
		                        String avlo = rs4.getString("gender");
		                        String aj = rs4.getString("email");
		                        String ab = rs4.getString("moblie");
		                        String aa = rs4.getString("qualification");
		                        String az = rs4.getString("experince");
		                        String jb = rs4.getString("job_apllied");
		                        
		                        
		                        //Adding row in Table 
		                        model.addRow(new Object[]{pa,partiu, ava,avlo,aj,ab,aa,az,jb}); 
		                        
		                      
		                    }
		                    //result set close
		                    rs4.close();
		                    //statement close
		                    stmt4.close();
		                }
		                //connection close
		                con.close();
		            }
		        }
		
			 
		        catch ( ClassNotFoundException | SQLException ex) 
		        {
		          //  JOptionPane.showMessageDialog(cutoffpage,ex);
		        }  
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(1226, 69, 85, 21);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(50, 165, 1433, 402);
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Applicant Id", "Name", "Address", "Gender", "Email", "Mobile No.", "Qualification", "Experience", "Job applied"},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Applicant Id", "Name", "Address", "Gender", "Email", "Mobile No.", "Qualification", "Experience", "Job applied"
			}
		));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(15);
		table_1.getColumnModel().getColumn(1).setResizable(false);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(60);
		table_1.getColumnModel().getColumn(1).setMinWidth(2);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(120);
		table_1.getColumnModel().getColumn(3).setPreferredWidth(15);
		table_1.getColumnModel().getColumn(4).setPreferredWidth(60);
		table_1.getColumnModel().getColumn(5).setPreferredWidth(20);
		table_1.getColumnModel().getColumn(6).setPreferredWidth(60);
		table_1.getColumnModel().getColumn(7).setPreferredWidth(60);
		table_1.getColumnModel().getColumn(8).setPreferredWidth(60);
		
		table_1.setToolTipText("");
		table_1.setSurrendersFocusOnKeystroke(true);
		table_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table_1.setRowHeight(36);
		table_1.setForeground(new Color(0, 0, 0));
		table_1.setFont(new Font("Calibri", Font.BOLD, 18));
		table_1.setFillsViewportHeight(true);
		table_1.setColumnSelectionAllowed(true);
		table_1.setCellSelectionEnabled(true);
		table_1.setBackground(Color.WHITE);
		scrollPane.setColumnHeaderView(table_1);
		
		JLabel lblNewLabel_1 = new JLabel("Applicant Details");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel_1.setBounds(527, 27, 547, 92);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Veyktesh Khemlapure\\Pictures\\jobportal\\img8.png"));
		lblNewLabel.setBounds(0, 0, 1505, 869);
		contentPane.add(lblNewLabel);
	}
}
