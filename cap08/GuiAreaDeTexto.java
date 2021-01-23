package cap08;

import java.awt.event.*;
import javax.swing.*;

public class GuiAreaDeTexto extends JPanel {
    private JTextField tfCampo;
    private JTextArea taTexto;
    private JScrollPane sp;
    private JButton btLimpar;
    private final static String NOVA_LINHA = "\n";

    public GuiAreaDeTexto() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);
        tfCampo = new JTextField();
        taTexto = new JTextArea();
        taTexto.setEditable(false);
        ImageIcon icoLimpar = new ImageIcon(getClass().getResource("/cap08/imagens/borracha.png"));
        btLimpar = new JButton();
        sp = new JScrollPane(taTexto);
        tfCampo.setBounds(25, 15, 150, 25);
        sp.setBounds(25, 45, 300, 120);
        btLimpar.setBounds(25, 170, 50, 50);
        icoLimpar.setImage(icoLimpar.getImage().getScaledInstance(btLimpar.getWidth(), btLimpar.getHeight(), 1));
        btLimpar.setIcon(icoLimpar);
        add(tfCampo);
        add(sp);
        add(btLimpar);
    }

    private void definirEventos() {
        tfCampo.addActionListener((ActionEvent e) -> {
            tfCampo.selectAll();
            taTexto.append(tfCampo.getText() + NOVA_LINHA);
            taTexto.setCaretPosition(taTexto.getDocument().getLength());
        });
        btLimpar.addActionListener((ActionEvent e) -> {
            tfCampo.setText("");
            taTexto.setText("");
        });
    }
    
    
}
