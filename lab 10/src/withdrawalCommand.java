public class withdrawalCommand implements Command{
    public BankAccount account;
    public double amount;

    public withdrawalCommand(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public void Do(){
        if(amount>account.totalbalance){
          //account.withdraw(amount);
            System.out.println("Failed to withdraw amount"+amount);
        }
        else{
            account.withdraw(amount);
            System.out.println("An amount of" + amount+"has been withdrawn");
        }

    }

}
