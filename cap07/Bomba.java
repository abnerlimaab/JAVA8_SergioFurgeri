package cap07;
public class Bomba {
    private boolean status;
    
    public void ligar(int tempo) throws InterruptedException {
        this.status = true;
        System.out.println("Desligando em...");
        while (tempo > 0) {
            System.out.print(tempo + " ");
            tempo--;
            Thread.sleep(1000);
        }
        desligar();
    }
    
    public void desligar() {
        this.status = false;
    }
}
