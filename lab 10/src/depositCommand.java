public class depositCommand  implements Command{
    public BankAccount account;
    public double amount;

    public depositCommand(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;

    }

    public void Do(){
        account.deposit(amount);
        System.out.println("An amount of"+amount+"is deposited into account");

    }
}
