import java.util.Scanner;

class Task7{
    int add(int a, int b){
        int c = a+b;
        return c;
    }
    int subtract(int a, int b){
        int c = a-b;
        return c;
    }
    int multiply(int a, int b){
        int c = a*b;
        return c;
    }
    int divide(int a, int b){
        int c = a*b;
        return c;
    }
    public static void main(String[] args) {
        Task7 calc = new Task7();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first Number");
        int a = s.nextInt();
        System.out.println("Enter Second Number4");
        int b = s.nextInt();
        s.close();
        System.out.println("Addition "+calc.add(a,b));
        System.out.println("Subtraction "+calc.subtract(a,b));
        System.out.println("Multiplication "+calc.multiply(a,b));
        System.out.println("Division "+calc.divide(a,b));
    }
}