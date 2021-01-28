package cap09.Exercicios;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GuiEventoCaixaTexto extends JFrame {
    private JLabel lb1;
    private JTextField tf1;

    public GuiEventoCaixaTexto() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);
        setTitle("Evento de Caixa de Texto");
        setSize(400, 100);
        setResizable(false);
        lb1 = new JLabel("Digite algo:");
        lb1.setBounds(20, 20, 100, 20);
        tf1 = new JTextField();
        tf1.setBounds(110, 20, 180, 20);
        add(lb1);
        add(tf1);
    }

    private void definirEventos() {
        tf1.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent ke) {
                if (tf1.getText().length() > 9) {JOptionPane.showMessageDialog(null, "São permitidos apenas 10 carateres.", "Erro", JOptionPane.ERROR_MESSAGE);
                tf1.setText(tf1.getText().substring(0, 9));
                }
            }

            public void keyPressed(KeyEvent ke) {
            }

            public void keyReleased(KeyEvent ke) {
            }
        });
    }
    
    public static void main(String[] args) {
        JFrame janela = new GuiEventoCaixaTexto();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
    
}
