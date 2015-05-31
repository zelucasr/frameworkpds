
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
    CLayout controlador;
    
    public TelaPrincipal(){
        busao.setIcon(new javax.swing.ImageIcon("C:\\Users\\Zé\\Documents\\GitHub\\projetopds\\frameworkpds\\RoadCompany\\src\\roadcompany\\img\\mainwindow.jpg"));
        
            btCVeiculo.addActionListener(new ActionListener(){ //BOTÃO CADASTRAR VEÍCULO
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.setLayout(2);
            }
            });
            
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
         
         telaPrincipal.add(busao);
         
         busao.setBounds(0, 0, 800, 600);
         
         telaPrincipal.add(btCVeiculo);
         btCVeiculo.setBounds(50, 40, 200, 120);
     }
    
}
