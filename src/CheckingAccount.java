public class CheckingAccount extends BankAccount{

    private double dailyIntersetRate;
    public CheckingAccount(String userName, String password, String name, double amount) {
        super(userName, password, name, amount);
    }

    public double getDailyIntersetRate() {
        return this.dailyIntersetRate;
    }

    public void setDailyIntersetRate(double dailyIntersetRate) {
        this.dailyIntersetRate = dailyIntersetRate;
    }
    
}


