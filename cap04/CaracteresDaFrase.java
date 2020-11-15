package cap04;

import javax.swing.JOptionPane;

public class CaracteresDaFrase {
    public static void main(String[] args) {
        String palavra = JOptionPane.showInputDialog("Forneça uma palavra com pelo menos 4 letras:");
        String caracteres = "Palavra: " + palavra + "\n";
        for (int i = 0; i <= 3; i++) {
            caracteres += "Caractere " + (i+1) + ": " + palavra.charAt(i) + "\n";
        }
        JOptionPane.showMessageDialog(null, caracteres);
    }
}
