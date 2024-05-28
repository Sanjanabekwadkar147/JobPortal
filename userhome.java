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

public class userhome extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userhome frame1 = new userhome();
					frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public userhome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1554, 846);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Easiest Way to Find a Job You Want");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setFont(new Font("Imprint MT Shadow", Font.BOLD, 82));
		lblNewLabel_1.setBounds(95, 347, 1395, 237);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Welcome to Job Portal");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Imprint MT Shadow", Font.BOLD, 99));
		lblNewLabel.setBounds(261, 168, 1141, 191);
		contentPane.add(lblNewLabel);
		
		JButton btnViewJobs = new JButton("View Jobs");
		btnViewJobs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				View_Jobs frame = new View_Jobs();
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
		
		JLabel img = new JLabel("");
		img.setForeground(new Color(255, 255, 255));
		img.setIcon(new ImageIcon("C:\\Users\\Veyktesh Khemlapure\\Pictures\\jobportal\\img8.png"));
		img.setBounds(0, 0, 1652, 809);
		contentPane.add(img);
	}

}
