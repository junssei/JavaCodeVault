//using jump statements
import java.util.Scanner;

public class teachergetAverageGrade {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the number of Students: ");
        int numStudent = s.nextInt();

        float grade[] = new float[numStudent], sum = 0, threshold;
        int counter = 0;

        for(int i = 0; i < numStudent; i++){
            System.out.print("Enter the grade for Student #" + (i+1) +": ");
            grade[i] = s.nextFloat();
        }
        
        for(int i = 0; i < grade.length; i++){
            if(grade[i] > 70){
                sum+=grade[i];
                counter++;
            } else {
                continue;
            }
        }


        System.out.print("Enter the minimum passing grade threshold: ");
        threshold = s.nextFloat();

        System.out.println("Average Grade (Excluding grades below " + threshold + "): " + sum/counter);
        
    }
}
