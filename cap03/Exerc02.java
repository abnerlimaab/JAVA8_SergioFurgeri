/**
 * Exercício proposto: Criar uma classe que calcule a resistência equivalente em um circuito em série com 4 resistências e apresentar a maior e menor resistência informada.
 */

package cap03;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Exerc02 {
    public Exerc02() {
        try {
            float res[] = new float[4];
            res[0] = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da 1ª resistência:"));
            res[1] = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da 2ª resistência:"));
            res[2] = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da 3ª resistência:"));
            res[3] = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da 3ª resistência:"));
            float maior = 0, menor = 0, rEquiv = 0;
            for (float r : res) {
                if (r > maior) maior = r;
                if (r < menor || menor == 0) menor = r;
                rEquiv = rEquiv + r;
            }
            JOptionPane.showMessageDialog(null, "Resistências fornecidas:\n" + Arrays.toString(res) + "\nMaior resistência: " + maior + "\nMenor resistência: " + menor + "\nResist~encia equivalente: " + rEquiv);
            System.exit(0);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conversão.\n" + erro);
        }
    }
}
