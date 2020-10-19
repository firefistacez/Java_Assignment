package Order;

public class DataException extends Exception {
    String message;
    String partNumber;
    String quantityOrdered;
    public DataException(String message, String partNumber, String quantityOrdered){
        this.message = message;
        this.partNumber = partNumber;
        this.quantityOrdered = quantityOrdered;
    }

    public String toString(){
        DataMessages partNotNumeric = new DataMessages();
        DataMessages quantityorderedNotNumeric = new DataMessages();
        DataMessages partLow = new DataMessages();
        DataMessages partHigh = new DataMessages();
        DataMessages quantityorderedLow = new DataMessages();
        DataMessages quantityorderedHigh = new DataMessages();
        int partNum;
        int quantityOrd;
        try{
            partNum = Integer.parseInt(partNumber);
            if(partNum<0){
                message += partLow.errorMessages[2];
            }
            else if(partNum>999){
                message += partHigh.errorMessages[3];
            }
            else{
                message += "Valid entry. Part number is within the range.\n";
            }
        } catch (NumberFormatException e) {
            message += partNotNumeric.errorMessages[0];
        }
        try{
            quantityOrd = Integer.parseInt(quantityOrdered);
            if(quantityOrd<1){
                message += quantityorderedLow.errorMessages[4];
            }
            else if(quantityOrd>5000){
                message += quantityorderedHigh.errorMessages[5];
            }
            else{
                message += "Valid entry. Quantity Ordered is within the range.\n";
            }
        } catch (NumberFormatException e) {
            message += quantityorderedNotNumeric.errorMessages[1];
        }
        return message;
    }
}
