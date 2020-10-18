package Message;

import java.util.Objects;
import java.util.Scanner;

public class FindVowel extends Thread {
    String message;
    String[] vowels = {"A", "E", "I", "O", "U"};
    int vowelsCount=0;
    Thread findVowelThread;
    public FindVowel(String message){
        this.message = message;
        findVowelThread = new Thread(this, "Find vowel thread.");
        System.out.println("Find vowel thread created " + findVowelThread);
    }

    @Override
    public void run() {
        try{
            Character[] vowels = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
            for(int i=0;i<message.length();i++){
                for(Character vowel: vowels){
                    if(Objects.equals(message.charAt(i), vowel)){
                        vowelsCount += 1;
                    }
                }
            }
        } catch (Exception e){
            System.out.println("Find vowel thread is interrupted");
        }
        System.out.println("Find vowel thread run is over.");
        System.out.println("The number of vowels in the message " + message +" are: " + vowelsCount);
    }
}
