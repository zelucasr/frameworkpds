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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaECliente extends JFrame{
    private static TelaECliente tela;
    JButton btVoltar = new JButton("Voltar");
    
    private TelaECliente(){
        super();
        //CONFIGS DA TELA
        this.setLayout(null);
        this.setPreferredSize(new java.awt.Dimension(1024, 768));
        this.setSize(1024, 768);
        this.setResizable(false);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE); 
        this.setTitle("Agreste Road Company");
        this.setLocationRelativeTo(null); 
        this.setAlwaysOnTop(true);
        this.setVisible(true);
        
        //LAYOUT
        initTelaECliente();
        
        //CONFIG BOTOES
    }
    
    public static TelaECliente getInstance(){
        if(tela == null){
            tela = new TelaECliente();
        }
        return tela;
    }

    public void initTelaECliente(){
        this.add(btVoltar);
        btVoltar.setBounds(462, 693, 100, 25);
    }
}