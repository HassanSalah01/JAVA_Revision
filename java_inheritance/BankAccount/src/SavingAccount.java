public class SavingAccount extends BankAccount {
    private int withdrawLimit = 5;
    private int withdrawAmount = 1000;

    public SavingAccount(String userName, String password, String name, double amount) {
        super(userName, password, name, amount);
        
    }


    public int getWithdrawLimit() {
        return this.withdrawLimit;
    }

    public void setWithdrawLimit(int withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public int getWithdrawAmount() {
        return this.withdrawAmount;
    }

    public void setWithdrawAmount(int withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }






}
