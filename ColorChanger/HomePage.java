package ColorChanger;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class HomePage   {
	private JFrame frmColorChanger;

	/**	 * Launch the application.*/
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage window = new HomePage();
					window.frmColorChanger.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**	 * Create the application.*/
	public HomePage() {
		initialize();
	}
	
	
	
	/*** Initialize the contents of the frame.*/
	private void initialize() {
		frmColorChanger = new JFrame();
		frmColorChanger.setTitle("Color Changer");
		frmColorChanger.getContentPane().setBackground(new Color(224, 255, 255));
		frmColorChanger.setBackground(SystemColor.desktop);
		frmColorChanger.setBounds(100, 100, 675, 528);
		frmColorChanger.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmColorChanger.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Color Changer");
		lblNewLabel.setForeground(Color.WHITE);
		//lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(32, 70, 597, 195);
		lblNewLabel.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 65));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frmColorChanger.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Deuteranopia");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(143, 402, 371, 46);
		btnNewButton.setFont(new Font("SketchFlow Print", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//lblNewLabel.setText("DOG");
				frmColorChanger.dispose();
				DSelectPic s = new DSelectPic();
				s.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(224, 255, 255));
		frmColorChanger.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Protanopia");
		btnNewButton_1.setBounds(143, 345, 371, 46);
		btnNewButton_1.setFont(new Font("SketchFlow Print", Font.PLAIN, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmColorChanger.dispose();
				PSelectPic s = new PSelectPic(); //new frame maybe
				s.setVisible(true); //this too
			}
		});
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(224, 255, 255));
		frmColorChanger.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/fsd.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		lblNewLabel_1.setBackground(new Color(135, 206, 235));
		lblNewLabel_1.setBounds(0, 0, 659, 489);
		frmColorChanger.getContentPane().add(lblNewLabel_1);
		
	}
}
