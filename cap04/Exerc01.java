/*
 * Exercício proposto: Crie uma classe que simule a jogada de um dado por três vezes. Ao final some seus valores e apresente o resultado das tr~es jogadas.
 */
package cap04;

import javax.swing.JOptionPane;

public class Exerc01 {
    public static void main(String[] args) {
        int jogada[] = new int[3];
        int total = 0;
        String out = "Números sorteados:\n";
        for (int i = 0; i <= 2; i++) {
            int num = (int) (Math.random() * 10);
            if (num > 0 && num <= 6) {
                jogada[i] = num;
                total += jogada[i];
                out += (i+1) + "ª Jogada: " + jogada[i] + "\n";
            } else {
                i--;
            }
        }
        out += "Total: " + total;
        JOptionPane.showMessageDialog(null, out);
        System.exit(0);
    }
}
