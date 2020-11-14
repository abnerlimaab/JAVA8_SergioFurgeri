/*
Exercício Proposto: Elabore uma classe que apresente uma espécie de menu usando JOptionPane. Para cada seção escolhida, execute um dos exercícios anteriores.
 */
package cap03;

import javax.swing.JOptionPane;

public class Exer05 {
    public static void main(String[] args) {
        Object menuOp[] = {"Exercício 1", "Exercício 2", "Exercício 3", "Exercício 4"};
        String opcao = (String) JOptionPane.showInputDialog(null, "Selecione o exercício\n", "Menu", JOptionPane.INFORMATION_MESSAGE, null, menuOp, "Exercício q");
        switch (opcao) {
            case "Exercício 1":
                Exerc01 ex1 = new Exerc01();
                break;
                
            case "Exercício 2":
                Exerc02 ex2 = new Exerc02();
                break;
                
            case "Exercício 3":
                Exerc03 ex3 = new Exerc03();
                break;
                
            case "Exercício 4":
                Exerc04 ex4 = new Exerc04();
                break;
        }
    }
}
