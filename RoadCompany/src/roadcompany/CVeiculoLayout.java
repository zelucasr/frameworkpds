
package roadcompany;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CVeiculoLayout { //LAYOUT 2
    JPanel CadastroVeiculo = new JPanel();
    JLabel busao = new JLabel();
    CLayout controlador;
    JButton btBack = new JButton("Voltar");
    //Campos para preencher:
    JTextField tModelo = new JTextField();
    JTextField tPlaca = new JTextField();
    JTextField tDisponivel = new JTextField();
    JTextField tRev = new JTextField();
    JTextField tObs = new JTextField();
        
    public CVeiculoLayout(){
        busao.setIcon(new javax.swing.ImageIcon("C:\\Users\\Zé\\Documents\\GitHub\\projetopds\\frameworkpds\\RoadCompany\\src\\roadcompany\\img\\mainwindow.jpg"));
        
        btBack.addActionListener(new ActionListener(){ //BOTÃO CADASTRAR VEÍCULO
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.setLayout(1);
            }
            });
        
    }
    
    public void setControlador(CLayout controlador) {
        this.controlador = controlador;
    }

    public JPanel getCadastroVeiculo() { //Retorna Tela de cadastro de veículo
        initCadastroVeiculo();
        return CadastroVeiculo;
    }
    
    public void initCadastroVeiculo(){ //Tela de cadastro de Veículo
         CadastroVeiculo.setLayout(null);
         CadastroVeiculo.setPreferredSize(new java.awt.Dimension(800, 600));
         CadastroVeiculo.setSize(800, 600);
            /*-Modelo
            -Ano
            -Placa
            -Disponibilidade (bool)
            -DataRevisão
            -Observações*/
         /*
         CadastroVeiculo.add(tModelo);
         CadastroVeiculo.add(tPlaca);
         CadastroVeiculo.add(tDisponivel);
         CadastroVeiculo.add(tRev);
         CadastroVeiculo.add(tObs);
         */
         CadastroVeiculo.add(btBack);
         btBack.setBounds(50, 40, 200, 120);
         /*
         tModelo.setBounds(50, 40, 150, 25);
         tPlaca.setBounds(50, 85, 150, 25);
         tDisponivel.setBounds(50, 130, 150, 25);
         tRev.setBounds(50, 175, 150, 25);
         tObs.setBounds(50, 220, 150, 25);
         */
         CadastroVeiculo.add(busao);
         busao.setBounds(0, 0, 800, 600);
         
         
    }
        
}
