import java.util.Scanner;

public class Ohara{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int j;
        char mae;
 do{
        System.out.print("Enter the number of salespeople: ");
        int numSalespeople = scanner.nextInt();

        float[] salesData = new float[numSalespeople];

        for (int i = 0; i < numSalespeople; i++) {
            System.out.print("Enter sales for salesperson " + (i + 1) + ": $");
            salesData[i] = scanner.nextFloat();
        }

        float totalSales = 0;
        float highestSale = Float.MIN_VALUE;
        float lowestSale = Float.MAX_VALUE;

        for (float sale : salesData) {
            totalSales += sale;

            if (sale > highestSale) {
                highestSale = sale;
            }

            if (sale < lowestSale) {
                lowestSale = sale;
            }
        }
        float averageSales = totalSales / numSalespeople;

        System.out.println("\n-----------------------------------------------:");
        System.out.println("\nSales Analysis:");
        System.out.println("Total Sales: " + totalSales);
        System.out.println("Highest Sale: " + highestSale);
        System.out.println("Lowest Sale: " + lowestSale);

        System.out.println("\n-----------------------------------------------:");

        if (averageSales >= 10000){
                System.out.println("The sales team performed well" );
         }else{
                System.out.println("Some salespeople need to improve their performance " );
        }
        System.out.println("Overall Sales Performance: The sales team performed well. :");

        System.out.println("\n-----------------------------------------------:");

        System.out.println("Thank you for using the Sales Data Analyzer. :");

        System.out.println("Do you want to redo? ");
        mae = scanner.next().charAt(0);
    }while(mae == 'y' || mae == 'Y' );
        
        }
 }