package PartandQuantity;

public class DataException extends Exception{
    String message;
    DataException(int i){
        DataMessages dataMessages = new DataMessages();
        message = dataMessages.errorMessages[i];
    }
}
