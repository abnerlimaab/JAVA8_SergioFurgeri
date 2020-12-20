package cap06;
public class MetodosComRetorno {
    public static void main(String[] args) {
        System.out.println(MetodosComRetorno.somar(2, 3));
        System.out.println(MetodosComRetorno.mostrarPares(100));
        System.out.println(MetodosComRetorno.mostrarDiaPorExtenso(3));
        System.out.println(MetodosComRetorno.contarLetrasA("Semana"));
    }
    public static double somar(double a, double b) {
        return a + b;
    }
    public static String mostrarPares(int valor) {
        String retorno = "";
        for (int a = 0; a <= valor; a = a + 2) {
            retorno += a + " ";
        }
        return retorno;
    }
    public static String mostrarDiaPorExtenso(int dia) {
        String extenso = "Domingo";
        if (dia == 2) extenso = "Segunda";
        else if (dia == 3) extenso = "Terça";
        else if (dia == 4) extenso = "Quarta";
        else if (dia == 5) extenso = "Quinta";
        else if (dia == 6) extenso = "Sexta";
        else if (dia == 7) extenso = "Sábado";
        else extenso = "Dia não reconhecido";
        return extenso;
    }
    public static int contarLetrasA(String palavra) {
        int quantidade = 0;
        palavra = palavra.toUpperCase();
        for (int a = 0; a < palavra.length(); a++) {
            if (palavra.charAt(a) == 'A') quantidade++;
        }
        return quantidade;
    }
}
