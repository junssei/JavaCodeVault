package project;

import java.util.Scanner;

public class courseEnrollment{
    public static void main(String args[]){
        //Declaration
        Scanner s = new Scanner(System.in);
        String availableCourses[] = {"Math 101", "History 202", "English 101", "Chemistry 101", "Computer Science 201"};
        int enrolledCourses[] = new int[5], option = 1;

        System.out.println("Welcome to the Course Enrollment System!");
        System.out.println("\nAvailable Courses: ");
            for(int i = 0; i < availableCourses.length; i++)
                System.out.println((i+1)+". "+availableCourses[i]);

        do{
        System.out.print("\nEnter the number of the course you want to enroll in (or 0 to finish): ");
        option = s.nextInt();

        if(option == 0){
        System.out.println("Your Enrollment Summary: ");
            for(int i = 0; i < availableCourses.length; i++){
                if(enrolledCourses[i] == 1)
                    System.out.println("- " + availableCourses[i]);
            }
        } else if(enrolledCourses[option-1] == 0){
            System.out.println("You have enrolled in "+ availableCourses[option-1]+".");
            enrolledCourses[option-1] = 1;
        } else{
            System.out.println("You have already enrolled in this course.");
        }

        }while(option!=0);
    }
}