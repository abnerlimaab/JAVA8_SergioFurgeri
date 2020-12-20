package cap06;
public class UsaMetodosComArray {
    public static void main(String[] args) {
        double[] numeros = {12.4, 3.4, 9, 7.3, 6.6};
        double maior = MetodosComArray.buscarMaior(numeros);
        System.out.println(maior);
        
        String[] nomes = {"Ivone", "Carlos", "Abner", "Romero"};
        String[] retorno = MetodosComArray.ordenarPalavras(nomes);
        for (String nome : retorno) {
            System.out.println(nome);
        }
    }
}
