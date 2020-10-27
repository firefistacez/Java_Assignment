package WordCount;
import java.net.*;
import java.io.*;

public class Client {
    Socket socket = null;
    DataInputStream dataInput = null;
    DataOutputStream dataOutput = null;
    Client(String address, int port){
        try{
            socket = new Socket(address, port);
            System.out.println("Connected");
            dataInput = new DataInputStream(System.in);
            dataOutput = new DataOutputStream(socket.getOutputStream());
        }catch (UnknownHostException ue){
            System.out.println(ue);
        }catch(IOException ie){
            System.out.println(ie);
        }
        System.out.println("Enter your message.\nOnce your done entering your message enter 'Over' in a new line.");

        String line = "";
        while(!line.equals("Over")){
            try{
                line = dataInput.readLine();
                dataOutput.writeUTF(line);
            }catch(IOException ie){
                System.out.println(ie);
            }
        }

        try{
            dataInput.close();
            dataOutput.close();
            socket.close();
        }catch (IOException ie){
            System.out.println(ie);
        }
    }

    public static void main(String[] args) {
        Client client = new Client("localhost", 5000);
    }
}
