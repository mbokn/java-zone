public class GoldBuyer {
    public static void main(String[] args) {
        double money = 50000.00;
        double conversionValue = 1208.50;

        double goldOunces = money / conversionValue;
        
        System.out.println("The amount of gold you can buy is: " + goldOunces + " ounces.");
    }
}