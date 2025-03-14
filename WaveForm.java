import javax.swing.*;
import java.awt.*;

public class WaveForm extends JFrame {
    public WaveForm() {
        super("Wave Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                int width = getWidth();
                int height = getHeight();

                int amplitude = height / 4;
                int wavelength = width / 8;

                g.setColor(Color.BLUE);

                for (int x = 0; x < width; x++) {
                    int y = (int) (amplitude * Math.sin(2 * Math.PI * x / wavelength) + height / 2);
                    g.drawLine(x, y, x, y);
                }
            }
        };

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new WaveForm();
    }
}
