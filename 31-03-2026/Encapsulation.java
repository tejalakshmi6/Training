class BankAccount{
    private double balance = 0;
    //balance is hidden -> encapsulation
    
    //balance can only be accessed using the functions inside the class:
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        if ( balance > 0 )
            this.balance = balance;
        else {
            System.out.println("Invalid Input");
            System.out.println();
        }
    }

    public void withdraw( int amount ){
        if ( amount > 0 && amount <= balance ){
            balance -= amount;
            System.out.println("Amount debited: "+amount);
            System.out.println("Account Balance after Withdrawal: "+balance);
        } else 
            System.out.println("Invalid withdrawal");
        System.out.println();
    }
    
    public void deposit(int amount){
        if ( amount > 0 ){
            balance += amount;
            System.out.println("Amount deposited: "+amount);
            System.out.println("Account Balance after Deposit: "+balance);
        } else 
            System.out.println("Invalid withdrawal");
        System.out.println();
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setBalance(1000);
        System.out.println("Account Balance: "+acc.getBalance());
        acc.setBalance(-80);
        acc.withdraw(2000);
        acc.withdraw(800);
        acc.deposit(16);
        acc.deposit(-10);
        
    }    
}
