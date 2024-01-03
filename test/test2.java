import java.util.Scanner;

public class test2{ //User Input Grade
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		char c;
		do{
			System.out.print("Enter Name: ");
        	String name = s.nextLine();
        	s.nextLine();
        	System.out.print("Enter Score: ");
        	int num = s.nextInt();
        
        	if(num < 60 && num > 0){
            	System.out.println("Grade: F");
        	} else if (num < 70 && num >= 60){
            	System.out.println("Grade: D");
        	} else if (num < 80 && num >= 70){
            	System.out.println("Grade: C");
        	} else if (num < 90 && num >= 80){
            	System.out.println("Grade: B");
        	} else if (num < 100 && num >= 90){
            	System.out.println("Grade: A");
        	} else {
            	System.out.println("Invalid");
        	}

			System.out.print("Do you want to reset? ");
			c = s.next().charAt(0);
		}while(c == 'Y' || c == 'y');
	}
}