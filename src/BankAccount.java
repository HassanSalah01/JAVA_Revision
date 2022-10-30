public class BankAccount {
    public static int obNumb;
    private String userName;
    private String password;
    private String name ;
    private int id;
    private double amount;
    public BankAccount(String userName , String password ,String name ,double amount){
        BankAccount.obNumb++;
        this.id = BankAccount.obNumb;
        this.name = name;
        this.amount = amount;
        this.userName = userName;
        this.password = password;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    
}
