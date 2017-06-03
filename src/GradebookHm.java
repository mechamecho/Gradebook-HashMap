import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Engineer on 6/2/2017.
 */
public class GradebookHm {

    public static void main(String[] args){
        String newStudent;
        Double newGrade;
        Map<String, Double> students= new HashMap<>();
        Scanner in= new Scanner(System.in);

        System.out.println("Enter your students (or press ENTER to finish)");
        do{
            newStudent=in.nextLine();
            if(!newStudent.equals("")){
                System.out.println("Grade : ");
                newGrade=in.nextDouble();
                students.put(newStudent, newGrade);
                in.nextLine();

            }

        }
        while(!newStudent.equals(""));

        // print class roster
        System.out.println("Class Roster: ");
        Double sum=0.0;
        for (Map.Entry<String, Double>student :students.entrySet()){
            sum+=student.getValue();

        }
        Double avg=sum/students.size();
        System.out.println("The average of the class is: "+avg);
    }





}
