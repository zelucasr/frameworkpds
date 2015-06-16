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
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class TelaConfirmSair extends JDialog{
    private static TelaConfirmSair tela;
    JButton btCancelar = new JButton("Cancelar");
    JButton btSair = new JButton("Sair");
    //Campos para preencher:
    JLabel txtNome = new JLabel("Deseja realmente sair?");
        
    private TelaConfirmSair(){
        //CONFIGS DA TELA
        this.setLayout(null);
        this.setPreferredSize(new java.awt.Dimension(500, 400));
        this.setSize(200, 150);
        this.setResizable(false);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE); 
        this.setTitle("Agreste RC");
        this.setLocationRelativeTo(null); 
        this.setAlwaysOnTop(true);
        this.setVisible(true);
        
        //LAYOUT
        initConfirmSair();
        
        //CONFIGS BOTOES
        btCancelar.addActionListener( (ActionEvent e) -> {  this.dispose(); } );
        btSair.addActionListener( (ActionEvent e) -> { Runtime.getRuntime().exit(0); });
    }
    
    public static TelaConfirmSair getInstance(){
        if(tela == null){
            tela = new TelaConfirmSair();
        }
        return tela;
    }; 
    
    public void initConfirmSair(){ //Tela de cadastro de Veículo
        this.add(txtNome);
        txtNome.setBounds(25, 15, 150, 25);
        btSair.setBounds(40, 50, 100, 25);
        this.add(btSair); 
        btCancelar.setBounds(40, 85, 100, 25);
        this.add(btCancelar);
         
        
    }   
}
