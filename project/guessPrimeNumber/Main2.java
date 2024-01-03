import java.util.Scanner;

public class Main2{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		char reset; 
		System.out.println("Welcome to the Guess the Prime Number!");
		do{
		int counter = 0;
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();


		for(int i = 0; i <= num; i++){
			for(int j = 0; j <= num; j++){
				if(i * j == num){
					counter++;
				}
			}
		}

		if(counter > 2){
			System.out.println("The number " + num + " is not prime number!");
		} else {
			System.out.println("The number " + num + " is prime number!");
		}

		System.out.print("Do you want to redo? [Y/N]: ");
		reset = scanner.next().charAt(0);
		}while(reset == 'Y' || reset == 'y');
	}
}