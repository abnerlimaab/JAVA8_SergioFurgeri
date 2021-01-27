package cap09;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class GuiEventos extends JFrame {
    JButton btMudarCor;
    JTextField tfCaixa1, tfCaixa2;
    int posicaoEsquerda = 100, posicaoTopo = 100;
    
    public static void main(String[] args) {
        JFrame janela = new GuiEventos();
        janela.addWindowListener(new WindowListener() {
            public void windowOpened(WindowEvent we) {
            }

            public void windowClosing(WindowEvent we) {
            }

            public void windowClosed(WindowEvent we) {
            }

            public void windowIconified(WindowEvent we) {
                System.out.println("A janela foi minimizada!");
            }

            public void windowDeiconified(WindowEvent we) {
                System.out.println("A janela foi restaurada!");
            }

            public void windowActivated(WindowEvent we) {
            }

            public void windowDeactivated(WindowEvent we) {
            }
        });
        janela.addComponentListener(new ComponentListener() {
            public void componentResized(ComponentEvent ce) {
                System.out.println("A janela foi redimensionada!");
            }

            public void componentMoved(ComponentEvent ce) {
                System.out.println("A Janela foi movida!");
            }

            public void componentShown(ComponentEvent ce) {
                System.out.println("A janela tornou-se visivel!");
            }

            public void componentHidden(ComponentEvent ce) {
                System.out.println("A janela tornou-se oculta");
            }
        });
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    public GuiEventos() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setTitle("Controle de Eventos");
        setSize(250, 150);
        setLocation(posicaoEsquerda, posicaoTopo);
        setLayout(new GridLayout(3, 1));
        btMudarCor = new JButton("Eventos de Botão");
        tfCaixa1 = new JTextField();
        tfCaixa2 = new JTextField();
        btMudarCor.setBackground(Color.gray);
        add(btMudarCor);
        add(tfCaixa1);
        add(tfCaixa2);
    }

    private void definirEventos() {
        btMudarCor.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent me) {
                System.out.println("O botão do mouse foi pressionado e solto");
            }

            public void mousePressed(MouseEvent me) {
                System.out.println("O botão do mouse foi pressionado");
            }

            public void mouseReleased(MouseEvent me) {
                System.out.println("O botão do mouse foi solto");
            }

            public void mouseEntered(MouseEvent me) {
                btMudarCor.setBackground(Color.yellow);
            }

            public void mouseExited(MouseEvent me) {
                btMudarCor.setBackground(Color.gray);
            }
        });
        btMudarCor.addMouseMotionListener(new MouseMotionListener() {
            public void mouseDragged(MouseEvent me) {
                System.out.println("Mouse foi arrastado em " + me.getX() + " , " + me.getY());
            }

            public void mouseMoved(MouseEvent me) {
                System.out.println("Mouse se moveu em " + me.getX() + " , " + me.getY());
            }
        });
        tfCaixa1.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent ke) {
            }

            public void keyPressed(KeyEvent ke) {
                System.out.println(ke.getKeyCode());
                if (ke.getKeyCode() == 37) // Seta para esquerda
                    posicaoEsquerda -= 5;
                if (ke.getKeyCode() == 38) // Seta para cima
                    posicaoTopo -= 5;
                if (ke.getKeyCode() == 39) // Seta para direita
                    posicaoEsquerda += 5;
                if (ke.getKeyCode() == 40) // Seta para baixo
                    posicaoTopo += 5;
                setLocation(posicaoEsquerda, posicaoTopo);
            }

            public void keyReleased(KeyEvent ke) {
            }
            
        });
        tfCaixa2.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent fe) {
                System.out.println("A caixa 2 recebeu foco");
            }

            public void focusLost(FocusEvent fe) {
                System.out.println("A caixa 2 perdeu foco");
            }
        });
        tfCaixa2.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent de) {
                System.out.println("Um caractere foi inserido");
            }

            public void removeUpdate(DocumentEvent de) {
                System.out.println("Um caractere foi removido");
            }

            public void changedUpdate(DocumentEvent de) {
                System.out.println("O conteudo de um atributo mudou");
            }
        });
    }
    
    
}
