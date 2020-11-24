/*
 * Uma imagem é formada por pixels. Considere uma imagem com dimensão de 40 x 40 e faça uma classe que contenha um array bidimensional com essas dimensões. A seguir, para cada posição desse array bidimensional armazene um valor aleatório entre 0 e 255 (esses valores correspondem as tonalidades aplicadas sobre a imagem). Apresente em tela os 1600 valores gerados.
 */
package cap05;
public class Exerc03 {
    public static void main(String[] args) {
        int[][] imagem = new int[40][40];
        String out = "";
        for (int x = 0; x < imagem.length; x++){
            for (int y = 0; y < imagem[x].length; y++) {
                imagem[x][y] = (int) (Math.random() * 256);
                out += imagem[x][y] + "\t";
            }
            out += "\n";
        }
        System.out.println(out);
    }
}
