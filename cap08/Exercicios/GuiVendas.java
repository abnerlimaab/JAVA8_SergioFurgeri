package cap08.Exercicios;

import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.JInternalFrame;
import javax.swing.*;

public class GuiVendas extends JInternalFrame {
    private JLabel lbValorVenda, lbPrecoFinal;
    private JTextField tfPreco, tfPrecoFinal;
    private JRadioButton rbDinheiro, rbCheque, rbCredito;
    private ButtonGroup buttonGroup;
    DecimalFormat df = new DecimalFormat("#,###.00");

    public GuiVendas() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setTitle("VENDAS");
        setSize(290, 300);
        setResizable(true);
        setMaximizable(true);
        setIconifiable(true);
        setClosable(true);
        setLayout(null);
        lbValorVenda = new JLabel("Valor da venda");
        lbValorVenda.setBounds(20, 50, 120, 20);
        tfPreco = new JTextField();
        tfPreco.setHorizontalAlignment(JTextField.RIGHT);
        tfPreco.setBounds(150, 50, 120, 20);
        buttonGroup = new ButtonGroup();
        rbDinheiro = new JRadioButton("Dinheiro");
        rbCheque = new JRadioButton("Cheque");
        rbCredito = new JRadioButton("Crédito");
        rbDinheiro.setBounds(20, 100, 120, 20);
        rbCheque.setBounds(20, 130, 120, 20);
        rbCredito.setBounds(20, 160, 120, 20);
        buttonGroup.add(rbDinheiro);
        buttonGroup.add(rbCheque);
        buttonGroup.add(rbCredito);
        lbPrecoFinal = new JLabel("Preço final da venda");
        lbPrecoFinal.setBounds(20, 200, 120, 20);
        tfPrecoFinal = new JTextField();
        tfPrecoFinal.setBounds(150, 200, 120, 20);
        tfPrecoFinal.setBackground(null);
        tfPrecoFinal.setEditable(false);
        tfPrecoFinal.setHorizontalAlignment(JTextField.RIGHT);
        add(lbValorVenda);
        add(tfPreco);
        add(rbDinheiro);
        add(rbCheque);
        add(rbCredito);
        add(tfPrecoFinal);
        add(lbPrecoFinal);
        setVisible(true);
    }

    private void definirEventos() {
        rbDinheiro.addActionListener((ActionEvent e) -> {
            try {
                 tfPrecoFinal.setText("R$ " + df.format(Float.parseFloat(tfPreco.getText().replace(",", ".")) * 0.95f));
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Digite apenas números.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });
        rbCheque.addActionListener((ActionEvent e) -> {
            try {
                tfPrecoFinal.setText("R$ " + df.format(Float.parseFloat(tfPreco.getText().replace(",", ".")) * 1.05f));
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Digite apenas números.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });
        rbCredito.addActionListener((ActionEvent e) -> {
            try {
                 tfPrecoFinal.setText("R$ " + df.format(Float.parseFloat(tfPreco.getText().replace(",", ".")) * 1.10f));
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Digite apenas números.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });
    } 
    
}
