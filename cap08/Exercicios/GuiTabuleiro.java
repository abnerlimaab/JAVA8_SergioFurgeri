package cap08.Exercicios;

import java.awt.*;
import javax.swing.JInternalFrame;
import javax.swing.*;

public class GuiTabuleiro extends JInternalFrame {
    private JButton[] botoes = new JButton[64];

    public GuiTabuleiro() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        setTitle("TABULEIRO");
        setSize(800, 600);
        setResizable(true);
        setClosable(true);
        setMaximizable(true);
        setIconifiable(true);
        setLayout(new GridLayout(8, 8));
        for (int i = 0; i <= 63; i++) {
            botoes[i] = new JButton();
            int linha = (int) i / 8;
            if (linha % 2 == 0 && i % 2 != 0) botoes[i].setBackground(Color.black);
            else if (linha % 2 == 0 && i % 2 == 0) botoes[i].setBackground(Color.white);
            else if (linha % 2 != 0 && i % 2 == 0) botoes[i].setBackground(Color.black);
            else if (linha % 2 != 0 && i % 2 != 0)botoes[i].setBackground(Color.white);
            add(botoes[i]);
        }
        setVisible(true);
    }
    
}
