
/**
 * Write a description of class number20 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;

public class number20 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        String out = "";

        for (int x : arr) {
            if (x % 2 == 0 && x > 20) {
                out += x + " ";
            }
        }

        JOptionPane.showMessageDialog(null, "Even numbers greater that 20:\n" + out);
    }
}