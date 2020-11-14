package cap03;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class UsoDoThrows {
    public static void main(String[] args) throws IOException {
        String frase = JOptionPane.showInputDialog("Entre com uma frase:");
        try {
            FileWriter file = new FileWriter("c:/temp/frases.txt", true);
            PrintWriter out = new PrintWriter(file);
            out.print(frase + "\n");
            file.close();
            out.close();
            JOptionPane.showMessageDialog(null, "Frase armazenada no arquivo!");
        } catch (FileNotFoundException erro) {
            JOptionPane.showMessageDialog(null, "Verifique se a pasta C:/temp existe.\n ERRO: " + erro);
        }
    }
}
