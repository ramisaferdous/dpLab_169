import java.util.ArrayList;
import java.util.List;

public class BankAccount {
public  String accoutnumber;
public double totalbalance;
public List<String>TransactionHistory;

    public BankAccount(String accoutnumber, double amount) {
        this.accoutnumber = accoutnumber;
        this.totalbalance = amount;
        this.TransactionHistory=new ArrayList<>();
        TransactionHistory.add("Account created with innitial deposit"+amount);
    }
    public void deposit(double amount){
        totalbalance+=amount;
        TransactionHistory.add("An ammount of "+amount +" has been deposited in the account");
    }
    public void withdraw(double amount){
        if(amount>totalbalance){
     TransactionHistory.add("Failed to withdraw amount"+amount);
        }
       else{
           totalbalance-=amount;
           TransactionHistory.add("An amount of" + amount+"has been withdrawn");
       }
    }

    public List<String> getTransactionHistory() {
        return TransactionHistory;
    }
    public double getBalance() {
        return totalbalance;
    }
}
