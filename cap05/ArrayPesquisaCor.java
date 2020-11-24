package cap05;

import javax.swing.JOptionPane;

public class ArrayPesquisaCor {
    public static void main(String[] args) {
        String cores[] = {"verde", "amarelo", "azul", "vermelho", "preto"};
        String corIn = JOptionPane.showInputDialog("informe a cor:");
        String mensagem = "Cor não encontrada";
        for (String cor : cores) {
            if (cor.equals(corIn)) {
                mensagem = "Cor encontrada";
                break;
            }            
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
