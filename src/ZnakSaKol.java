import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class ZnakSaKol extends JPanel {

	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		//crtanje zutog kvadrata sa crnim okvirom
		int[] xPoints = {getWidth()/2-160,getWidth()/2,getWidth()/2+160,getWidth()/2};
		int[] yPoints = {getHeight()/2,getHeight()/2-160,getHeight()/2,getHeight()/2+160};
		g.setColor(Color.YELLOW);
		g.fillPolygon(xPoints, yPoints, 4);
		g.setColor(Color.black);
		g.drawPolygon(xPoints, yPoints, 4);
		
		//crtanje leve strane krsta
		int[] xl = {getWidth()/2-60,getWidth()/2-30,getWidth()/2+60,getWidth()/2+30};
		int[] yl = {getHeight()/2-30,getHeight()/2-60,getHeight()/2+30,getHeight()/2+60};
		g.fillPolygon(xl,yl,4);
		
		//crtanje desne strane krsta
		int[] xd = {getWidth()/2+30,getWidth()/2+60,getWidth()/2-30,getWidth()/2-60};
		int[] yd = {getHeight()/2-60,getHeight()/2-30,getHeight()/2+60,getHeight()/2+30};
		g.fillPolygon(xd,yd,4);
	}
	
	public static void main(String[] args){
		JFrame prozor = new JFrame();
		prozor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		prozor.setVisible(true);
		prozor.setSize(640, 480);
		prozor.getContentPane().add(new ZnakSaKol());
	}
}
