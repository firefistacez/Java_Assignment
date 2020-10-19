package Order;
import Grade.GradeException;

import javax.xml.crypto.Data;
import java.util.*;

public class PartAndQuantityEntry {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean end = false;
        while(!end){
            try {
                System.out.print("Enter the part number: ");
                String partNumber = scan.next();
                System.out.print("Enter the quantity ordered: ");
                String quantityOrdered = scan.next();
                throw new DataException("", partNumber, quantityOrdered);
            }catch (DataException e) {
                System.out.println(e);
            }
            System.out.print("Enter true to end: ");
            end = scan.nextBoolean();
        }
    }
}
