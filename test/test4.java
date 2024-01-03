import java.util.Scanner;

public class test4{
	public static void main(String[] args){
		//Find The Highest Number
		//Without using array

		Scanner s = new Scanner(System.in);

		int num = 0, high = 0;

		for(int i=1; i<=3; i++){
			System.out.print("Enter number: ");
			num = s.nextInt();

			//Find High Number
			if(num > high){
				high = num;
			}
		}
		
		System.out.println("Highest Number: " + high);

	}
}