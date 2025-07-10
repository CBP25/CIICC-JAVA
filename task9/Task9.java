package task9;

import static java.lang.Math.addExact;
import static java.lang.Math.subtractExact;
import java.util.Scanner;
import static java.lang.Math.multiplyExact;
import static java.lang.Math.floorDiv;
public class Task9 {

    static int add(int a, int b) {
        return addExact(a, b);
    }

    static int subtract(int a, int b) {
        return Math.abs(subtractExact(a, b));
    }

    static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }
    static int divide(int a, int b) {
        return floorDiv(a, b);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x , y;

        System.out.println("Enter first Number: ");
        x = s.nextInt();
        System.out.println("Enter Second Number: ");
        y = s.nextInt();
        System.out.println("Addition: " + add(x, y)); 
        System.out.println("Subtraction: " + subtract(x, y)); 
        System.out.println("Multiplication: " + multiply(x, y)); 
        System.out.println("Division: " + divide(x, y));   
        
        s.close();
            }
}
