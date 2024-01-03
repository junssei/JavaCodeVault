package project.dataAnalyzer;
import java.util.Scanner;

public class salesDataAnalyzer{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int person[] = new int[10];

		System.out.println("Welcome to the Sales Data Analyzer");
		System.out.println("\nEnter the sales figures for 10 salespeople: ");

		for(int i = 0; i < person.length; i++){
			System.out.print("Salesperson "+ (i+1) + ": $");
			person[i] = s.nextInt();
		}

		System.out.println("\n................................");
		int total = 0, highest = person[0], lowest = person[0];

		for(int i = 0; i < person.length; i++){
			total += person[i];

			if(person[i] > highest){
				highest = person[i];
			}
			if(person[i] < lowest){
				lowest = person[i];
			}
		}

		System.out.println("\nTotal Sales: $" + total);
		System.out.println("Highest Sales: $" + highest);
		System.out.println("Lowest Sales: $" + lowest);

		System.out.println("\nSales who exceeded $10,000 in sales: ");
		for(int i = 0; i < person.length; i++){
			if(person[i] >= 10000){
				System.out.println("Salesperson: " + (i+1));
			}
		}

		int average = total/person.length;
		System.out.println("\nAverage Sales per Salesperson: $" + average);
		if(average >= 10000)
		System.out.println("\nOverall Sales Performance: The sales team performed well.");
		else
		System.out.println("\nOverall Sales Performance: Some salespeople need to improve their performance.");

		System.out.println("\n................................");
		System.out.println("Thank you for using the Sales Data Analyzer!");
	}
}