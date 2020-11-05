import java.util.Scanner;

public class MoneyCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter monetary amount: ");

        double input = scan.nextDouble();

        int intIn = (int)(input * 100);

        int twenties = intIn / 2000;
        int leftovers = intIn % 2000;
        System.out.println(twenties + " twenties");

        int tens = leftovers / 1000;
        leftovers = leftovers % 1000;
        System.out.println(tens + " tens");

        int fives = leftovers / 500;
        leftovers = leftovers % 500;
        System.out.println(fives + " fives");

        int ones = leftovers / 100;
        leftovers = leftovers % 100;
        System.out.println(ones + " ones");

        int quarters = leftovers / 25;
        leftovers = leftovers % 25;
        System.out.println(quarters + " quarters");

        int dimes = leftovers / 10;
        leftovers = leftovers % 10;
        System.out.println(dimes + " dimes");

        int nickels = leftovers / 5;
        leftovers = leftovers % 5;
        System.out.println(nickels + " nickels");

        int pennies = leftovers;
        System.out.println(pennies + " pennies");

        scan.close();
    }
}
