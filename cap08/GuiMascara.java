package cap08;

import java.awt.event.*;
import java.text.ParseException;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

public class GuiMascara extends JPanel {
    private JLabel lbCPF, lbCNPJ, lbTel, lbCEP;
    private JFormattedTextField tfCPF, tfCNPJ, tfTel, tfCEP;
    private MaskFormatter msCPF, msCNPJ, msTel, msCEP;
    private JButton btMostrar;

    public GuiMascara() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        try {
            msCPF = new MaskFormatter("###.###.###-##");
            msCNPJ = new MaskFormatter("##.###.###/####-##");
            msTel = new MaskFormatter("(##)#####-####");
            msCEP = new MaskFormatter("#####-###");
            setBounds(0, 0, 250, 220);
            setLayout(null);
            lbCPF = new JLabel("CPF:");
            lbCPF.setBounds(15, 20, 100, 20);
            tfCPF = new JFormattedTextField(msCPF);
            tfCPF.setBounds(100, 20, 100, 20);
            lbCNPJ = new JLabel("CNPJ:");
            lbCNPJ.setBounds(15, 50, 100, 20);
            tfCNPJ = new JFormattedTextField(msCNPJ);
            tfCNPJ.setBounds(100, 50, 150, 20);
            lbTel = new JLabel("Telefone:");
            lbTel.setBounds(15, 80, 100, 20);
            tfTel = new JFormattedTextField(msTel);
            tfTel.setBounds(100, 80, 100, 20);
            lbCEP = new JLabel("CEP:");
            lbCEP.setBounds(15, 110, 100, 20);
            tfCEP = new JFormattedTextField(msCEP);
            tfCEP.setBounds(100, 110, 100, 20);
            btMostrar = new JButton("Mostrar");
            btMostrar.setBounds(15, 140, 100, 22);
            add(lbCPF);
            add(lbCNPJ);
            add(lbTel);
            add(lbCEP);
            add(tfCPF);
            add(tfCNPJ);
            add(tfTel);
            add(tfCEP);
            add(btMostrar);
        } catch (ParseException erro) {
            erro.printStackTrace();
        }
    }

    private void definirEventos() {
        btMostrar.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(null, tfCPF.getText() + "\n" + tfCNPJ.getText() + "\n" + tfTel.getText() + "\n" + tfCEP.getText());
            JOptionPane.showMessageDialog(null, tfCPF.getValue());
            String CNPJsoNumeros = tfCNPJ.getText();
            CNPJsoNumeros = CNPJsoNumeros.replace(".", "");
            CNPJsoNumeros = CNPJsoNumeros.replace("/", "");
            CNPJsoNumeros = CNPJsoNumeros.replace("-", "");
            JOptionPane.showMessageDialog(null, CNPJsoNumeros);
        });
    }
    
}
