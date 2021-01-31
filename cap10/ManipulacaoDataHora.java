package cap10;

import java.util.Date;
import java.util.Calendar;
import javax.swing.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ManipulacaoDataHora extends JFrame {
    private JTextArea taTexto;
    private JButton btMostrar;
    private Date agora;
    final long MILI_SEGUNDOS_POR_DIA = 1000 * 60 * 60 * 24;

    public static void main(String[] args) {
        JFrame janela = new ManipulacaoDataHora();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    public ManipulacaoDataHora() {
        inicializarComponentes();
        definirEventos();
    }

    public void inicializarComponentes() {
        setTitle("Manipulação de Data e Hora");
        setBounds(100, 100, 300, 200);
        taTexto = new JTextArea();
        btMostrar = new JButton("Mostrar");
        add(taTexto, "Center");
        add(btMostrar, "North");
        agora = new Date();
    }

    public void definirEventos() {
        btMostrar.addActionListener((ActionEvent e) -> {
            calcularData();
        });
    }

    public void usaGetTime() {
        long tempo = agora.getTime();
        Date novaData = new Date(agora.getTime() + (MILI_SEGUNDOS_POR_DIA * 10));
        taTexto.setText("Milisegundos desde 1970: " + tempo + 
            "\nDias: " + tempo / MILI_SEGUNDOS_POR_DIA +
            "\nMeses: " + tempo / MILI_SEGUNDOS_POR_DIA / 30 +
            "\nAnos: " + tempo / MILI_SEGUNDOS_POR_DIA / 365 +
            "\nData: " + novaData);
    }

    public void usaDateFormat() {
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
        taTexto.setText("Data normal: " + agora +
            "\nData formatada: " + dateFormat.format(agora));
    }

    public void usaSimpleDateFormat() {
        String formato = "dd/MM/yyyy, HH:mm:ss";
        DateFormat dateFormat = new SimpleDateFormat(formato);
        taTexto.setText("Data normal: " + agora +
            "\nData formatada: " + dateFormat.format(agora));
    }
    
    public void usaCalendar() {
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(agora);
        int dia = calendario.get(Calendar.DATE);
        int mes = calendario.get(Calendar.MONTH);
        int ano = calendario.get(Calendar.YEAR);
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        int minuto = calendario.get(Calendar.MINUTE);
        int segundo = calendario.get(Calendar.SECOND);
        int diaDaSemana = calendario.get(Calendar.DAY_OF_WEEK);
        String semana = "";
        if (diaDaSemana == Calendar.SATURDAY || diaDaSemana == Calendar.SUNDAY) semana = "Fim de semana";
        else semana = "Dia útil";
        taTexto.setText("Dia: " + dia
                        + "\nMês: " + mes
                        + "\nAno: " + ano
                        + "\nHora: " + hora
                        + "\nMinuto: " + minuto
                        + "\nSegundo: " + segundo
                        + "\nDia da semana: " + diaDaSemana
                        + "\n" + semana);  
    }

    public void mensagemDinamica() {
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(agora);
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        int minuto = calendario.get(Calendar.MINUTE);
        int segundo = calendario.get(Calendar.SECOND);
        String msg = "Boa noite!";
        if (hora < 6) msg = "Boa madrugada!";
        else if (hora < 12) msg = "Bom dia!";
        else if (hora < 18) msg = "Boa tarde!";
        taTexto.setText("Data atual: " + df.format(agora)
                        + "\nHora atual: " + hora + ":" + minuto + ":" + segundo
                        + "\n" + msg);
    }

    public void calcularData() {
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        Calendar calendario1 = Calendar.getInstance();
        Calendar calendario2 = Calendar.getInstance();
        Calendar calendario3 = Calendar.getInstance();
        Calendar calendario4 = Calendar.getInstance();
        try {
            Date data1 = df.parse("01/01/2015");
            calendario1.setTime(data1);
            Date data2 = df.parse("01/03/2015");
            calendario2.setTime(data2);
            long diaData1 = calendario1.getTimeInMillis();
            long diaData2 = calendario2.getTimeInMillis();
            long dif = (diaData2 - diaData1) / MILI_SEGUNDOS_POR_DIA;
            calendario2.add(Calendar.DAY_OF_YEAR, 30);
            Date trinta = calendario2.getTime();
            Date data3 = df.parse("31/12/2014");
            calendario3.setTime(data3);
            calendario4.setTime(data3);
            calendario3.add(Calendar.DAY_OF_YEAR, 1);
            calendario4.roll(Calendar.DAY_OF_YEAR, 1);
            Date dia1 = calendario3.getTime();
            Date dia2 = calendario4.getTime();
            taTexto.setText("Data 1: " + df.format(data1)
                            + "\nData 2: " + df.format(data2)
                            + "\nDiferença de dias: " + dif
                            + "\nTrinta dias após data 2: " + df.format(trinta)
                            + "\nDia primeiro com add: " + df.format(dia1)
                            + "\nDia primeiro com roll: " + df.format(dia2));
        } catch (ParseException erro) {
            JOptionPane.showMessageDialog(null, "Data inválida ", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
