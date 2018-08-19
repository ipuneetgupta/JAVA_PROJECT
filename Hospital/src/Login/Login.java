package Login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;

import Hospitals.Hospital;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtLogin;
	private JTextField txtPassword;
	private JTextField txtLoginSystem;
	private JTextField txtHospitalManagementSystem;
	private JTextField txtGbPantHospital;
	private JTextField textField;
       private static Login frame2;
        int atm=0;
        private JFrame frame1;
        private JPasswordField textField_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame2 = new Login();
					frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,1183 ,795);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBackground(Color.PINK);
		panel.setBounds(10, 11, 1143, 99);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtHospitalManagementSystem = new JTextField();
		txtHospitalManagementSystem.setBackground(Color.GREEN);
		txtHospitalManagementSystem.setForeground(Color.RED);
		txtHospitalManagementSystem.setText("HOSPITAL MANAGEMENT SYSTEM");
		txtHospitalManagementSystem.setHorizontalAlignment(SwingConstants.CENTER);
		txtHospitalManagementSystem.setFont(new Font("Microsoft YaHei", Font.BOLD, 35));
		txtHospitalManagementSystem.setColumns(10);
		txtHospitalManagementSystem.setBounds(10, 11, 1123, 77);
		panel.add(txtHospitalManagementSystem);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBackground(Color.PINK);
		panel_1.setBounds(10, 639, 1143, 99);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtGbPantHospital = new JTextField();
		txtGbPantHospital.setText("GBPEC HOSPITAL");
		txtGbPantHospital.setHorizontalAlignment(SwingConstants.CENTER);
		txtGbPantHospital.setForeground(Color.RED);
		txtGbPantHospital.setFont(new Font("Microsoft YaHei", Font.BOLD, 35));
		txtGbPantHospital.setColumns(10);
		txtGbPantHospital.setBackground(Color.GREEN);
		txtGbPantHospital.setBounds(10, 11, 1123, 77);
		panel_1.add(txtGbPantHospital);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.setBackground(Color.YELLOW);
		panel_2.setBounds(209, 201, 792, 339);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		txtLogin = new JTextField();
		txtLogin.setBackground(Color.ORANGE);
		txtLogin.setHorizontalAlignment(SwingConstants.CENTER);
		txtLogin.setFont(new Font("Caladea", Font.BOLD, 25));
		txtLogin.setText("USERNAME");
		txtLogin.setBounds(95, 119, 224, 48);
		panel_2.add(txtLogin);
		txtLogin.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBackground(Color.ORANGE);
		txtPassword.setText("PASSWORD");
		txtPassword.setHorizontalAlignment(SwingConstants.CENTER);
		txtPassword.setFont(new Font("Caladea", Font.BOLD, 25));
		txtPassword.setColumns(10);
		txtPassword.setBounds(95, 193, 224, 48);
		panel_2.add(txtPassword);
		
		txtLoginSystem = new JTextField();
		txtLoginSystem.setBackground(Color.GREEN);
		txtLoginSystem.setForeground(Color.RED);
		txtLoginSystem.setText("LOGIN SYSTEM");
		txtLoginSystem.setHorizontalAlignment(SwingConstants.CENTER);
		txtLoginSystem.setFont(new Font("Microsoft YaHei", Font.BOLD, 35));
		txtLoginSystem.setBounds(190, 25, 419, 64);
		panel_2.add(txtLoginSystem);
		txtLoginSystem.setColumns(10);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(467, 119, 215, 41);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("CANCEL");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(324, 265, 150, 48);
		panel_2.add(btnNewButton);
		
		JButton button = new JButton("LOGIN");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String username=textField.getText();
			String password=textField_1.getText();
			if(username.contains("puneet")&&password.contains("puneet")) {
				frame2.setVisible(false);
				Hospital I=new Hospital();
				I.setVisible(true);
			}
			else if(!(username.contains("puneet")&&password.contains("puneet"))) {
				textField.setText("");
				textField_1.setText("");
				atm+=1;
				if(atm==3) {
					JOptionPane.showMessageDialog(frame1, "Login", "u attempt 3 Time", JOptionPane.CANCEL_OPTION);
					System.exit(0);
				}
			}
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBounds(112, 265, 150, 48);
		panel_2.add(button);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame1 =new JFrame();
				if(JOptionPane.showConfirmDialog(frame2, "Confirm if U Want To Exit" , "Hospital Management System", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
	                System.exit(0);				
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBounds(532, 265, 150, 48);
		panel_2.add(btnExit);
		
		textField_1 = new JPasswordField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_1.setBounds(467, 200, 215, 41);
		panel_2.add(textField_1);
	}
}
