import java.util.Scanner;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student's name:");
        String name = scanner.nextLine();

        System.out.println("Enter student's age:");
        int age = scanner.nextInt();

        Student student = new Student(name, age);
        student.displayInfo();

        scanner.close();
    }
}