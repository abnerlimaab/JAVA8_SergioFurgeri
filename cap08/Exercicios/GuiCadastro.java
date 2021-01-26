package cap08.Exercicios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuiCadastro extends JInternalFrame {
    private JLabel lbNome, lbEndereco, lbSexo, lbEstCivil;
    private JTextField tfNome, tfEndereco;
    private JTextArea taRetorno;
    private JComboBox cbSexo, cbEstCivil;
    private JButton btMostrar, btLimapar;
    private JPanel pnRetorno, pnBotoes;
    private String[] strSexo = {"", "Masculino", "Feminino"};
    private String[] strEstCivil = {"","Casado(a)", "Solteiro(a)", "Viuvo(a)", "Divorciado(a)"};
    

    public GuiCadastro() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        //Criação do Frame Interno
        setTitle("CADASTRO");
        setLayout(null);
        setSize(600, 400);
        setClosable(true);
        setMaximizable(false);
        setIconifiable(true);
        setResizable(false);
        setVisible(true);
        //Campos Formulário
        lbNome = new JLabel("Nome:");
        lbNome.setBounds(0, 0, 300, 30);
        lbEndereco = new JLabel("Endereço:");
        lbEndereco.setBounds(0, 30, 300, 30);
        lbSexo = new JLabel("Sexo:");
        lbSexo.setBounds(0, 60, 300, 30);
        lbEstCivil = new JLabel("Estado Civil:");
        lbEstCivil.setBounds(0, 90, 300, 30);
        tfNome = new JTextField();
        tfNome.setBounds(300, 0, 300, 30);
        tfEndereco = new JTextField();
        tfEndereco.setBounds(300, 30, 300, 30);
        cbSexo = new JComboBox(strSexo);
        cbSexo.setBounds(300, 60, 290, 30);
        cbEstCivil = new JComboBox(strEstCivil);
        cbEstCivil.setBounds(300, 90, 290, 30);
        add(lbNome);
        add(lbEndereco);
        add(lbSexo);
        add(lbEstCivil);
        add(tfNome);
        add(tfEndereco);
        add(cbSexo);
        add(cbEstCivil);
        //Painel Retorno
        pnRetorno = new JPanel(new BorderLayout());
        pnBotoes = new JPanel(new GridLayout(1, 2));
        btMostrar = new JButton("Mostrar");
        btLimapar = new JButton("Limpar");
        pnBotoes.add(btMostrar);
        pnBotoes.add(btLimapar);
        pnRetorno.add("North", pnBotoes);
        taRetorno = new JTextArea();
        taRetorno.setEditable(false);
        pnRetorno.add(taRetorno);
        pnRetorno.setBounds(0, 120, 600, 280);
        add(pnRetorno);
    }

    private void definirEventos() {
        btMostrar.addActionListener((ActionEvent e) -> {
            if (tfNome.getText().equals("") || tfEndereco.getText().equals("") || cbSexo.getSelectedIndex() == 0 || cbEstCivil.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos", "ERRO", JOptionPane.ERROR_MESSAGE);
            } else {
                taRetorno.setText(tfNome.getText() + "\n"
                                + tfEndereco.getText() + "\n"
                                + strSexo[cbSexo.getSelectedIndex()] + "\n"
                                + strEstCivil[cbEstCivil.getSelectedIndex()]);
            }
        });
        btLimapar.addActionListener((ActionEvent e) -> {
            taRetorno.setText("");
        });
    }
    
    
}
