import java.util.Scanner;

class PropertyRental{
	int month;
	double total;

	void promptMnthlyAmount(){ //method to prompt for monthly ammount 
		System.out.print("Enter the monthly rent amount: ");
	}

	void promptNumbrOfMonth(){ //method to prompt for month period
		System.out.print("Enter the number of months for the rental period: ");
	}

	double total(double amount, int period){ //method to calculate amount and period
		total = amount * period;
		month = period;
		return total;
	}

	void display(){ //method to display the total cost
		System.out.println("The total cost of renting for " + month + " months is $" + total);
	}
}

public class main{
	public static void main(String args[]){
		double amount;
		Scanner s = new Scanner(System.in);
		PropertyRental pr = new PropertyRental();

		pr.promptMnthlyAmount();
		amount = s.nextDouble();
		pr.promptNumbrOfMonth();
		int month = s.nextInt();
		pr.total(amount, month);
		pr.display();
	}
}