package cap06.Exerc02;
public class Contagem {
    public static void contar() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    };
    public static void contar(int fim) {
        for (int i = 1; i <= fim; i++) {
            System.out.print(i + " ");
        }
    };
    public static void contar(int inicio, int fim) {
        for (int i = inicio; i <= fim; i++) {
            System.out.print(i + " ");
        }
    };
    public static void contar(int inicio, int fim, int pausa) throws InterruptedException {
        for (int i = inicio; i <= fim; i++) {
            System.out.print(i + " ");
            Thread.sleep(pausa*1000);
        }
    }
}
