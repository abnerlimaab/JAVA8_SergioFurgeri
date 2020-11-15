package cap04;

import javax.swing.JOptionPane;

public class DiversosMetodos {
    public static void main(String[] args) {
        double a = 2.4, b = 2.6, c = 4, d = -1;
        String r = "Arredondamento de " + a + " = " + Math.round(a)
                + "\nArredondamento de " + b + " = " + Math.round(b)
                + "\nMaior valor entre " + a + " e " + b + " = " + Math.max(a, b)
                + "\nMenor valor entre " + a + " e " + b + " = " + Math.min(a, b)
                + "\nO quadrado de " + c + " é " + Math.pow(c, 2)
                + "\nA raiz quadrada de " + c + " é " + Math.sqrt(c)
                + "\nO valor absoluto de " + d + " é " + Math.abs(d);
        JOptionPane.showMessageDialog(null, r);
        System.exit(0);
    }
}
