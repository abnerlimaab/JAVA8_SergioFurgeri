package cap02;

import java.text.NumberFormat;
import javax.swing.JOptionPane;

public class Exerc04 {
    public static void main(String[] args) {
        float   nota1, nota2, notaTB, media;
        String aux;
        
        try {
        aux = JOptionPane.showInputDialog("Informe a nota da primeira prova:");
        nota1 = Float.parseFloat(aux);
        
        aux = JOptionPane.showInputDialog("Informe a nota da segunda prova:");
        nota2 = Float.parseFloat(aux);
        
        aux = JOptionPane.showInputDialog("Informe a nota do trabalho:");
        notaTB = Float.parseFloat(aux);
        
        media = (nota1 + nota2 + notaTB) / 3;
        
        if (media > 6) {
            JOptionPane.showMessageDialog(null, "Resultado Final: APROVADO | Média: " + NumberFormat.getCurrencyInstance().format(media));
        } else {
            JOptionPane.showMessageDialog(null, "Resultado Final: REPROVADO | Média: " + NumberFormat.getCurrencyInstance().format(media));
        }
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Informe apenas números. ERRO: " + erro);
        }
    }
}
