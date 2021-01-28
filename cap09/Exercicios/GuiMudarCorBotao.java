package cap09.Exercicios;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class GuiMudarCorBotao extends JFrame {
    private JButton btTrocar;

    public GuiMudarCorBotao() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setTitle("Muda cor do botão");
        setSize(150, 150);
        setBackground(Color.black);
        setLayout(null);
        setResizable(false);
        btTrocar = new JButton("Trocar");
        btTrocar.setBackground(Color.yellow);
        btTrocar.setBounds(25, 25, 100, 50);
        add(btTrocar);
    }

    private void definirEventos() {
        btTrocar.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent me) {
            }

            public void mousePressed(MouseEvent me) {
            }

            public void mouseReleased(MouseEvent me) {
            }

            public void mouseEntered(MouseEvent me) {
                btTrocar.setBackground(Color.orange);
            }

            public void mouseExited(MouseEvent me) {
                btTrocar.setBackground(Color.yellow);
            }
        });
    }
    
    public static void main(String[] args) {
        JFrame janela = new GuiMudarCorBotao();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
}
