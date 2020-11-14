package cap03;

import java.util.Scanner;

public class ContadorWhile {
    public static void main(String[] args) {
        try {
            System.out.print("informe o limite: ");
            int limite = Integer.parseInt(new Scanner(System.in).nextLine());
            int contador = limite;
            while (contador >= 0) {
                System.out.print(contador + " ");
                contador--;
            }
            System.out.println("\nContador regressivo finalizado.");
            contador = 0;
            do {
                System.out.print(contador + " ");
                contador++;
            } while (contador <= limite);
            System.out.println("\nContador progressivo finalizado");
        } catch (NumberFormatException erro) {
            System.out.println("Limite deve ser do tipo inteiro \nERRO: " + erro);
        }
    }
}
