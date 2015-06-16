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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import java.awt.ItemSelectable;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import roadcompany.framework.TelaBaseItinerario;

public class TelaBItinerario extends TelaBaseItinerario{
    private static TelaBItinerario tela;
    JButton btBuscar = new JButton("Buscar");
    //Campos para preencher:
    JLabel txtBuscar = new JLabel("Buscar por:");
    String[] Opcoes = {"Selecionar" ,"End. Saida", "End. Destino", "Motorista", "Placa do Veiculo", "Horário"};
    JComboBox tBuscar = new JComboBox(Opcoes);
        
    private TelaBItinerario() {
        super();
        //CONFIGS DA TELA    
        this.setTitle("Buscar Itinerario");

        //LAYOUT DA TELA
        initb();

        //FUNCOES DE BOTOES
        btBuscar.addActionListener( (ActionEvent e) -> {
            Object campo = new Object();
            String resultado = new String();
            if((String)tBuscar.getSelectedItem() == "End. Saida"){
                campo = (String)tSaida.getText();
                resultado = (String)DAOItinerario.getInstance().buscarItinerario(campo,(String)tBuscar.getSelectedItem());
                TelaEItinerario.getInstance().setText(resultado);
            }
            if((String)tBuscar.getSelectedItem() == "End. Destino"){
                campo = (String)tDestino.getText();
                resultado = (String)DAOItinerario.getInstance().buscarItinerario(campo,(String)tBuscar.getSelectedItem());
                TelaEItinerario.getInstance().setText(resultado);
            }
            if((String)tBuscar.getSelectedItem() == "Motorista"){
                campo = (String)tMotorista.getText();
                resultado = (String)DAOItinerario.getInstance().buscarItinerario(campo,(String)tBuscar.getSelectedItem());
                TelaEItinerario.getInstance().setText(resultado);
            }
            if((String)tBuscar.getSelectedItem() == "Placa do Veiculo"){
                campo = (String)tPlaca.getText();
                resultado = (String)DAOItinerario.getInstance().buscarItinerario((String)campo,(String)tBuscar.getSelectedItem());
                TelaEItinerario.getInstance().setText(resultado);
            }
            if((String)tBuscar.getSelectedItem() == "Horário"){
                campo = (String)tHora.getText();
                resultado = (String)DAOItinerario.getInstance().buscarItinerario((String)campo,(String)tBuscar.getSelectedItem());
                TelaEItinerario.getInstance().setText(resultado);
            }
            TelaEItinerario.getInstance().setVisible(true);  
        });
    }
    
    public static TelaBItinerario getInstance(){
        if(tela == null){
            tela = new TelaBItinerario();
        }
        return tela;
    };    
    
    private void initb(){
        btBuscar.setBounds(125, 330, 120, 25);
        this.add(btBuscar);
        tBuscar.setBounds(135, 25, 200, 25);
        tBuscar.addActionListener(tBuscar);
        
        this.add(txtSaida);
        txtSaida.setBounds(80, 120, 150, 25);
        this.add(tSaida);
        tSaida.setBounds(200, 120, 150, 25);

        this.add(txtDestino);
        txtDestino.setBounds(80, 120, 150, 25);
        this.add(tDestino);
        tDestino.setBounds(200, 120, 150, 25);

        this.add(txtMotorista);
        txtMotorista.setBounds(80, 120, 150, 25);
        this.add(tMotorista);
        tMotorista.setBounds(200, 120, 150, 25);

        this.add(txtPlaca);
        txtPlaca.setBounds(80, 120, 150, 25);
        this.add(tPlaca);
        tPlaca.setBounds(200, 120, 150, 25);
        
        this.add(txtHora);
        txtHora.setBounds(80, 120, 150, 25);
        this.add(tHora);
        tHora.setBounds(200, 120, 150, 25);
        
        setAllInvisible();
         
        ItemListener itemListener = (ItemEvent itemEvent) -> {
            if(itemEvent.getItem() == "Selecionar"){
                setAllInvisible();
            }
            else if(itemEvent.getItem() == "End. Saida"){
                setSaidaVisible();
            }
            else if(itemEvent.getItem() == "End. Destino"){
                setDestinoVisible();
            }
            else if(itemEvent.getItem() == "Motorista"){
                setMotoristaVisible();
            }
            else if(itemEvent.getItem() == "Placa do Veiculo"){
                setPlacaVisible();
            }
            else if(itemEvent.getItem() == "Horário"){
                setHoraVisible();
            }
        };
        tBuscar.addItemListener(itemListener);
        this.add(tBuscar);
    }
    
    private void setSaidaVisible(){
        limpaCampos();
        txtSaida.setVisible(true);
        tSaida.setVisible(true);
        
        txtDestino.setVisible(false);
        tDestino.setVisible(false);
        txtMotorista.setVisible(false);
        tMotorista.setVisible(false);
        txtPlaca.setVisible(false);
        tPlaca.setVisible(false);
        txtHora.setVisible(false);
        tHora.setVisible(false);
    }
    
    private void setDestinoVisible(){
        limpaCampos();
        txtSaida.setVisible(false);
        tSaida.setVisible(false);
        
        txtDestino.setVisible(true);
        tDestino.setVisible(true);
        
        txtMotorista.setVisible(false);
        tMotorista.setVisible(false);
        txtPlaca.setVisible(false);
        tPlaca.setVisible(false);
        txtHora.setVisible(false);
        tHora.setVisible(false);
    }
    
    private void setMotoristaVisible(){
        limpaCampos();
        txtSaida.setVisible(false);
        tSaida.setVisible(false);
        txtDestino.setVisible(false);
        tDestino.setVisible(false);
        
        txtMotorista.setVisible(true);
        tMotorista.setVisible(true);
        
        txtPlaca.setVisible(false);
        tPlaca.setVisible(false);
        txtHora.setVisible(false);
        tHora.setVisible(false);
    }
    
    private void setPlacaVisible(){
        limpaCampos();
        txtSaida.setVisible(false);
        tSaida.setVisible(false);
        txtDestino.setVisible(false);
        tDestino.setVisible(false);
        txtMotorista.setVisible(false);
        tMotorista.setVisible(false);
        
        txtPlaca.setVisible(true);
        tPlaca.setVisible(true);
        
        txtHora.setVisible(false);
        tHora.setVisible(false);
    }

    
    private void setHoraVisible(){
        limpaCampos();
        txtSaida.setVisible(false);
        tSaida.setVisible(false);
        txtDestino.setVisible(false);
        tDestino.setVisible(false);
        txtMotorista.setVisible(false);
        tMotorista.setVisible(false);
        txtPlaca.setVisible(false);
        tPlaca.setVisible(false);
        
        txtHora.setVisible(true);
        tHora.setVisible(true);
    }
    
    private void setAllInvisible(){
        limpaCampos();
        txtSaida.setVisible(false);
        tSaida.setVisible(false);
        txtDestino.setVisible(false);
        tDestino.setVisible(false);
        txtMotorista.setVisible(false);
        tMotorista.setVisible(false);
        txtPlaca.setVisible(false);
        tPlaca.setVisible(false);
        txtHora.setVisible(false);
        tHora.setVisible(false);
    }
    
    private void limpaCampos(){
        tSaida.setText("");
        tDestino.setText("");
        tMotorista.setText("");
        tPlaca.setText("");
        tHora.setText("");
    }
}
