package cap03;

import java.io.IOException;
import javax.swing.JOptionPane;

public class InstrucaoThrows {
    public static void main(String[] args) throws IOException {
        try {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));
            if (idade < 18) throw new Exception("Menor de idade, entrada não permitida.");
            else JOptionPane.showMessageDialog(null, "Idáde válida, seja bem-vindo!");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.toString());
        }
    }
}
