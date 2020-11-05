import edu.gatech.mediacomp.Turtle;
import edu.support.AnimatedTurtle;
import edu.support.EndWorld;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

public class HelloTurtles {

    /**
     * Use the given turtle to draw your name.
     *
     * NOTE: You may NOT change the parameter list, and you must use the
     *       turtle that is passed in.  You may NOT create any turtle
     *       or world in this method.
     *
     * @param t the turtle to use for drawing.
     */
    public static void drawName(AnimatedTurtle t) {
        // TODO: your implementation here
    } // end drawName

    /**
     * Draws a regular polygon of the specified number of sides and length of side.
     *
     * NOTE: You may NOT change the parameter list, and you must use the
     *       turtle that is passed in.  You may NOT create any turtle
     *       or world in this method.
     *
     * @param t the turtle to use to draw.
     * @param numSides the number of sides of each polygon.
     * @param sideLen the length of each side of each polygon.
     */
    public static void drawPolygon(AnimatedTurtle t, int numSides, int sideLen) {
        // TODO: your implementation here
    } // end drawPolygon

    /**
     * Draws the specified number of regular polygons,
     * each starting at the same place, however,
     * after each polygon is drawn the turtle turns 360.0 / numPolys degrees
     *
     * NOTE: You may NOT change the parameter list, and you must use the
     *       turtle that is passed in.  You may NOT create any turtle
     *       or world in this method.
     *
     * @param t the turtle to use to draw.
     * @param numPolys the number of polygons to draw.
     * @param numSides the number of sides of each polygon.
     * @param sideLen the length of each side of each polygon.
     */
    public static void manyPolygons(AnimatedTurtle t, int numPolys, int numSides, int sideLen) {
        // TODO: your implementation here
    } // end manyPolygons

    /**
     * Draws the specified number of lines, rotating 360.0 / n between
     * each line.  The color of each line is determined by the angle
     * the turtle is facing when drawing that line.
     * A line drawn at angle, ang, has the HSB/HSV color of (ang / 360f, 1, 1).
     * You may want to refer to
     * https://docs.oracle.com/javase/8/docs/api/java/awt/Color.html#getHSBColor-float-float-float-
     *
     * NOTE: You may NOT change the parameter list, and you must use the
     *       turtle that is passed in.  You may NOT create any turtle
     *       or world in this method.
     *
     * @param t the turtle to use to draw.
     * @param numLines the number of line segments.
     * @param lineLength the length of each line segment.
     */
    public static void radial(AnimatedTurtle t, int numLines, int lineLength) {
        // TODO: your implementation here
    } // end radial

    /**
     * Your code for creating the (1 and only) EndWorld,
     * and the (1 and only) AnimatedTurtle, and dealing with input
     * goes in this method.
     *
     * If you write code that creates a turtle or world more than
     * once, you will lose points. This includes duplicate code.
     *
     * You must pass along the turtle created in this method,
     * along with the user's input for other parameters
     * to the other methods based on the user's menu choice.
     * Once again, failure to meet these requirements will result
     * in loss of points.
     */
    public static void solution() {
        System.out.println("which option");
        String choice = menu();
        switch (choice) {
            case "Polygon": {
                System.out.println("number of sides");
                int sides = castle.getInt();
                System.out.println("length");
                int length = castle.getInt();
                turt.drawPolygons(sides, length);
                break;}

            case "Many Polygons": {
                System.out.println("polys");
                int polys = castle.getInt();
                System.out.println("sides");
                int sides = castle.getInt();
                System.out.println("length");
                int length = castle.getInt();
                turt.manyPolygon(polys, sides, length);
                break; }

            case "Radial": {
                System.out.println("number of lines");
                int lines = castle.getInt();
                System.out.println("length");
                int length = castle.getInt();
                turt.radial(lines, length);
                break; }
        
            default:
                break;
            }
        // TODO: Your code here
    } // end solution

    public static int getInt() {
        //Java Option Pane that prompts user to enter an integer, and stores it as a string
        String inputString = JOptionPane.showInputDialog("Enter an integer greater than 0: ");

        //Converts Option Pane input string into an integer
        int inputToInt = Integer.parseInt(inputString);

        //Input Validation
        while (inputToInt < 1) {

            inputString = JOptionPane.showInputDialog("Invalid entry, please enter an integer greater than 0: ");

            //Converts Option Pane input string into an integer
            inputToInt = Integer.parseInt(inputString);

        } //End While Loop
        
        return inputToInt;
    }
    /**
     * Entry point of the program.
     */
    public static void main(String[] args) {
        solution();
        // You may put whatever testing code you want in
        // here,
        // WARNING: remove your testing code, leaving only
        // the call to solution() prior to submitting.
    } // end main

    /**
     * Returns a random number between low (inclusive) and high (exclusive)
     *
     * DO NOT CHANGE THIS METHOD!!!!
     *
     * @param low the lower (inclusive) part of the range.
     * @param high the upper (exclusive) part of the range.
     * @return a random number between low (inclusive) and high (exclusive).
     */
    public static int rand(int low, int high) {
        return ThreadLocalRandom.current().nextInt(low, high);
    } // end rand

    /**
     * Displays the menu and returns the value the user selected.
     *
     * DO NOT CHANGE THIS METHOD!!!!
     *
     * Quits the program if the user selects Cancel.
     *
     * NOTE: Remember to compare strings using the .equals method.
     *
     * @return one of "Name", "Polygon", "Many Polygons", "Radial"
     */
    public static String menu() {
        JPanel panel = new JPanel();
        panel.add(new JRadioButton("radio"));
        String values[] = {"Name", "Polygon", "Many Polygons", "Radial"};
        Object choice = JOptionPane.showInputDialog(null,
                "Choose the demo to show", "Choose Demo",
                JOptionPane.DEFAULT_OPTION, null, values, "0");
        if (choice == null) {
            System.exit(0);
        }
        return choice.toString();
    } // end menu

} // end class HelloTurtles
