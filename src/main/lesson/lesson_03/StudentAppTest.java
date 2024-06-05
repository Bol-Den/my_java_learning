package lesson_03;

class StudentAppTest {

    public static void main(String[] args) {

       StudentAppTest test = new StudentAppTest();

       test.gradeA();
       test.gradeB();
       test.gradeC();

    }

    public void gradeA() {
        // input numbers to test
        int realScore = 95;
        String realGrade = "A";

        // returned grade from Student class
        Student student = new Student();
        String calculatedGrade = student.calculateGrade(realScore);

        // comparing input numbers vs returned numbers
        if (realGrade.equals(calculatedGrade)) {
            System.out.println("TEST gradeA - Passed OK");
        } else {
            System.out.println("TEST gradeA - Failed");
        }

    }

    public void gradeB() {
        // input numbers to test
        int realScore = 56;
        String realGrade = "B";

        // returned grade from Student class
        Student student = new Student();
        String calculatedGrade = student.calculateGrade(realScore);

        // comparing input numbers vs returned numbers
        if (realGrade.equals(calculatedGrade)) {
            System.out.println("TEST gradeB - Passed OK");
        } else {
            System.out.println("TEST gradeB - Failed");
        }

    }

    public void gradeC() {
        // input numbers to test
        int realScore = 35;
        String realGrade = "C";

        // returned grade from Student class
        Student student = new Student();
        String calculatedGrade = student.calculateGrade(realScore);

        // comparing input numbers vs returned numbers
        if (realGrade.equals(calculatedGrade)) {
            System.out.println("TEST gradeC - Passed OK");
        } else {
            System.out.println("TEST gradeC - Failed");
        }

    }

}
