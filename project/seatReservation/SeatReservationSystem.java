//package project;
//2D Array
//Plane Seat Reservation System

import java.util.Scanner;

public class SeatReservationSystem{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int seats[][] = new int[5][3];

		System.out.println("Welcome to the Plane Seat Reservation System!\n");

		System.out.println("Plane Seating Arrangement:");
		System.out.println("--------------------------");
		System.out.println("\t1\t2\t3");
		for(int i = 0; i < 5; i++){
			System.out.print((i+1) + "\t");
			for(int j = 0; j < 3; j++){
				System.out.print(seats[i][j] + "\t");
			}
			System.out.println();
		}

		int option;
		do{
			System.out.println("\nMenu: ");
			System.out.println("1. View Seating Arrangement\n2. Reserve a Seat\n3. Exit");
			System.out.print("\nPlease enter your choice: "); option = s.nextInt();

			switch(option){
				case 1: {
					System.out.println("Plane Seating Arrangement:");
					System.out.println("--------------------------");
					System.out.println("\t1\t2\t3");
					for(int i = 0; i < 5; i++){
						System.out.print((i+1) + "\t");
						for(int j = 0; j < 3; j++){
							System.out.print(seats[i][j] + "\t");
						}
						System.out.println();
					}
					break;
				}
				case 2: {
					int row, column;
					System.out.println("Enter the row and column number to reserve a seat:");
					System.out.print("Row: "); row = s.nextInt();
					System.out.print("Column: "); column = s.nextInt();

					if(row > 5 || column > 3){
						System.out.println("The seats didn't exist");
					} else if (seats[row-1][column-1] == 1){
						System.out.println("Sorry, that seat is already reserved. Please choose another seat.");
					} else {
						seats[row-1][column-1] = 1;
						System.out.println("Seat successfully reserved!");
					}
					break;
				}
			}
		}while(option != 3);

	}
}