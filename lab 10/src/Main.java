
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<BankAccount> accounts = new ArrayList<>();
        ActionHandler invoker = new ActionHandler();

        while (true) {
            System.out.println("\nBanking System:\n1. Create Account\n2. Deposit\n3. Withdraw\n4. Check Balance\n5. View Transaction History\n6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Account Number: ");
                    String accNum = scanner.next();
                    System.out.print("Enter Initial Deposit: ");
                    double deposit = scanner.nextDouble();
                    invoker.executeCommand(new createaccountCommand(accounts, accNum, deposit));
                }
                case 2, 3, 4, 5 -> {
                    System.out.print("Enter Account Number: ");
                    String accNum = scanner.next();
                    BankAccount account = accounts.stream().filter(a -> a.getBalance() != 0).findFirst().orElse(null);
                    if (account == null) {
                        System.out.println("Account not found!");
                        break;
                    }
                    if (choice == 2) {
                        System.out.print("Enter Amount: ");
                        double amount = scanner.nextDouble();
                        invoker.executeCommand(new depositCommand(account, amount));
                    } else if (choice == 3) {
                        System.out.print("Enter Amount: ");
                        double amount = scanner.nextDouble();
                        invoker.executeCommand(new withdrawalCommand(account, amount));
                    } else if (choice == 4) {
                        System.out.println("Current Balance: " + account.getBalance());
                    } else {
                        System.out.println("Transaction History:");
                        account.getTransactionHistory().forEach(System.out::println);
                    }
                }
                case 6 -> {
                    System.out.println("Exiting... Thank you!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid option! Try again.");
            }
        }
    }
}
