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
import roadcompany.framework.TelaBaseMotorista;

public class TelaBMotorista extends TelaBaseMotorista{
    private static TelaBMotorista tela;
    JButton btBuscar = new JButton("Buscar");
    //Campos para preencher:
    JLabel txtHabil = new JLabel("Habilitação:");
    JTextField tHabil = new JTextField();
    JLabel txtBuscar = new JLabel("Buscar por:");
    String[] Opcoes = {"Selecionar" ,"Nome", "CPF", "Habilitação", "Telefone"};
    JComboBox tBuscar = new JComboBox(Opcoes);
        
    private TelaBMotorista() {
        super();
        //CONFIGS DA TELA   
        this.setTitle("Buscar Motorista");

        //LAYOUT DA TELA
        initb();

        //FUNCOES DE BOTOES
        btBuscar.addActionListener( (ActionEvent e) -> { /*ADCIONAR COMANDOS PARA BUSCAR AQUI*/ });
    }
    
    public static TelaBMotorista getInstance(){
        if(tela == null){
            tela = new TelaBMotorista();
        }
        return tela;
    };    
    
    public void initb(){
        this.add(btBuscar);
        btBuscar.setBounds(120, 330, 120, 25);
        txtBuscar.setBounds(25, 25, 100, 25);
        this.add(txtBuscar);
        tBuscar.setBounds(135, 25, 200, 25);
        tBuscar.addActionListener(tBuscar);
        
        btCancelar.setBounds(255, 330, 120, 25);
        this.add(btCancelar);
        
        this.add(txtNome);
        txtNome.setBounds(25, 85, 150, 25);
        this.add(tNome);
        tNome.setBounds(135, 85, 200, 25);
        this.add(txtCpf);
        txtCpf.setBounds(25, 85, 150, 25);
        this.add(tCpf);
        tCpf.setBounds(135, 85, 200, 25);
        this.add(txtTelefone);
        txtTelefone.setBounds(25, 85, 150, 25);
        this.add(tTelefone);
        tTelefone.setBounds(135, 85, 200, 25);
        
        this.add(txtHabil);
        txtHabil.setBounds(25, 85, 150, 25);
        this.add(tHabil);
        tHabil.setBounds(135, 85, 200, 25);
        
        setAllInvisible();
         
        ItemListener itemListener = (ItemEvent itemEvent) -> {
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
        };
        tBuscar.addItemListener(itemListener);
        this.add(tBuscar);
    }
    
    private void setNomeVisible(){
        txtNome.setVisible(true);
        tNome.setVisible(true);
        txtCpf.setVisible(false);
        tCpf.setVisible(false);
        txtHabil.setVisible(false);
        tHabil.setVisible(false);
        txtTelefone.setVisible(false);
        tTelefone.setVisible(false);
    }

    private void setCpfVisible(){
        txtNome.setVisible(false);
        tNome.setVisible(false);
        txtCpf.setVisible(true);
        tCpf.setVisible(true);
        txtHabil.setVisible(false);
        tHabil.setVisible(false);
        txtTelefone.setVisible(false);
        tTelefone.setVisible(false);
    }

    private void setHabilVisible(){
        txtNome.setVisible(false);
        tNome.setVisible(false);
        txtCpf.setVisible(false);
        tCpf.setVisible(false);
        txtHabil.setVisible(true);
        tHabil.setVisible(true);
        txtTelefone.setVisible(false);
        tTelefone.setVisible(false);
    }

    private void setTelVisible(){
        txtNome.setVisible(false);
        tNome.setVisible(false);
        txtCpf.setVisible(false);
        tCpf.setVisible(false);
        txtHabil.setVisible(false);
        tHabil.setVisible(false);
        txtTelefone.setVisible(true);
        tTelefone.setVisible(true);
    }

    private void setAllInvisible(){
        txtNome.setVisible(false);
        tNome.setVisible(false);
        txtCpf.setVisible(false);
        tCpf.setVisible(false);
        txtHabil.setVisible(false);
        tHabil.setVisible(false);
        txtTelefone.setVisible(false);
        tTelefone.setVisible(false);
    }
}