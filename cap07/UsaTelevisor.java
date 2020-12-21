package cap07;
public class UsaTelevisor {
    public static void main(String[] args) {
        Televisor tv = new Televisor();
        tv.trocarCanal(150);
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.trocarCanal(10);
        tv.mostrar();
    }
}
