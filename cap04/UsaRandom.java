package cap04;

import javax.swing.JOptionPane;

public class UsaRandom {
    public static void main(String[] args) {
        String senha = "";
        for (int i = 1; i <= 10; i++) {
            int num = (int) (Math.random() * 10);
            senha += num;
        }
        JOptionPane.showMessageDialog(null, "Senha: " + senha);
        
        for (int numCartao = 1; numCartao <= 4; numCartao++) {
            String numeroCartao = "";
            for (int numLot = 1; numLot <= 6; numLot++) {
                int num = (int) (Math.random() * 100);
                numeroCartao += num + "     ";
            }
            JOptionPane.showMessageDialog(null, "Números do cartão: " + numCartao + "\n" + numeroCartao);
        }
        
        System.exit(0);
    }
}
