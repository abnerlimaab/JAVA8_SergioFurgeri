package cap03;

import javax.swing.JOptionPane;

public class IfComElse {
    public static void main(String[] args) {
        String aux = JOptionPane.showInputDialog("Forneça o número do mês");
        if (aux != null) {
            try {
                int mes = Integer.parseInt(aux);
                if (mes >= 1 && mes <= 12) JOptionPane.showMessageDialog(null, "Número do mês é válido! \n" + mes);
                else JOptionPane.showMessageDialog(null, "Número do mês inválido!\n" + mes);
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Informe apenas números inteiros! \n Erro: " + erro);
            }
        } else JOptionPane.showMessageDialog(null, "Operação cancelada.");
        System.exit(0);
    }
}
