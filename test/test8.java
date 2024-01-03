//Bus Ticket/Reservation

import java.util.Scanner;

public class test8{
	public static void main(String args[]){
		//3d array
		//16 seats each 5 Bus 
		//Option 1: Choose Bus then view what is vacant seats
		//Option 2: Select seats available

		Scanner s = new Scanner(System.in);
		//int threeD[][][] = new int[5][8][2];
		int threeD[][][] = new int[5][2][8];
		String buses[] = {"Cagayan", "Kauswagan", "Mukas", "Kapatagan", "Pagadian"};

		System.out.println("Welcome to the Iligan Bus Reservation System!\n");

		/*for(int a = 0; a < 5; a++){
			System.out.print("Bus: " + busdestination[a] + "\n");
			for(int i = 0; i < 8; i++){
				for(int j = 0; j < 2; j++){
					System.out.print(threeD[a][i][j] + "\t");
				}
				System.out.println("");
			}
			System.out.println("\n");
		}*/

		//System.out.println("Buses: \tCagayan \tKauswagan \tMukas  \tKapatagan \tPagadian");
		
		for(int a = 0; a < 5; a++){
			System.out.print("Bus: " + buses[a] + "\n");
			for(int i = 0; i < 2; i++){
				for(int j = 0; j < 8; j++){
					System.out.print(threeD[a][i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

			int option;
		do{
			System.out.println();
			System.out.println("Menu: ");
			System.out.println("1. View/Select Bus\n2. Choose a Seat\n3. Exit");
			System.out.print("\nPlease enter your choice: "); option = s.nextInt();

			switch(option){
				case 1: {
					/*
					int bus;
					System.out.println("Which bus you want to view? (1-5)");
					bus = s.nextInt();

					if(bus > 5){
						System.out.println("The bus didn't exist");
					} else {
						System.out.print("Bus: " + buses[bus-1] + "\n");
						for(int i = 0; i < 2; i++){
							for(int j = 0; j < 8; j++){
								System.out.print(threeD[bus-1][i][j] + " ");
							}
							System.out.println();
						}
					}*/

					for(int a = 0; a < 5; a++){
						System.out.print("Bus: " + buses[a] + "\n");
						for(int i = 0; i < 2; i++){
							for(int j = 0; j < 8; j++){
								System.out.print(threeD[a][i][j] + " ");
							}
							System.out.println();
						}
						System.out.println();
					}
					break;
				}
				case 2: {
					int destination, row, column;
					System.out.print("Where is your destination: "); destination = s.nextInt();
					System.out.println("Iligan to " + buses[destination-1]);

					System.out.print("Row: "); row = s.nextInt();
					System.out.print("Column: "); column = s.nextInt();

					if(row > 2 || column > 8){
						System.out.println("The seats didn't exist");
					} else if (threeD[destination-1][row-1][column-1] == 1){
						System.out.println("Sorry, that seat is already reserved. Please choose another seat.");
					} else {
						threeD[destination-1][row-1][column-1] = 1;
						System.out.println("Seat successfully reserved!");
					}
					break;
				}
			}
		} while(option != 3);
	}
}