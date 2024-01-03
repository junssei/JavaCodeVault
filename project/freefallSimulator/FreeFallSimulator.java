package project;

//introducing classes
//instance-variables
//methods

import java.util.Scanner;

class simulator{
    double initialPosition = 1.0, initialVelocity, constAcceleration;
    double equPosition, equVelocity;

    void simulateMotion(){
        for(double t = 0; t <= 10; t++){
            equPosition = initialPosition + (initialVelocity * t) + (0.5 * constAcceleration) * (t * t);
            equVelocity = initialVelocity + (constAcceleration * t);
            System.out.println("Time: " + t + " seconds, Position: " + equPosition + " meters, Velocity: " + equVelocity + " m/s");
        }
    }
}

public class FreeFallSimulator{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        simulator ffs = new simulator();
        String reset = "yes";

        System.out.println("Welcome to the Free Fall Simulator!\n");
        
        while(reset.equalsIgnoreCase("yes")){
        System.out.println("==================================================================================================");
        System.out.print("Enter the initial position (height) in meters: ");
        ffs.initialPosition = s.nextDouble();
        System.out.print("Enter the initial velocity in m/s: ");
        ffs.initialVelocity = s.nextDouble();
        System.out.print("Enter the constant acceleration (e.g., 9.81 m/s^2: ): ");
        ffs.constAcceleration = s.nextDouble();

        System.out.println("==================================================================================================");
        ffs.simulateMotion();
        System.out.println("==================================================================================================");
        System.out.print("Do you want to do it again? Yes/No: ");
        s.nextLine(); reset = s.nextLine();
        }
    }
}