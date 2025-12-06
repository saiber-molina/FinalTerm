
/**
 * Write a description of class number12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;

public class number12 {
    public static void main(String[] args) {
        int[] num = {11, 22, 22, 1, 22, 3};
        int value = 22, count = 0;

        for (int x : num) {
            if (x == value)
            count++;
        }

        if (count >= 3)
            JOptionPane.showMessageDialog(null, value + " appears at least 3 times.");
        else
            JOptionPane.showMessageDialog(null, "Not enough occurrences.");
    }
}