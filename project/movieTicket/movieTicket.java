package project.movieTicket;
import java.util.Scanner;

public class movieTicket{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        //Declaration
        String movieNames[] = new String[3]; //string array
        double ticketPrice[] = new double[3]; //double array
        boolean rebook = true; //set to true - this is for while loop

        System.out.println("Welcome to the Movie Ticket Booking System");

        for(int i = 0; i < 3; i++){ //for loop - prompt to enter the title and ticket price of the movie
            System.out.print("\nEnter the title of movie " + (i+1) + ": ");
                movieNames[i] = s.nextLine();
            System.out.print("Enter the ticket price for movie " + (i+1) + ": $");
                ticketPrice[i] = s.nextDouble();
                s.nextLine();
        }

        while(rebook){ //default statement: true - if the value change the program stop
            System.out.println("\nAvailable Movies: ");
            for(int i = 0; i < 3; i++){ //for loop - display the inputted movies name and price
                System.out.println((i+1) + ". " + movieNames[i] + " ($" + ticketPrice[i] + ")");
            }

            //Prompt
            System.out.print("\nPlease enter the number of the movie you want to watch (1-3): ");
            int numMovie = s.nextInt();
            System.out.print("How many tickets do you want to purchase? ");
            int numTicket = s.nextInt();

            switch(numMovie){ //variable numMovie
                case 1: { //numMovie == 1
                    System.out.println("Movie Title: " + movieNames[numMovie-1]);
                    System.out.println("Ticket Price: $" + ticketPrice[numMovie-1] + " x " + numTicket);
                    System.out.println("Total: $" + (ticketPrice[numMovie-1] * numTicket));
                    break;
                }
                case 2: { //numMovie == 2
                    System.out.println("Movie Title: " + movieNames[numMovie-1]);
                    System.out.println("Ticket Price: $" + ticketPrice[numMovie-1] + " x " + numTicket);
                    System.out.println("Total: $" + (ticketPrice[numMovie-1] * numTicket));
                    break;
                }
                case 3: { //numMovie == 3
                    System.out.println("Movie Title: " + movieNames[numMovie-1]);
                    System.out.println("Ticket Price: $" + ticketPrice[numMovie-1] + " x " + numTicket);
                    System.out.println("Total: $" + (ticketPrice[numMovie-1] * numTicket));
                    break;
                }
            }

            s.nextLine();
            System.out.print("\nDo you want to book another ticket? Yes/No : ");
            String book = s.nextLine();
            switch(book){
                case "No": case "no":{
                    rebook = false;
                }
            }  
        }
    }
}