package lesson_04;

class InterestRate {

    public InterestRate(){}

    public int calculateInterestRate(int rating) {
        int interestRate;

        if (rating > 700) {
          interestRate = 5;
        } else if (rating >= 650) {
          interestRate = 7;
        } else {
          interestRate = 10;
        }

        return interestRate;
    }
}
