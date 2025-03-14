import java.awt.*;
import javax.swing.*;

class Lab extends actionListener {
     JFrame f;
     JLabel lab1, lab2;

     Lab() {
     	f = new JFrame("Learn");
	lab1 = new JLabel();
	lab2 = new JLabel();
	lab1.setText("Check");
	lab2.setText("Test");
	f.add(lab1);
	f.add(lab2);
	f.setSize(300, 500);
	f.setLayout(new FlowLayout());
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setVisible(true);
     }

     public void actionPerformed(ActionEvent e) {
     	
     }
}

public class Label {
    public static void main(String[] args) {
    	new Lab();
    }
}
