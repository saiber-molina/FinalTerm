
/**
 * Write a description of class number13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;

public class number13 {
    public static void main(String[] args) {
        int[] grades = {70, 75, 80, 85, 90};
        int pass = 0, fail = 0;

        for (int i = 0; i < grades.length; i++) {
        if (grades[i] >= 75) 
            pass++;
        else 
            fail++;
        }

        JOptionPane.showMessageDialog(null, "Pass: " + pass + "\nFail: " + fail);

    }
}