package ColorChanger;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class DShowImg extends JFrame {

	private static final long serialVersionUID = 1L;
	protected static final String String = null;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DShowImg frame = new DShowImg(String);
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
	public DShowImg(String pic) {
		setTitle("Deuteranomaly");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 675, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("Try Again");
		btn1.setBounds(479, 445, 170, 33);
		contentPane.add(btn1);
		
		JLabel lblNewLabel = new JLabel(" ");
		ImageIcon img = new ImageIcon(pic);
		lblNewLabel.setIcon(img);
		lblNewLabel.setBounds(10, 11, 639, 413);
		contentPane.add(lblNewLabel);
		
		JLabel lbl = new JLabel(" ");
		Image img2 = new ImageIcon(this.getClass().getResource("/xasd.jpg")).getImage();
		lbl.setIcon(new ImageIcon(img2));
		lbl.setBounds(0, 0, 659, 489);
		contentPane.add(lbl);
		
	}
}
