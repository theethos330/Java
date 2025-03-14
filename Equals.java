class Titus {
    void sayIntro() {
        System.out.println("Hey I'm Titus");
    }
}

class TitusObj extends Titus {
    int age;

    @Override
    void sayIntro() {
        System.out.println("Hey I'm Titus, I 'm' " + this.age + "years old");
    }
}

public class Equals {
    void test(Titus tObj) {
        System.out.println("My age is " + ((TitusObj)tObj).age);
    }

    public static void main(String[] args) {
        TitusObj tObj = new TitusObj();


        // String s = "hello";
        // String st = "hello";
        // String str = new String("hello");
        

        // System.out.println(s == st);
        // System.out.println(s == str);
        // System.out.println(s.equals(st));
        // System.out.println(s.equals(str));
    }
}
