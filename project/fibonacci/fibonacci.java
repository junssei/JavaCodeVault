import java.util.Scanner;

public class fibonacci{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int integer = 1;
        
        System.out.println("Welcome to the Fibonacci : Number Input Guess Fibonacci Number");

        while(integer != 0){
            int neew = 0, old = 0, total = 0;

            System.out.print("\nEnter integer: ");
            integer = s.nextInt();

            for(int i = 0; i < integer; i++){
                if(i == 0){
                    neew = 1;
                } else {
                    total = neew + old;
                    neew = old;
                    old = total;
                }
                //System.out.print(total + " ");
            }

            if(integer!=0)
            System.out.println("Fibonacci No. : " + total);
        }

            System.out.println("Thank you for using it!");
    }
}