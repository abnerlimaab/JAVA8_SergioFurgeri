package cap06.Exerc02;

import java.util.Scanner;

public class UsaContagem {
    public static void main(String[] args) throws InterruptedException {
        int inicio, fim, pausa;
        Scanner teclado = new Scanner(System.in);
        System.out.println("USANDO MÉTODOS DE CONTAGEM COM SOBRECARGA");
        while (true) {
            System.out.println("\n---------------------------------------------------"
                    + "\nEscolha um método:"
                    + "\n1 - Contar até 10"
                    + "\n2 - Contar até um valor informado"
                    + "\n3 - Contar a partir de ... até ..."
                    + "\n4 - Contar a partir de ... até ... a cada ... segundos"
                    + "\n5 - Encerrar");
            int op = Integer.parseInt(teclado.nextLine());
            switch (op) {
                case 1: 
                    Contagem.contar();
                    break;
                case 2: 
                    System.out.print("Defina o limite da contagem: ");
                    fim = Integer.parseInt(teclado.nextLine());
                    Contagem.contar(fim);
                    break;
                case 3:
                    System.out.println("Defina o início da contagem: ");
                    inicio = Integer.parseInt(teclado.nextLine());
                    System.out.println("Defina o limite da contagem: ");
                    fim = Integer.parseInt(teclado.nextLine());
                    Contagem.contar(inicio, fim);
                    break;
                case 4:
                    System.out.println("Defina o início da contagem: ");
                    inicio = Integer.parseInt(teclado.nextLine());
                    System.out.println("Defina o limite da contagem: ");
                    fim = Integer.parseInt(teclado.nextLine());
                    System.out.println("Defina o intervalo de tempo da contagem em segundos");
                    pausa = Integer.parseInt(teclado.nextLine());
                    Contagem.contar(inicio, fim, pausa);
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
