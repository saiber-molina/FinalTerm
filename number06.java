
/**
 * Write a description of class number6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;

public class number6 {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9};
        int sum = 0, count = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) { 
                sum += num[i];
                count++;
            }
        }

        double avg = (count == 0) ? 0 : (double) sum / count;

        JOptionPane.showMessageDialog(null, "Average of odd numbers: " + avg);
    }
}
