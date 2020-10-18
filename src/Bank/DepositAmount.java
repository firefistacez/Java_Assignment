package Bank;

public class DepositAmount extends Thread{
    int amount;
    BankAccount accountNo;
    Thread depositThread;
    public DepositAmount(BankAccount account, int amount){
        accountNo = account;
        this.amount = amount;
        depositThread = new Thread(this, "Deposit amount thread");
        System.out.println("Deposit amount thread created " + depositThread);
    }

    @Override
    public void run() {
        try{
            accountNo.depositAmount(amount);
        } catch (Exception e) {
            System.out.println("Deposit thread interrupted");
        }
        System.out.println("Deposit thread run is over");
    }
}
