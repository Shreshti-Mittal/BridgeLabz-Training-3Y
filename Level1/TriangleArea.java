import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base (in inches): ");
        double baseInches = input.nextDouble();

        System.out.print("Enter height (in inches): ");
        double heightInches = input.nextDouble();

        double areaInches = 0.5 * baseInches * heightInches;
        double areaCm = areaInches * 6.4516;  // 1 sq inch = 6.4516 sq cm

        System.out.println("Area of triangle in square inches is " + areaInches +
                " and in square centimeters is " + areaCm);
        input.close();
    }
}
