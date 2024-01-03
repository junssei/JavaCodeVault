import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);

		String item, yesno, code;
		double  price = 0, total = 0, sum = 0, discount = 0, cost = 0;

		while(true){
			System.out.print("Enter the name of an item (or 'checkout' to finish shopping):");
			item=scanner.nextLine();

			if(item.equalsIgnoreCase("checkout"))
				break;
				

				System.out.print("Enter the cost of  " + item + ": " + "$");
				cost=scanner.nextDouble();
				scanner.nextLine();
				sum += cost;
			}
			discount=sum * 0.1;
			total= sum-discount;

			System.out.print("Your shopping cart contains items with a total cost of $" + sum + "\n");
			System.out.print("Do you have a discount code? (yes/no): ");
			yesno=scanner.nextLine();
			
				if(yesno.equalsIgnoreCase("yes")){
					System.out.print("Enter your discount code: ");
					code=scanner.nextLine();
					if(code.equalsIgnoreCase("DISCOUNT123")){
						System.out.print("Discount applied! Your total cost after discount: " + total );
					}else{
						System.out.print("Discount Code is not available.");
					}
				}else if(yesno.equalsIgnoreCase("no")){
						System.out.print("Your total cost  $" + sum + "\n");
					}
			System.out.print("\n_________________________________\n");
			System.out.print("Thank you for shopping with us!");
	
	}
}
