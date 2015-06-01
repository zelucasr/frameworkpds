package roadcompany;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class TelaCVeiculo { //LAYOUT 2
    JPanel CadastroVeiculo = new JPanel();
    JLabel busao = new JLabel();
    CLayout controlador;
    JButton btBack = new JButton("Voltar");
    //Campos para preencher:
    JLabel txtModelo = new JLabel("Modelo:");
    JTextField tModelo = new JTextField();
    JLabel txtPlaca = new JLabel("Placa:");
    JTextField tPlaca = new JTextField();
    JLabel txtDisponivel = new JLabel("Disponibilidade:");
    JRadioButton tDisponivelV = new JRadioButton();
    JRadioButton tDisponivelF = new JRadioButton();
    ButtonGroup group = new ButtonGroup();
    JLabel txtRev = new JLabel("Última revisão:");
    JTextField tRev = new JTextField();
    JLabel txtObs = new JLabel("Observações:");
    JTextArea tObs = new JTextArea();
        
    public TelaCVeiculo(){
        btBack.addActionListener((ActionEvent e) -> { controlador.setLayout(1); } ); //BOTÃO VOLTAR
    }
    
    public void setControlador(CLayout controlador) {
        this.controlador = controlador;
    }

    public JPanel getCadastroVeiculo() { //Retorna Tela de cadastro de veículo
        initCadastroVeiculo();
        System.out.println("teste");
        return CadastroVeiculo;
    }
    
    public void initCadastroVeiculo(){ //Tela de cadastro de Veículo
         CadastroVeiculo.setLayout(null);
         CadastroVeiculo.setPreferredSize(new java.awt.Dimension(800, 600));
         CadastroVeiculo.setSize(800, 600);
         busao.setIcon(new javax.swing.ImageIcon("C:\\Users\\CH1CO\\Desktop\\Git\\frameworkpds\\frameworkpds\\RoadCompany\\src\\img\\busao.jpg"));
         CadastroVeiculo.add(busao);
         busao.setBounds(646, 466, 154, 134);
         CadastroVeiculo.add(btBack);
         btBack.setBounds(710, 10, 80, 25);
         
         CadastroVeiculo.add(txtModelo);
         txtModelo.setBounds(80, 50, 150, 25);
         CadastroVeiculo.add(tModelo);
         tModelo.setBounds(200, 50, 150, 25);
         
         CadastroVeiculo.add(txtPlaca);
         txtPlaca.setBounds(80, 85, 150, 25);
         CadastroVeiculo.add(tPlaca);
         tPlaca.setBounds(200, 85, 150, 25);
         
         CadastroVeiculo.add(txtDisponivel);
         txtDisponivel.setBounds(80, 120, 150, 25);
         CadastroVeiculo.add(tDisponivelV);
         CadastroVeiculo.add(tDisponivelF);
         tDisponivelV.setText("Disponível");
         tDisponivelF.setText("Indisponível");
         tDisponivelV.setBounds(200, 120, 100, 25);
         tDisponivelF.setBounds(300, 120, 150, 25);
         group.add(tDisponivelV);
         group.add(tDisponivelF);
         
         CadastroVeiculo.add(txtRev);
         txtRev.setBounds(80, 155, 150, 25);
         CadastroVeiculo.add(tRev);
         tRev.setBounds(200, 155, 150, 25);
         
         CadastroVeiculo.add(txtObs);
         txtObs.setBounds(80, 190, 150, 25);
         CadastroVeiculo.add(tObs);
         tObs.setBounds(200, 190, 150, 100);
         
         System.out.println(btBack.getBounds());
    }
        
}
