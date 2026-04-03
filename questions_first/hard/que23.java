package questions_first.hard;

import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    int[] marks = new int[3];

    Student(String name, int rollNo, int[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    double getAverage() {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += marks[i];
        }
        return sum / 3.0;
    }
}

class StudentManager {
    Student[] students = new Student[3];
    int count = 0;

    void addStudent(Student s) {
        if (count < 3) {
            students[count++] = s;
        }
    }

    void displayTopper() {
        Student topper = students[0];

        for (int i = 1; i < count; i++) {
            if (students[i].getAverage() > topper.getAverage()) {
                topper = students[i];
            }
        }

        System.out.println("Topper:");
        System.out.println(
            "Name: " + topper.name +
            ", Roll No: " + topper.rollNo +
            ", Average: " + topper.getAverage()
        );
    }
}

public class que23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager sm = new StudentManager();

        int n = sc.nextInt(); 

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int rollNo = sc.nextInt();
            int[] marks = new int[3];

            for (int j = 0; j < 3; j++) {
                marks[j] = sc.nextInt();
            }

            sm.addStudent(new Student(name, rollNo, marks));
        }

        sm.displayTopper();
        sc.close();
    }
}
