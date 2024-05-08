package lesson_04;

import java.util.Scanner;

class TaxRateApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Your income ?");
        int income = scanner.nextInt();

        TaxRate tax = new TaxRate();
        int taxRate = tax.calculateTaxRate(income);

        System.out.println("Tax rate: " + taxRate + "%");
        System.out.println("Net Amount: " + tax.calculateNetIncome(income));

    }
}
