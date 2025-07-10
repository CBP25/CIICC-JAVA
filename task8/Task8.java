package task8;

public class Task8 {
    static int sumOfCumulativeSums(int... numbers) {
        int totalSum = 0;

        for (int n : numbers) {
            int cumulative = 0;

            for (int i = 1; i <= n; i++) {
                cumulative += i;
            }
            System.out.println("Cumulative sum of " + n + " = " + cumulative);
            totalSum += cumulative;
        }

        return totalSum;
    }

    public static void main(String[] args) {
        int result = sumOfCumulativeSums(4, 5, 10);
        System.out.println("Total Sum of All Cumulative Sums = " + result);
    }
}
