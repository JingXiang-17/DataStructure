package Tutorial_1.Question_5;

public class BankAccount implements Account {
    private int balance;

    public BankAccount (int balance){
        this.balance = balance;
    }

    public int deposit (int amount) {
        balance += amount;
        return balance;
    }

    public boolean withdraw (int amount) {
        return (balance >= amount) ? (balance-=amount) >=0 : false ;
    }
}