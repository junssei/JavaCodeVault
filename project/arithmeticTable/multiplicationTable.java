import java.util.Scanner;

public class multiplicationTable{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String reset;

        System.out.println("Welcome to Multiplication Table Input!");
        System.out.println("======================================");

        do{
            System.out.print("Enter number: ");
            int num = s.nextInt();
        System.out.println("======================================");
            if(num != 0){
                System.out.println("\nTABLE");
        System.out.println("======================================");        
                for(int i = 1; i <= num; i++){
                    for(int j = 1; j <= num; j++){
                        if(i*j <= 9)
                        System.out.print(i * j + "   ");
                        else
                        System.out.print(i * j + "  ");
                    }
                    System.out.println();
                }
            }
            s.nextLine();
        System.out.println("======================================");
            System.out.print("Do you want to reset? Yes/No : ");
            reset = s.nextLine();
        }while(reset.equalsIgnoreCase("yes"));
        
    }
}