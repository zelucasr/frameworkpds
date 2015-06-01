package roadcompany;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class TelaCCliente { //LAYOUT 2
    JPanel CadastroCliente = new JPanel();
    JLabel cliente = new JLabel();
    CLayout controlador;
    JButton btBack = new JButton("Voltar");
    //Campos para preencher:
    JLabel txtNome = new JLabel("Nome:");
    JTextField tNome = new JTextField();
    JLabel txtCpf = new JLabel("Cpf:");
    JTextField tCpf = new JTextField();
    JLabel txtDisponivel = new JLabel("Disponibilidade:");
    JRadioButton tDisponivelV = new JRadioButton();
    JRadioButton tDisponivelF = new JRadioButton();
    ButtonGroup group = new ButtonGroup();
    JLabel txtTelefone = new JLabel("Telefone:");
    JTextField tTelefone = new JTextField();
    JLabel txtObs = new JLabel("Observações:");
    JTextArea tObs = new JTextArea();
        
    public TelaCCliente(){
        btBack.addActionListener( (ActionEvent e) -> { controlador.setLayout(1); } ); //BOTÃO VOLTAR
    }
    
    public void setControlador(CLayout controlador) {
        this.controlador = controlador;
    }

    public JPanel getCadastroCliente() { //Retorna Tela de cadastro de veículo
        initCadastroCliente();
        System.out.println("teste");
        return CadastroCliente;
    }
    
    public void initCadastroCliente(){ //Tela de cadastro de Veículo
         CadastroCliente.setLayout(null);
         CadastroCliente.setPreferredSize(new java.awt.Dimension(800, 600));
         CadastroCliente.setSize(800, 600);
         cliente.setIcon(new javax.swing.ImageIcon("C:\\Users\\CH1CO\\Desktop\\Git\\frameworkpds\\frameworkpds\\RoadCompany\\src\\roadcompany\\img\\cliente.png"));
         CadastroCliente.add(cliente);
         cliente.setBounds(590, 400, 200, 189);
         CadastroCliente.add(btBack);
         btBack.setBounds(710, 10, 80, 25);
         
         CadastroCliente.add(txtNome);
         txtNome.setBounds(80, 50, 150, 25);
         CadastroCliente.add(tNome);
         tNome.setBounds(200, 50, 150, 25);
         
         CadastroCliente.add(txtCpf);
         txtCpf.setBounds(80, 85, 150, 25);
         CadastroCliente.add(tCpf);
         tCpf.setBounds(200, 85, 150, 25);
         
         /*
         CadastroCliente.add(txtDisponivel);
         txtDisponivel.setBounds(80, 120, 150, 25);
         CadastroCliente.add(tDisponivelV);
         CadastroCliente.add(tDisponivelF);
         tDisponivelV.setText("Disponível");
         tDisponivelF.setText("Indisponível");
         tDisponivelV.setBounds(200, 120, 100, 25);
         tDisponivelF.setBounds(300, 120, 150, 25);
         group.add(tDisponivelV);
         group.add(tDisponivelF);
         */
         
         CadastroCliente.add(txtTelefone);
         txtTelefone.setBounds(80, 120, 150, 25);
         CadastroCliente.add(tTelefone);
         tTelefone.setBounds(200, 120, 150, 25);
         
         /*
         CadastroCliente.add(txtObs);
         txtObs.setBounds(80, 190, 150, 25);
         CadastroCliente.add(tObs);
         tObs.setBounds(200, 190, 150, 100);
         */
         
         System.out.println(btBack.getBounds());
    }
        
}
