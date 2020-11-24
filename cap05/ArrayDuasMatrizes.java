package cap05;

import java.text.DecimalFormat;

public class ArrayDuasMatrizes {
    public static void main(String[] args) throws InterruptedException {
        int[][][] inteiros = new int[5][5][2];
        int somaImpares = 0, somaPares = 0;
        // Alimenta a dimensão da matriz de números impares
        for (int linha = 0; linha < inteiros.length; linha++) {
            for (int coluna = 0; coluna < inteiros[linha].length; coluna++) {
                int aux = (int) (Math.random() * 100);
                if (aux != 0 && aux % 2 == 1) {
                 inteiros[linha][coluna][0] = aux;
                 somaImpares += aux;
                } else coluna--;
           }
        }
        // Alimenta a dimensão da matriz de números pares
        for (int linha = 0; linha < inteiros.length; linha++) {
            for (int coluna = 0; coluna < inteiros[linha].length; coluna++) {
                int aux = (int) (Math.random() * 100);
                if (aux != 0 && aux % 2 == 0) {
                 inteiros[linha][coluna][1] = aux;
                 somaPares += aux;
                } else coluna--;
           }
        }
        // Imprime a matriz no console
        for (int matriz = 0; matriz < 2; matriz++) {
            if (matriz == 0) System.out.println("Matriz de números impares:");
            else System.out.println("\n\nMatriz de números pares:");
            for (int linha = 0; linha < inteiros.length; linha++) {
                System.out.println("");
                for (int coluna = 0; coluna < inteiros[linha].length; coluna++){
                    System.out.print(new DecimalFormat("00").format(inteiros[linha][coluna][matriz]) + "\t");
                }
            }
        }
        System.out.println("\n\nSoma Impares = " + somaImpares + "\nSoma Pares = " + somaPares);
    }
}
