class Base {
    Base(String name) {
    	System.out.println("Hello " + name + " from super class");
    }
}

class InheritingClass extends Base {
    
    InheritingClass(String name, int age) {
    	super(name);
	System.out.println("Your age is: " + age + " from inherting class");
    }
}

public class Tester {
    public static void main(String[] args) {
    	new InheritingClass("Rahul", 19);
    }
}
