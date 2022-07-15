package ColorChanger;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

public class DSelectPic extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DSelectPic frame = new DSelectPic();
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
	public DSelectPic() {
		setTitle("Protanomaly");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 675, 528);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 0, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("");
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl1.setBackground(Color.WHITE);
		lbl1.setOpaque(true);
		lbl1.setBounds(37, 320, 596, 55);
		contentPane.add(lbl1);

		
		JButton btn1 = new JButton("Choose Image");
		btn1.setForeground(Color.BLACK);
		btn1.setFont(new Font("SketchFlow Print", Font.BOLD, 14));
		btn1.setBackground(new Color(255, 204, 204));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser ch = new JFileChooser("C:\\Users\\Admin\\eclipse-workspace2\\ColorChanger\\img");
				try {
					ch.showOpenDialog(null);
					//ch.setFileFilter(new FileNameExtensionFilter("PNG images"||"JPG", "png"||"jpg"));
					File f = ch.getSelectedFile();
					String filename = f.getAbsolutePath();
					lbl1.setText(filename);
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Please choose png or jpg!",
				               "Swing Tester", JOptionPane.ERROR_MESSAGE);
				}	
			}
		});
		btn1.setBounds(37, 277, 133, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("Confirm");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String fil = lbl1.getText();
					File x = new File(fil);
					String ze = x.getName();
					//ax = lbl1.getText();
					Image img = new ImageIcon(this.getClass().getResource("/"+ze)).getImage();
					//clabel.setIcon(new ImageIcon(img));
					PChosenPic v = new PChosenPic(img,fil);
					v.setVisible(true);
					dispose();
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Wrong file!",
				               "Swing Tester", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btn2.setBounds(522, 432, 111, 23);
		contentPane.add(btn2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Image img = new ImageIcon(this.getClass().getResource("/clr.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBackground(SystemColor.window);
		lblNewLabel.setBounds(0, 0, 659, 200);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Please choose an image through clicking the button below.");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(47, 225, 580, 29);
		contentPane.add(lblNewLabel_1);
	}	
}
