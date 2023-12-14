public class UpSave implements BankAccountDecorator{
    private BankAccount bankAccount;

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String showAccountType() {
        return "UpSave";
    }

    @Override
    public double getInterestRate() {
        return 4.0;
    }

    @Override
    public double getbalance() {
        return bankAccount.getbalance();
    }

    @Override
    public String showBenefits() {
        return bankAccount.showBenefits() + ", With Insurance";
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
