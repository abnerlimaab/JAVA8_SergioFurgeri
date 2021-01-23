package cap08;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;

public class GuiListaComFotos extends JPanel {
    private JList isFotos;
    private DefaultListModel dim;
    private ImageIcon imagem1;
    private JScrollPane sp;
    private JLabel lbImagens;

    public GuiListaComFotos() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);
        dim = new DefaultListModel();
        for (int i = 1; i <= 10; i++) {
            dim.addElement("foto" + i);
        }
        isFotos = new JList(dim);
        sp = new JScrollPane(isFotos);
        sp.setBounds(50, 40, 70, 150);
        imagem1 = new ImageIcon();
        lbImagens = new JLabel(imagem1);
        lbImagens.setBounds(150, 30, 180, 180);
        add(sp);
        add(lbImagens);
    }

    private void definirEventos() {
        isFotos.addListSelectionListener((ListSelectionEvent e) -> {
            imagem1 = new ImageIcon(getClass().getResource("/cap08/imagens/" + isFotos.getSelectedValue() + ".jpg"));
            imagem1.setImage(imagem1.getImage().getScaledInstance(lbImagens.getWidth(), lbImagens.getHeight(), 1));
            lbImagens.setIcon(imagem1);
        });
    }
    
}
