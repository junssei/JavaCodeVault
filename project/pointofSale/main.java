import java.util.Scanner;

class PointOfSale{
	int countr = 0; //to count the items added to cart
	int[][]cart = new int[50][2]; //[itemNum][quantity]
	Scanner s = new Scanner(System.in);
	double[] price = {5.99, 2.49, 8.99, 1.49, 9.99};
	String[] items = {"Burger", "Fries", "Pizza", "Water", "Coke"};
	
	void viewItems(){ //display all items using for loop
		System.out.println("===== Available Items =====");
		for(int i = 0; i < price.length; i++){
			System.out.println((i+1) + ". " + items[i] + " - $" + price[i]);
		}
		System.out.println("===========================");
	}

	void addtoCart(){ //prompt and input to add to cart items
		System.out.print("Enter the Item Number you want to add to the cart: ");
		int num = s.nextInt();
		cart[countr][0] = num-1;
		System.out.print("Enter the quantity: ");
		cart[countr][1] = s.nextInt();
		System.out.println("Added " + cart[countr][1] + "x " + items[num-1] + "(s) to your cart");
		countr++;
	}

	void vewtoCart(){ //cart displayed
		System.out.println("===== Shopping Cart =====");
		if(countr == 0){
			System.out.println("You have not ordered yet!");
		} else {
			for(int i = 0; i < countr; i++){
				if(cart[i][0] == 0)
					System.out.println((i+1) + ". " + items[0] + " - " + cart[i][1] + "x");
				else if(cart[i][0] == 1)
					System.out.println((i+1) + ". " + items[1] + " - " + cart[i][1] + "x");
				else if(cart[i][0] == 2)
					System.out.println((i+1) + ". " + items[2] + " - " + cart[i][1] + "x");
				else if(cart[i][0] == 3)
					System.out.println((i+1) + ". " + items[3] + " - " + cart[i][1] + "x");
				else if(cart[i][0] == 4)
					System.out.println((i+1) + ". " + items[4] + " - " + cart[i][1] + "x");
			}
		}
		System.out.println("=========================");
	}

	double checkOut(){ //same with the vewtoCart() w/ calculation
		double total = 0, subtotal = 0;
			for(int i = 0; i < countr; i++){
				if(cart[i][0] == 0){
					subtotal = cart[i][1]*price[0];
					total += subtotal;
					System.out.println(items[0] + ": " + cart[i][1] + "x $" + price[0] + " = $" + subtotal);
				}else if(cart[i][0] == 1){
					subtotal = cart[i][1]*price[1];
					total += subtotal;
					System.out.println(items[1] + ": " + cart[i][1] + "x $" + price[1] + " = $" + subtotal);
				}else if(cart[i][0] == 2){
					subtotal = cart[i][1]*price[2];
					total += subtotal;
					System.out.println(items[2] + ": " + cart[i][1] + "x $" + price[2] + " = $" + subtotal);
				}else if(cart[i][0] == 3){
					subtotal = cart[i][1]*price[3];
					total += subtotal;
					System.out.println(items[3] + ": " + cart[i][1] + "x $" + price[3] + " = $" + subtotal);
				}else if(cart[i][0] == 4){
					subtotal = cart[i][1]*price[4];
					total += subtotal;
					System.out.println(items[4] + ": " + cart[i][1] + "x $" + price[4] + " = $" + subtotal);
				}	
			}
			return total; //return total
		}
		
}

public class main{
	public static void main(String args[]){
		int option = 0;
		Scanner s = new Scanner(System.in);
		PointOfSale pos = new PointOfSale();

		System.out.println("===== Welcome to the Simple POS System");
		System.out.println("1. Display Available Items\n2. Add Items to Cart\n3. View Cart\n4. Checkout\n5. Exit");

		while(option!=5){
			System.out.print("Enter your choice (1-5): ");
			option = s.nextInt();

			switch(option){
				case 1:{
					pos.viewItems(); //display items
					break;	
				}
				case 2:{
					pos.addtoCart(); //prompt to add to cart
					break;
				}
				case 3:{
					pos.vewtoCart(); //display the cart
					break;
				}
				case 4:{
					System.out.println("===== Receipt =====");
					if(pos.countr == 0){
						System.out.println("You have not ordered yet!");
					} else {
						System.out.println("Total: $" + pos.checkOut());
						System.out.println("===================");
						option = 5;
					}
				}
			}
		}
		System.out.println("Thank you for shopping with us!");
	}
}