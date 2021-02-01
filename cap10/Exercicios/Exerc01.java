/**
 * Crie uma classe que imprima uma mensagem diferente em tela dependendo do horário do dia.
 */

package cap10.Exercicios;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class Exerc01 {
    public Date agora;

    public Exerc01() {
        agora = new Date();
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(agora);
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        int diaDaSemana = calendario.get(Calendar.DAY_OF_WEEK);
        String formato = "EEEE, HH";
        String mensagem = "";
        DateFormat dateFormat = new SimpleDateFormat(formato);
        if (diaDaSemana >= 1 && diaDaSemana <= 5 && hora >= 8 && hora <= 17) mensagem = dateFormat.format(agora) + "h - Estamos atendendo";
        else mensagem = dateFormat.format(agora) + "h - Estamos fechados";
        JOptionPane.showMessageDialog(null, mensagem, "Mensagem", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        Exerc01 info = new Exerc01();
    }
}
