package project;
/*
	-Takes the passenger's age as input.
	-Takes the type of ticket (e.g., standard, first class) as input.
	-Determines the ticket price based on the following criteria:
	-Children (age 0-12): 50% off the standard price.
	-Adults (age 13-59): Standard price.
	-Seniors (age 60 and above): 20% off the standard price.
	-First-class upgrade: Additional 50% of the calculated price.
*/

import java.util.Scanner;

public class passengerTicket{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);

		int totalPassenger;
		float standardTicketPrice = 0;

		System.out.print("Enter the total number of passengers: ");
		totalPassenger = s.nextInt();
		System.out.print("Enter the standard ticket price: ");
		standardTicketPrice = s.nextFloat();

		int age = 0, ticketType = 0;
		double discount = 0, calculatedPrice = 0;

		for(int i=1; i<=totalPassenger; i++){
			System.out.println("Passenger "+i);
			System.out.print("Age: ");
			age = s.nextInt();
			System.out.print("Ticket Type [1] Standard [2] First Class : ");
			ticketType = s.nextInt();
			
			if(age >= 0 && age <= 12)
				discount = standardTicketPrice * 0.5;
			else if(age >= 13 && age <= 59)
				discount = standardTicketPrice;
			else if(age >= 60)
				discount = standardTicketPrice * 0.8;

			if(ticketType == 1){
				calculatedPrice = discount;
			} else if (ticketType == 2){
				calculatedPrice = discount + (discount * 0.5);
			}

			System.out.println("Calculated Price: "+ calculatedPrice);
			System.out.println();
		}
	}
}