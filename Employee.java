import java.io.*;

public class Employee implements Serializable {
    String name; 
    int id;
    public Employee(String name, int id) {
        this.id = id;
        this.name = name;
    }
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("Employee.txt");
            Employee e = new Employee("Jobit", 1);
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(e);
            out.flush();
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        int a = 5;
        int b = ~a;
        System.out.println(b);
        int res = 3;
        res <<= 1;
        // res <<= 1;
        // res <<= 1;
        System.out.println(res); 
    }
}