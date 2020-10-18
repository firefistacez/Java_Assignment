package Bank;

public class BankAccount {
    int balance;
    int accountNo;
    public void display(){
        System.out.println("Account No: " + accountNo);
        System.out.println("Balance:" + balance);
    }

    public void depositAmount(int amount){
        balance += amount;
        System.out.println(amount + " is deposited.");
        display();
    }

    public void withdrawAmount(int amount){
        balance -= amount;
        System.out.println(amount + " is withdrawn.");
        display();
    }
}
