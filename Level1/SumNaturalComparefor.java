import java.util.Scanner;

public class SumNaturalComparefor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("The number " + n + " is not a natural number");
            return;
        }

        int sumFor = 0;
        for (int i = 1; i <= n; i++) {
            sumFor += i;
        }

        int sumFormula = n * (n + 1) / 2;
        boolean correct = (sumFor == sumFormula);

        System.out.println("Sum using for loop: " + sumFor);
        System.out.println("Sum using formula: " + sumFormula);
        System.out.println("Both results are equal? " + correct);
        scanner.close();
    }
}
