import java.util.Random;
import java.util.Scanner;

public class exc5 {

    public static void main(String[] args) {
        String answers[] = {
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten"
        };
        Scanner scan = new Scanner(System.in);
        Random r = new Random();

        do {
            System.out.print("What is your question? ");
            scan.nextLine();
            scan.nextLine();

            int num = r.nextInt(9);
            System.out.println(answers[num]);

            System.out.print("Another question? ");
        } while (scan.next().equalsIgnoreCase("yes"));

        scan.close();
    }
}