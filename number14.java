
/**
 * Write a description of class number14 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;

public class number14 {
    public static void main(String[] args) {
        int[] num = {11, 22, 2004, 21, 2};
        String out = "";

        for (int i = num.length - 1; i >= 0; i--) {
            out += num[i] + " ";
        }

        JOptionPane.showMessageDialog(null, out);
    }
}