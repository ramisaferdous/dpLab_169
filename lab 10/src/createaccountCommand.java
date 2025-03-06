import java.util.ArrayList;
import java.util.List;

public class createaccountCommand implements Command
{
public String accountnumber;

public double innitialdeposit;

List<BankAccount> bankAccountList;

    public createaccountCommand(List<BankAccount>accountlist,String accountnumber, double innitialdeposit) {
        this.bankAccountList=accountlist;
        this.accountnumber = accountnumber;
        this.innitialdeposit = innitialdeposit;
    }


    public void Do(){
      bankAccountList.add(new BankAccount(accountnumber,innitialdeposit));
        System.out.println("Account " + accountnumber + " created with balance: " + innitialdeposit);
 }
}
