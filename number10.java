
/**
 * Write a description of class number10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;

public class number10 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                index = i;
                break;
            }
        }

        JOptionPane.showMessageDialog(null, "First even index: " + index);
    }
}