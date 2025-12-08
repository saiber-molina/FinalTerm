
/**
 * Write a description of class number2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;

public class number2 {
    public static void main(String[] args) {
        int[] num = {7, 7, 7, 7, 1, 7, 2, 3, 7, 4};
        int count = 0;
        for (int n : num) {
            if (n == 7)
            count++;
        }
        JOptionPane.showMessageDialog(null, "Number 7 appears " + count + " times.");
    }
}
