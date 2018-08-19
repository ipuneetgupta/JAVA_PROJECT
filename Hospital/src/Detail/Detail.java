package Detail;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Detail extends JFrame {

	private JPanel contentPane;
	static Detail dehos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dehos= new Detail();
					dehos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Detail() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 586, 432);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setBounds(10, 11, 550, 319);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GBPEC HOSPITAL");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 45));
		lblNewLabel.setBounds(10, 11, 530, 77);
		lblNewLabel.setBackground(Color.GREEN);
		panel.add(lblNewLabel);
		
		JLabel lblOwner = new JLabel("OWNER ::");
		lblOwner.setForeground(Color.RED);
		lblOwner.setHorizontalAlignment(SwingConstants.CENTER);
		lblOwner.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblOwner.setBounds(20, 99, 187, 59);
		panel.add(lblOwner);
		
		JLabel lblNewLabel_1 = new JLabel("DR. PUNEET GUPTA");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1.setBounds(227, 99, 313, 59);
		panel.add(lblNewLabel_1);
		
		JLabel lblCoFounder = new JLabel("CO FOUNDER::");
		lblCoFounder.setHorizontalAlignment(SwingConstants.CENTER);
		lblCoFounder.setForeground(Color.RED);
		lblCoFounder.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblCoFounder.setBounds(30, 169, 187, 59);
		panel.add(lblCoFounder);
		
		JLabel lblDrShinchan = new JLabel("DR. SHINCHAN");
		lblDrShinchan.setHorizontalAlignment(SwingConstants.CENTER);
		lblDrShinchan.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblDrShinchan.setBounds(227, 169, 313, 59);
		panel.add(lblDrShinchan);
		
		JLabel lblWwwgbpechoscom = new JLabel("www.gbpechos.com");
		lblWwwgbpechoscom.setHorizontalAlignment(SwingConstants.CENTER);
		lblWwwgbpechoscom.setForeground(Color.RED);
		lblWwwgbpechoscom.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblWwwgbpechoscom.setBounds(20, 239, 503, 59);
		panel.add(lblWwwgbpechoscom);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dehos.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(194, 341, 183, 41);
		contentPane.add(btnNewButton);
	}
}
