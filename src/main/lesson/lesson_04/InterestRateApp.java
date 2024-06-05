package lesson_04;

import java.util.Scanner;

class InterestRateApp {

    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         System.out.println("Your credit rating?");
         int creditRating = scanner.nextInt();

         InterestRate interest = new InterestRate();
         int rate = interest.calculateInterestRate(creditRating);

         System.out.println("applicable Interest Rate: " + rate + "%");

    }
}
