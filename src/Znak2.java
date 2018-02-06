import java.awt.*;
import javax.swing.*;

public class Znak2 extends JPanel {
	
	protected void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		//Prvi komentar u ovoj klasi
		g.setColor(Color.RED);
		int xs[]={140,500,320};
		int ys[]={80,80,400};
		g.fillPolygon(xs, ys, 3);
		
		g.setColor(Color.YELLOW);
		int xu[]={180,460,320};
		int yu[]={100,100,350};
		g.fillPolygon(xu, yu, 3);
		
		g.setColor(Color.BLACK);
		int x[]={295,345,320};
		int y[]={120,120,280};
		g.fillPolygon(x, y, 3);
		g.fillRect(312, 287, 15, 15);
	}
	
	public static void main(String[] args) {
		JFrame prozor = new JFrame();
		prozor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		prozor.setVisible(true);
		prozor.setSize(640, 480);
		prozor.getContentPane().add(new Znak2());
	}

}
