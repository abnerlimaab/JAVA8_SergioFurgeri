package cap03;

import javax.swing.JOptionPane;

public class IfResumido {
    public static void main(String[] args) {
        int a = 15, b = 10, maior;
        if (a > b) maior = a;
        else maior = b;
        JOptionPane.showMessageDialog(null, "If comum\n Maior: " + maior);
        
        int c = 10, d = 8;
        maior = (c > d) ? c : d;
        JOptionPane.showMessageDialog(null, "If resumido\n Maior: " + maior);
    }
}
