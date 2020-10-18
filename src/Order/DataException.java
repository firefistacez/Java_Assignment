package Order;

public class DataException extends Exception {
    String message;
    int partNumber;
    int quantityOrdered;
    public DataException(String message, int partNumber, int quantityOrdered){
        this.message = message;
        this.partNumber = partNumber;
        this.quantityOrdered = quantityOrdered;
    }

    public String toString(){
        DataMessages dataMessages1 = new DataMessages();
        DataMessages dataMessages2 = new DataMessages();
        DataMessages dataMessages3 = new DataMessages();
        DataMessages dataMessages4 = new DataMessages();
        if(partNumber<0){
            message += dataMessages1.errorMessages[0];
        }
        else if(partNumber>999){
            message += dataMessages2.errorMessages[1];
        }
        else{
            message += "Valid entry. Part number is within the range.\n";
        }
        if(quantityOrdered<1){
            message += dataMessages3.errorMessages[2];
        }
        else if(quantityOrdered>5000){
            message += dataMessages4.errorMessages[3];
        }
        else{
            message += "Valid entry. Quantity ordered is within the range.\n";
        }
        return message;
    }
}
