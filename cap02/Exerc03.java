package cap02;

import javax.swing.JOptionPane;

public class Exerc03 {
    public static void main(String[] args) {
        float vlrTransacao, vlrVenal, imposto, vlrImposto;
        String aux;
        
        try {
            aux = JOptionPane.showInputDialog("Entre com o valor da transação:");
            vlrTransacao = Float.parseFloat(aux);
            
            aux = JOptionPane.showInputDialog("Entre com o valor venal de referência:");
            vlrVenal = Float.parseFloat(aux);
            
            aux = JOptionPane.showInputDialog("Entre com o percentual do TBI:");
            imposto = Float.parseFloat(aux);
            
            if (vlrTransacao > vlrVenal) {
                vlrImposto = vlrTransacao * imposto / 100;
            } else {
                vlrImposto = vlrVenal * imposto / 100;
            }
            
            JOptionPane.showMessageDialog(null, "Valor de imposto a ser pago: R$ " + vlrImposto);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Informe apenas números. ERRO: " + erro);
        }
    }
}
