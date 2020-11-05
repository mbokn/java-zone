import java.util.Scanner;

public class castle {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        solution();
    }
    public static int getInt() {
        int out;
        //joption pane
        System.out.println("insert int");
        out = castle.scan.nextInt();
        return (out);
    }
    public static void solution() {
        System.out.println("which option");
        int choice = castle.scan.nextInt();
        int inp;
        switch (choice) {
            case 1: {
                System.out.println("number of sides");
                int sides = castle.getInt();
                System.out.println("length");
                int length = castle.getInt();
                multiplePolygons(sides, length);
                break;}

            case 2: {
                System.out.println("number of sides");
                int sides = castle.getInt();
                System.out.println("length");
                int length = castle.getInt();
                System.out.println("c");
                int c = castle.getInt();
                onePolygon(sides, length, c);
                break; }

            case 3: {
                System.out.println("number of sides");
                int sides = castle.getInt();
                System.out.println("length");
                int length = castle.getInt();
                multiplePolygons(sides, length);
                break; }
        
            default:
                break;
        }
    }
    public static void multiplePolygons(int sides, int length) {
        System.out.print(sides + " " + length);
    }

    public static void onePolygon(int sides, int length, int c) {
        System.out.print(sides + " " + length);
    }

    public static void radial(int sides, int length) {
        System.out.print(sides + " " + length);
    }
}
