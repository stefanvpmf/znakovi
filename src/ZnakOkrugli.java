import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class ZnakOkrugli extends JPanel {

	protected void paintComponent(Graphics g){
		
		g.setColor(Color.red);
		g.fillOval(getWidth()/2-150, getHeight()/2-150, 300, 300);
		
		g.setColor(Color.YELLOW);
		g.fillOval(getWidth()/2-120, getHeight()/2-120, 240, 240);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame prozor = new JFrame();
		prozor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		prozor.setVisible(true);
		prozor.setSize(640, 480);
		prozor.getContentPane().add(new ZnakOkrugli());

	}
	naskdasdmk

}
