

import java.util.Scanner;

public class numberSearchOne{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int list[] = new int[100], counter = 0, num = 1, reset = 1;
		boolean check = true; 

		System.out.println("Welcome to the User-Defined Number Search!");

		System.out.print("\nPlease enter a series of numbers (enter '0' to stop)\n");
		/*while(check){
			if(num != 0){
				System.out.print("Enter a number: ");
				num = scanner.nextInt();
				list[counter] = num;
				counter++;
			} else {
				counter--;
				check = false;
			}
		}*/

		while(num != 0){
			System.out.print("Enter a number: ");
			num = scanner.nextInt();
			list[counter] = num;
			counter++;
		}

		System.out.print("List of numbers: [ ");
		for(int i = 0; i < counter-1; i++)
			System.out.print(list[i] + " ");
		System.out.print("]");

		do{
			System.out.print("\n\nEnter a number to search for: " );
			int search = scanner.nextInt();
			check = false;

			for(int x = 0; x < counter; x++){
				if(list[x] == search){
					System.out.println("Number " + search +  " was found at index " + x + ". ");
					check = true;
				}
			}

				if(check == false){
					System.out.println("Number " + search + " was not found in the list.");
				}

			System.out.print("Do you want to search for another number? (1 - Yes || 0 - No): ");
			reset = scanner.nextInt();
		}while(reset != 0);

			System.out.println("Thank you for using User-Defined Number Search!");
	}
}