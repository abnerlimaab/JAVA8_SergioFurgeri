package cap04;

import javax.swing.JOptionPane;

public class TransformacoesNaFrase {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Forneça uma frase:");
        String out = "Frase: " + frase
                    + "\nTodas em Maiúsculas: " + frase.toUpperCase()
                    + "\nTodas em Minúsculas: " + frase.toLowerCase();
        JOptionPane.showMessageDialog(null, out);
    }
}
