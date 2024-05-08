package Logical_04;

class Student {

    public Student() {}

    public String calculateGrade(int score) {

        String grade;

        if ((score > 90) && (score <= 100)) {
            grade = "A";
        } else if ((score > 50) && (score <= 90)) {
            grade = "B";
        } else if ((score > 30) && (score <= 50)) {
            grade = "C";
        } else {
            grade = "unknown grade";
        }

        return grade;
    }
}