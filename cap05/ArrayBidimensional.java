package cap05;

import java.text.DecimalFormat;

public class ArrayBidimensional {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        String out = "";
        for (int i = 0; i < matriz.length; i++) {
            if (!out.equals("")) out += "\n";
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
                out += new DecimalFormat("000").format(matriz[i][j]) + "\t";
            }
        }
        System.out.print(out);
    }
}
