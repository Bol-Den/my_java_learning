package lesson_05;

class BankTest {

    public static void main(String[] args) {
         BankTest test = new BankTest();
         test.test1();
         test.test2();
         test.test3();

    }

    // initial balance 1789 ,
    // withdrawals made for 155
    // ending balance 1789 - 155 = 1634
    public void test1(){
        Bank bank = new Bank("test_1", 1789);
        bank.makeWithdrawal(155);
        int result = bank.getBalance();
        if (result == 1634) {
            System.out.println("Test1: OK");
        } else {
            System.out.println("Test2: FAILED");
        }
    }


    // initial balance 178 ,
    // withdrawals made for 1550
    // ending balance = 178
    public void test2(){
        Bank bank = new Bank("test_2", 178);
        bank.makeWithdrawal(1550);
        int result = bank.getBalance();
        if (result == 178) {
            System.out.println("Test2: OK");
        } else {
            System.out.println("Test2: FAILED");
        }
    }


    // initial balance 100 ,
    // withdrawals made for 40
    // deposit made for 17
    // ending balance = 77
    public void test3(){
        Bank bank = new Bank("test_3", 100);
        bank.makeWithdrawal(40);
        bank.makeDeposit(17);
        int result = bank.getBalance();
        if (result == 77) {
            System.out.println("Test3: OK");
        } else {
            System.out.println("Test3: FAILED");
        }
    }


}
