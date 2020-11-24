/*
 * Faça uma classe contendo dois arrays do tipo inteiro, um chamado par e outro chamado impar. Cada array deve conter 10 elementos. A seguir, faça um laço de repetição com 10 iterações e que contenha internamente a geração randômica de números entre 1 e 20. Se o valor gerado for par, armazene no array chamado par, caso contrário, no array chamado impar. Ao final, apresente o conteúdo de cada um dos arrays.
 */
package cap05;
public class Exerc04 {
    public static void main(String[] args) {
        int[] pares = new int[10];
        int[] impares = new int[10];
        int contPar = 0, contImpar = 0;
        while (contPar < pares.length || contImpar < impares.length) {
            int aux = (int) (Math.random() * 21);
            if (aux % 2 == 1 && contImpar < impares.length) {
                impares[contImpar] = aux;
                contImpar++;
            }
            else if (aux != 0 && aux % 2 == 0 && contPar < pares.length) {
                pares[contPar] = aux;
                contPar++;
            }
        }
        String outPares = "";
        String outImpares = "";
        for (int par : pares) {
            outPares += par + "\t";
        }
        for (int impar : impares) {
            outImpares += impar + "\t";
        }
        System.out.println("Pares:   \t" + outPares);
        System.out.println("Impares: \t" + outImpares);
    }
}
