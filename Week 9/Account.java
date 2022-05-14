public class Account {
    private double balance;

    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public boolean checkDeposit(double amt){
        return (amt > 0);
    }
    public void depositMoney(double amt){
        if (checkDeposit(amt)){
            balance += amt;
            System.out.println("DEPOSIT SUCCESSFUL!");
        } else {
            // throw new Exception()
            System.out.println("Your balance is less than " + amt + ". Transaction failed." );
        }
    }

    public boolean checkWithdraw(double amt){ // using this as validator for transferMoney as well
        return (amt <= balance && amt > 0);
    }
    public void withdrawMoney(double amt){
        if (checkWithdraw(amt)){
            balance -= amt;
            System.out.println("WITHDRAWAL SUCCESSFUL!");
        } else {
            // throw new exception
            System.out.println("Not enough funds to withdraw: " + amt + ". Transaction failed.");
        }
    }

    
}
