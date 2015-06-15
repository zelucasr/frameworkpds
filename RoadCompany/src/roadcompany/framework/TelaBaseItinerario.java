/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadcompany.framework;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author CH1CO
 */
public abstract class TelaBaseItinerario extends JFrame{
    protected JButton btCancelar = new JButton("Cancelar");
    protected JLabel txtSaida = new JLabel("End. Saida:");
    protected JTextField tSaida = new JTextField();
    protected JLabel txtDestino = new JLabel("End. Destino:");
    protected JTextField tDestino = new JTextField();
    protected JLabel txtMotorista = new JLabel("Motorista:");
    protected JTextField tMotorista = new JTextField();
    protected JLabel txtPlaca = new JLabel("Placa do Veiculo:");
    protected JTextField tPlaca = new JTextField();
    protected JLabel txtHora = new JLabel("Horario:");
    protected JTextField tHora = new JTextField();
    
    public TelaBaseItinerario(){
        super();
        this.setLayout(null);
        this.setPreferredSize(new java.awt.Dimension(500, 400));
        this.setSize(500, 400);
        this.setResizable(false);
        this.setLocationRelativeTo(null);  
        this.setAutoRequestFocus(true);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        btCancelar.addActionListener( (ActionEvent e) -> {  this.dispose(); } );
        inita();
    }
    
    public void inita(){
        this.add(btCancelar);
        btCancelar.setBounds(255, 330, 120, 25);
        
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
        
        this.add(txtHora);
        txtHora.setBounds(80, 190, 150, 25);
        this.add(tHora);
        tHora.setBounds(200, 190, 150, 25);
    }
    
}
