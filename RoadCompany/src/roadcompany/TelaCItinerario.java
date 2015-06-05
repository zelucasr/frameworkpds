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

public class TelaCItinerario extends JFrame{
    private static TelaCItinerario tela;
    JButton btCancelar = new JButton("Cancelar");
    JButton btCadastrar = new JButton("Cadastrar");
    //Campos para preencher:
    JLabel txtSaida = new JLabel("End. Saida:");
    JTextField tSaida = new JTextField();
    JLabel txtDestino = new JLabel("End. Destino:");
    JTextField tDestino = new JTextField();
    JLabel txtMotorista = new JLabel("Motorista:");
    JTextField tMotorista = new JTextField();
    JLabel txtPlaca = new JLabel("Placa do Veiculo:");
    JTextField tPlaca = new JTextField();
    JLabel txtData = new JLabel("Data:");
    JTextField tData = new JTextField();
    JLabel txtHora = new JLabel("Horario:");
    JTextField tHora = new JTextField();
        
    private TelaCItinerario(){
        super();
        //CONFIGS DA TELA
        this.setLayout(null);
        this.setPreferredSize(new java.awt.Dimension(500, 400));
        this.setSize(500, 400);
        this.setResizable(false);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE); 
        this.setTitle("Cadastrar Itinerário");
        this.setLocationRelativeTo(null);  
         this.setAlwaysOnTop(true);
        this.setVisible(true);
        
        //LAYOUT
        initTelaCItinerario();
        
        //CONFIG BOTOES
        btCancelar.addActionListener( (ActionEvent e) -> {  this.dispose(); } );
        btCadastrar.addActionListener( (ActionEvent e) -> { /*ADCIONAR COMANDOS PARA CADASTRRA AQUI*/ });
    }
    
    public static TelaCItinerario getInstance(){
        if(tela == null){
            tela = new TelaCItinerario();
        }
        return tela;
    }; 
    
    public void initTelaCItinerario(){ //Tela de cadastro de Veículo
        btCadastrar.setBounds(125, 330, 120, 25);
        this.add(btCadastrar); 
        btCancelar.setBounds(255, 330, 120, 25);
        this.add(btCancelar);

        this.add(txtSaida);
        txtSaida.setBounds(80, 50, 150, 25);
        this.add(tSaida);
        tSaida.setBounds(200, 50, 150, 25);

        this.add(txtDestino);
        txtDestino.setBounds(80, 85, 150, 25);
        this.add(tDestino);
        tDestino.setBounds(200, 85, 150, 25);

        this.add(txtMotorista);
        txtMotorista.setBounds(80, 120, 150, 25);
        this.add(tMotorista);
        tMotorista.setBounds(200, 120, 150, 25);

        this.add(txtPlaca);
        txtPlaca.setBounds(80, 155, 150, 25);
        this.add(tPlaca);
        tPlaca.setBounds(200, 155, 150, 25);
        
        this.add(txtData);
        txtData.setBounds(80, 190, 150, 25);
        this.add(tData);
        tData.setBounds(200, 190, 150, 25);
        
        this.add(txtHora);
        txtHora.setBounds(80, 225, 150, 25);
        this.add(tHora);
        tHora.setBounds(200, 225, 150, 25);
        
        // saída, destino, motorista , veículo data, horário,
    }
}
