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
import roadcompany.framework.TelaBaseMotorista;

public class TelaCMotorista extends TelaBaseMotorista{
    private static TelaCMotorista tela;
    //Campos que podem variar:
    JButton btCadastrar = new JButton("Cadastrar");
    JLabel txtHabil = new JLabel("Habilitação:");
    JTextField tHabil = new JTextField();
        
    private TelaCMotorista(){
        super();
        this.setTitle("Cadastrar Motorista");
        
        //LAYOUT QUE VARIA
        this.initc();
        
        //CONFIG BOTOES QUE VARIAM
        btCadastrar.addActionListener( (ActionEvent e) -> { /*ADCIONAR COMANDOS PARA CADASTRRA AQUI*/ });
    }
    
    public static TelaCMotorista getInstance(){
        if(tela == null){
            tela = new TelaCMotorista();
        }
        return tela;
    }; 
    
    public void initc(){ //Tela de cadastro de Veículo
        this.btCadastrar.setBounds(125, 330, 120, 25);
        this.add(btCadastrar);
        
        this.add(txtHabil);
        this.txtHabil.setBounds(80, 120, 150, 25);
        this.add(tHabil);
        this.tHabil.setBounds(200, 120, 150, 25);
    }
}
