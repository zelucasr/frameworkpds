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

public class TelaBItinerario extends JFrame{
    private static TelaBItinerario tela;
    JButton btCancelar = new JButton("Cancelar");
    JButton btBuscar = new JButton("Buscar");
    //Campos para preencher:
    JLabel txtSaida = new JLabel("End. Saida:");
    JTextField tSaida = new JTextField();
    JLabel txtDestino = new JLabel("End. Destino:");
    JTextField tDestino = new JTextField();
    JLabel txtMotorista = new JLabel("Motorista:");
    JTextField tMotorista = new JTextField();
    JLabel txtPlaca = new JLabel("Plava do Veiculo:");
    JTextField tPlaca = new JTextField();
    JLabel txtData = new JLabel("Data:");
    JTextField tData = new JTextField();
    JLabel txtHora = new JLabel("Horário:");
    JTextField tHora = new JTextField();
    JLabel txtBuscar = new JLabel("Buscar por:");
    String[] Opcoes = {"Selecionar" ,"End. Saida", "End. Destino", "Motorista", "Placa do Veiculo", "Data", "Horário"};
    JComboBox tBuscar = new JComboBox(Opcoes);
        
    private TelaBItinerario() {
        super();
        //CONFIGS DA TELA
        this.setLayout(null);
        this.setPreferredSize(new java.awt.Dimension(370, 220));
        this.setSize(370, 220);
        this.setResizable(false);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);    
        this.setTitle("Buscar Itinerario");
        this.setLocationRelativeTo(null);  
        this.setAutoRequestFocus(true);
        this.setAlwaysOnTop(true);
        this.setVisible(true);

        //LAYOUT DA TELA
        initTelaBItinerario();

        //FUNCOES DE BOTOES
        btCancelar.addActionListener( (ActionEvent e) -> {  this.dispose();} );
        btBuscar.addActionListener( (ActionEvent e) -> { /*ADCIONAR COMANDOS PARA BUSCAR AQUI*/ });
    }
    
    public static TelaBItinerario getInstance(){
        if(tela == null){
            tela = new TelaBItinerario();
        }
        return tela;
    };    
    
    private void initTelaBItinerario(){
        btCancelar.setBounds(190, 145, 120, 25);
        this.add(btCancelar);
        btBuscar.setBounds(60, 145, 120, 25);
        this.add(btBuscar);
        txtBuscar.setBounds(25, 25, 100, 25);
        this.add(txtBuscar);
        tBuscar.setBounds(135, 25, 200, 25);
        tBuscar.addActionListener(tBuscar);
        
        this.add(txtSaida);
        txtSaida.setBounds(25, 85, 150, 25);
        this.add(tSaida);          
        tSaida.setBounds(135, 85, 200, 25);
        
        this.add(txtDestino);
        txtDestino.setBounds(25, 85, 150, 25);
        this.add(tDestino);
        tDestino.setBounds(135, 85, 200, 25);
        
        this.add(txtMotorista);
        txtMotorista.setBounds(25, 85, 150, 25);
        this.add(tMotorista);
        tMotorista.setBounds(135, 85, 200, 25);
        
        this.add(txtPlaca);
        txtPlaca.setBounds(25, 85, 150, 25);
        this.add(tPlaca);
        tPlaca.setBounds(135, 85, 200, 25);
        
        this.add(txtData);
        txtData.setBounds(25, 85, 150, 25);
        this.add(tData);
        tData.setBounds(135, 85, 200, 25);
        
        this.add(txtHora);
        txtHora.setBounds(25, 85, 150, 25);
        this.add(tHora);
        tHora.setBounds(135, 85, 200, 25);
        
        setAllInvisible();
         
        ItemListener itemListener = new ItemListener() {
            public void itemStateChanged(ItemEvent itemEvent) {
                if(itemEvent.getItem() == "Selecionar"){
                    setAllInvisible();
                }
                if(itemEvent.getItem() == "End. Saida"){
                    setSaidaVisible();
                }
                if(itemEvent.getItem() == "End. Destino"){
                    setDestinoVisible();
                }
                if(itemEvent.getItem() == "Motorista"){
                    setMotoristaVisible();
                }
                if(itemEvent.getItem() == "Placa do Veiculo"){
                    setPlacaVisible();
                }
                if(itemEvent.getItem() == "Data"){
                    setDataVisible();
                }
                if(itemEvent.getItem() == "Horário"){
                    setHoraVisible();
                }
            }
        };
        tBuscar.addItemListener(itemListener);
        this.add(tBuscar);
        }
    
    static private String selectedString(ItemSelectable is) {
        Object selected[] = is.getSelectedObjects();
        return ((selected.length == 0) ? "null" : (String) selected[0]);
    }
    
    private void setSaidaVisible(){
        txtSaida.setVisible(true);
        tSaida.setVisible(true);
        
        txtDestino.setVisible(false);
        tDestino.setVisible(false);
        txtMotorista.setVisible(false);
        tMotorista.setVisible(false);
        txtPlaca.setVisible(false);
        tPlaca.setVisible(false);
        txtData.setVisible(false);
        tData.setVisible(false);
        txtHora.setVisible(false);
        tHora.setVisible(false);
    }
    
    private void setDestinoVisible(){
        txtSaida.setVisible(false);
        tSaida.setVisible(false);
        
        txtDestino.setVisible(true);
        tDestino.setVisible(true);
        
        txtMotorista.setVisible(false);
        tMotorista.setVisible(false);
        txtPlaca.setVisible(false);
        tPlaca.setVisible(false);
        txtData.setVisible(false);
        tData.setVisible(false);
        txtHora.setVisible(false);
        tHora.setVisible(false);
    }
    
    private void setMotoristaVisible(){
        txtSaida.setVisible(false);
        tSaida.setVisible(false);
        txtDestino.setVisible(false);
        tDestino.setVisible(false);
        
        txtMotorista.setVisible(true);
        tMotorista.setVisible(true);
        
        txtPlaca.setVisible(false);
        tPlaca.setVisible(false);
        txtData.setVisible(false);
        tData.setVisible(false);
        txtHora.setVisible(false);
        tHora.setVisible(false);
    }
    
    private void setPlacaVisible(){
        txtSaida.setVisible(false);
        tSaida.setVisible(false);
        txtDestino.setVisible(false);
        tDestino.setVisible(false);
        txtMotorista.setVisible(false);
        tMotorista.setVisible(false);
        
        txtPlaca.setVisible(true);
        tPlaca.setVisible(true);
        
        txtData.setVisible(false);
        tData.setVisible(false);
        txtHora.setVisible(false);
        tHora.setVisible(false);
    }
    
    private void setDataVisible(){
        txtSaida.setVisible(false);
        tSaida.setVisible(false);
        txtDestino.setVisible(false);
        tDestino.setVisible(false);
        txtMotorista.setVisible(false);
        tMotorista.setVisible(false);
        txtPlaca.setVisible(false);
        tPlaca.setVisible(false);
        
        txtData.setVisible(true);
        tData.setVisible(true);
        
        txtHora.setVisible(false);
        tHora.setVisible(false);
    }
    
    private void setHoraVisible(){
        txtSaida.setVisible(false);
        tSaida.setVisible(false);
        txtDestino.setVisible(false);
        tDestino.setVisible(false);
        txtMotorista.setVisible(false);
        tMotorista.setVisible(false);
        txtPlaca.setVisible(false);
        tPlaca.setVisible(false);
        txtData.setVisible(false);
        tData.setVisible(false);
        
        txtHora.setVisible(true);
        tHora.setVisible(true);
    }
    
    private void setAllInvisible(){
        txtSaida.setVisible(false);
        tSaida.setVisible(false);
        txtDestino.setVisible(false);
        tDestino.setVisible(false);
        txtMotorista.setVisible(false);
        tMotorista.setVisible(false);
        txtPlaca.setVisible(false);
        tPlaca.setVisible(false);
        txtData.setVisible(false);
        tData.setVisible(false);
        txtHora.setVisible(false);
        tHora.setVisible(false);
    }
}
