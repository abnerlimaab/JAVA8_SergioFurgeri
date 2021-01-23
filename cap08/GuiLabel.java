package cap08;

import java.awt.*;
import javax.swing.*;

public class GuiLabel extends JPanel {
    private JLabel lbl1, lbl2, lbl3, lbl4;
    private ImageIcon imgIco1;

    public GuiLabel() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        setLayout(new GridLayout(4, 1));
        imgIco1 = new ImageIcon(getClass().getResource("/cap08/java.jpg"));
        setBackground(new Color(100, 220, 100));
        lbl1 = new JLabel("   Aprendendo", JLabel.LEFT);
        lbl1.setForeground(Color.white);
        lbl2 = new JLabel(imgIco1);
        lbl3 = new JLabel("Inserir   ", JLabel.RIGHT);
        lbl3.setForeground(Color.blue);
        lbl4 = new JLabel("Labels e imagens", imgIco1, JLabel.CENTER);
        lbl4.setFont(new Font("Serif", Font.BOLD, 20));
        lbl4.setForeground(Color.black);
        add(lbl1);
        add(lbl2);
        add(lbl3);
        add(lbl4);
    }
    
    
}
