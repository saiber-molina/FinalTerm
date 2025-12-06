
/**
 * Write a description of class number11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;

public class number11 {
    public static void main(String[] args) {
        int[] num = {11, 1, 22, 2, 2004};
        String out = " ";

        for (int i = 0; i < num.length; i += 2) {
            out += num[i] + " ";
        }

        JOptionPane.showMessageDialog(null, out);
    }
}