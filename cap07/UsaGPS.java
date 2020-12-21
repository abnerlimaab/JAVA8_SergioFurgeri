package cap07;
public class UsaGPS {
    public static void main(String[] args) {
        GPS gps1 = new GPS();
        gps1.mostrar();
        gps1.setIdioma("English");
        gps1.setRota("RIO - FORTALEZA");
        gps1.mostrar();
        
        GPS gps2 = new GPS("RIO - SÃO PAULO");
        gps2.mostrar();
    }
}
