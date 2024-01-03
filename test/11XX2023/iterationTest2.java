import java.util.Scanner;

public class iterationTest2{
	public static void main(String args[]){
		boolean done = false;

		System.out.println("\nTest 1: ");
		for (int i = 1; !done; i++){
			System.out.println(i);
			if(i == 5){
			    done = true;
			}
		}

		System.out.println("\nTest 2: ");
		boolean done1 = false;
		int j = 0;
		for(;!done1;){
			System.out.println(j);
			if(j == 10)
				done1 = true;
			j++;
		}
		
	}
}