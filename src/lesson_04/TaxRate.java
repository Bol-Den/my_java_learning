package lesson_04;

class TaxRate {

    public int calculateTaxRate(int income) {
        int taxRate;

        if (income >= 20000) {
            taxRate = 20;
        } else if (income >= 10000) {
            taxRate = 15;
        } else {
            taxRate = 10;
        }

        return taxRate;
    }


    public double calculateNetIncome(int income) {
         int taxRate =  calculateTaxRate(income);
         double taxAmount = (double) income * taxRate / 100;

         return income - taxAmount;
    }


}
