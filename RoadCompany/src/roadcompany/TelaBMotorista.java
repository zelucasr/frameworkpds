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

public class TelaBMotorista extends JFrame{
    private static TelaBMotorista tela;
    JButton btCancelar = new JButton("Cancelar");
    JButton btBuscar = new JButton("Buscar");
    //Campos para preencher:
    JLabel txtNome = new JLabel("Nome:");
    JTextField tNome = new JTextField();
    JLabel txtCpf = new JLabel("CPF:");
    JTextField tCpf = new JTextField();
    JLabel txtHabil = new JLabel("Habilitação:");
    JTextField tHabil = new JTextField();
    JLabel txtTel = new JLabel("Telefone:");
    JTextField tTel = new JTextField();
    JLabel txtBuscar = new JLabel("Buscar por:");
    String[] Opcoes = {"Selecionar" ,"Nome", "CPF", "Habilitação", "Telefone"};
    JComboBox tBuscar = new JComboBox(Opcoes);
        
    private TelaBMotorista() {
        super();
        //CONFIGS DA TELA
        this.setLayout(null);
        this.setPreferredSize(new java.awt.Dimension(370, 220));
        this.setSize(370, 220);
        this.setResizable(false);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);    
        this.setTitle("Buscar Motorista");
        this.setLocationRelativeTo(null);  
        this.setAutoRequestFocus(true);
        this.setAlwaysOnTop(true);
        this.setVisible(true);

        //LAYOUT DA TELA
        initTelaBMotorista();

        //FUNCOES DE BOTOES
        btCancelar.addActionListener( (ActionEvent e) -> {  this.dispose();} );
        btBuscar.addActionListener( (ActionEvent e) -> { /*ADCIONAR COMANDOS PARA BUSCAR AQUI*/ });
    }
    
    public static TelaBMotorista getInstance(){
        if(tela == null){
            tela = new TelaBMotorista();
        }
        return tela;
    };    
    
    private void initTelaBMotorista(){
        btCancelar.setBounds(190, 145, 120, 25);
        this.add(btCancelar);
        btBuscar.setBounds(60, 145, 120, 25);
        this.add(btBuscar);
        txtBuscar.setBounds(25, 25, 100, 25);
        this.add(txtBuscar);
        tBuscar.setBounds(135, 25, 200, 25);
        tBuscar.addActionListener(tBuscar);
        
        this.add(txtNome);
        txtNome.setBounds(25, 85, 150, 25);
        this.add(tNome);          
        tNome.setBounds(135, 85, 200, 25);
        
        this.add(txtCpf);
        txtCpf.setBounds(25, 85, 150, 25);
        this.add(tCpf);
        tCpf.setBounds(135, 85, 200, 25);
        
        this.add(txtHabil);
        txtHabil.setBounds(25, 85, 150, 25);
        this.add(tHabil);
        tHabil.setBounds(135, 85, 200, 25);
        
        
        this.add(txtTel);
        txtTel.setBounds(25, 85, 150, 25);
        this.add(tTel);
        tTel.setBounds(135, 85, 200, 25);
        
        setAllInvisible();
         
        ItemListener itemListener = new ItemListener() {
            public void itemStateChanged(ItemEvent itemEvent) {
                if(itemEvent.getItem() == "Selecionar"){
                    setAllInvisible();
                }
                if(itemEvent.getItem() == "Nome"){
                    setNomeVisible();
                }
                if(itemEvent.getItem() == "CPF"){
                    setCpfVisible();
                }
                if(itemEvent.getItem() == "Habilitação"){
                    setHabilVisible();
                }
                if(itemEvent.getItem() == "Telefone"){
                    setTelVisible();
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
    
    private void setNomeVisible(){
        txtNome.setVisible(true);
        tNome.setVisible(true);
        txtCpf.setVisible(false);
        tCpf.setVisible(false);
        txtHabil.setVisible(false);
        tHabil.setVisible(false);
        txtTel.setVisible(false);
        tTel.setVisible(false);
    }
    
    private void setCpfVisible(){
        txtNome.setVisible(false);
        tNome.setVisible(false);
        txtCpf.setVisible(true);
        tCpf.setVisible(true);
        txtHabil.setVisible(false);
        tHabil.setVisible(false);
        txtTel.setVisible(false);
        tTel.setVisible(false);
    }
    
    private void setHabilVisible(){
        txtNome.setVisible(false);
        tNome.setVisible(false);
        txtCpf.setVisible(false);
        tCpf.setVisible(false);
        txtHabil.setVisible(true);
        tHabil.setVisible(true);
        txtTel.setVisible(false);
        tTel.setVisible(false);
    }
    
    private void setTelVisible(){
        txtNome.setVisible(false);
        tNome.setVisible(false);
        txtCpf.setVisible(false);
        tCpf.setVisible(false);
        txtHabil.setVisible(false);
        tHabil.setVisible(false);
        txtTel.setVisible(true);
        tTel.setVisible(true);
    }
    
    private void setAllInvisible(){
        txtNome.setVisible(false);
        tNome.setVisible(false);
        txtCpf.setVisible(false);
        tCpf.setVisible(false);
        txtHabil.setVisible(false);
        tHabil.setVisible(false);
        txtTel.setVisible(false);
        tTel.setVisible(false);
    }
}