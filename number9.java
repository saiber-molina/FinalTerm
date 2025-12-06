
/**
 * Write a description of class number9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;

public class number9 {
    public static void main(String[] args) {
        int sum = 0, num;

        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Enter number: "));
            sum += num;
        } while (num != 0);

        JOptionPane.showMessageDialog(null, "Sum = " + sum);
    }
}