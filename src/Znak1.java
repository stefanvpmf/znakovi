novi red
import java.awt.*;
import javax.swing.*;

public class Znak1 extends JPanel {
	
		protected void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			
			//crveni krug
			g.setColor(Color.RED);
			g.fillOval(160,70,300,300);
			
			//zuti krug
			g.setColor(Color.YELLOW);
			g.fillOval(185,95,250,250);
			
			//crtanje strelice
			g.setColor(Color.BLUE);
			g.fillRect(295,178,30,130);
			int xs[]={270,310,350};
			int ys[]={178,138,178};
			g.fillPolygon(xs, ys, 3);
			
			
		}
		
		

		public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Znak1());
		frame.setSize(640, 480);
		frame.setTitle("Znak 1");
		frame.setVisible(true);
	}

}
