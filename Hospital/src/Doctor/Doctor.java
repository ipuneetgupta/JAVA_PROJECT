package Doctor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Login.Login;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Doctor extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Doctor frame = new Doctor();
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
	public Doctor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		panel.setBounds(10, 11, 414, 239);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblPuneetGupta = new JLabel("DR. PUNEET GUPTA");
		lblPuneetGupta.setHorizontalAlignment(SwingConstants.CENTER);
		lblPuneetGupta.setFont(new Font("Calibri Light", Font.BOLD, 35));
		lblPuneetGupta.setForeground(Color.RED);
		lblPuneetGupta.setBackground(Color.RED);
		lblPuneetGupta.setBounds(0, 11, 404, 83);
		panel.add(lblPuneetGupta);
		
		JLabel lblDrSunilKumar = new JLabel("DR SUNIL KUMAR");
		lblDrSunilKumar.setHorizontalAlignment(SwingConstants.CENTER);
		lblDrSunilKumar.setForeground(Color.RED);
		lblDrSunilKumar.setFont(new Font("Calibri Light", Font.BOLD, 35));
		lblDrSunilKumar.setBackground(Color.RED);
		lblDrSunilKumar.setBounds(0, 78, 404, 83);
		panel.add(lblDrSunilKumar);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login i=new Login();
				i.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(122, 172, 161, 40);
		panel.add(btnNewButton);	}
}
