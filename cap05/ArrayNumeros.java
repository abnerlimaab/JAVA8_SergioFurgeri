package cap05;

import java.text.DecimalFormat;

public class ArrayNumeros {
    public static void main(String[] args) {
        int[] inteiros = new int[10];
        for (int i = 0; i < inteiros.length; i++) {
            inteiros[i] = (int) (Math.random() * 1000);
            System.out.println(new DecimalFormat("000").format(inteiros[i]));
        }
    }
}
