package Grade;
import java.util.*;

public class TestGrade {
    int[] studentID = {190901, 190902, 190903, 190904, 190905, 190906, 190907, 190908, 190909, 190910, 190911, 190912, 190913, 190914};
    String[] studentsGrade = new String[studentID.length];

    public void displayStart(){
        int i=1;
        for(int id: studentID){
            System.out.println(i + ". " + id);
            i++;
        }
    }

    public void displayEnd(){
        for(int i=0;i< studentID.length;i++){
            System.out.println((i+1) + ". " + studentID[i] + " " + studentsGrade[i]);
        }
    }

    public static void main(String[] args) {
        TestGrade testGrade = new TestGrade();
        Scanner scan = new Scanner(System.in);
        testGrade.displayStart();
        for(int i=0;i<testGrade.studentID.length;i++){
            try{
                System.out.print("Enter the grade: ");
                String grade = scan.next();
                throw new GradeException("", grade, i, testGrade.studentsGrade);
            } catch (GradeException e) {
                System.out.println(e);
            }
        }
        testGrade.displayEnd();
    }
}
