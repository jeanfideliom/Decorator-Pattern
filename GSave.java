public class GSave implements BankAccountDecorator{
    private BankAccount bankAccount;
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String showAccountType() {
        return "GSave";
    }

    @Override
    public double getInterestRate() {
        return 2.5;
    }

    @Override
    public double getbalance() {
        return bankAccount.getbalance();
    }

    @Override
    public String showBenefits() {
        return bankAccount.showBenefits() + ", GSave Transfer";
    }

    @Override
    public double computeBalanceWithInterest() {
        double interest = getbalance() * getInterestRate() / 100;
        return getbalance() + interest;
    }

    @Override
    public String showInfo() {
        return bankAccount.showInfo();
    }
}
