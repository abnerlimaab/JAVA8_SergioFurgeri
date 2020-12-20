package cap06.Exerc01;

/**
 * Faça uma classe chamada Mes que possua um método chamado getMesPorExtenso que recebe um número inteiro referente ao mês do ano, um código referente ao idioma (1 para português e 2 para inglês) e retorna o mês por extenso.
 */
public class Mes {
    static String[][] mesList = {
        {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"},
        {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}};
    /**
     * 
     * @param mes = Indíce do mês
     * @param idioma = Indíce do idioma de retorno (1 - PT | 2 - EN)
     * @return Retorna o mês por extenso
     */
    public static String getMesPorExtenso(int mes, int idioma) {
        return mesList[idioma-1][mes-1];
    };
}
