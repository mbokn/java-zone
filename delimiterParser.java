/**
 * delimiterParser
 */
import java.util.Scanner;

public class delimiterParser {
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);

    int age = sc.nextInt();

    int weight = sc.nextInt();

    int heartRate = sc.nextInt();

    int mins = sc.nextInt();

    double women = ((age * 0.074) - (weight * 0.05741) + (heartRate*0.4472)-20.4022) * mins/4.184;
    double men = ((age * 0.2017) + (weight * 0.09036) + (heartRate * 0.6309) - 55.0969) * mins / 4.184;

    System.out.printf("Women: %.2f calories\n",women);

    System.out.printf("Men: %.2f calories\n",men);
    }
    
}