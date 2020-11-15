package cap04;

import java.util.Scanner;

public class MostrarLetras {
    public static void main(String[] args) throws InterruptedException {
        System.out.print("Forneça uma palavra: ");
        String palavra = new Scanner(System.in).nextLine();
        System.out.println("");
        
        for (int i = 0; i < palavra.length(); i++) {
            System.out.print(palavra.charAt(i) + " ");
            Thread.sleep(700);
        }
        System.out.println("");
        
        for (int i = palavra.length()-1; i >= 0; i--) {
            System.out.print(palavra.charAt(i) + " ");
            Thread.sleep(700);
        }
    }
}
