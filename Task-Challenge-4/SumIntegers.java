import java.util.Scanner;

public class SumIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean continueInput = true;

        while (continueInput) {
            System.out.print("Enter a positive integer: ");
            int n = scanner.nextInt();
            sum += n;

            scanner.nextLine(); // clear newline

            System.out.print("Do you want to add another integer? Y/N: ");
            String input = scanner.nextLine().trim();

            // Convert user input to boolean
            if (input.equalsIgnoreCase("y")) {
                continueInput = true;
            } else {
                continueInput = false;
            }
        }

        System.out.println("The sum of integers: " + sum);
        scanner.close();
    }
}
