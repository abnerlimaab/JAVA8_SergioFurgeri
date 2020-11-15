package cap04;
public class BuscaLetraNaFrase {
    public static void main(String[] args) {
        String frase = "Livro Java 8 - Ensino Didático";
        char caract = 'a';
        System.out.println("Frase: " + frase
        + "\nÍndices: " + frase.indexOf(caract)
        + ", " + frase.indexOf(caract, 10)
        + ", " + frase.indexOf("Ensino")
        + ", " + frase.indexOf("Java", 15));
    }
}
