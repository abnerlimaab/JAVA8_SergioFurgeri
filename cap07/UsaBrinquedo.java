package cap07;
public class UsaBrinquedo {
    public static void main(String[] args) {
        Brinquedo brinq1 = new Brinquedo();
        brinq1.mostrar();
        
        Brinquedo brinq2 = new Brinquedo("Carro", 9.99f);
        brinq2.setFaixaEtaria("acima de 10");
        brinq2.mostrar();
    }
}
