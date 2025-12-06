
/**
 * Write a description of class number17 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;

public class number17 {
    public static void main(String[] args) {
        int[] num = {11, 22, 2004, 21};

        int highest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int x : num) {
            if (x > highest) {
                second = highest;
                highest = x;
            } else if (x > second && x != highest) {
                second = x;
            }
        }

        JOptionPane.showMessageDialog(null, "Second highest: " + second);
    }
}