package lesson_04;

class Purchase {

    private int amount;

    public Purchase(int amount){
        this.amount = amount;
    }

    public int getAmount(){
        return this.amount;
    }

    public int calculateDiscountRate() {
        int discountRate = 0;

        if (this.amount > 10000) {
            discountRate = 20;
        } else if (this.amount > 5000){
            discountRate = 10;
        }

        return discountRate;
    }

    public double calculateDiscountAmount() {
        return (double) this.amount * calculateDiscountRate() / 100 ;
    }

    public double calculateNetPurchase() {
        return this.amount - calculateDiscountAmount();
    }


}
