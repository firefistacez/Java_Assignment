package WordCount;
import java.net.*;
import java.io.*;

public class Server {
    Socket socket = null;
    ServerSocket serverSocket = null;
    DataInputStream dataInput = null;

    Server(int port){
        try{
            serverSocket = new ServerSocket(port);
            System.out.println("Server started");
            System.out.println("Waiting for a client message");
            socket = serverSocket.accept();
            System.out.println("Client accepted");

            dataInput = new DataInputStream((new BufferedInputStream(socket.getInputStream())));

            String line ="";
            int count = 0;
            while(!line.equals("Over")){
                try{
                    line = dataInput.readUTF();
                    System.out.println(line);
                    String[] words = line.split(" ");
                    count += words.length;
                }catch(IOException ie){
                    System.out.println(ie);
                }
            }
            System.out.println("The number of words in the paragraph is " + (count-1));

            socket.close();
            dataInput.close();
        }catch (IOException ie){
            System.out.println(ie);
        }
    }

    public static void main(String[] args) {
        Server server = new Server(5000);
    }
}
