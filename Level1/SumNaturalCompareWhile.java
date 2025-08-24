import java.util.Scanner;

public class SumNaturalCompareWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("The number " + n + " is not a natural number");
            return;
        }

        int sumWhile = 0;
        int i = 1;
        while (i <= n) {
            sumWhile += i;
            i++;
        }

        int sumFormula = n * (n + 1) / 2;
        boolean correct = (sumWhile == sumFormula);

        System.out.println("Sum using while loop: " + sumWhile);
        System.out.println("Sum using formula: " + sumFormula);
        System.out.println("Both results are equal? " + correct);
        scanner.close();
    }
}
