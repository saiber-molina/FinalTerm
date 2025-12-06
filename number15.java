
/**
 * Write a description of class number15 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;

public class number15 {
    public static void main(String[] args) {
        int[] num = new int[5];
        String out = "";

        for (int i = 0; i < 5; i++) {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter number #" + (i+1) + ":"));
            if (num[i] > 50) 
            out += num[i] + " ";
        }

        JOptionPane.showMessageDialog(null, "Numbers > 50: " + out);
    }
}