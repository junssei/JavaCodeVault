import java.util.Scanner;

class fibo{
    int nacci(int a){
        int neew = 0, old = 0, total = 0;
        for(int i = 0; i < a; i++){
            if(i == 0)
                neew = 1;
            else {
                total = neew + old;
                neew = old;
                old = total;
            }
        }
        return total;
    }
}

public class fibonacci2 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        fibo fibo = new fibo();
        String r;

        do{
        System.out.println("Welcome to Fibonacci!");
        System.out.println("//Input Integer Range to guess the Fibonacci Number");

        System.out.print("Enter integer: ");
        int integer = s.nextInt();
        System.out.println("Fibonacci No. : " + fibo.nacci(integer));

        System.out.print("Do you want to input again? : ");
        s.nextLine();
        r = s.nextLine();
        }while(r.equalsIgnoreCase("yes"));
    }
}
