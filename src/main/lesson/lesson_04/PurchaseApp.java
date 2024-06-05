package lesson_04;

class PurchaseApp {

    public static void main(String[] args) {

        Purchase purchase1  = new Purchase(5111);

        System.out.println("Gross Purchase: " + purchase1.getAmount());
        System.out.println("Discount Rate: " + purchase1.calculateDiscountRate() + "%");
        System.out.println("Discount Amount: " + purchase1.calculateDiscountAmount());
        System.out.println("Net Purchase: " + purchase1.calculateNetPurchase());

    }
}
