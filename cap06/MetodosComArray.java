package cap06;

import java.util.Arrays;

public class MetodosComArray {
    /**
     * Recebe um array de números e retorna o maior deles. O array deve conter pelo menos um elemento.
     * 
     * @param numeros = os numeros a serem comparados
     * @return = o maior numero
     */
    public static double buscarMaior(double[] numeros) {
        double maior = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            maior = Math.max(maior, numeros[i]);
        }
        return maior;
    }
    /**
     * Recebe um array de palavras e o retorna em ordem crescente
     * 
     * @param palavras = as palavras a serem ordenadas
     * @return = o array ordenado
     */
    public static String[] ordenarPalavras(String[] palavras) {
        Arrays.sort(palavras);
        return palavras;
    }
}
