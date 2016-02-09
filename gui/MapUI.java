package gui;
/*
 * PersonsCubed, Steven Clerkin, v1 design of risk map
 */
//import java.awt.Dimension;	//For screen dimensions
import java.awt.EventQueue;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Graphics;

public class MapUI {
	private JFrame frame;
	
	public MapUI() throws IOException {
		initialize(null);
	}
	
	private void initialize(Graphics g) throws IOException {
		frame = new JFrame();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		File file = new File("riskMap2.jpg");
		BufferedImage img = ImageIO.read(file);
		Image ReImage = img.getScaledInstance(frame.getWidth(), frame.getHeight(), Image.SCALE_SMOOTH);
		JLabel label = new JLabel(new ImageIcon(ReImage));
		frame.getContentPane().add(label);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MapUI window = new MapUI();
					window.frame.setVisible(true);
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
