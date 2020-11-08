package cap02;

import javax.swing.JOptionPane;

public class EntradaComJOptionPane {
    public static void main(String[] args) {
        String aux;
        float largura, comprimento, area, perimetro;
        
        try {
            aux = JOptionPane.showInputDialog("Entre com o comprimento:");
            comprimento = Float.parseFloat(aux);
            
            aux = JOptionPane.showInputDialog("Entre com a largura:");
            largura = Float.parseFloat(aux);
            
            area = comprimento * largura;
            perimetro = comprimento * 2 + largura * 2;
            
            JOptionPane.showMessageDialog(null, "Área: " + area + ", Perimêtro: " + perimetro);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Houve um erro de conversão! Digite apenas números. Erro: " + erro.toString());
        }
    }
}
