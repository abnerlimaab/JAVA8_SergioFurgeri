package cap09.Exercicios;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GuiMovImagem extends JFrame {
    private JButton btMostrar, btOcultar;
    private JPanel pnBotoes;
    private JLabel lbImg;
    private ImageIcon img;

    public GuiMovImagem() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setSize(500, 500);
        setLayout(new BorderLayout());
        setResizable(false);
        pnBotoes = new JPanel(new GridLayout(1, 2));
        btMostrar = new JButton("Mostrar");
        btOcultar = new JButton("Ocultar");
        pnBotoes.add(btMostrar);
        pnBotoes.add(btOcultar);
        add("North", pnBotoes);
        img = new ImageIcon(getClass().getResource("/cap09/Exercicios/imagens/java.jpg"));
        img.setImage(img.getImage().getScaledInstance(100, 100, 1));
        lbImg = new JLabel(img);
        lbImg.setVisible(false);
        add(lbImg);
    }

    private void definirEventos() {
        btMostrar.addActionListener((ActionEvent e) -> {
            int posX = (int) (Math.random() * 1000 * 0.4);
            int posY = (int) (Math.random() * 1000 * 0.4);
            lbImg.setBounds(posX, posY, 100, 100);
            lbImg.setVisible(true);
        });
        btOcultar.addActionListener((ActionEvent e) -> {
            lbImg.setVisible(false);
        });
    }
    
    public static void main(String[] args) {
        JFrame janela = new GuiMovImagem();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
    
}
