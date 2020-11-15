package cap04;

import javax.swing.JOptionPane;

public class TamanhoDaFrase {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Informe uma frase:");
        JOptionPane.showMessageDialog(null, "Frase informada: " + frase + "\nNúmero de caractéres: " + frase.length());
        System.exit(0);
    }
}
