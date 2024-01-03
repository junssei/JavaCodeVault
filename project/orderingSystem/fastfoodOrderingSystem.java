package project.orderingSystem;
//Restaurant

import java.util.Scanner;

public class fastfoodOrderingSystem {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

		//Declaration
		int itemNum = 1, itemQty = 0;
		double subtotal = 0, tax = 0, total = 0,
		store[][] = { 	{1, 5.99, 10}, //Hamburger. 	Item Number, Price, Quantity Index: 0
					  	{2, 6.99, 8 }, //Cheeseburger.	Item Number, Price, Quantity Index: 1
						{3, 2.49, 20}, //Fries.			Item Number, Price, Quantity Index: 2
						{4, 1.99, 15}  //Soda.			Item Number, Price, Quantity Index: 3
					};

		System.out.println("Welcome to Fast Food Restaurant!");
		//Displaying Menu
		System.out.println("\nMenu: ");
		for(int i = 0; i < store.length; i++){ //for loop to display the menu
			if(store[i][0] == 1){
				System.out.println(store[i][0] + " Hamburger - $" + store[i][1] + " (Inventory: " + store[i][2] + ")");
			} else if (store[i][0] == 2){
				System.out.println(store[i][0] + " Cheeseburger - $" + store[i][1] + " (Inventory: " + store[i][2] + ")");
			} else if(store[i][0] == 3){
				System.out.println(store[i][0] + " Fries - $" + store[i][1] + " (Inventory: " + store[i][2] + ")");
			} else if(store[i][0] == 4){
				System.out.println(store[i][0] + " Soda - $" + store[i][1] + " (Inventory: " + store[i][2] + ")");
			}
		}

		while(itemNum!=0){ //it will keep looping if the variable itemNum value is not 0
		System.out.print("\nEnter the item number to order (0 to finish): ");
		itemNum = s.nextInt(); //user input to choose which item number

		if(itemNum != 0){ //if the variable itemNum value is not 0 it will prompt to enter quantity
		System.out.print("Enter the quantity: ");
		itemQty = s.nextInt(); //user input to input how many quantity
		}

		if(itemNum == 0){ //variable itemNum value is 0 it will display Order Summary
			System.out.println("\nOrder Summary: ");
        	System.out.println("Subtotal: $" + subtotal);
        	//get 8% tax on subtotal : 0.08
        	tax = subtotal * 0.08;
        	System.out.println("Tax (8%): $" + tax);
        	//sum of tax and subtotal
        	total = subtotal + tax;
        	System.out.println("Total: $" + total);
		} else if(itemNum == 1 && store[itemNum-1][2] >= itemQty){ //itemNum value is 1
			System.out.println("Hamburger x" + itemQty + " added to your order."); //display Hamburger added to order
			subtotal += store[itemNum-1][1] * itemQty; //the item price multiply to the quantity that user bought/input
			store[itemNum-1][2] -= itemQty; //item inventory subtract to the quantity that user bought/input

		} else if(itemNum == 2 && store[itemNum-1][2] >= itemQty){ //Cheeseburger
			System.out.println("Cheeseburger x" + itemQty + " added to your order.");
			subtotal += store[itemNum-1][1] * itemQty;
			store[itemNum-1][2] -= itemQty;

		} else if(itemNum == 3 && store[itemNum-1][2] >= itemQty){ //Fries
			System.out.println("Fries x" + itemQty + " added to your order.");
			subtotal += store[itemNum-1][1] * itemQty;
			store[itemNum-1][2] -= itemQty;

		} else if(itemNum == 4 && store[itemNum-1][2] >= itemQty){ //Soda
			System.out.println("Soda x" + itemQty + " added to your order.");
			subtotal += store[itemNum-1][1] * itemQty;
			store[itemNum-1][2] -= itemQty;
		} else { //default
			//all if else if condition turn false, it will display not enough stock
			System.out.println("Sorry, we don't have enough in stock for your order.");
		}

		}
    }
}
