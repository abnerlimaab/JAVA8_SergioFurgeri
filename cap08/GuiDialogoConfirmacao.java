package cap08;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.*;

public class GuiDialogoConfirmacao extends JPanel {
    private JButton btMostrar;
    private JRadioButton rb1, rb2, rb3;
    private ButtonGroup btGroup;

    public GuiDialogoConfirmacao() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);
        btMostrar = new JButton("Mostrar");
        rb1 = new JRadioButton("Sim e Não");
        rb2 = new JRadioButton("Sim, Não e Cancelar");
        rb3 = new JRadioButton("Ok e Cancelar");
        btGroup = new ButtonGroup();
        btGroup.add(rb1);
        btGroup.add(rb2);
        btGroup.add(rb3);
        rb1.setBounds(55, 10, 200, 25);
        rb2.setBounds(55, 30, 200, 35);
        rb3.setBounds(55, 60, 200, 25);
        btMostrar.setBounds(55, 90, 100, 20);
        add(btMostrar);
        add(rb1);
        add(rb2);
        add(rb3);
    }

    private void definirEventos() {
        btMostrar.addActionListener((ActionEvent e) -> {
            int resp = 0;
            if (rb1.isSelected()) resp = JOptionPane.showConfirmDialog(null, "Erro ao acessar arquivo. " + "Tentar novamente?", "Erro de arquivo", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
            else if (rb2.isSelected()) resp = JOptionPane.showConfirmDialog(null, "Deseja salvar as alterações?", "Salvar o arquivo", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            else resp = JOptionPane.showConfirmDialog(null, "Deseja abrir o arquivo?", "Abrir arquivo", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        });
    }
    
}
