import java.util.Scanner;

public class FibonacciGenerator {
    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci sequence: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + (i < n ? ", " : "\n"));
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Fibonacci terms: ");
        int terms = sc.nextInt();
        printFibonacci(terms);
        sc.close();
    }
}
