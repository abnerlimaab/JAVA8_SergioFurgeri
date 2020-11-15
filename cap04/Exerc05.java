/*
 * Elabore uma classe que receba uma frase e verifique se essa frase possui palavras impróprias. As palavras impróprias são: sexo e sexual. Caso encontre uma dessas palavras, emita em tela a mensagem "conteúdo impróprio", caso contrário "conteúdo liberado".
 */
package cap04;

import javax.swing.JOptionPane;

public class Exerc05 {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Insira uma frase:");
        if (texto.contains("sexo") || texto.contains("sexual")) {
            JOptionPane.showMessageDialog(null, "Conteúdo impróprio");
        } else {
            JOptionPane.showMessageDialog(null, "Conteúdo liberado");
        }
        System.exit(0);
    }
}
