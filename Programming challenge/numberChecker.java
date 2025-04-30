import java.util.Scanner;

class numberChecker{
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = s.nextInt();
        if (num <=0){
            System.out.println(
                "a negative number"
            );
            if (num % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
        else if (num == 0){
            System.out.println(
                num
            );
        } else {
            System.out.println(
                "a positive number"
            );
            if (num % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }

        s.close();
    }
}