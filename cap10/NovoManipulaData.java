package cap10;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;


public class NovoManipulaData {
    public static void main(String[] args) {
        //Parte 1
        LocalDate nascimento = LocalDate.of(1960, Month.MARCH, 21);
        LocalDate morte = LocalDate.of(1994, Month.MAY, 1);
        Period periodo = Period.between(nascimento, morte);
        System.out.println("Anos: " + periodo.getYears());
        System.out.println("Meses: " + periodo.getMonths());
        System.out.println("Dias: " + periodo.getDays());
        // Parte 2
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime agora = LocalDateTime.now();
        String dataHora = agora.format(dtf);
        System.out.println(dataHora);
        // Parte 3
        LocalDateTime hoje = LocalDateTime.now();
        dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(new Locale("pt", "br"));
        System.out.println(dataHora);
        // Parte 4
        LocalDate dataLocal = LocalDate.now();
        LocalDate vencimento = dataLocal.plusDays(10);
        dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String novaData = vencimento.format(dtf);
        System.out.println(novaData);
        // Parte 5
        Instant inicio = Instant.now();
        for (int a = 0; a < 999999999; a++);
        Instant fim = Instant.now();
        System.out.println(inicio);
        System.out.println(fim);
        // Parte 6
        Duration duracao = Duration.between(inicio, fim);
        long duracaoMilisegundos = duracao.toMillis();
        System.out.println(duracaoMilisegundos);
        // Parte 7
        ZoneId fusoSP = ZoneId.of("America/Sao_Paulo");
        ZoneId fusoNY = ZoneId.of("America/New_York");
        ZonedDateTime agoraSP = ZonedDateTime.now(fusoSP);
        ZonedDateTime agoraNY = ZonedDateTime.now(fusoNY);
        System.out.println(agoraSP);
        System.out.println(agoraNY);
    }
}
