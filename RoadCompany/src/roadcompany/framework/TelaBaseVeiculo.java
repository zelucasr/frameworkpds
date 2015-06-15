/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadcompany.framework;

import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author CH1CO
 */
public abstract class TelaBaseVeiculo extends JFrame{
    protected JButton btCancelar = new JButton("Cancelar");
    protected JLabel txtModelo = new JLabel("Modelo:");
    protected JTextField tModelo = new JTextField();
    protected JLabel txtDisponivel = new JLabel("Disponibilidade:");
    protected JRadioButton tDisponivelV = new JRadioButton();
    protected JRadioButton tDisponivelF = new JRadioButton();
    protected ButtonGroup group = new ButtonGroup();
    protected JLabel txtRev = new JLabel("Última revisão:");
    protected JTextField tRev = new JTextField();
    protected JLabel txtObs = new JLabel("Observações:");
    protected JTextArea tObs = new JTextArea();
    
    public TelaBaseVeiculo(){
        super();
        this.setLayout(null);
        this.setPreferredSize(new java.awt.Dimension(500, 400));
        this.setSize(500, 400);
        this.setResizable(false);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE); 
        this.setLocationRelativeTo(null); 
        
        btCancelar.addActionListener( (ActionEvent e) -> {  this.dispose();} );
        inita();
    }
    
    public void inita(){
        btCancelar.setBounds(255, 330, 120, 25);
        this.add(btCancelar);
        
        this.add(txtModelo);
        txtModelo.setBounds(80, 50, 150, 25);
        this.add(tModelo);
        tModelo.setBounds(200, 50, 150, 25);
        this.add(txtDisponivel);
        txtDisponivel.setBounds(80, 120, 150, 25);
        this.add(tDisponivelV);
        this.add(tDisponivelF);
        tDisponivelV.setText("Disponível");
        tDisponivelF.setText("Indisponível");
        tDisponivelV.setBounds(200, 120, 100, 25);
        tDisponivelF.setBounds(300, 120, 150, 25);
        group.add(tDisponivelV);
        group.add(tDisponivelF);

        this.add(txtRev);
        txtRev.setBounds(80, 155, 150, 25);
        this.add(tRev);
        tRev.setBounds(200, 155, 150, 25);

        this.add(txtObs);
        txtObs.setBounds(80, 190, 150, 25);
        this.add(tObs);
        tObs.setBounds(200, 190, 150, 100);
    }
}
