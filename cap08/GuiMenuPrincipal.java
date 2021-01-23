package cap08;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuiMenuPrincipal extends JFrame {
    private JDesktopPane contentPane;
    private JMenuBar mnBarra;
    private JMenu mnArquivo, mnExemplos;
    private JMenuItem miSair, miBotao, miCaixaOpcao, miRadioButton, miLabels, miList, miListaFotos, miComboEstados, miTextArea, miDialogoMensagem, miConfirmarMensagem, miDialogoOpcao, miBarraRolagem, miBarraProgresso, miAbas, miFrameInterno;
    
    public GuiMenuPrincipal() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setTitle("Menu Principal");
        setBounds(0, 0, 800, 600);
        contentPane = new JDesktopPane();
        setContentPane(contentPane);
        mnBarra = new JMenuBar();
        mnArquivo = new JMenu("Arquivo");
        mnArquivo.setMnemonic('A');
        mnExemplos = new JMenu("Exemplos");
        mnExemplos.setMnemonic('E');
        miSair = new JMenuItem("Sair");
        miSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
        miBotao = new JMenuItem("Botao");
        miCaixaOpcao = new JMenuItem("Caixa de Opção");
        miRadioButton = new JMenuItem("Radio Button");
        miLabels = new JMenuItem("Labels");
        miList = new JMenuItem("Lista");
        miListaFotos = new JMenuItem("Lista com fotos");
        miComboEstados = new JMenuItem("Estados - Combo Box");
        miTextArea = new JMenuItem("Área de texto");
        miDialogoMensagem = new JMenuItem("Diálogo de mensagem");
        miConfirmarMensagem = new JMenuItem("Confirmação de mensagem");
        miDialogoOpcao = new JMenuItem("Diálogo de opção");
        miBarraRolagem = new JMenuItem("Barra de rolagem");
        miBarraProgresso = new JMenuItem("Barra de progresso");
        miAbas = new JMenuItem("Abas");
        miFrameInterno = new JMenuItem("Frame Interno");
        mnArquivo.add(miSair);
        mnExemplos.add(miBotao);
        mnExemplos.add(miCaixaOpcao);
        mnExemplos.add(miRadioButton);
        mnExemplos.add(miLabels);
        mnExemplos.add(miList);
        mnExemplos.add(miListaFotos);
        mnExemplos.add(miComboEstados);
        mnExemplos.add(miTextArea);
        mnExemplos.add(miDialogoMensagem);
        mnExemplos.add(miConfirmarMensagem);
        mnExemplos.add(miDialogoOpcao);
        mnExemplos.add(miBarraRolagem);
        mnExemplos.add(miBarraProgresso);
        mnExemplos.add(miAbas);
        mnExemplos.add(miFrameInterno);
        mnBarra.add(mnArquivo);
        mnBarra.add(mnExemplos);
        setJMenuBar(mnBarra);
    }

    private void definirEventos() {
        miSair.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        miBotao.addActionListener((ActionEvent ae) -> {
            GuiBotao botao = new GuiBotao();
            contentPane.removeAll();
            contentPane.add(botao);
            contentPane.validate();
        });
        miCaixaOpcao.addActionListener((ActionEvent e) -> {
            GuiCaixaOpcao guiCaixaOpcao = new GuiCaixaOpcao();
            contentPane.removeAll();
            contentPane.add(guiCaixaOpcao);
            contentPane.validate();});
        miRadioButton.addActionListener((ActionEvent e) -> {
            GuiRadio guiRadio = new GuiRadio();
            contentPane.removeAll();
            contentPane.add(guiRadio);
            contentPane.validate();});
        miLabels.addActionListener((ActionEvent e) -> {
            GuiLabel guiLabel = new GuiLabel();
            contentPane.removeAll();
            contentPane.add(guiLabel);
            contentPane.validate();
        });
        miList.addActionListener((ActionEvent e) -> {
            GuiList guiList = new GuiList();
            contentPane.removeAll();
            contentPane.add(guiList);
            contentPane.validate();
        });
        miListaFotos.addActionListener((ActionEvent e) -> {
            GuiListaComFotos guiListaFotos = new GuiListaComFotos();
            contentPane.removeAll();
            contentPane.add(guiListaFotos);
            contentPane.validate();
        });
        miComboEstados.addActionListener((ActionEvent e) -> {
            GuiCombo guiCombo = new GuiCombo();
            contentPane.removeAll();
            contentPane.add(guiCombo);
            contentPane.validate();
        });
        miTextArea.addActionListener((ActionEvent e) -> {
            GuiAreaDeTexto guiAreaDeTexto = new GuiAreaDeTexto();
            contentPane.removeAll();
            contentPane.add(guiAreaDeTexto);
            contentPane.validate();
        });
        miDialogoMensagem.addActionListener((ActionEvent e) -> {
            GuiDialogoMensagem guiDialogoMensagem = new GuiDialogoMensagem();
            contentPane.removeAll();
            contentPane.add(guiDialogoMensagem);
            contentPane.validate();
        });
        miConfirmarMensagem.addActionListener((ActionEvent e) -> {
            GuiDialogoConfirmacao guiDialogoConfirmacao = new GuiDialogoConfirmacao();
            contentPane.removeAll();
            contentPane.add(guiDialogoConfirmacao);
            contentPane.validate();
        });
        miDialogoOpcao.addActionListener((ActionEvent e) -> {
            GuiDialogoOpcao guiDialogoOpcao = new GuiDialogoOpcao();
            contentPane.removeAll();
            contentPane.add(guiDialogoOpcao);
            contentPane.validate();
        });
        miBarraRolagem.addActionListener((ActionEvent e) -> {
            GuiBarraRolagem guiBarraRolagem = new GuiBarraRolagem();
            contentPane.removeAll();
            contentPane.add(guiBarraRolagem);
            contentPane.validate();
        });
        miBarraProgresso.addActionListener((ActionEvent e) -> {
            GuiBarraProgresso guiBarraProgresso = new GuiBarraProgresso();
            contentPane.removeAll();
            contentPane.add(guiBarraProgresso);
            contentPane.validate();
        });
        miAbas.addActionListener((ActionEvent e) -> {
            GuiAbas guiAbas = new GuiAbas();
            contentPane.removeAll();
            contentPane.add(guiAbas);
            contentPane.validate();
        });
        miFrameInterno.addActionListener((ActionEvent e) -> {
            GuiFrameInterno guiFrameInterno = new GuiFrameInterno();
            contentPane.removeAll();
            contentPane.add(guiFrameInterno);
            contentPane.validate();
        });
    }
    
    public static void abrir() {
        GuiMenuPrincipal frame = new GuiMenuPrincipal();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((tela.width - frame.getSize().width) / 2, (tela.height - frame.getSize().height) / 2);
        frame.setVisible(true);
    }
}
