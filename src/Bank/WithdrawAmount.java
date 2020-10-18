package Bank;

public class WithdrawAmount extends Thread{
    int amount;
    BankAccount accountNo;
    Thread withdrawThread;
    public WithdrawAmount(BankAccount account, int amount){
        accountNo = account;
        this.amount = amount;
        withdrawThread = new Thread(this, "Withdraw amount thread");
        System.out.println("Withdraw amount thread created " + withdrawThread);
    }

    @Override
    public void run() {
        try{
            accountNo.withdrawAmount(amount);
        } catch (Exception e) {
            System.out.println("Withdraw thread interrupted");
        }
        System.out.println("Withdraw thread run is over");
    }
}
