package Message;
import java.util.*;

public class WriteMessage extends Thread{
    Thread writeMessageThread;
    String message;

    public WriteMessage(){
        writeMessageThread = new Thread(this, "Write message thread.");
        System.out.println("Write message thread created " + writeMessageThread);
    }

    @Override
    public void run() {
        try{
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter you message ");
            message = "";
            message += scan.nextLine();
        } catch (Exception e){
            System.out.println("Write Message thread is interrupted");
        }
        System.out.println("Write message thread run is over.");
    }
}
