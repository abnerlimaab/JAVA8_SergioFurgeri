package cap02;

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        int ptsLider, ptsLanterna, difVitorias;
        Scanner s;
        
        try {
            System.out.println("Informe a quantidade de pontos do lider:");
            s = new Scanner(System.in);
            ptsLider = s.nextInt();
            
            System.out.println("Informe a quantidade de pontos do lanterna:");
            s = new Scanner(System.in);
            ptsLanterna = s.nextInt();
            
            if ((ptsLider - ptsLanterna) % 3 == 0) {
                difVitorias = (ptsLider - ptsLanterna) / 3;
            } else {
                difVitorias = (ptsLider - ptsLanterna) / 3 + 1;
            }
            
            System.out.println("O lanterna precisa de " + difVitorias + " vitórias para acompanhar ou passar o Líder.");
        } catch (NumberFormatException erro) {
            System.out.println("Informe apenas números inteiros. ERRO: " + erro);
        }
    }
}
