/**
 * Exercício proposto: Receber o nome de um produto e seu valor e calcular o valor com desconto com base na tabela de descontos apresentada.
 */

package cap03;

import javax.swing.JOptionPane;

public class Exerc01 {
    public Exerc01() {
        try {
            String produto = JOptionPane.showInputDialog("Informe o nome do produto:");
            float vlrOriginal = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do produto em R$:"));
            if (vlrOriginal < 0) throw new Exception("Valor não pode ser menor que zero");
            float vlrComDesconto;
            if (vlrOriginal < 50) vlrComDesconto = vlrOriginal;
            else if (vlrOriginal < 200) vlrComDesconto = vlrOriginal - vlrOriginal * 5 / 100;
            else if (vlrOriginal < 500) vlrComDesconto = vlrOriginal - vlrOriginal * 6 / 100;
            else if (vlrOriginal < 1000) vlrComDesconto = vlrOriginal - vlrOriginal * 7 / 1000;
            else vlrComDesconto = vlrOriginal - vlrOriginal * 8 / 1000;
            JOptionPane.showMessageDialog(null, "Nome do produto: " + produto + "\nValor original do produto: R$ " + vlrOriginal + "\nValor do produto com desconto: R$ " + vlrComDesconto, "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conversão.\n" + erro.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro, "Número inválido", JOptionPane.ERROR_MESSAGE);
        }
    }
}
