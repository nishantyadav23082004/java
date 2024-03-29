//wap to Create a class student and a method to show tgpa which takes input(name,regno,noOfsemester) return tgpa for each sem in the form of array

import java.util.*;

class Student {
    String name;
    int regNo;
    int totalSemesters;
    double[] tgpa;

    public boolean showtgpa(String name, int regNo, int totalSemesters) {
        this.name = name;
        this.regNo = regNo;
        this.totalSemesters = totalSemesters;
        this.tgpa = new double[totalSemesters];
    }

    public double showTgpa() {
        Scanner sc = new Scanner(System.in);
        for (int sem = 1; sem <= totalSemesters; sem++) {
            System.out.print("Enter TGPA for Semester " + sem + ": ");
            tgpa[sem - 1] = sc.nextDouble();
        }
	return tgpa;
    }
    public double calculateCGPA() {
        double totalTGPA = 0;
        for (double semTGPA : tgpa) {
            totalTGPA += semTGPA;
        }
        return totalTGPA / totalSemesters;
    }

    public void displayStudentDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Registration Number: " + regNo);
        System.out.println("Overall CGPA: " + calculateCGPA());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numS = sc.nextInt();

        Student[] st = new Student[numS];

        for (int i = 0; i < numS; i++) {
            sc.nextLine(); 					// Consume newline left by nextInt()
            System.out.print("\nEnter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter registration number: ");
            int regNo = sc.nextInt();

            System.out.print("Enter total number of semesters: ");
            int totalSemesters = sc.nextInt();

            st[i] = new showtgpa(name, regNo, totalSemesters);
            st[i].showTgpa();
        }

        for (Student student : st) {
            student.displayStudentDetails();
        }
    }
}