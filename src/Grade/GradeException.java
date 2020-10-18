package Grade;

public class GradeException extends Exception{
    String message;
    String grade;
    String[] input = new String[14];
    int index;
    public static String[] gradesChar = {"A", "B", "C", "D", "F", "I"};
    public GradeException(String message, String grade, int index, String[] input){
        this.message = message;
        this.grade = grade;
        this.index= index;
        this.input =input;
    }

    public String toString(){
        for(String grades: gradesChar){
            if(grades.equals(grade)){
                input[index] = grade;
                return("No Exception occurred: Valid input" );
            }
        }
        input[index] = "I";
        return("Exception occurred: Invalid input");
    }
}
