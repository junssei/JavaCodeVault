//Batch 2 #4
//

import java.util.Scanner;

public class activitySeven{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		float arr[] = new float[5];

		System.out.println("Welcome to Boom Shaka Laka\n");

		for(int i = 0; i < 5; i++){
			System.out.print("Enter Person #" + (i+1) + ": ");
			arr[i] = s.nextFloat();
		}

		float average = 0, sum = 0, max = arr[0], min = arr[0];

		for(int i = 0; i < 5; i++){
			sum = sum + arr[i];
			average = sum / 5;
			if(arr[i] > max){
				max = arr[i];
			}
			if(arr[i] < min){
				min = arr[i];
			}
		}

		int option;
		do{
			System.out.println("\n1. Display All Numbers\n2. Sum\n3. Average\n4. Max\n5. Min\n6. Exit\n");
			System.out.print("\nOption: "); option = s.nextInt();

			if(option == 1){
				System.out.print("Numbers: [");
				for(int i = 0; i < 5; i++){
					System.out.print(arr[i] + ", ");
				}
				System.out.print("]\n");
			} else if(option == 2){
				System.out.println("Sum: " + sum);
			} else if(option == 3){
				System.out.println("Average: " + average);
			} else if(option == 4){
				System.out.println("Max: " + max);
			} else if(option == 5){
				System.out.println("Min: " + min);
			}

		} while(option != 6);

		System.out.println("Thank you for using it!");
	}
}