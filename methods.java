/**
 * methods
 */

import java.util.Scanner;
import java.lang.Math;
public class methods {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double in1 = scan.nextDouble();
        double in2 = scan.nextDouble();
        double out = squarish(in1, in2);
        System.out.print(out);
        scan.close();
    }

    public static double squarish(double i) {
        return (Math.pow(i, 2) + 1);
    }

    public static double squarish(double i, double j) {
        return (Math.pow(i, 2) + j);
    }
}