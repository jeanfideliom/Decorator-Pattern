public class SavingsAccount implements BankAccount {

    public int accountNumber;
    public String accountName;
    public double balance;


    @Override
    public String showAccountType() {
        return "Savings Account";
    }
    @Override
    public double getInterestRate() {
        return 1.0;
    }

    @Override
    public double getbalance() {
        return this.balance;
    }

    @Override
    public String showBenefits() {
        return "Standard Savings Account";
    }

    @Override
    public double computeBalanceWithInterest() {
        double interest = balance * getInterestRate() / 100;
        return balance + interest;
    }

    @Override
    public String showInfo(){
        return "Account Number: "+accountNumber +"\nAccount Name: " +accountName + "\nBalance: "+balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountName() {
        return accountName;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }


}
