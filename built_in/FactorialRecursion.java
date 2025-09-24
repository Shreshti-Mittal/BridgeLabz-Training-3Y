import java.util.Scanner;

public class FactorialRecursion {
    public static int inputNumber(Scanner sc) {
        System.out.print("Enter a non-negative integer: ");
        return sc.nextInt();
    }

    public static long factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void displayResult(int n, long fact) {
        System.out.println("Factorial of " + n + " is: " + fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = inputNumber(sc);
        if (number < 0)
            System.out.println("Invalid input, number must be non-negative.");
        else {
            long fact = factorial(number);
            displayResult(number, fact);
        }
        sc.close();
    }
}
