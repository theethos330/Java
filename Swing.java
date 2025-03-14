import javax.swing.*;

class Swing {
    Swing() {
        JFrame jfrm = new JFrame("A Sample Swing App");

        jfrm.setSize(500, 500);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jlab = new JLabel("Swing means powerful GUIS");
        jfrm.add(jlab);
        jfrm.setVisible(true);
    }

    public static void main(String a[])  { 
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Swing();
            }
        });
    }
}