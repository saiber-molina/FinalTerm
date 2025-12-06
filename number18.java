
/**
 * Write a description of class number18 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;

public class number18 {
    public static void main(String[] args) {
        int[] num = {11, 22, 22, 22, 2004};
        boolean hasDuplicate = false;

        for (int i = 0; i < num.length; i++) {
            for (int x = i + 1; x < num.length; x++) {
                if (num[i] == num[x]) {
                    hasDuplicate = true;
                    break;
                }
            }
        }

        JOptionPane.showMessageDialog(null, hasDuplicate ? "Has duplicates" : "No duplicates");
    }
}