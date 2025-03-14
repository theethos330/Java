import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class T extends JPanel implements ActionListener {
    JRadioButton r1;
    JRadioButton r2;
    JRadioButton r3;
    ButtonGroup g = new ButtonGroup();
    Color red;
    Color green;
    Color yellow;

    T() {
  	setBounds(0, 0, 600, 480);
	r1 = new JRadioButton("Red");
	r2 = new JRadioButton("Yellow");
	r3 = new JRadioButton("Green");
	add(r1);
	add(r2);
	add(r3);
	g.add(r1);
	g.add(r2);
	g.add(r3);
	r1.setSelected(true);
	red = Color.red;
	green = getBackground();
	yellow = getBackground();
	r1.addActionListener(this);
	r2.addActionListener(this);
	r3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
    	if (r1.isSelected() == true) {
	    red = Color.red;
	    green = getBackground();
	    yellow = getBackground();
	    JOptionPane.showMessageDialog(this, "You cannot go now", "Error", JOptionPane.ERROR_MESSAGE);
	} else if (r3.isSelected() == true) {
            red = getBackground();
            green = Color.green;
            yellow = getBackground();
	    JOptionPane.showMessageDialog(this, "You can go now");
        } else if (r2.isSelected() == true) {
            red = getBackground();
            green = getBackground();
            yellow = Color.YELLOW;
        }
	repaint();
    }

    public void paintComponent(Graphics g) {
    	super.paintComponent(g);
	g.drawOval(50, 50, 50, 50);
	g.drawOval(50, 110, 50, 50);
	g.drawOval(50, 170, 50, 50);
	g.setColor(red);
	g.fillOval(50, 50, 50, 50);
        g.setColor(yellow);
        g.fillOval(50, 110, 50, 50);
        g.setColor(green);
        g.fillOval(50, 170, 50, 50);
    }
}

public class Traffic {
    public static void main(String[] args) {
    	SwingUtilities.invokeLater(new Runnable() {
	    public void run() {
		JFrame f = new JFrame();
   	        f.setVisible(true);
	        f.setSize(600, 480);
	        f.setLayout(null);
    		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	        f.add(new T());
	    }
	});
    }
}
