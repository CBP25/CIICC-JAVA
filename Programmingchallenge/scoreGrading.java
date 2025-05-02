import java.util.Scanner;

class scoreGrading {
   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your Grade: ");
        double g = s.nextDouble();
        System.out.println((g>=90.00)?"Grade A":(g>=80.00)?"Grade B":(g>=70.00)?"Grade C":(g>=60.00)?"Grade D":(g<60.00)?"Grade F":"Invalid Input");
       
    }
}