package cap04;

import javax.swing.JOptionPane;

public class PedacosDaFrase {
    public static void main(String[] args) {
        try {
            String frase = JOptionPane.showInputDialog("Forneça uma frase:");
            String out = "Frase: " + frase
                        + "\n(0,2) " + frase.substring(0, 2)
                        + "\n(3,8) " + frase.substring(3, 8)
                        + "\n(9,11) " + frase.substring(9, 11)
                        + "\n(12,14) " + frase.substring(12, 14);
            JOptionPane.showMessageDialog(null, out);
        } catch (StringIndexOutOfBoundsException erro) {
            JOptionPane.showMessageDialog(null, "ERRO: A frase deve ter pelo menos 15 caractéres!");
            System.out.println(erro);
        }
    }
}
