import java.util.Scanner;

public class test6{
	public static void main(String args[]){
		//Guessing the number
		Scanner s = new Scanner(System.in);

		int randnum = ((int)(100 * Math.random()));
		System.out.println("The number: "+randnum);

		int guess = 0, count = 1;
		System.out.println("Guess the number: ");

		while(randnum != guess){
			if(count == 1)
			System.out.print(count + "st try: ");
			else if(count == 2)
			System.out.print(count + "nd try: ");
			else if(count == 3)
			System.out.print(count + "rd try: ");
			else
			System.out.print(count + "th try: ");

			guess = s.nextInt();

			if(guess > randnum){
				System.out.println("It less than your guess");
			} else if (guess < randnum){
				System.out.println("It greater than your guess");
			} else if (guess == randnum){
				System.out.println("You got it right!");
			}

			System.out.println();
			count++;
		}

	}
}