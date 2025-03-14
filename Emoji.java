import javax.swing.*;
import java.awt.*;

public class Emoji extends JPanel {
    Emoji() {
    	setSize(400, 500);
	repaint();
    }

    public void paintComponent(Graphics g) {
    	super.paintComponent(g);
	g.setColor(Color.YELLOW);
	g.fillOval(50, 50, 300, 300);
	g.setColor(Color.BLACK);
	g.drawOval(50, 50, 300, 300);
	g.drawOval(120, 120, 40, 30);
	g.drawOval(250, 120, 40, 30);
	g.drawArc(140, 170, 130, 100,180,180);  
    }

    public static void main(String[] args) {
    	JFrame f = new JFrame("Emoji");
	f.setSize(400, 500);
	f.add(new Emoji());
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setVisible(true);
    }
}
