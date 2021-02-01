package cap10.Exercicios;

import java.time.*;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class DiferencaFusos {
    public static void main(String[] args) {
        ZoneId fusoSP = ZoneId.of("America/Sao_Paulo");
        ZoneId fusoNY = ZoneId.of("America/New_York");
        ZonedDateTime agoraSP = ZonedDateTime.now(fusoSP);
        ZonedDateTime agoraNY = ZonedDateTime.now(fusoNY);
        int horaSP = ZonedDateTime.now(fusoSP).getHour();
        int horaNY = ZonedDateTime.now(fusoNY).getHour();
        int dif = horaSP - horaNY;
        JOptionPane.showMessageDialog(null, "São Paulo: " + horaSP + "h\n" + "Nova York: " + horaNY + "h\n" + "Diferença: " + dif + "h", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
    }
}
