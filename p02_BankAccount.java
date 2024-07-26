package f06_Defining_Classes.Bank_account;

public class p02_BankAccount {
    private static double interestRate = 0.02;
    public static int idProvider = 1;

    private int id;
    private double balance;

    public int getId() {
        return id;
    }

    public p02_BankAccount(){
      this.id = idProvider++;
    }

    public void setInterestRate(double interest){
        interestRate = interest;
    }

    public double getInterest(int years){
        return balance * years * interestRate;
    }

    public void deposit (double amount){
       balance += amount;
    }
}
