package Message;
import java.util.*;

public class Message {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        int end=1;
        while(end!=0){
            WriteMessage writeMessage = new WriteMessage();
            writeMessage.start();
            try{
                writeMessage.join();
            }
            catch(Exception e){
                System.out.print(e);
            }
            FindVowel findVowel = new FindVowel(writeMessage.message);
            findVowel.start();
            findVowel.join();
            System.out.print("Enter 0 to end: ");
            end = scan.nextInt();
        }
    }
}
