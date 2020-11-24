/*
 * Crie uma classe que armazene os 12 meses do ano em um array. A seguir, gere um valor randômico entre 0 e 11 e apresente o mês correspondente ao valor sorteado. Considere que o valor 0 corresponde ao mês de Janeiro e o valor 11 a Dezembro.
 */
package cap05;
public class Exerc02 {
    public static void main(String[] args) {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abríl", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        for (int i = 0; i < 10; i++) {
            int mes = (int) (Math.random() * 12);
            System.out.println(meses[mes]);
        }
    }
}
