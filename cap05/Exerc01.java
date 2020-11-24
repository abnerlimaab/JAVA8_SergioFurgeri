/*
Exercício proposto: Elabore uma classe que receba 5 notas de aluno por meio de showInputDialog, armazene essas notas em um array de cinco elementos, apresente em tela as cinco notas em ordem decrescente e a média aritimética das notas
*/
package cap05;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Exerc01 {
    public static void main(String[] args) {
        try {
            float[] notas = new float[5];
            float media = 0;
            String out = "Média: ";
            for (int i = 0; i < notas.length; i++) {
                notas[i] = Float.parseFloat(JOptionPane.showInputDialog("Informe a " + (i+1) + "ª nota"));
            }
            Arrays.sort(notas);
            for (float nota : notas) {
                media += nota;
            }
            media /= 5;
            out += media + "\nNotas: ";
            for (int i = notas.length - 1; i >= 0; i--) {
                out += notas[i] + "    ";
            }
            JOptionPane.showMessageDialog(null, out);
            System.exit(0);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conversão! \nInforme apenas números.");
            System.out.println(erro);
        }
    }
}
