package cap08;

import java.awt.event.*;
import javax.swing.*;

public class GuiCombo extends JPanel {
    private JComboBox cbEstados;
    private JLabel lbEstados;
    private JButton btMostrar;

    public GuiCombo() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);
        String[] cbEstadosItens = {"Espírito Santo", "Minas Gerais", "Rio de Janeiro", "São Paulo"};
        cbEstados = new JComboBox(cbEstadosItens);
        lbEstados = new JLabel("Estados do Sudeste");
        btMostrar = new JButton("Mostrar");
        add(lbEstados);
        add(cbEstados);
        add(btMostrar);
        lbEstados.setBounds(25, 15, 150, 25);
        cbEstados.setBounds(25, 40, 150, 25);
        btMostrar.setBounds(25, 75, 100, 25);
    }

    private void definirEventos() {
        btMostrar.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(null, "Índice selecionado: " + cbEstados.getSelectedIndex() + "\nItem selecionado: " + cbEstados.getSelectedItem());
        });
    }
    
    
}
