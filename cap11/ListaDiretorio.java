package cap11;

import java.io.File;

import javax.swing.JOptionPane;

public class ListaDiretorio {
    public static void main(String[] args) {
        String path = JOptionPane.showInputDialog("Forneça o caminho do diretório: \nUtilize / entre os diretórios");
        File dir = new File(path);
        if (dir.isDirectory()) {
            System.out.println("Conteúdo do diretório " + path);
            String s[] = dir.list();
            for (String str : s) {
                System.out.println(str);
            }
        } else System.out.println(path + " não é um diretório válido.");
    }
}
