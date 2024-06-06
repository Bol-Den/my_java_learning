package lesson_04;

class InterestRateTests {

    public static void main(String[] args) {
         InterestRateTests test = new InterestRateTests();

         test.testFivePercentRate();
         test.testSevenPercentRate();

    }

    public void testFivePercentRate() {
        int realRating = 725;
        int realRate = 5;

        InterestRate interest = new InterestRate();
        int calculatedRate = interest.calculateInterestRate(realRating);

        if (calculatedRate == realRate) {
            System.out.println("Passed") ;
        } else {
            System.out.println("Failed");
        }
    }

    public void testSevenPercentRate() {
        int realRating = 675;
        int realRate = 7;

        InterestRate interest = new InterestRate();
        int calculatedRate = interest.calculateInterestRate(realRating);

        if (calculatedRate == realRate) {
            System.out.println("Passed") ;
        } else {
            System.out.println("Failed");
        }
    }

}
