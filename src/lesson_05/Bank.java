package lesson_05;

import java.math.BigDecimal;

class Bank {

    private String account;
    private int balance;
    private int deposit;
    private int withdrawal;


    public Bank(String account, int balance){
        this.account = account;
        this.balance = balance;
        this.deposit = 0;
        this.withdrawal = 0;
    }


    public String getAccount() {
        return this.account;
    }

    public int getBalance() {
        return this.balance;
    }

    public int getDeposits() {
        return this.deposit;
    }

    public int getWithdrawal() {
        return this.withdrawal;
    }


    public void makeWithdrawal(int withdrawal){
         if (this.balance >= withdrawal) {
             this.withdrawal = withdrawal;
             this.balance -= withdrawal;
         } else {
             this.withdrawal = 0;
         }
    }


    public void makeDeposit(int deposit){
            this.deposit = deposit;
            this.balance += deposit;
    }


}
