import java.util.Scanner;

// attempt at using a lot of functions to improve performance and readability :)
public class BankApp {
    public static void main(String[] args) { // driver function
        new BankApp().run();
    }
    
    private final Scanner sc = new Scanner(System.in); // scanner

    static Bank myBank = new Bank("BCA"); // to add: add list of banks, implement another class here?

    private int menuGeneral() { // displays main menu
        do {
          System.out.println("--- WELCOME TO " + myBank.getBankName() + " TELLER SYSTEM ---\nPress: ");
          System.out.println("1. Register a new account");
          System.out.println("2. Delete an existing account");
          System.out.println("3. Log in to an account");
          System.out.println("4. Exit");
          int option = sc.nextInt();
          if (1 <= option && option <= 4) {
            return option;
          }
          System.out.println("Your input was not recognized. Please try again.");
        } while (true);  
    }

    public void run() { // switch for options
        do {
            int option = menuGeneral();
            switch (option) {
                case 1:
                  Customer account = register();
                  break;
                case 2:
                  delete();
                  break;
                case 3:
                  account = login();
                  if (account != null){
                      System.out.println("BALANCE: $" + displayBalance(account));
                      manageAccount(account);
                  }
                  break;
                case 4:
                  return;
            }
        } while (true);
    }

    private Customer register() {
        System.out.print("Enter first name: ");
        String firstName = sc.next();
        System.out.print("Enter last name: ");
        String lastName = sc.next();
        Customer customer = new Customer(firstName, lastName, new Account(0));
        myBank.addCustomer(customer);
        System.out.println("Account number: " + customer.getAccNo());
        return customer;
    }

    private void delete(){
        System.out.print("Enter account number: ");
        String accNo = sc.next();
        Customer found = search(accNo);
        if (found == null){
            System.out.println("ACCOUNT DOES NOT EXIST!");
        } else {
            myBank.delCustomer(found);
        }

    }

    private Customer search(String accNo){ // would replace with exceptions for unknown accounts for the sake of readability
        Customer found = myBank.getCustomer(accNo);
        return found;
    }

    private Customer login() {
        System.out.print("Enter account number: ");
        String accNo = sc.next();
        Customer found = search(accNo);
        if (found == null){
            System.out.println("ACCOUNT DOES NOT EXIST!");
            return null;
        }
        return found;
    }

    private double displayBalance(Customer customer){
        return customer.getAccount().getBalance();
    }

    private int menuManageAcc() {
        do {
            
            System.out.println("--- MANAGE ACCOUNT---\nPress: ");
            System.out.println("1. Display info");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer between accounts");
            System.out.println("5. Return to main menu");
            int option = sc.nextInt();
            if (1 <= option && option <= 5) {
              return option;
            }
            System.out.println("Your input was not recognized. Please try again.");
          } while (true);  
    }

    private void manageAccount(Customer customer) { // menu for existing customer
        do {
            int option = menuManageAcc(); // print menu for manageAccount
            switch (option) {
            case 1:
              info(customer);
              break;
            case 2:
              deposit(customer);
              break;
            case 3:
              withdraw(customer);
              break;
            case 4:
              transfer(customer);
              break;
            case 5:
              return;
            }
          } while (true);
    }

    private void info(Customer customer){ // display customer info
        System.out.println("--- CUSTOMER DETAILS ---");
        System.out.println(customer.toString());
    }

    private void deposit(Customer customer){
        System.out.print("Enter amount to deposit (in USD): ");
        double amt = sc.nextDouble();
        customer.getAccount().depositMoney(amt);
    }

    private void withdraw(Customer customer){
        System.out.print("Enter amount to withdraw (in USD): ");
        double amt = sc.nextDouble();
        customer.getAccount().withdrawMoney(amt);
    }

    private void transfer(Customer customer){ // this is atrocious but i will fix
        System.out.print("Enter amount to transfer (in USD): ");
        double amt = sc.nextDouble();
        System.out.print("Enter recipient account number: ");
        String accNoRec = sc.next();
        Customer recipient = search(accNoRec);
        if (recipient == null){
            System.out.println("ACCOUNT DOES NOT EXIST!");
        } else { // to fix: the headache inducing nested if below
            if (customer.getAccount().checkWithdraw(amt)){
                recipient.getAccount().depositMoney(amt);
                System.out.println("TRANSFER SUCCESSFUL!");
            }
        }
    }
    
}