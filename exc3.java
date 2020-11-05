import java.text.DecimalFormat;
import java.util.Scanner;

public class exc3 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat ("0.###");

        double temp = -100;
        double vel = -100;

        System.out.println("Temperature between -58f and 41f: ");
        temp = scan.nextDouble();
        while (!((temp <= 41) && (temp >= -58))) {
            System.out.println("Try again: ");
            temp = scan.nextDouble();
        }

        System.out.println("Velocity greater than or equal to 2mph: ");
        vel = scan.nextDouble();
        while (!(vel >= 2)){
            System.out.println("Try again: ");
            vel = scan.nextDouble();
        }

        double twc = 35.74 + .6215 * temp - 35.75 * Math.pow(vel, .016) + .4275 * temp * Math.pow(vel, .016);
        System.out.println("Windchill: " + twc);
        scan.close();
    }
}
