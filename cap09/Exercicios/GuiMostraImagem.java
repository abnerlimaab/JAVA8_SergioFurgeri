package cap09.Exercicios;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class GuiMostraImagem extends JFrame {
    private JButton bt;
    private ImageIcon img;
    private JLabel lbImg;

    public GuiMostraImagem() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setTitle("Mostrar imagem");
        setLayout(new BorderLayout());
        setSize(600, 400);
        bt = new JButton("Passe o mouse...");
        add("North", bt);
        img = new ImageIcon(getClass().getResource("/cap09/Exercicios/imagens/java.jpg"));
        lbImg = new JLabel(img);
        lbImg.setBounds((getSize().width - img.getIconWidth()) / 2, 30, img.getIconWidth(), img.getIconHeight());
        lbImg.setVisible(false);
        add(lbImg);
    }

    private void definirEventos() {
        bt.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent me) {
            }

            public void mousePressed(MouseEvent me) {
            }

            public void mouseReleased(MouseEvent me) {
            }

            public void mouseEntered(MouseEvent me) {
                lbImg.setVisible(true);
            }

            public void mouseExited(MouseEvent me) {
                lbImg.setVisible(false);
            }
        });
    }
    
    public static void main(String[] args) {
        JFrame janela = new GuiMostraImagem();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
