/*
Exercício proposto: Faça uma classe que apresente em tela a tabuada de qualquer número. O usuário fornece o número desejado e a classe apresenta a relação de todos os calculos de 1 a 10.
 */
package cap03;

import javax.swing.JOptionPane;

public class Exerc04 {
    public Exerc04() {
        try {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Forneça um número"));
            String tabuada = "";
            for (int i = 1; i <= 10; i++) {
                tabuada = tabuada + Integer.toString(num) + " x " + Integer.toString(i) + " = " + num * i + "\n";
            }
            JOptionPane.showMessageDialog(null, tabuada);
            System.exit(0);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conversão\n" + erro);
        }
    }
}
