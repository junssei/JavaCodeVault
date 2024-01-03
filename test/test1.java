import java.util.Scanner;

public class test1{
	public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Score: ");
        int num = scanner.nextInt();
        
        if(num < 60 && num > 0){
            System.out.print("Grade: F");
        } else if (num < 70 && num >= 60){
            System.out.print("Grade: D");
        } else if (num < 80 && num >= 70){
            System.out.print("Grade: C");
        } else if (num < 90 && num >= 80){
            System.out.print("Grade: B");
        } else if (num < 100 && num >= 90){
            System.out.print("Grade: A");
        } else {
            System.out.print("Invalid");
        }
	}
}