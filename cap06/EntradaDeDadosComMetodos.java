package cap06;

import javax.swing.JOptionPane;

public class EntradaDeDadosComMetodos {
    static String aux = "";
    public static int lerNumeroInt(int min, int max, String men) {
        int n = 0;
        while (true) {
            try {
                aux = JOptionPane.showInputDialog(men);
                n = Integer.parseInt(aux);
                if (n < min || n > max) JOptionPane.showMessageDialog(null, "Entrada fora da faixa permitida");
                else break;
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Digite apenas valores númericos\n" + erro.toString());
            }
        }
        return n;
    }
    public static float lerNumeroFloat(float min, float max, String men) {
        float n = 0;
        while (true) {
            try {
                aux = JOptionPane.showInputDialog(men);
                n = Float.parseFloat(aux);
                if (n < min || n > max) JOptionPane.showMessageDialog(null, "Entrada fora da faixa permitida");
                else break;
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Digite apenas valores númericos\n" + erro.toString());
            }
        }
        return n;
    }
    public static double lerNumeroDouble(double min, double max, String men) {
        double n = 0;
        while (true) {
            try {
                aux = JOptionPane.showInputDialog(men);
                n = Float.parseFloat(aux);
                if (n < min || n > max) JOptionPane.showMessageDialog(null, "Entrada fora da faixa permitida");
                else break;
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Digite apenas valores númericos\n" + erro.toString());
            }
        }
        return n;
    }
    public static String lerString(String men) {
        aux = JOptionPane.showInputDialog(men);
        return aux;
    }
    public static char selecionarOpcao(String men) {
        Object[] op = {"Sim", "Não"};
        char opcao = 'N';
        String resp = (String) JOptionPane.showInputDialog(null, men + "\n", "Pesquisa", JOptionPane.PLAIN_MESSAGE, null, op, "Sim");
        if (resp.equals("Sim")) opcao = 'S';
        return opcao;
    }
}
