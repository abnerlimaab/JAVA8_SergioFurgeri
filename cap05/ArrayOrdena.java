package cap05;

import java.util.Arrays;

public class ArrayOrdena {
    public static void main(String[] args) {
        String[] nomes = {"Lucas", "Daniel", "Julia", "Tatiana", "Isabela", "Mateus"};
        Arrays.sort(nomes);
        System.out.print("Nomes: ");
        for (String nome: nomes) {
            System.out.print(nome + ", ");
        }
    }
}
