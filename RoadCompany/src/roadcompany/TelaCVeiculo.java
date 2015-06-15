package roadcompany;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import roadcompany.framework.TelaBaseVeiculo;

public class TelaCVeiculo extends TelaBaseVeiculo {
    private static TelaCVeiculo tela;
    JButton btCadastrar = new JButton("Cadastrar");
    //Campos variaveis para preencher:
    JLabel txtPlaca = new JLabel("Placa:");
    JTextField tPlaca = new JTextField();
    JLabel txtAviso1 = new JLabel("Aviso: Para atualizar as informações de um veiculo insira a placa dele junto com as");
    JLabel txtAviso2 = new JLabel("informações atualizadas. Não é possivel atualizar o modelo ou a placa do veiculo.");
    
        
    private TelaCVeiculo() {
        super();
        //CONFIGS DA TELA
        this.setTitle("Cadastrar Veículo");

        //LAYOUT DA TELA
        initb();

        //FUNCOES DE BOTOES
        btCadastrar.addActionListener( (ActionEvent e) -> { 
            EVeiculo v;
            if(tDisponivelV.isSelected()){
                v = new EVeiculo(tModelo.getText(), tPlaca.getText(), true, tRev.getText(), tObs.getText());
            }
            else{
                v = new EVeiculo(tModelo.getText(), tPlaca.getText(), false, tRev.getText(), tObs.getText());
            }
            DAOVeiculo.getInstance().cadastrarVeiculo(v);
            this.dispose();
        });
    }
    
    public static TelaCVeiculo getInstance(){
        if(tela == null){
            tela = new TelaCVeiculo();
        }
        return tela;
    };    
    
    private void initb(){
        btCadastrar.setBounds(125, 330, 120, 25);
        this.add(btCadastrar); 
        txtAviso1.setBounds(5, 5, 480, 15);
        this.add(txtAviso1);
        txtAviso2.setBounds(5, 20, 480, 15);
        this.add(txtAviso2);
        
        this.add(txtPlaca);
        txtPlaca.setBounds(80, 85, 150, 25);
        this.add(tPlaca);
        tPlaca.setBounds(200, 85, 150, 25);
    }
}
