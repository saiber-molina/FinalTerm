  
/**
 * Write a description of class number4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;

public class number4 {
    public static void main(String[] args) {
        int[] num = {11,22,21};

        int smallest = num[0];
        int largest = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] < smallest)
            smallest = num[i];
            if (num[i] > largest)
            largest = num[i];
        }

        JOptionPane.showMessageDialog(null, "Smallest: " + smallest + "\nLargest: " + largest);
    }
}
