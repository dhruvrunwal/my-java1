public class Student {
    String name;
    int age;

    public Student(String n, int a) {
        name = n;
        age = a;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        s1.displayInfo();
    }
}
