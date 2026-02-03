/*
 * This program demonstrates the difference between a class and objects.
 * Student is the class.
 * student1 and student2 are objects created from that class.
 */
public class Main {
    public static void main(String[] args) {

        // Creating two different objects from the same class
        Student student1 = new Student("Bruno", 7);
        Student student2 = new Student("Chubbs", 4);

        // Even though they come from the same class,
        // these objects store their own data
        student1.introduce();
        student2.introduce();

        System.out.println();

        // Changing one object does not affect the other
        student1.setName("Bruno Hernandez");

        System.out.println("After changing student1's name:");
        student1.introduce();
        student2.introduce();

        System.out.println();

        // This shows the relationship between the class and the objects
        System.out.println("Class type: Student");
        System.out.println("Object 1 name: " + student1.getName());
        System.out.println("Object 2 name: " + student2.getName());
    }
}
