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

public class TelaBVeiculo extends JFrame{
    private static TelaBVeiculo tela;
    JButton btCancelar = new JButton("Cancelar");
    JButton btBuscar = new JButton("Buscar");
    //Campos para preencher:
    JLabel txtModelo = new JLabel("Modelo:");
    JTextField tModelo = new JTextField();
    JLabel txtPlaca = new JLabel("Placa:");
    JTextField tPlaca = new JTextField();
    JLabel txtDisponivel = new JLabel("Disponibilidade:");
    JRadioButton tDisponivelV = new JRadioButton();
    JRadioButton tDisponivelF = new JRadioButton();
    ButtonGroup group = new ButtonGroup();
    JLabel txtRev = new JLabel("Última revisão:");
    JTextField tRev = new JTextField();
    JLabel txtBuscar = new JLabel("Buscar por:");
    String[] Opcoes = {"Selecionar" ,"Modelo", "Placa", "Disponibilidade", "Ultima Revisão"};
    JComboBox tBuscar = new JComboBox(Opcoes);
        
    private TelaBVeiculo() {
        super();
        //CONFIGS DA TELA
        this.setLayout(null);
        this.setPreferredSize(new java.awt.Dimension(370, 220));
        this.setSize(370, 220);
        this.setResizable(false);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);    
        this.setTitle("Buscar Veículo");
        this.setLocationRelativeTo(null);  
        this.setAutoRequestFocus(true);
        this.setAlwaysOnTop(true);
        this.setVisible(true);

        //LAYOUT DA TELA
        initTelaBVeiculo();

        //FUNCOES DE BOTOES
        btCancelar.addActionListener( (ActionEvent e) -> {  this.dispose();} );
        btBuscar.addActionListener( (ActionEvent e) -> { /*ADCIONAR COMANDOS PARA BUSCAR AQUI*/ });
    }
    
    public static TelaBVeiculo getInstance(){
        if(tela == null){
            tela = new TelaBVeiculo();
        }
        return tela;
    };    
    
    private void initTelaBVeiculo(){
        btCancelar.setBounds(190, 145, 120, 25);
        this.add(btCancelar);
        btBuscar.setBounds(60, 145, 120, 25);
        this.add(btBuscar);
        txtBuscar.setBounds(25, 25, 100, 25);
        this.add(txtBuscar);
        tBuscar.setBounds(135, 25, 200, 25);
        tBuscar.addActionListener(tBuscar);
        
        this.add(txtModelo);
        txtModelo.setBounds(25, 85, 150, 25);
        this.add(tModelo);          
        tModelo.setBounds(135, 85, 200, 25);
        
        this.add(txtPlaca);
        txtPlaca.setBounds(25, 85, 150, 25);
        this.add(tPlaca);
        tPlaca.setBounds(135, 85, 200, 25);
        
        this.add(txtDisponivel);
        txtDisponivel.setBounds(25, 85, 150, 25);
        this.add(tDisponivelV);
        this.add(tDisponivelF);
        tDisponivelV.setText("Disponível");
        tDisponivelF.setText("Indisponível");
        tDisponivelV.setBounds(135, 85, 100, 25);
        tDisponivelF.setBounds(235, 85, 100, 25);
        group.add(tDisponivelV);
        group.add(tDisponivelF);
        
        this.add(txtRev);
        txtRev.setBounds(25, 85, 150, 25);
        this.add(tRev);
        tRev.setBounds(135, 85, 200, 25);
        
        setAllInvisible();
         
        ItemListener itemListener = new ItemListener() {
            public void itemStateChanged(ItemEvent itemEvent) {
                if(itemEvent.getItem() == "Selecionar"){
                    setAllInvisible();
                }
                if(itemEvent.getItem() == "Modelo"){
                    setModeloVisible();
                }
                if(itemEvent.getItem() == "Placa"){
                    setPlacaVisible();
                }
                if(itemEvent.getItem() == "Disponibilidade"){
                    setDisponibilidadeVisible();
                }
                if(itemEvent.getItem() == "Ultima Revisão"){
                    setURevVisible();
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
    
    private void setModeloVisible(){
        tModelo.setVisible(true);
        txtModelo.setVisible(true);
        txtPlaca.setVisible(false);
        tPlaca.setVisible(false);
        txtDisponivel.setVisible(false);
        tDisponivelV.setVisible(false);
        tDisponivelF.setVisible(false);
        txtRev.setVisible(false);
        tRev.setVisible(false);
    }
    
    private void setPlacaVisible(){
        tModelo.setVisible(false);
        txtModelo.setVisible(false);
        txtPlaca.setVisible(true);
        tPlaca.setVisible(true);
        txtDisponivel.setVisible(false);
        tDisponivelV.setVisible(false);
        tDisponivelF.setVisible(false);
        txtRev.setVisible(false);
        tRev.setVisible(false);
    }
    
    private void setDisponibilidadeVisible(){
        tModelo.setVisible(false);
        txtModelo.setVisible(false);
        txtPlaca.setVisible(false);
        tPlaca.setVisible(false);
        txtDisponivel.setVisible(true);
        tDisponivelV.setVisible(true);
        tDisponivelF.setVisible(true);
        txtRev.setVisible(false);
        tRev.setVisible(false);
    }
    
    private void setURevVisible(){
        tModelo.setVisible(false);
        txtModelo.setVisible(false);
        txtPlaca.setVisible(false);
        tPlaca.setVisible(false);
        txtDisponivel.setVisible(false);
        tDisponivelV.setVisible(false);
        tDisponivelF.setVisible(false);
        txtRev.setVisible(true);
        tRev.setVisible(true);
    }
    
    private void setAllInvisible(){
        tModelo.setVisible(false);
        txtModelo.setVisible(false);
        txtPlaca.setVisible(false);
        tPlaca.setVisible(false);
        txtDisponivel.setVisible(false);
        tDisponivelV.setVisible(false);
        tDisponivelF.setVisible(false);
        txtRev.setVisible(false);
        tRev.setVisible(false);
    }
}