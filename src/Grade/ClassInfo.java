package Grade;

public class ClassInfo {
    int[] studentID = {190901, 190902, 190903, 190904, 190905, 190906, 190907, 190908, 190909, 190910, 190911, 190912, 190913, 190914};
    String[] studentsGrade = new String[14];

    public void display(){
        int i=1;
        System.out.println("ID StudentID");
        for(int id: studentID){
            System.out.println(i + ". " + id);
            i++;
        }
    }
}
