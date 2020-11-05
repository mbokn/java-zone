import java.util.Scanner;

public class w6task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = scan.nextInt();
        while (year< 0){
            System.out.println("Year is invalid. Use a positive year: ");
            year = scan.nextInt();
        }
        int yearMod = year % 12;
        System.out.print(year + " is the year of the ");

        switch(yearMod+1){
            case 1: System.out.println("Monkey"); break;
            case 2: System.out.println("Rooster"); break;
            case 3: System.out.println("Dog"); break;
            case 4: System.out.println("Pig"); break;
            case 5: System.out.println("Rat"); break;
            case 6: System.out.println("Ox"); break;
            case 7: System.out.println("Tiger"); break;
            case 8: System.out.println("Rabbit"); break;
            case 9: System.out.println("Dragon"); break;
            case 10: System.out.println("Snake"); break;
            case 11: System.out.println("Horse"); break;
            case 12: System.out.println("Sheep"); break;
        }
        scan.close();
    }
}
