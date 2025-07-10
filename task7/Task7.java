package task7;

import java.util.Scanner;

public class Task7 {
    static int addition (int num1, int num2){
        return num1 + num2;
    }
    static int subtraction (int num1, int num2){
        return Math.abs(num1 - num2);
    }
    static int multiply (int num1, int num2){
        return  num1 * num2;
    }
    static int divide (int num1, int num2){
        return  num1 / num2;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a First Number: ");
        int _1stnumber = s.nextInt();
        System.out.println("Enter a Second Number: ");
        int _2ndnumber = s.nextInt();

        System.out.println("Sum of 2 numbers is: "+ addition(_1stnumber,_2ndnumber));
        System.out.println("Difference of 2 numbers is: "+ subtraction(_1stnumber,_2ndnumber));
        System.out.println("Product of 2 numbers is: "+ multiply(_1stnumber,_2ndnumber));
        System.out.println("Quotient of 2 numbers is: "+ divide(_1stnumber,_2ndnumber));
        s.close();
    }
}