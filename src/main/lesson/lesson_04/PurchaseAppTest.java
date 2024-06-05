package lesson_04;

class PurchaseAppTest {

    public static void main(String[] args) {

        PurchaseAppTest test = new PurchaseAppTest();

        test.testRate20();
        test.testRate10();

    }


    public void testRate20() {
        int amount = 11000;
        int realRate = 20;

        Purchase purchase = new Purchase(amount);
        int expectedRate = purchase.calculateDiscountRate();

        if (expectedRate == realRate) {
            System.out.println("TEST Rate20 - OK");
        } else {
            System.out.println("TEST Rate20 - Failed");
        }
    }

    public void testRate10() {
        int amount = 5600;
        int realRate = 10;

        Purchase purchase = new Purchase(amount);
        int expectedRate = purchase.calculateDiscountRate();

        if (expectedRate == realRate) {
            System.out.println("TEST Rate10 - OK");
        } else {
            System.out.println("TEST Rate10 - Failed");
        }
    }


}
