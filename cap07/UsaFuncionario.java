package cap07;
public class UsaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setName("Lucas");
        funcionario.setRg("25-654-321");
        funcionario.setCartao("RH125");
        System.out.println(funcionario.getName());
        System.out.println(funcionario.getRg());
        System.out.println(funcionario.getCartao());
    }
}
