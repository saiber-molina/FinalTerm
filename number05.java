
/**
 * Write a description of class number5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;

public class number5 {
    public static void main(String[] args) {
        int[] num = {11, 22, 4, 21};
        int find = 22;

        for (int i = 0; i < num.length; i++) {
            if (num[i] == find) {
                JOptionPane.showMessageDialog(null, find + " found at index " + i);
                break;
            }
        }
    }
}
