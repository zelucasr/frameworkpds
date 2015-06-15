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
public abstract class TelaBaseMotorista extends JFrame{
    protected JButton btCancelar = new JButton("Cancelar");
    //Campos que toda instancia terá
    protected JLabel txtNome = new JLabel("Nome:");
    protected JTextField tNome = new JTextField();
    protected JLabel txtCpf = new JLabel("CPF:");
    protected JTextField tCpf = new JTextField();
    protected JLabel txtTelefone = new JLabel("Telefone:");
    protected JTextField tTelefone = new JTextField();
    
    public TelaBaseMotorista(){
        super();
        //CONFIGS DA TELA
        this.setLayout(null);
        this.setPreferredSize(new java.awt.Dimension(500, 400));
        this.setSize(500, 400);
        this.setResizable(false);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);  
        init();
        btCancelar.addActionListener( (ActionEvent e) -> {  this.dispose(); } );
    }
    
    public void init(){
        btCancelar.setBounds(255, 330, 120, 25);
        this.add(btCancelar);
        
        this.add(txtNome);
        txtNome.setBounds(80, 50, 150, 25);
        this.add(tNome);
        tNome.setBounds(200, 50, 150, 25);
        this.add(txtCpf);
        txtCpf.setBounds(80, 85, 150, 25);
        this.add(tCpf);
        tCpf.setBounds(200, 85, 150, 25);
        this.add(txtTelefone);
        txtTelefone.setBounds(80, 155, 150, 25);
        this.add(tTelefone);
        tTelefone.setBounds(200, 155, 150, 25);
    }
}
