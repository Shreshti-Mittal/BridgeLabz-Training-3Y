import java.util.Scanner;

public class TwoDToOneD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements of matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int[] oneD = new int[rows * cols];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                oneD[index++] = matrix[i][j];
            }
        }

        System.out.println("1D array elements:");
        for (int val : oneD) {
            System.out.print(val + " ");
        }
        System.out.println();
        scanner.close();
    }
}
