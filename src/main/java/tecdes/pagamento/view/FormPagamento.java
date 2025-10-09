package tecdes.pagamento.view;
import javax.swing.*;
import tecdes.pagamento.controller.ControllerPagamento;

public class FormPagamento extends JFrame{
    private JTextField txtValor;
    private JComboBox<String> cmbMetodo;
    private JTextArea txtResultado;
    private ControllerPagamento controller;

    public FormPagamento(){
        setSize(420, 340);
        setTitle("Gestor de Pagamentos - v1.0");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);

        initComponents();
    }

    private void initComponents(){

        JLabel lblValor = new JLabel("Valor (R$):");
        lblValor.setBounds(40, 30, 100, 25);
        add(lblValor);

        txtValor = new JTextField();
        txtValor.setBounds(150, 30, 200, 25);
        add(txtValor);

        JLabel lblMetodo = new JLabel("Método de Pagamento:");
        lblMetodo.setBounds(40, 70, 150, 25);
        add(lblMetodo);

        cmbMetodo = new JComboBox<>(new String[]{"Boleto", "Cartão", "PIX"});
        cmbMetodo.setBounds(190, 70, 160, 25);
        add(cmbMetodo);

        JButton btnProcessar = new JButton("Processar Pagamento");
        btnProcessar.setBounds(120, 120, 180, 35);
        add(btnProcessar);

        txtResultado = new JTextArea();
        txtResultado.setEditable(false);
        txtResultado.setLineWrap(true);
        txtResultado.setWrapStyleWord(true);

        JScrollPane scroll = new JScrollPane(txtResultado);
        scroll.setBounds(40, 180, 320, 100);
        add(scroll);
    }
}
