package cap08;

import java.awt.Color;
import javax.swing.*;

public class GuiFrameInterno extends JInternalFrame {

    public GuiFrameInterno() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        setTitle("Usando frame interno");
        setSize(300, 100);
        setResizable(true);
        setClosable(true);
        setMaximizable(true);
        setIconifiable(true);
        setBackground(Color.orange);
        setVisible(true);
    }
    
}
