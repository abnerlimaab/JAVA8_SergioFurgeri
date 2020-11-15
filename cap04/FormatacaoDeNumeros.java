package cap04;

import java.text.DecimalFormat;

public class FormatacaoDeNumeros {
    public static void main(String[] args) {
        short idade = 38;
        System.out.println("Idade: " + new DecimalFormat("000").format(idade));
        int quantidade = 9750;
        System.out.println("Quantidade: " + new DecimalFormat("#0,000").format(quantidade));
        long estoque = 198564;
        System.out.println("Estoque: " + new DecimalFormat("#,##0,000").format(estoque));
        float altura = 1.74f;
        System.out.println("Altura: " + new DecimalFormat("0,00").format(altura));
        double peso = 70.25;
        System.out.println("Peso: " + new DecimalFormat("#0,00").format(peso));
        String valorEmReais = "2563.75";
        System.out.println("Valor em Real: " + new DecimalFormat("R$ #,##0.00").format(Double.parseDouble(valorEmReais)));
    }
}
