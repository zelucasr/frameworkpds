package roadcompany;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaPrincipal {  //LAYOUT 1
    JPanel telaPrincipal = new JPanel();
    JLabel busao = new JLabel();
    JButton btCVeiculo = new JButton("Cadastrar Veículo");
    JButton btCCliente = new JButton("Cadastrar Cliente");
    JButton btCMotorista = new JButton("Cadastrar Motorista");
    CLayout controlador;
    
    public TelaPrincipal(){
            btCVeiculo.addActionListener( (ActionEvent e) -> { controlador.setLayout(2); } );//BOTÃO CADASTRAR VEÍCULO
            btCCliente.addActionListener( (ActionEvent e) -> { controlador.setLayout(3); } );//BOTÃO CADASTRAR CLIENTE
            btCMotorista.addActionListener( (ActionEvent e) -> { controlador.setLayout(4); } );//BOTÃO CADASTRAR MOTORISTA
    }

    public void setControlador(CLayout controlador) {
        this.controlador = controlador;
    }
    
    public JPanel getTelaPrincipal() {
        initTelaPrincipal();
        return telaPrincipal;
    }
    
    public void initTelaPrincipal() {
         telaPrincipal.setLayout(null);
         telaPrincipal.setPreferredSize(new java.awt.Dimension(800, 600));
         telaPrincipal.setSize(800, 600);
         busao.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("img/busao.jpg")));
         telaPrincipal.add(busao);
         busao.setBounds(646, 466, 154, 134);
         telaPrincipal.add(btCVeiculo);
         btCVeiculo.setBounds(50, 40, 150, 50);
         telaPrincipal.add(btCMotorista);
         btCMotorista.setBounds(50, 100, 150, 50);
         telaPrincipal.add(btCCliente);
         btCCliente.setBounds(50, 160, 150, 50);
     }
}