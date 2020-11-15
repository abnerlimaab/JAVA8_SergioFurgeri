/*
 * Crie uma classe que receba uma frase qualquer e mostre essa frase de trás para a frente e sem espaços em branco.
 */
package cap04;

import javax.swing.JOptionPane;

public class Exerc04 {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Informe uma frase:");
        String fraseSemEspaco = frase.replace(" ", "");
        String fraseTratada = "";
        
        for (int i = fraseSemEspaco.length()-1; i >= 0; i--) {
            fraseTratada += fraseSemEspaco.charAt(i);
        }
        
        JOptionPane.showMessageDialog(null, "Frase fornecida: " + frase + "\nFrase invertida sem espaçoes: " + fraseTratada);
        System.exit(0);
    }
}
