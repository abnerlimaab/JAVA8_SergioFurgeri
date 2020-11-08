package cap02;

import java.util.Scanner;

public class EntradaComScanner {
    public static void main(String[] args) {
        float largura, comprimento, area, perimetro;
        Scanner s;
        
        try{
            System.out.println("Entre com o comprimento:");
            s = new Scanner(System.in);
            comprimento = s.nextFloat();
            
            System.out.println("Entre com a largura:");
            s = new Scanner(System.in);
            largura = s.nextFloat();
            
            area = comprimento * largura;
            perimetro = comprimento * 2 + largura * 2;
            System.out.println("Área do retângulo: " + area);
            System.out.println("Perimetro do retângulo: " + perimetro);
        } catch (NumberFormatException erro) {
            System.out.println("Houve um erro na conversão, digite apenas valores númericos");
            System.out.println("Erro: " + erro.toString());
        }
    }
}
