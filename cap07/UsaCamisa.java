package cap07;
public class UsaCamisa {
    public static void main(String[] args) {
        Camisa camisa = new Camisa();
        System.out.println(camisa.getClass());
        System.out.println(camisa.getClass().getSimpleName());
        System.out.println(camisa.hashCode());
    }
}
