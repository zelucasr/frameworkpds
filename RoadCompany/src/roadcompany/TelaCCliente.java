package roadcompany;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import roadcompany.framework.TelaBaseCliente;

public class TelaCCliente extends TelaBaseCliente{
    private static TelaCCliente tela;
    JButton btCadastrar = new JButton("Cadastrar");
    //Campos para preencher:
        
    private TelaCCliente(){
        super();
        //CONFIGS DA TELA
        this.setTitle("Cadastrar Cliente");
        
        //LAYOUT
        initb();
        
        //CONFIGS BOTOES
        btCadastrar.addActionListener( (ActionEvent e) -> { 
            ECliente cliente = new ECliente(tNome.getText(), tCpf.getText(), tEmail.getText(), tTel.getText());
            DAOCliente.getInstance().cadastrarCliente(cliente);
            this.dispose();
        });
    }
    
    public static TelaCCliente getInstance(){
        if(tela == null){
            tela = new TelaCCliente();
        }
        return tela;
    }; 
    
    public void initb(){ //Tela de cadastro de Veículo
        btCadastrar.setBounds(125, 330, 120, 25);
        this.add(btCadastrar); 
    }     
}