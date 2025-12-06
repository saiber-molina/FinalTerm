
/**
 * Write a description of class number19 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;

public class number19 {
    public static void main(String[] args) {
        String[] names = {"Yejun", "Noah", "Bamby", "Eunho", "Hamin"};
        int[] grades = {90, 92, 94, 96, 98};

        String out = "";
        for (int i = 0; i < names.length; i++) {
            out += names[i] + " = " + grades[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, out);
    }
}