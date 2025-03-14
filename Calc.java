import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class C implements ActionListener {
    JFrame f;
    JTextField t;
    JButton[] btns = new JButton[19];
    String[] buttonLabels = {
   	"1", "2", "3", "4", "5", "6", "7", "8", "9",
        "0", "+", "-", "*", "/", "sqrt", "^", "clear", "delete", "="
    };

    C() {
    	f = new JFrame("Calculator");
		t = new JTextField();
		t.setBounds(40, 30, 270, 40);
		f.add(t);
		int x=40, y=100;
		for (int i=0; i<buttonLabels.length; i++) {
			btns[i] = new JButton(buttonLabels[i]);
			btns[i].setBounds(x, y, 50, 40);
			btns[i].addActionListener(this);
			f.add(btns[i]);
			x += 70;

			if ((i+1) % 4 == 0) {
				x = 40;
				y += 70;
	    	}

		}

		btns[14].setBounds(175, 310, 60, 40);
		btns[16].setBounds(40, 380, 70, 40);
		btns[17].setBounds(135, 380, 80, 40);
		btns[18].setBounds(240, 380, 60, 40);

		f.setLayout(null);
		f.setSize(400, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
		double a=0, b=0, result=0;
    	String command = e.getActionCommand();
		int op=0;
		switch (command) {
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
            case "7":
            case "8":
            case "9":
            case "0":
				t.setText(t.getText().concat(command));
			break;
	   	 	case "+":
				a = Double.parseDouble(t.getText());
				op = 1;
				t.setText("");
				break;
	    	case "-":
				a = Double.parseDouble(t.getText());
				op  = 2;
				t.setText("");
				break;
	    	case "*":
				a = Double.parseDouble(t.getText());
				op = 3;
				t.setText("");
				break;
	    	case "/":
				a = Double.parseDouble(t.getText());
				op = 4;
				t.setText("");
				break;
	    	case "sqrt":
				a = Double.parseDouble(t.getText());
				op = 5;
				t.setText("");
				break;
	    	case "^":
				a = Double.parseDouble(t.getText());
				op = 6;
				t.setText("");
			break;
			case "delete":
				a = Double.parseDouble(t.getText());
				String s = t.getText();
				if (!s.isEmpty()) {
					t.setText(s.substring(0, s.length() - 1));
				}
				break;
			case "clear":
				t.setText("");
			break;
			case "=":
				b = Double.parseDouble(t.getText());
			
			switch (op) {
				case 1:
					result = a+b;
					break;
				case 2:
					result = a-b;
					break;
				case 3:
					result = a*b;
					break;
				case 4:
					result = a/b;
					break;
				case 5:
					result = Math.sqrt(b);
					break;
				case 6:
					result = Math.pow(a,b);
					break;

			}
			t.setText(String.valueOf(result));
		}
	}
}

public class Calc {
    public static void main(String[] args) {
    	SwingUtilities.invokeLater(new Runnable() {
	    public void run() {
	    	new C();
	    }
	});
    }
}
