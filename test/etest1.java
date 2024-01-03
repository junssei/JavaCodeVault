import java.util.Scanner;

public class etest1{
    public static void main(String args[]){
        int n = 5; int array[] = {0, 0};

        for(int i = 0; i < n; i++){
            for(int j = n; j > i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println(++array[0]);
    }
}