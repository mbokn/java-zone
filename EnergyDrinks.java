public class EnergyDrinks {
    
    public static void main(String[] args){
        int customers = 12467;
        double one_or_more_percent = .14;
        double prefers_citrus_percent = .64;

        double total_one_or_more = customers * one_or_more_percent;
        double total_prefers_citrus = customers * prefers_citrus_percent;

        System.out.println("According to a survey of " + customers + "people:");
        System.out.println(total_one_or_more + " customers surveyed purchased one or more energy drinks per week.");
        System.out.println(total_prefers_citrus + " customers surveyed preferred citrus flavored energy drinks.");
    }
}
