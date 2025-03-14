import java.awt.*; 
import java.awt.event.*; 
  
public class KeyEventEx extends Frame implements KeyListener { 
   
    String msg="";
    int x=10, y=20;

    public KeyEventEx() {  
        super("Key Event Example"); 
        addKeyListener(this);
        setSize(300, 300);
        setVisible(true);
    } 
  

    public void keyPressed(KeyEvent e) { 
        msg="key down";
        repaint();
    } 
  
   
    public void keyReleased(KeyEvent e) { 
        msg="key down";
        repaint();
    } 
  

    public void keyTyped(KeyEvent e) { 
        msg += "Pressed char is: " + e.getKeyChar();
        repaint();
    } 

    public void paint(Graphics g) {
        g.drawString(msg + " at " + x + " "  + y, 50, 50);
    }
  
    public static void main(String[] args) { 
        new KeyEventEx(); 
    } 
}
