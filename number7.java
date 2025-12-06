
/**
 * Write a description of class number7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;

public class number7 {
    public static void main(String[] args) {
        int[] num = {11, -22, -2004, 21};

        for (int i = 0; i < num.length; i++) {
            if (num[i] < 0) 
            num[i] = -num[i];
        }

        String result = "";
        for (int x : num) 
        result += x + "\n ";

        JOptionPane.showMessageDialog(null, "Converted:\n " + result);
    }
}