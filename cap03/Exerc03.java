/*
 * Exercício proposto: Faça uma classe que solicite login e senha, simulando o acesso a um sistema. Considere que os conteúdos de login e senha originais são iguais a "java8". O usuário deverá fornecer login e senha e você irá compará-los com os conteúdos originais. O usuário tem três chances para digitar corretamente os dados de login e senha. Paca cada tentativa incorreta deve aparecer uma mensagem alertando o erro e apresentando a quantidade de tentativas que ainda restam.
 */
package cap03;

import javax.swing.JOptionPane;

public class Exerc03 {
    public Exerc03() {
        String origLogin = "java08";
        String origSenha = "java08";
        int tentativas = 3;
        boolean logado = false;
        while (tentativas > 0 && !logado) {
            String login = JOptionPane.showInputDialog("Forneça seu login:");
            String senha = JOptionPane.showInputDialog("Forneça sua senha:");
            if (login.equals(origLogin) && senha.equals(origSenha)) {
                JOptionPane.showMessageDialog(null, "Login e senha aceitos!");
                logado = true;
            } else {
                tentativas--;
                JOptionPane.showMessageDialog(null, "Falha, verifique login e senha! \nVocê tem " + tentativas + " tentativa(s)");
            }
        }
    }
}
