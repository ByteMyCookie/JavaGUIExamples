import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        StringBuilder c = new StringBuilder("Baby");
        StringBuilder d = new StringBuilder("Beluga");
        c.append(d); // Mutates -- faster.
        System.out.println(new StringBuilder(c.append(" Horton")));

        System.out.println(Integer.BYTES);

        int[][] irregular;
        irregular = new int[3][];
        irregular[0] = new int[6];
        irregular[1] = new int[99];
        irregular[2] = new int[10];
        irregular[1][8] = 170;

        System.out.println(Arrays.deepToString(irregular));

        Integer i = 10; // Autoboxing
        System.out.println(i);
    }
}
