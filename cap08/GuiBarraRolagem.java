package cap08;

import java.awt.event.*;
import java.text.NumberFormat;
import javax.swing.*;

public class GuiBarraRolagem extends JPanel {
    private JScrollBar sb1;
    private JLabel lbCentimetros, lbPolegadas;

    public GuiBarraRolagem() {
        inicializarElementos();
        definirEventos();
    }

    private void inicializarElementos() {
        setLayout(null);
        sb1 = new JScrollBar(JScrollBar.HORIZONTAL, 0, 5, 0, 105);
        lbPolegadas = new JLabel("0 Polegadas", JLabel.CENTER);
        lbCentimetros = new JLabel("0.00 Centimetros", JLabel.CENTER);
        sb1.setBounds(25, 20, 180, 25);
        lbPolegadas.setBounds(35, 50, 150, 25);
        lbCentimetros.setBounds(35, 180, 150, 25);
        add(sb1);
        add(lbCentimetros);
        add(lbPolegadas);
    }

    private void definirEventos() {
        sb1.addAdjustmentListener((AdjustmentEvent e) -> {
            lbPolegadas.setText(sb1.getValue() + " Polegadas");
            NumberFormat nf = NumberFormat.getNumberInstance();
            nf.setMinimumFractionDigits(2);
            nf.setMaximumFractionDigits(2);
            double cm = sb1.getValue() * 2.54;
            lbCentimetros.setText(nf.format(cm) + " Centimetros");
        });
    }
    
}
