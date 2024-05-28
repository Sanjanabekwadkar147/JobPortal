package jdbcjava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminHome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminHome frame = new AdminHome();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminHome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1554, 846);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome Admin");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Imprint MT Shadow", Font.BOLD, 99));
		lblNewLabel.setBounds(435, 302, 800, 191);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Add Jobs");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				add w = new add();
				w.frame.setVisible(true);
			}
			
			
		});
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 28));
		btnNewButton.setBounds(125, 49, 155, 43);
		contentPane.add(btnNewButton);
		
		JButton btnViewJobs = new JButton("View Jobs");
		btnViewJobs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				View_jobAdmin frame = new View_jobAdmin();
				frame.setVisible(true);
			}
		});
		btnViewJobs.setFont(new Font("Calibri", Font.BOLD, 28));
		btnViewJobs.setBounds(290, 49, 155, 43);
		contentPane.add(btnViewJobs);
		
		JButton btnNewButton_1 = new JButton("Logout");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				home frame = new home();
				frame.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Calibri", Font.BOLD, 28));
		btnNewButton_1.setBounds(1317, 49, 155, 43);
		contentPane.add(btnNewButton_1);
		
		JButton btnApplicantDetails = new JButton("Applicant Details");
		btnApplicantDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				view_applicant frame = new view_applicant();
				frame.setVisible(true);
			}
		});
		btnApplicantDetails.setFont(new Font("Calibri", Font.BOLD, 28));
		btnApplicantDetails.setBounds(455, 49, 245, 43);
		contentPane.add(btnApplicantDetails);
		
		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon("C:\\Users\\Veyktesh Khemlapure\\Pictures\\jobportal\\img8.png"));
		img.setBounds(0, 0, 1652, 809);
		contentPane.add(img);
	}

}
