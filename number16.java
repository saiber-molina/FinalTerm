
/**
 * Write a description of class number16 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;

public class number16 {
    public static void main(String[] args) {
        String phone = JOptionPane.showInputDialog("Enter your number:");

        int digits = phone.length();

        JOptionPane.showMessageDialog(null, "Digits: " + digits);
    }
}