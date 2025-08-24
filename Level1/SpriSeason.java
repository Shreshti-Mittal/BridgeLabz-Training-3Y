import java.util.Scanner;

public class SpriSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        boolean isSpring = false;

        if (month == 3 && day >= 20) isSpring = true;
        else if (month > 3 && month < 6) isSpring = true;
        else if (month == 6 && day <= 20) isSpring = true;

        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
        scanner.close();
    }
}
