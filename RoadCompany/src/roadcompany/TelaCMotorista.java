package roadcompany;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class TelaCMotorista extends JFrame{
    private static TelaCMotorista tela;
    JButton btCancelar = new JButton("Cancelar");
    JButton btCadastrar = new JButton("Cadastrar");
    //Campos para preencher:
    JLabel txtNome = new JLabel("Nome:");
    JTextField tNome = new JTextField();
    JLabel txtCpf = new JLabel("CPF:");
    JTextField tCpf = new JTextField();
    JLabel txtHabil = new JLabel("Habilitação:");
    JTextField tHabil = new JTextField();
    JLabel txtTelefone = new JLabel("Telefone:");
    JTextField tTelefone = new JTextField();
        
    private TelaCMotorista(){
        super();
        //CONFIGS DA TELA
        this.setLayout(null);
        this.setPreferredSize(new java.awt.Dimension(500, 400));
        this.setSize(500, 400);
        this.setResizable(false);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE); 
        this.setTitle("Cadastrar Motorista");
        this.setLocationRelativeTo(null);  
         this.setAlwaysOnTop(true);
        this.setVisible(true);
        
        //LAYOUT
        initCMotorista();
        
        //CONFIG BOTOES
        btCancelar.addActionListener( (ActionEvent e) -> {  this.dispose(); } );
        btCadastrar.addActionListener( (ActionEvent e) -> { /*ADCIONAR COMANDOS PARA CADASTRRA AQUI*/ });
    }
    
    public static TelaCMotorista getInstance(){
        if(tela == null){
            tela = new TelaCMotorista();
        }
        return tela;
    }; 
    
    public void initCMotorista(){ //Tela de cadastro de Veículo
        btCadastrar.setBounds(125, 330, 120, 25);
        this.add(btCadastrar); 
        btCancelar.setBounds(255, 330, 120, 25);
        this.add(btCancelar);

        this.add(txtNome);
        txtNome.setBounds(80, 50, 150, 25);
        this.add(tNome);
        tNome.setBounds(200, 50, 150, 25);

        this.add(txtCpf);
        txtCpf.setBounds(80, 85, 150, 25);
        this.add(tCpf);
        tCpf.setBounds(200, 85, 150, 25);

        this.add(txtHabil);
        txtHabil.setBounds(80, 120, 150, 25);
        this.add(tHabil);
        tHabil.setBounds(200, 120, 150, 25);

        this.add(txtTelefone);
        txtTelefone.setBounds(80, 155, 150, 25);
        this.add(tTelefone);
        tTelefone.setBounds(200, 155, 150, 25);
    }
}
