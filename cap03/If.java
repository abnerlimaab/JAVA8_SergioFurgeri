package cap03;

import javax.swing.JOptionPane;

public class If {
    public static void main(String[] args) {
        Object[] op = {"Masculino", "Feminino"};
        String resp = (String) JOptionPane.showInputDialog(null, "Selecione o sexo: \n", "Pesquisa", JOptionPane.QUESTION_MESSAGE, null, op, "Masculino");
        /**
         * Local em que a caixa de mensagem será exibida = null
         * Mensagem que será exibida = "Selecione o sexo: "
         * Título da mensagem = "Pesquisa"
         * Ícone exibido na caixa de mensagem = QUESTION_MESSAGE -> Valor inteiro constante
         * Ícone externo = null
         * Lista de opções = op -> Array de objetos
         * Opção default = "Masculino"
         */
        if (resp == null) JOptionPane.showMessageDialog(null, "Você pressionou cancel.");
        if (resp.equals("Masculino")) JOptionPane.showMessageDialog(null, "Você é homem.");
        if (resp.equals("Feminino")) JOptionPane.showMessageDialog(null, "Você é mulher.");
        System.exit(0);
    }
}
