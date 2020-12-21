package cap07;
public class UsaVeiculo {
    public static void main(String[] args) {
        Automovel automovel = new Automovel();
        automovel.ligar();
        automovel.acelerar();
        System.out.println(automovel.velocidade);
        automovel.desligar();
        
        Aviao aviao = new Aviao();
        aviao.ligar();
        aviao.acelerar();
        System.out.println(aviao.velocidade);
        aviao.desligar();
    }
}
