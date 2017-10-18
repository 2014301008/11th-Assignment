import java.awt.Color;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BasicPaint {
	    public static void main(String[] args) {
		JFrame f = new JFrame("그래픽 기초 프로그램");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new MyPanel());
		f.setSize(1000,500);
		f.setVisible(true);
	}
}
  
class MyPanel extends JPanel {
	    public MyPanel() {
		setBorder(BorderFactory.createLineBorder(Color.black));
		}
	    
	    protected void paintComponent(Graphics g)
	    {
	    	super.paintComponent(g);
	    	
	    	g.drawLine(85,10,10,85); 
	    	g.drawString(" drawLine() ",10,115);
	    	g.drawRect(140,10,100,85);
	    	g.drawString(" drawRect() ",140,115);
	    	g.draw3DRect(285,10,100,85,true);
	    	g.drawString(" draw3DRect() ",285,115);
	    	g.drawRoundRect(425, 10, 100, 85,30,30);
	    	g.drawString(" drawRoundRect() ",425,115);
	    	g.drawOval(565,10,100,85);
	    	g.drawString(" drawOval() ",565,115);
	    	g.drawArc(705,10, 100,85,60,150);
	    	g.drawString(" drawArc() ",705,115);
	    	int[] x1 = {845,950,845,950};
	    	int[] y1= {10,85,85,10};
	    	g.drawPolygon(x1, y1,4);
	    	g.drawString(" drawPolygon() ",840,115);
	    	int[] x2 = {10,85,10,85};
	    	int[] y2= {150,235,235,150};
	    	g.drawPolyline(x2, y2, 4);
	    	g.drawString(" drawPolyLine() ",10,255);
	    	g.fillRect(140,150,100,85);
	    	g.setColor(Color.BLACK);
	    	g.drawString(" fillRect() ",140,255);
	    	g.setColor(Color.lightGray);
	    	g.fill3DRect(285,150,100,85,true);
	    	g.setColor(Color.BLACK);
	     	g.drawString(" fill3DRect() ",285,255);
	     	g.fillRoundRect(425,150,100 ,85,30,30);
	     	g.drawString(" fillRoundRect() ",425,255);
	     	g.fillOval(565,150,100,80);
	     	g.drawString(" fillOval() ",565,255);
	     	g.fillArc(705,150,100,80,60 ,150);
	     	g.drawString(" fillArc() ",705,255);
	     	int[] x3 = {845,950,845,950};
	     	int[] y3 = {150,235,235,150};
	     	g.fillPolygon(x3, y3, 4);
	     	g.drawString(" fillPolygon() ",840,255);
	     	
	     
	    	
	    	
	    }
}
