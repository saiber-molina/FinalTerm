/**
 * Write a description of class number1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;

public class number1 {
    public static void main(String[] args) {
        int number;
        do {
            String input = JOptionPane.showInputDialog("Enter a number between 1 and 100:");
            number = Integer.parseInt(input);
        } while (number < 1 || number > 100);
        JOptionPane.showMessageDialog(null, "You entered: " + number);
    }
}