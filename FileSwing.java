import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class FileSwing implements ActionListener {
    JFrame f;
    JTextField t;
    JLabel lab;
    JButton b;

    FileSwing() {
    	f = new JFrame("FileReder");
	t = new JTextField();
	lab = new JLabel();
	b = new JButton("Read");
	
	t.setBounds(50, 60, 100, 50);
	f.add(t);

	lab.setBounds(50, 150, 200, 50);
	f.add(lab);
	lab.setText("Hey");
	b.setBounds(160, 60, 100, 50);
	f.add(b);
	b.addActionListener(this);
	f.setLayout(null);
	f.setSize(350, 500);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
    	try {
	    File f = new File(t.getText());
	    FileReader r = new FileReader(f);
	    char[] ch = new char[(int)f.length()];

	    r.read(ch);
	    String st = new String(ch);
	    lab.setText(st);
	}
	catch (IOException e)  {
	    lab.setText("Error reading file");
	}
    }

    public static void main(String[] args) {
	SwingUtilities.invokeLater(new Runnable() {
	    public void run() {
	   	new FileSwing();
	    }
	});
    }
}
