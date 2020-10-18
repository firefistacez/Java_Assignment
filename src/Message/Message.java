package Message;

public class Message {
    public static void main(String[] args) {
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
    }
}
