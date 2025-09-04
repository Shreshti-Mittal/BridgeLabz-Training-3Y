//The Library Book Tracker A library records the number of books borrowed each day for 7 days in an array.
// Use a loop to calculate the total number of books borrowed in the week.
// Find the day with the highest borrowings.
// Check if there was any day with zero borrowings (holiday).
// Display the average daily borrowings.
import java.util.Scanner;

public class LibraryBookTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] borrowings = new int[7];  

        System.out.println("Enter the number of books borrowed each day for 7 days:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            borrowings[i] = sc.nextInt();
        }

        int total = 0;
        int max = borrowings[0];
        int dayOfMax = 0;
        boolean zeroFound = false;

        for (int i = 0; i < 7; i++) {
            total += borrowings[i];

            if (borrowings[i] > max) {
                max = borrowings[i];
                dayOfMax = i;
            }

            if (borrowings[i] == 0) {
                zeroFound = true;
            }
        }

        double average = total / 7.0;

        System.out.println("\nTotal books borrowed in the week: " + total);
        System.out.println("Average daily borrowings: " + average);
        System.out.println("Day with highest borrowings: Day " + (dayOfMax + 1) + " (" + max + " books)");

        if (zeroFound) {
            System.out.println("There was at least one day with zero borrowings (possibly a holiday).");
        } else {
            System.out.println("No holidays! Books were borrowed every day.");
        }

        sc.close();
    }
}
