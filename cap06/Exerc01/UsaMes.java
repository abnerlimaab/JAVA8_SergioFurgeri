package cap06.Exerc01;

import java.util.Scanner;

public class UsaMes {
    public static void main(String[] args) throws Exception {
        try {
            System.out.print("Meses por extenso... \nInforme o número do mês desejado: ");
            int mes = Integer.parseInt(new Scanner(System.in).nextLine());
            if (mes < 1 || mes > 12) throw new Exception("Número de mês informado não é válido.");
            System.out.println("\nInforme o ídioma de retorno (1 - Português | 2 - Inglês)");
            int idioma = Integer.parseInt(new Scanner(System.in).nextLine());
            if (idioma < 1 || idioma > 2) throw new Exception("Indice de idioma inválido.");
            System.out.println(Mes.getMesPorExtenso(mes, idioma));
        } catch (NumberFormatException erro) {
            System.out.println("Erro de conversão! Informe apenas números inteiros");
        } catch (Exception erro) {
            System.out.println(erro);
        }
    }
}
