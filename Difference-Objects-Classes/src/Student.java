/*
 * This is a CLASS.
 * A class acts as a blueprint that defines what a Student is
 * and what a Student can do.
 * No real data exists until an object is created from this class.
 */
public class Student {

    // These fields define what data each Student object will have
    private String name;
    private int age;

    /*
     * Constructor:
     * This runs when a new Student object is created.
     * Each object gets its own copy of these values.
     */
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // This method belongs to the class and is used by objects
    public void introduce() {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}