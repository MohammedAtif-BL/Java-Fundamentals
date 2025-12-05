package datatypes;

public class AccessModifiersExample {
    public String name; // Public access
    private double salary; // Private access
    protected int age; // Protected access
    String department; // Default (package-private) access

    public double getSalary() {
        return salary;
    }
}

class Example{
    public static void main(String[] args) {
        AccessModifiersExample object = new AccessModifiersExample();
        object.name = "John Doe"; // Accessible
//        object.salary = 50000; // Not Accessible
        object.getSalary();
        int number = 10;
        number = number + 20; // number += 20;

        System.out.println(number > 5); // true
    }
}
