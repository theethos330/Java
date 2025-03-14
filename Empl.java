import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Empl {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("Employee.txt");
            ObjectInputStream in = new ObjectInputStream(fin);
            Employee e = (Employee)in.readObject();
            System.out.println(e.id + " " + e.name);
        } catch (Exception e) {
            System.out.println(e);
        }
    }   
}
