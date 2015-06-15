/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadcompany;

/**
 *
 * @author CH1CO
 */

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
import roadcompany.framework.TelaBaseItinerario;

public class TelaCItinerario extends TelaBaseItinerario{
    private static TelaCItinerario tela;
    JButton btCadastrar = new JButton("Cadastrar");
    //Campos para preencher:
    JLabel txtVagas = new JLabel("N de Vagas: ");
    JTextField tVagas = new JTextField();
        
    private TelaCItinerario(){
        super();
        //CONFIGS DA TELA
        this.setTitle("Cadastrar Itinerário");
        
        //LAYOUT
        initb();
        
        //CONFIG BOTOES
        
        btCadastrar.addActionListener( (ActionEvent e) -> {
            EItinerario i = new EItinerario(tSaida.getText(), tDestino.getText(), tPlaca.getText(), tMotorista.getText(), tHora.getText(), Integer.parseInt(tVagas.getText()));
            DAOItinerario.getInstance().cadastrarItinerario(i);
            this.dispose();
        });
    }
    
    public static TelaCItinerario getInstance(){
        if(tela == null){
            tela = new TelaCItinerario();
        }
        return tela;
    }; 
    
    public void initb(){ //Tela de cadastro de Veículo
        btCadastrar.setBounds(125, 330, 120, 25);
        this.add(btCadastrar); 
        
        this.add(txtVagas);
        txtVagas.setBounds(80, 225, 150, 25);
        this.add(tVagas);
        tVagas.setBounds(200, 225, 150, 25);
    }
}
