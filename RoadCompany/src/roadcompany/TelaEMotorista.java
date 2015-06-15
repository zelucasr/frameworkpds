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
import roadcompany.framework.TelaBaseMotorista;

public class TelaEMotorista extends TelaBaseMotorista{
    private static TelaEMotorista tela;
    
    private TelaEMotorista(){
        super();
        //CONFIGS DA TELA
        btCancelar.setName("Voltar");
        this.setTitle("Agreste Road Company - Motoristas");
        
        //LAYOUT
        inite();
        
        //CONFIG BOTOES
    }
    
    public static TelaEMotorista getInstance(){
        if(tela == null){
            tela = new TelaEMotorista();
        }
        return tela;
    }
    
    public void inite(){
        this.add(btCancelar);
        btCancelar.setBounds(462, 693, 100, 25);
    }
}