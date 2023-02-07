package geometry;

import java.util.Scanner;

public class CalculateLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1, y1, x2, y2;
        System.out.println("enter x1");
        x1 = scanner.nextInt();


        System.out.println("enter y1");
        y1 = scanner.nextInt();

        System.out.println("enter x2");
        x2 = scanner.nextInt();


        System.out.println("enter y2");
        y2 = scanner.nextInt();

        double lengthOfLine = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("lengthOfLine : =(" + x1 + ", " + y1 + ")to (" + x2 + ", " + y2 + ")=" + lengthOfLine);

    }
}
