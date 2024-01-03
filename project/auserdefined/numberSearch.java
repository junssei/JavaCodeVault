import java.util.Scanner;

public class numberSearch{
  public static void main(String args[]){
  	Scanner scanner = new Scanner(System.in);

  	int arr[] = new int[100], counter = 0;
  	int reset = 0, search = 0;
  	

  	System.out.println("Welcome to the User-Defined Number Search!");
  	System.out.print("Please enter a series of numbers (enter '0' to stop) \n" );

		for(int i = 0; i < arr.length; i++){
			System.out.print("Enter a number: ");
			arr[i]=scanner.nextInt();
			if(arr[i] == 0){
				break;
			}
			counter++;
		}
		
		System.out.print("List of Numbers: ");
		for(int j = 0; j<counter; j++ )
			System.out.print(arr[j] + " ");
		

	do{
		boolean check = false;
		System.out.print("\n\nEnter a number to search for: " );
		search = scanner.nextInt();
		for(int j = 0; j < counter; j++ ){
			if(search == arr[j]){
				System.out.println("Number " + search +  " was found at index " + j + ". ");
				check = true;
			}
		}

		if(check == false){
		System.out.println("Number " + search + " was not found in the list.");
		}

	System.out.print("Do you want to search for another number? (1 - yes / 0 - no) ");
	reset=scanner.nextInt();
	}while(reset != 0);
	}
 }
