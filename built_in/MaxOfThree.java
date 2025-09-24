import java.util.Scanner;

public class MaxOfThree {
    public static int inputNumber(String prompt, Scanner sc) {
        System.out.print(prompt);
        return sc.nextInt();
    }

    public static int maxOfThree(int a, int b, int c) {
        return Math.max(c, Math.max(a, b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = inputNumber("Enter first number: ", sc);
        int num2 = inputNumber("Enter second number: ", sc);
        int num3 = inputNumber("Enter third number: ", sc);
        int max = maxOfThree(num1, num2, num3);
        System.out.println("Maximum is: " + max);
        sc.close();
    }
}
