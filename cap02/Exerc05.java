package cap02;

import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args) {
        int idade, tmpContribuicao;
        String sexo;
        int apIdadeM = 65, apIdadeF = 60, apContrM = 35, apContrF = 30;
        Scanner s;
        
        try{
            System.out.println("Informe o sexo: \n M - Masculino \n F - Feminino");
            s = new Scanner(System.in);
            sexo = s.nextLine();
            
            System.out.print("Informe a idade: ");
            s = new Scanner(System.in);
            idade = s.nextInt();
            
            System.out.print("\nInforme o tempo de contribuição: ");
            s = new Scanner(System.in);
            tmpContribuicao = s.nextInt();
            
            if (sexo.equals("F")) {
                if (idade >= apIdadeF || tmpContribuicao >= apContrF) {
                    System.out.println("\nVocê já tem direito a aposentadoria");
                } else {
                    System.out.println("\nVocê não tem direito a aposentadoria");
                }
            } else {
                if (idade >= apIdadeM || tmpContribuicao >= apContrM) {
                    System.out.println("\nVocê já tem direito a aposentadoria");
                } else {
                    System.out.println("\nVocê não tem direito a aposentadoria");
                }
            }
        } catch (NumberFormatException erro) {
            System.out.println("Informe apenas números. ERRO: " + erro);
        }
    }
}
