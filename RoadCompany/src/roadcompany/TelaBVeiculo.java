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
import roadcompany.framework.TelaBaseVeiculo;

public class TelaBVeiculo extends TelaBaseVeiculo{
    private static TelaBVeiculo tela;
    JButton btBuscar = new JButton("Buscar");
    //Campos para preencher:
    JLabel txtPlaca = new JLabel("Placa:");
    JTextField tPlaca = new JTextField();
    JLabel txtBuscar = new JLabel("Buscar por:");
    String[] Opcoes = {"Selecionar" ,"Modelo", "Placa", "Disponibilidade", "Ultima Revisão"};
    JComboBox tBuscar = new JComboBox(Opcoes);
        
    private TelaBVeiculo() {
        super();
        //CONFIGS DA TELA    
        this.setTitle("Buscar Veículo");

        //LAYOUT DA TELA
        initb();

        //FUNCOES DE BOTOES
        btBuscar.addActionListener( (ActionEvent e) -> {
            Object campo = new Object();
            String resultado = new String();
            if(tDisponivelV.isSelected()){
                resultado = (String)DAOVeiculo.getInstance().buscarVeiculo(true,(String)tBuscar.getSelectedItem());
                TelaEVeiculo.getInstance().setText(resultado);
            }
            if(tDisponivelF.isSelected()){
                resultado = (String)DAOVeiculo.getInstance().buscarVeiculo(false,(String)tBuscar.getSelectedItem());
                TelaEVeiculo.getInstance().setText(resultado);
            }
            if((String)tBuscar.getSelectedItem() == "Placa"){
                campo = (String)tPlaca.getText();
                resultado = (String)DAOVeiculo.getInstance().buscarVeiculo(campo,(String)tBuscar.getSelectedItem());
                TelaEVeiculo.getInstance().setText(resultado);
            }
            if((String)tBuscar.getSelectedItem() == "Ultima Revisão"){
                campo = (String)tRev.getText();
                resultado = (String)DAOVeiculo.getInstance().buscarVeiculo((String)campo,(String)tBuscar.getSelectedItem());
                TelaEVeiculo.getInstance().setText(resultado);
            }
            if((String)tBuscar.getSelectedItem() == "Modelo"){
                campo = (String)tModelo.getText();
                resultado = (String)DAOVeiculo.getInstance().buscarVeiculo((String)campo,(String)tBuscar.getSelectedItem());
                TelaEVeiculo.getInstance().setText(resultado);
            }
            TelaEVeiculo.getInstance().setVisible(true);  
        });
    }
    
    public static TelaBVeiculo getInstance(){
        if(tela == null){
            tela = new TelaBVeiculo();
        }
        return tela;
    };    
    
    private void initb(){
        btBuscar.setBounds(120, 330, 120, 25);
        this.add(btBuscar);
        txtBuscar.setBounds(25, 25, 100, 25);
        this.add(txtBuscar);
        tBuscar.setBounds(135, 25, 200, 25);
        tBuscar.addActionListener(tBuscar);
        
        this.add(txtModelo);
        txtModelo.setBounds(25, 85, 150, 25);
        this.add(tModelo);
        tModelo.setBounds(135, 85, 200, 25);
        this.add(txtDisponivel);
        txtDisponivel.setBounds(25, 85, 200, 25);
        this.add(tDisponivelV);
        this.add(tDisponivelF);
        tDisponivelV.setText("Disponível");
        tDisponivelF.setText("Indisponível");
        tDisponivelV.setBounds(135, 85, 100, 25);
        tDisponivelF.setBounds(235, 85, 150, 25);
        group.add(tDisponivelV);
        group.add(tDisponivelF);

        this.add(txtRev);
        txtRev.setBounds(25, 85, 150, 25);
        this.add(tRev);
        tRev.setBounds(135, 85, 150, 25);
        
        this.add(txtPlaca);
        txtPlaca.setBounds(25, 85, 150, 25);
        this.add(tPlaca);
        tPlaca.setBounds(135, 85, 200, 25);
        
        setAllInvisible();
         
        ItemListener itemListener = (ItemEvent itemEvent) -> {
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
        };
        tBuscar.addItemListener(itemListener);
        this.add(tBuscar);
        txtObs.setVisible(false);
        tObs.setVisible(false);
        }
    
    private void setModeloVisible(){
        limpaCampos();
        
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
        limpaCampos();
        
        txtPlaca.setVisible(true);
        tPlaca.setVisible(true);
        
        tModelo.setVisible(false);
        txtModelo.setVisible(false);
        txtDisponivel.setVisible(false);
        tDisponivelV.setVisible(false);
        tDisponivelF.setVisible(false);
        txtRev.setVisible(false);
        tRev.setVisible(false);
    }
    
    private void setDisponibilidadeVisible(){
        limpaCampos();
        
        txtDisponivel.setVisible(true);
        tDisponivelV.setVisible(true);
        tDisponivelF.setVisible(true);
        
        tModelo.setVisible(false);
        txtModelo.setVisible(false);
        txtPlaca.setVisible(false);
        tPlaca.setVisible(false);
        txtRev.setVisible(false);
        tRev.setVisible(false);
    }
    
    private void setURevVisible(){
        limpaCampos();
        
        txtRev.setVisible(true);
        tRev.setVisible(true);
        
        tModelo.setVisible(false);
        txtModelo.setVisible(false);
        txtPlaca.setVisible(false);
        tPlaca.setVisible(false);
        txtDisponivel.setVisible(false);
        tDisponivelV.setVisible(false);
        tDisponivelF.setVisible(false);
    }
    
    private void setAllInvisible(){
        limpaCampos();
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
    
    private void limpaCampos(){
        tModelo.setText("");
        tPlaca.setText("");
        group.clearSelection();
        tRev.setText("");
    }
}