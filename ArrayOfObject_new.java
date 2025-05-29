package Advance_Java_Telusco;

import java.util.Scanner;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ArrayOfObject_new {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array for 3 students
        Student[] students = new Student[3];

        // Take user input to initialize objects
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter name for student " + (i + 1) + ":");
            String name = scanner.nextLine();
            System.out.println("Enter age for student " + (i + 1) + ":");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            students[i] = new Student(name, age);
        }

        // Display all students
        System.out.println("\nStudent Details:");
        for (Student student : students) {
            student.display();
        }
    }
}


