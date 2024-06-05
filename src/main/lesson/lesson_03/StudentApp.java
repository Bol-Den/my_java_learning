package lesson_03;

import java.util.Scanner;

class StudentApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide your student score");
        int score = scanner.nextInt();

        Student student = new Student();
        String studentGrade = student.calculateGrade(score);

        System.out.println(studentGrade);

    }

}
