/*
 * Uma farmácia precisa ajustar o preço de seus produtos em 12%. Elabore uma classe que receba o valor do produto e aplique o percentual de acréscimo. O novo valor a ser calculado deve ser arredondado para mais ou para menos usando o método round. A classe deve conter também um método de repetição que encerre o programa quando o usuário fornecer o valor zero (0) para o valor do produto. Dessa forma, o usuário digita o valor do produto, a classe calcula e mostra o valor com acréscimo, a seguir solicita um novo valor. Esse processo continua enquanto o valor do produto for diferente de zero; caso contrário, o programa será encerrado.
 */
package cap04;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Exerc02 {
    public static void main(String[] args) {
        float valor;
        DecimalFormat moeda = new DecimalFormat();
        moeda.applyPattern("R$ #,##0.00");
        try {
            do {
                valor = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do produto: \nInsira (0) para encerrar."));
                if (valor == 0) break;
                String out = "O valor com acréscimo é: " + moeda.format(valor*1.12)
                            + "\nO valor arredondado é: " + moeda.format(Math.round(valor*1.12));
                JOptionPane.showMessageDialog(null, out);
            } while (valor != 0);
            System.exit(0);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "ERRO: Só são aceitos valores reais.");
        }
    }
}
