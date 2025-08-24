import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;

        System.out.println("Enter numbers (0 or negative to stop):");
        while (true) {
            double number = scanner.nextDouble();
            if (number <= 0) break;
            total += number;
        }
        System.out.println("Total sum: " + total);
        scanner.close();
    }
}
