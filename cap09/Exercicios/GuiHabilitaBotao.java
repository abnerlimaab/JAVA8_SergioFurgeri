package cap09.Exercicios;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class GuiHabilitaBotao extends JFrame {
    private JTextField tf1, tf2, tf3;
    private boolean tf1Status, tf2Status, tf3Status;
    private JButton btEnviar;

    public GuiHabilitaBotao() {
        inicializarComponentes();
        definirEventos();
        ativaBotao();
    }

    private void inicializarComponentes() {
        setTitle("Habilita Botão");
        setSize(400, 200);
        setLayout(new GridLayout(4, 1));
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf1Status = false;
        tf2Status = false;
        tf3Status = false;
        btEnviar = new JButton("Enviar");
        btEnviar.setEnabled(false);
        add(tf1);
        add(tf2);
        add(tf3);
        add(btEnviar);
    }

    private void definirEventos() {
        tf1.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent de) {
                ativaBotao();
            }

            public void removeUpdate(DocumentEvent de) {
                ativaBotao();
            }

            public void changedUpdate(DocumentEvent de) {
                ativaBotao();
            }
        });
        tf2.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent de) {
                ativaBotao();
            }

            public void removeUpdate(DocumentEvent de) {
                ativaBotao();
            }

            public void changedUpdate(DocumentEvent de) {
                ativaBotao();
            }
        });
        tf3.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent de) {
                ativaBotao();
            }

            public void removeUpdate(DocumentEvent de) {
                ativaBotao();
            }

            public void changedUpdate(DocumentEvent de) {
                ativaBotao();
            }
        });
    }

    private void ativaBotao() {
        if (!tf1.getText().isEmpty() && !tf2.getText().isEmpty() && !tf3.getText().isEmpty()) btEnviar.setEnabled(true);
        else btEnviar.setEnabled(false);
    }
    
    public static void main(String[] args) {
        JFrame janela = new GuiHabilitaBotao();
        janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
}
