package cap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exerc01 {
    public static void main(String[] args) {
        float vlrProduto, desconto, vlrDesconto, prodDesconto;
        String s;
        BufferedReader n;
        
        try {
            System.out.println("Informe o valor do produto:");
            n = new BufferedReader(new InputStreamReader(System.in));
            s = n.readLine();
            vlrProduto = Float.parseFloat(s);
            
            System.out.println("Informe o percentual de desconto:");
            n = new BufferedReader(new InputStreamReader(System.in));
            s = n.readLine();
            desconto = Float.parseFloat(s);
            
            vlrDesconto = vlrProduto * desconto / 100;
            prodDesconto = vlrProduto - vlrDesconto;
            
            System.out.println("Desconto: " + vlrDesconto);
            System.out.println("Preço final: " + prodDesconto);
        } catch (IOException erro) {
            System.out.println("Informe apenas números. ERRO: " + erro);
        } catch (NumberFormatException erro) {
            System.out.println("Erro de conversão. ERRO: " + erro);
        }
    }
}
