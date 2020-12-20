package cap06;
public class UsaMetodos {
    public static void main(String[] args) {
        MetodosSemRetorno.imprimirTexto("Usando métodos de outras classes");
        MetodosSemRetorno.somar(20, 30);
        System.out.println(MetodosComRetorno.mostrarDiaPorExtenso(5));
        System.out.println(MetodosComRetorno.contarLetrasA("Macacada"));
    }
}
