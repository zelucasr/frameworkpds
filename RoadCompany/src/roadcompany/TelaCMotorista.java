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

public class TelaCMotorista { //LAYOUT 2
    JPanel CadastroMotorista = new JPanel();
    JLabel motorista = new JLabel();
    CLayout controlador;
    JButton btBack = new JButton("Voltar");
    //Campos para preencher:
    JLabel txtNome = new JLabel("Nome:");
    JTextField tNome = new JTextField();
    JLabel txtCpf = new JLabel("Cpf:");
    JTextField tCpf = new JTextField();
    JLabel txtHabil = new JLabel("Habilitação:");
    JTextField tHabil = new JTextField();
    JLabel txtTelefone = new JLabel("Telefone:");
    JTextField tTelefone = new JTextField();
        
    public TelaCMotorista(){
        btBack.addActionListener( (ActionEvent e) -> { controlador.setLayout(1); } ); //BOTÃO VOLTAR
    }
    
    public void setControlador(CLayout controlador) {
        this.controlador = controlador;
    }

    public JPanel getCadastroMotorista() { //Retorna Tela de cadastro de veículo
        initCadastroMotorista();
        System.out.println("teste");
        return CadastroMotorista;
    }
    
    public void initCadastroMotorista(){ //Tela de cadastro de Veículo
         CadastroMotorista.setLayout(null);
         CadastroMotorista.setPreferredSize(new java.awt.Dimension(800, 600));
         CadastroMotorista.setSize(800, 600);
         motorista.setIcon(new javax.swing.ImageIcon("C:\\Users\\CH1CO\\Desktop\\Git\\frameworkpds\\frameworkpds\\RoadCompany\\src\\roadcompany\\img\\motorista.png"));
         CadastroMotorista.add(motorista);
         motorista.setBounds(590, 400, 200, 184);
         CadastroMotorista.add(btBack);
         btBack.setBounds(710, 10, 80, 25);
         
         CadastroMotorista.add(txtNome);
         txtNome.setBounds(80, 50, 150, 25);
         CadastroMotorista.add(tNome);
         tNome.setBounds(200, 50, 150, 25);
         
         CadastroMotorista.add(txtCpf);
         txtCpf.setBounds(80, 85, 150, 25);
         CadastroMotorista.add(tCpf);
         tCpf.setBounds(200, 85, 150, 25);
         
          CadastroMotorista.add(txtHabil);
         txtHabil.setBounds(80, 120, 150, 25);
         CadastroMotorista.add(tHabil);
         tHabil.setBounds(200, 120, 150, 25);
         
         CadastroMotorista.add(txtTelefone);
         txtTelefone.setBounds(80, 155, 150, 25);
         CadastroMotorista.add(tTelefone);
         tTelefone.setBounds(200, 155, 150, 25);
        
         System.out.println(btBack.getBounds());
    }
        
}
