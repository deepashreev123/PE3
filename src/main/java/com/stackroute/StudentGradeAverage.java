package com.stackroute;

import java.util.Scanner;

public class StudentGradeAverage {
    private final int LOWEST_GRADE = 0;
    private final int HIGHEST_GRADE = 100;

    // student's grades
    private int[] stuGrades;

    private Scanner in;

    public static void main(String[] args) {
        StudentGradeAverage studentgradeaverage = new StudentGradeAverage();
        studentgradeaverage.in = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numOfStudents = studentgradeaverage.in.nextInt();
        studentgradeaverage.run(numOfStudents);
    }

    /**
     * methood for checking grades
     */
    private void run(int numOfStudents) {
        if (numOfStudents <= 0) {
            System.out.println("Invalid number of students.");
            return;
        }
        stuGrades = new int[numOfStudents];

        double sum = 0;
        int i = 0;
        while (i < numOfStudents) {
            System.out.printf("Enter the grade for student %d: ", (i + 1));
            int grade = in.nextInt();

            // chek if grade is between 0 and 100
            if ((grade >= LOWEST_GRADE) && (grade <= HIGHEST_GRADE)) {
                stuGrades[i] = grade;
                sum += grade;
                i++;
                continue;
            }
            System.out.println("Invalid grade, try again...");
        }
        System.out.printf("The average is %f\n", (sum / numOfStudents));
    }

}