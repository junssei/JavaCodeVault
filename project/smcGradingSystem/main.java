import java.util.Scanner;

public class main {
    public static void main(String args[]){
        String gradeTitle[] = {"Prelim", "Midterm", "Semifinal", "your Final"};
        double grade[] = new double[4];
        double fgrade[] = new double[4];
        Scanner s = new Scanner(System.in);
        
        System.out.println(" Welcome to St. Michaels College");
        for(int i = 0; i < grade.length; i++){
            System.out.print(" Enter " + gradeTitle[i] + " equivalent grade: ");
            grade[i] = s.nextDouble();
        }

        for(int i = 0; i < grade.length; i++){
            
        }

    }
}
