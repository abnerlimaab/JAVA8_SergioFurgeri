/*
 * Usando um array unidimensional de 10 elementos do tipo String, faça uma classe que simule a ocupação de um estacionamento de veículos. Considere que a posição do array corresponde ao número da vaga e para cada vaga é armazenada a placa do veículo que está estacionado. Sua classe deve conter um laço de repetição simulando um menu que controle a entrada e a saída dos  veículos com as opções: 1-Entrada, 2-Saída, 3- Listar situação atual e 4 - Encerrar o programa. 
Se o usuário escolher 1, solicite o número da vaga e a placa do veículo; 
se escolher 2, solicite o número da vaga que será liberada e armazene o valor branco na posição correspondente ao array;
se escolher 3, liste a situação atual apresentando em tela todos os elementos do array;
quando for 4, encerre o programa.
 */
package cap05;

import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args) {
        String[] vagas = new String[10];
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("### ESTACIONAMENTO ### \n* Menu: "
                    + "\n1 - Entrada"
                    + "\n2 - Saída"
                    + "\n3 - Listar vagas"
                    + "\n4 - Encerrar o programa");
            System.out.print("Opção: ");
            opcao = new Scanner(System.in).nextInt();
            switch (opcao) {
                case 1: // Entrada
                    System.out.print("Informe o nª da vaga: ");
                    int vaga = new Scanner(System.in).nextInt();
                    if (vagas[vaga] != null) {
                        System.out.println("\nERRO! Vaga ocupada!");
                    }
                    else {
                        System.out.print("\nInforme a placa do veículo:");
                        String placa = new Scanner(System.in).nextLine();
                        vagas[vaga] = placa;
                        System.out.println("Vaga locada com sucesso!");
                    }
                    break;
                case 2: // Saída
                    System.out.print("Informe o nª da vaga: ");
                    vaga = new Scanner(System.in).nextInt();
                    vagas[vaga] = null;
                    System.out.println("A vaga está livre.");
                    break;
                case 3: // Listar
                    String out = "Vaga\t Placa\n";
                    for (int i = 0; i < vagas.length; i++) {
                        if (vagas[i] != null) out += i + "\t" + vagas[i] + "\n";
                        else out += i + "\tbranco\n";
                    }
                    System.out.println(out);
                    break;
                case 4: // Encarrar
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! \nTente novamente.");
            }
        }
    }
}
