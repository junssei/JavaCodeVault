import java.util.Scanner;

class attendanceTracker{
    float calculateAttendancePercentages(float a, float days){ //methods with two parameters
        return a / days * 100;
        //calculation, a is the value of present, late, absent
        //divided by inputted days multiply by 100
    }
}

public class employeeAttendanceTracker{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        attendanceTracker eat = new attendanceTracker();

        System.out.println("Employee Attendance Tracker");
        System.out.print("Enter the number of days in the month: ");
        int numD = s.nextInt();

        int array[] = new int[numD];
        float present = 0, absent = 0, late = 0; //counter to count how many present, late, absent in the month

        System.out.println();
        for(int i = 0; i < numD; i++){
            System.out.print("Enter attendance for day " + (i+1) + " (1 for present, 0 for absent, 2 for late): ");
            array[i] = s.nextInt();
        }

        System.out.println("\nEmployee Attendance for the Month:");
        for(int j = 0; j < numD; j++){
            if(array[j] == 2){
                System.out.print("late");
                late++; //increment if 2
            }else if(array[j] == 1){
                System.out.print("present");
                present++; //increment if 1
            }else{ 
                System.out.print("absent");
                absent++; //increment if else 0 or any
            }
            System.out.print(" ");
        }

        System.out.println("\n\nAttendance Percentages: ");
        System.out.println("Late (" + late + "): " + eat.calculateAttendancePercentages(late, numD) + "%"); //call the function with late parameters
        System.out.println("Present (" + present + "): " + eat.calculateAttendancePercentages(present, numD) + "%"); //call the function with present parameters
        System.out.println("Absent (" + absent + "): " + eat.calculateAttendancePercentages(absent, numD) + "%"); //call the function with absent parameters
    }
}