import java.util.Scanner;

class Circle{
    double pi = 3.14;

    /*Only Constructors
        Circle(double r){
            System.out.println("Circle Properties");
            System.out.println("Radius: " + r);
            System.out.println("Area: " + (pi*r*r));
            System.out.println("Circumference: " + (2*pi*r));
        }
    */

    Circle(double r){ //radius
        System.out.println("Circle Properties");
        System.out.println("Radius: " + r);
    }
    
    void area(double r){ //area
        System.out.println("Area: " + (pi*r*r));
    }
    
    void circ(double r){ //circumference
        System.out.println("Circumference: " + (2*pi*r));
    }
}

public class main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        Circle cir = new Circle(radius);
        cir.area(radius);
        cir.circ(radius);
    }
}