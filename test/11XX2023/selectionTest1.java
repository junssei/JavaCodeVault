import java.util.Scanner;

public class selectionTest1{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);

		int numMonth;
		String season,
		month[] = {
		"January", "February", "March", "April", "May",
		"June", "July", "August", "September", "October",
		"November", "December"
		};

		System.out.println("Welcome to the Season Calendar!");
		System.out.print("Choose a month (1-12): ");
		numMonth = s.nextInt();

		if(numMonth == 12 || numMonth == 1 || numMonth == 2)
			season = "Winter";
		else if(numMonth == 3 || numMonth == 4 || numMonth == 5)
			season = "Spring";
		else if(numMonth == 6 || numMonth == 7 || numMonth == 8)
			season = "Summer";
		else if(numMonth == 9 || numMonth == 10 || numMonth == 11)
			season = "Autumn";
		else
			season = "Bogus Month";
		
		System.out.println(month[numMonth-1] + " is in the " + season + ".");

	}
}