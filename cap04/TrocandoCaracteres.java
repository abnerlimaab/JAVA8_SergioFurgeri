package cap04;

import javax.swing.JOptionPane;

public class TrocandoCaracteres {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Forneça uma frase:");
        String out = "Frase: " + frase
                    + "\nRetirando os espaços: " + frase.replace(" ", "")
                    + "\nTrocando 'a' por 'u': " + frase.replace("a", "u");
        JOptionPane.showMessageDialog(null, out);
    }
}
