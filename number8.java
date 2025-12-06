
/**
 * Write a description of class number8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;

public class number8 {
    public static void main(String[] args) {
        int[] A = {11, 22, 2004, 21};
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }

        String out = "";
        for (int x : B)
        out += x + "\n";

        JOptionPane.showMessageDialog(null, "Array B:\n " + out);
    }
}