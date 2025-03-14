public class Student {
    String name;
    String course;
    String year;

    Student(String name, String course, String year) {
        this.name = name;
        this.course = course;
        this.year = year;
    }

    void sayHi() {
        System.out.println("Hi from "+ name);
    }

    void introduce() {
        System.out.println("Hello, I am " + this.name + " currently studying " + this.course + " and I'm in the " + this.year + " year");
    }
    
}
