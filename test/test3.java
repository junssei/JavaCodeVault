import java.util.Scanner;

public class test3{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		char reset;
		
		do{
			float result = 0;
			System.out.print("Enter first number: ");
			float num1 = s.nextFloat();
			System.out.print("Operator (+ - * /) : ");
			char opt = s.next().charAt(0);
			System.out.print("Enter second number: ");
			float num2 = s.nextFloat();

			if(opt == '+'){
				result = num1 + num2;
			} else if (opt == '-'){
				result = num1 - num2;
			} else if (opt == '*'){
				result = num1 * num2;
			} else if (opt == '/'){
				result = num1 / num2;
			}

			System.out.println(num1 + " " + opt + " " + num2 + " = " + result);

			System.out.print("Do you want to enter again? (Y/N) : ");
			reset = s.next().charAt(0);
		}while(reset == 'Y' || reset == 'y');
	}
}