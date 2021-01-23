package cap08;

import java.awt.event.*;
import javax.swing.*;

public class GuiBotao extends JPanel {
    private JButton btMensagem, btTeimoso;
    private ImageIcon imageIcon1;
    
    public GuiBotao() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);
        imageIcon1 = new ImageIcon("java.jpg");
        btMensagem = new JButton("Mensagem", imageIcon1);
        btMensagem.setBounds(50, 20, 140, 38);
        btMensagem.setMnemonic(KeyEvent.VK_M);
        btMensagem.setToolTipText("Clique aqui para ver a mensagem");
        btTeimoso = new JButton("Teimoso");
        btTeimoso.setBounds(50, 70, 100, 25);
        add(btMensagem);
        add(btTeimoso);
    }

    private void definirEventos() {
        btMensagem.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(null, "Botão mensagem");});
        btTeimoso.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(null, "Botão teimoso");});
        btTeimoso.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent me) {
            }

            public void mousePressed(MouseEvent me) {
            }

            public void mouseReleased(MouseEvent me) {
            }

            public void mouseEntered(MouseEvent me) {
                btTeimoso.setBounds(50, 120, 100, 25);
            }

            public void mouseExited(MouseEvent me) {
                btTeimoso.setBounds(50, 70, 100, 25);
            }
        });
    }
}
