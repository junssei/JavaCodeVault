import java.util.Scanner;

public class Main3{
	public static void main(String args []){
		Scanner ashira = new Scanner(System.in);

		String item, discode, checkout;
		double cost, sum = 0, discount, total = 0;
		char choice;

		System.out.println("Welcome to the shopping cart simulator!");

		while(true){
			System.out.print("Enter the name of an item (or 'checkout' to finish shopping): ");
			item = ashira.nextLine();

			if(item.equalsIgnoreCase("checkout"))
				break;

			System.out.print("Enter the cost of " + item + ": $");
			cost = ashira.nextDouble();
			System.out.println();
			ashira.nextLine();

			sum += cost;
		}

			discount = sum * 0.1;
			total = sum - discount;
			System.out.print("\nYour shopping cart contain items with a total cost of: $" + sum + "\n");
			System.out.print("\n\nDo you have a discounted code? (Y/y): ");
			choice = ashira.next().charAt(0);

			if(choice == 'Y' || choice == 'y'){
				System.out.print("Enter your discount code: ");
				discode = ashira.nextLine();
				ashira.nextLine();
				System.out.print("Discount Applied! Your total cost after discount: $" + total);
			}else{
				System.out.print("\nThank you for shopping with us!");
			}
		}
	}