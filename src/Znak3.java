import java.awt.*;
import javax.swing.*;

public class Znak3 extends JPanel {
	
	protected void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		//Neki komentar
		int[] xs2={118,320,522,320};
		int[] ys2={240,38,240,442};
		g.setColor(Color.BLACK);
		g.fillPolygon(xs2, ys2, 4);
		int[] xs={120,320,520,320};
		int[] ys={240,40,240,440};
		g.setColor(Color.yellow);
		g.fillPolygon(xs,ys,4);
		
		//crtanje strelice
		g.setColor(Color.BLACK);
		g.fillRect(180, 220, 220 , 40);
		int[] xPoints = {400,460,400};
		int[] yPoints = {200,240,280};
		g.fillPolygon(xPoints, yPoints, 3);
		
	}
	
	public static void main(String[] args) {
		JFrame prozor = new JFrame();
		prozor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		prozor.setVisible(true);
		prozor.setSize(640, 480);
		prozor.getContentPane().add(new Znak3());
	}

}
