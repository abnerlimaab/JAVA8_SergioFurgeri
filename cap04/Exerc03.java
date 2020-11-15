/*
 * Crie uma classe que gera um número aleatoriamente (entre 5 e 10) por Math.random. Em seguida, faça com que apareça em tela uma senha numérica contendo a mesma quantidade de digitos correspondentes ao valor aleatório gerado. Apresente em tela o número sorteado e a senha.
 */
package cap04;

import javax.swing.JOptionPane;

public class Exerc03 {
    public static void main(String[] args) {
        int sorteio = 0;
        boolean encontrou = false;
        String senha = "";
        
        while (!encontrou) {
            int num = (int) (Math.random() * 100);
            if (num >= 5 && num <= 10) {
                sorteio = num;
                encontrou = true;
            }
        }
        
        for (int i = 1; i <= sorteio; i++) {
            senha += (int) (Math.random() * 10);
        }
        
        JOptionPane.showMessageDialog(null, "Número sorteado: " + sorteio + "\nSenha Gerada: " + senha);
        System.exit(0);
    }
}
