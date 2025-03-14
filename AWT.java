import java.awt.*;

public class AWT {
    public AWT() {
    	Frame f = new Frame();
	Button btn = new Button("Hello World");
	btn.setBounds(80, 80, 100, 50);
	f.add(btn);
	f.setSize(300, 250);
	f.setTitle("My Frame");
	f.setLayout(null);
	f.setVisible(true);
    }

    public static void main(String[] args) {
    	AWT aw = new AWT();
    }
}
