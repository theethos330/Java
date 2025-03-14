import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AlphaBeta extends JApplet {
    JButton jbtnAlpha;
    JButton jbtnBeta;
    JLabel jlab;
    public void init() {
        try {
            SwingUtilities.invokeAndWait(new Runnable () {
            public void run() {
                makeGUI(); 
            }
        });
        } catch(Exception exc) {
            System.out.println("Can't create because of "+ exc);
        }
    }

    private void makeGUI() {
        setLayout(new FlowLayout());
        
        jbtnAlpha = new JButton("Alpha");
        jbtnBeta = new JButton("Beta");
        
        jbtnAlpha.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent le) {
                jlab.setText("Alpha was pressed.");
            }
        });

        jbtnBeta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent le) {
                jlab.setText("Beta was pressed.");
            }
        });
        
        add(jbtnAlpha);
        add(jbtnBeta);
            
        jlab = new JLabel("Press a button.");
            
        add(jlab);
    }
}