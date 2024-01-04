import java.util.Scanner;

public class main {
    public static void main(String args[]){
        String gradeTitle[] = {" Prelim", " Midterm", " Semifinal", " Final"};
        double grade[] = new double[4], fgrade[] = new double[4], result = 0.0;
        Scanner s = new Scanner(System.in);
        
        System.out.println(" >Welcome to St. Michaels College");
        for(int i = 0; i < grade.length; i++){
            System.out.print(" Enter" + gradeTitle[i] + " equivalent grade: ");
            grade[i] = s.nextDouble();
        }

        System.out.println("\n >Inputted Grades");
        for(int i = 0; i < grade.length; i++){
            System.out.println(gradeTitle[i] + ": " + grade[i]);
        }

        for(int x = 0; x < grade.length; x++){
            if(x == 0){
                fgrade[x] = grade[x];
            } else {
                double temp1 = (1.0/3)*fgrade[x-1];
                double temp2 = (2.0/3)*grade[x];
                result = temp2 + temp1;
                fgrade[x] = result;
            }
        }

        System.out.println(" >All Term Final Grades");
        for(int j = 0; j < fgrade.length; j++){
            System.out.println("" + gradeTitle[j] + ": " + fgrade[j]);
        }

    }
}
