package cap08.Exercicios;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JInternalFrame;
import javax.swing.*;

public class GuiBandeiras extends JInternalFrame {
    private JLabel lbBandeira, lbContinente;
    private JComboBox cbPaises;
    private ImageIcon icPais;
    private String[][] paises = {{"Austrália", "Brasil", "Egito", "Espanha", "Japão"},{"Oceanía", "América do Sul", "África", "Europa", "Ásia"}};

    public GuiBandeiras() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setTitle("BANDEIRAS");
        setSize(600, 600);
        setResizable(true);
        setClosable(true);
        setMaximizable(true);
        setIconifiable(true);
        setLayout(null);
        cbPaises = new JComboBox();
        for (int i = 0; i < paises[0].length; i++) {
            cbPaises.addItem(paises[0][i]);
        }
        cbPaises.setBounds(200, 100, 200, 20);
        icPais = new ImageIcon();
        lbBandeira = new JLabel(icPais);
        lbBandeira.setBounds(200, 150, 200, 150);
        lbContinente = new JLabel("", JLabel.CENTER);
        lbContinente.setBounds(200, 330, 200, 20);
        add(cbPaises);
        add(lbBandeira);
        add(lbContinente);
        setVisible(true);
    }

    private void definirEventos() {
        cbPaises.addActionListener((ActionEvent e) -> {
            icPais = new ImageIcon(getClass().getResource("/cap08/Exercicios/imagens/" + paises[0][cbPaises.getSelectedIndex()] + ".jpg"));
            icPais.setImage(icPais.getImage().getScaledInstance(lbBandeira.getWidth(), lbBandeira.getHeight(), 1));
            lbBandeira.setIcon(icPais);
            lbContinente.setText("Este país fica na " + paises[1][cbPaises.getSelectedIndex()]);
        });
    }
    
    
}
