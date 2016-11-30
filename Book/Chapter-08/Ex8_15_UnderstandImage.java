
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex8_15_UnderstandImage {

	public static void main(String[] args) {
		JFrame frm = new JFrame("Àí½âÍ¼Ïñ");
		frm.setLayout(null);
		ImagePanel pic = new ImagePanel();
		pic.setBounds(0,0,400,200);
		frm.getContentPane().add(pic);
		frm.setBounds(400,200,400,200);
		frm.setVisible(true);
	}
}

//class ImagePanel extends JPanel {
//		Image img;
//
//		public void paint(Graphics g){
//			try {
//				//×°ÔØÍ¼Ïñ
//				img = ImageIO.read(new File("label.jpg"));
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			//»æÖÆÍ¼Ïñ
//			g.drawImage(img, 0, 0, 400, 200, null);
//			
//		}
//}
class ImagePanel extends JPanel {
		Image img;
		MediaTracker mt = new MediaTracker(this);
		public void paint(Graphics g){
			try {
				//×°ÔØÍ¼Ïñ
				img = ImageIO.read(new File("label.jpg"));
				mt.addImage(img, 1);
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				mt.waitForAll();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//»æÖÆÍ¼Ïñ
			g.drawImage(img, 0, 0, 400, 200, null);
			
		}
	}
