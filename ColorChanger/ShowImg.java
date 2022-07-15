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
import java.awt.event.ActionEvent;

public class ShowImg extends JFrame {

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
					ShowImg frame = new ShowImg(String);
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
	public ShowImg(String pic) {
		setTitle("Converted Image");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 675, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("Try Again");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
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
