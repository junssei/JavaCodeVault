//for each : iteration statement
import java.util.Scanner;

public class iterationTest1 {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int arr[] = new int[5];
		//int arr[] = {1, 2, 3, 4, 5};

		for(int x = 0; x < arr.length; x++){
			System.out.print("Enter num #" + (x+1) + " : ");
			arr[x] = s.nextInt();
		}

		System.out.println("Entered List: ");
		for(int x : arr)
			System.out.print(x + ", ");

	}
}