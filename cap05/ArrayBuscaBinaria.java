package cap05;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class ArrayBuscaBinaria {
    public static void main(String[] args) {
        int[] n = new int[10000];
        String out = "Valor não encontrado";
        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (Math.random() * 1000);
        }
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Forneça um número"));
        for (int i = 0; i < n.length; i++) {
            if (n[i] == valor) {
                out = "Valor encontrado na posição [" + i + "] com busca sequencial";
                break;
            }
        }
        JOptionPane.showMessageDialog(null, out);
        Arrays.sort(n);
        int pos = Arrays.binarySearch(n, valor);
        if (pos >= 0) out = "Valor encontrado na posição [" + pos + "] com busca binária";
        else out = "Valor não encontrado";
        JOptionPane.showMessageDialog(null, out);
    }
}
