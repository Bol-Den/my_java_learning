package lesson_04;

class InterestRateTest {

    public static void main(String[] args) {
         InterestRateTest test = new InterestRateTest();

         test.testFivePercentRate();
    }


    public InterestRateTest() {}

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

}
