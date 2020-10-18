package Bank;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) throws InterruptedException {
        BankAccount bankAccount = new BankAccount();
        Scanner scan = new Scanner(System.in);
        boolean end = false;
        while(!end){
            System.out.print("Enter the account number: ");
            bankAccount.accountNo = scan.nextInt();
            System.out.print("Enter you balance amount: ");
            bankAccount.balance = scan.nextInt();
            System.out.print("Enter the amount to deposit: ");
            int deposit = scan.nextInt();
            System.out.print("Enter the amount to withdraw: ");
            int withdraw = scan.nextInt();
            DepositAmount depositAmount = new DepositAmount(bankAccount, deposit);
            WithdrawAmount withdrawAmount = new WithdrawAmount(bankAccount, withdraw);
            depositAmount.start();
            try{
                depositAmount.join();
            }catch (Exception e){System.out.print(e);}
            withdrawAmount.start();
            System.out.print("Enter true to end: ");
            end =scan.nextBoolean();
        }

    }
}
