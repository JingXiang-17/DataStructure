package Lab_1.Question_4;
import Lab_1.Question_3.Account;
import java.util.ArrayList;

public class Account1 extends Account {
    private String name;

    public Account1 (String name, int id, double balance) {
        super(id, balance);
        this.name = name;
    }

    
}
