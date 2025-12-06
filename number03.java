
/**
 * Write a description of class number3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;

public class number3 {
    public static void main(String[] args) {
        String pattern = "";

        for (int i = 1; i <= 5; i++) {
            for (int x = 1; x <= i; x++) {
                pattern += "*";
            }
            pattern += "\n";
        }

        JOptionPane.showMessageDialog(null, pattern);
    }
}
