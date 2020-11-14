package cap03;
public class Relogio {
    public static void main(String[] args) {
        for (int hora = 0; hora < 24; hora++) {
            for (int minutos = 0; minutos < 60; minutos++) {
                for (int segundos = 0; segundos < 60; segundos++) {
                    System.out.println(hora + " hrs : " + minutos + " min : " + segundos + "seg");
                    try {
                        Thread.sleep(1000);
                        if (segundos == 10) System.exit(0);
                    } catch (InterruptedException erro) {
                        System.out.println("Erro: " + erro.toString());
                    }
                }
            }
        }
    }
}
