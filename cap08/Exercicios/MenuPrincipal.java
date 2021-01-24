package cap08.Exercicios;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class MenuPrincipal extends JFrame {
    private JDesktopPane contentPane;
    private JMenuBar mnBarra;
    private JMenu mnArquivo, mnExercicios;
    private JMenuItem miSair, miTabuleiro, miBandeiras, miVendas, miCadastro;

    public MenuPrincipal() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setTitle("Menu Principal");
        setBounds(0, 0, 1024, 800);
        contentPane = new JDesktopPane();
        setContentPane(contentPane);
        mnBarra = new JMenuBar();
        mnArquivo = new JMenu("Arquivo");
        mnExercicios = new JMenu("Exercícios");
        miSair = new JMenuItem("Sair");
        mnArquivo.add(miSair);
        miTabuleiro = new JMenuItem("Tabuleiro");
        miBandeiras = new JMenuItem("Bandeiras");
        miVendas = new JMenuItem("Vendas");
        miCadastro = new JMenuItem("Cadastro");
        mnExercicios.add(miTabuleiro);
        mnExercicios.add(miBandeiras);
        mnExercicios.add(miVendas);
        mnExercicios.add(miCadastro);
        mnBarra.add(mnArquivo);
        mnBarra.add(mnExercicios);
        setJMenuBar(mnBarra);
    }

    private void definirEventos() {
        miSair.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        miTabuleiro.addActionListener((ActionEvent e) -> {
            GuiTabuleiro guiTabuleiro = new GuiTabuleiro();
            //contentPane.removeAll();
            contentPane.add(guiTabuleiro);
            contentPane.validate();
        });
        miBandeiras.addActionListener((ActionEvent e) -> {
            GuiBandeiras guiBandeiras = new GuiBandeiras();
            //contentPane.removeAll();
            contentPane.add(guiBandeiras);
            contentPane.validate();
        });
    }
    
    public static void main(String[] args) {
        MenuPrincipal frame = new MenuPrincipal();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((tela.width - frame.getSize().width) / 2, (tela.height - frame.getSize().height) / 2);
        frame.setVisible(true);
    }
}
