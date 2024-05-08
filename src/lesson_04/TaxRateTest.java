package lesson_04;

class TaxRateTest {

    public static void main(String[] args) {
        TaxRateTest test = new TaxRateTest();

        test.testRateTen();
        test.testRateFifteen();
        test.testRateTwenty();

    }

    // Test 10% rate
    public void testRateTen() {
        int income = 9500;
        int realRate = 10;

        TaxRate tax = new TaxRate();
        int expectedRate = tax.calculateTaxRate(income);

        if (expectedRate == realRate){
            System.out.println("TEST 10% Rate - Passed");
        } else {
            System.out.println("TEST 10% Rate - Failed");
        }
    }

    // Test 15% rate
    public void testRateFifteen() {
        int income = 12000;
        int realRate = 15;

        TaxRate tax = new TaxRate();
        int expectedRate = tax.calculateTaxRate(income);

        if (expectedRate == realRate){
            System.out.println("TEST 15% Rate - Passed");
        } else {
            System.out.println("TEST 15% Rate - Failed");
        }
    }

    // Test 20% rate
    public void testRateTwenty() {
        int income = 45000;
        int realRate = 20;

        TaxRate tax = new TaxRate();
        int expectedRate = tax.calculateTaxRate(income);

        if (expectedRate == realRate){
            System.out.println("TEST 20% Rate - Passed");
        } else {
            System.out.println("TEST 20% Rate - Failed");
        }
    }


}
