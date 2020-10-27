package PartandQuantity;
import java.util.*;

public class PartAndQuantityEntry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataException dataException0 = new DataException(0);
        DataException dataException1 = new DataException(1);
        DataException dataException2 = new DataException(2);
        DataException dataException3 = new DataException(3);
        DataException dataException4 = new DataException(4);
        DataException dataException5 = new DataException(5);
        String partNumber;
        String quantityOrdered;
        System.out.println("Enter Part Number");
        partNumber = scanner.next();
        System.out.println("Enter Quantity Ordered");
        quantityOrdered = scanner.next();
        try{
            int partNum = Integer.parseInt(partNumber);
            if(partNum<0){System.out.println(dataException1.message);}
            if(partNum>999){System.out.println(dataException2.message);}
            else{System.out.println("Part number is valid");};

        }catch(NumberFormatException ne){
            System.out.println(dataException0.message);
        }
        try{
            int quantityOrder = Integer.parseInt(quantityOrdered);
            if(quantityOrder<1){System.out.println(dataException4.message);}
            if(quantityOrder>5000){System.out.println(dataException5.message);}
            else{System.out.println("Part number is valid");};

        }catch(NumberFormatException ne){
            System.out.println(dataException3.message);
        }
    }
}
