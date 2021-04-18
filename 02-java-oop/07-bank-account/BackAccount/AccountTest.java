
public class AccountTest{
public static void main(String[] args) {
    
    BankAccount may = new BankAccount();
    BankAccount dan = new BankAccount();
    BankAccount leo = new BankAccount();
    System.out.println(may.getAccountNumber());
    System.out.println(dan.getAccountNumber());
    System.out.println(leo.getAccountNumber());

    System.out.println(BankAccount.totalAccounts);

    leo.deposit("Savings", 50000.00);
    dan.deposit("Savings", 50000.00);

    may.deposit("Savings", 50000.00);
    System.out.println(may.getSavingsBalance());

    may.deposit("Checking", 10000.00);
    System.out.println(may.getCheckingBalance());

    may.withdraw("Savings", 5000000.00);

    may.withdraw("Savings", 5000.00);
    System.out.println(may.getSavingsBalance());

    may.withdraw("Checking", 6000.00);
    System.out.println(may.getCheckingBalance());

    may.withdraw("Checking", 6000.00);
    System.out.println(may.getCheckingBalance());

    may.totalMoney();

    System.out.println(BankAccount.totalHoldings);
}
}