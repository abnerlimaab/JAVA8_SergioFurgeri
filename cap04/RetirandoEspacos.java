package cap04;

import javax.swing.JOptionPane;

public class RetirandoEspacos {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Forneça uma frase:");
        frase = "   " + frase + "   ";
        String out = "Com espaços: " + "-" + frase + "-"
                    + "\nSem espaços: " + "-" + frase.trim() + "-";
        JOptionPane.showMessageDialog(null, out);
    }
}
