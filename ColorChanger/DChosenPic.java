package ColorChanger;

import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class DChosenPic extends JFrame {

	/**

	 */
	private static final long serialVersionUID = 1L;
	//protected static final String String = null;
	protected static final Image Image = null;
	protected static final String String = null;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DChosenPic frame = new DChosenPic(Image, String);
					frame.setVisible(true);
					
					DSelectPic x = new DSelectPic();
					x.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DChosenPic(Image msg, String str) {
		setTitle("Deuterenomaly");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 675, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel piclbl = new JLabel("");
		piclbl.setIcon(new ImageIcon(msg));
		piclbl.setBounds(10, 11, 639, 417);
		contentPane.add(piclbl);
		
		JButton btn1 = new JButton("Proceed");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String c;
				DAlgo c = null;
				try {
					c = new DAlgo(str);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				c.getClass();
			}
		});
		btn1.setBounds(450, 439, 199, 32);
		contentPane.add(btn1);
		
		JLabel lblNewLabel = new JLabel(" ");
		Image img = new ImageIcon(this.getClass().getResource("/xasd.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, 0, 659, 489);
		contentPane.add(lblNewLabel);
		
	}

	
}
