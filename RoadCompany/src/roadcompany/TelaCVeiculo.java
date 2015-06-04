package roadcompany;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class TelaCVeiculo extends JFrame {
    private static TelaCVeiculo tela;
    JButton btCancelar = new JButton("Cancelar");
    JButton btCadastrar = new JButton("Cadastrar");
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
        
    private TelaCVeiculo() {
        super();
        //CONFIGS DA TELA
        this.setLayout(null);
        this.setPreferredSize(new java.awt.Dimension(500, 400));
        this.setSize(500, 400);
        this.setResizable(false);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);    
        this.setTitle("Cadastrar Veículo");
        this.setLocationRelativeTo(null);  
        this.setAutoRequestFocus(true);
        this.setAlwaysOnTop(true);
        this.setVisible(true);

        //LAYOUT DA TELA
        initTelaCVeiculo();

        //FUNCOES DE BOTOES
        btCancelar.addActionListener( (ActionEvent e) -> {  this.dispose();} );
        btCadastrar.addActionListener( (ActionEvent e) -> { /*ADCIONAR COMANDOS PARA CADASTRRA AQUI*/ });
    }
    
    public static TelaCVeiculo getInstance(){
        if(tela == null){
            tela = new TelaCVeiculo();
        }
        return tela;
    };    
    
    private void initTelaCVeiculo(){
        btCadastrar.setBounds(125, 330, 120, 25);
        this.add(btCadastrar); 
        btCancelar.setBounds(255, 330, 120, 25);
        this.add(btCancelar);

        this.add(txtModelo);
        txtModelo.setBounds(80, 50, 150, 25);
        this.add(tModelo);
        tModelo.setBounds(200, 50, 150, 25);

        this.add(txtPlaca);
        txtPlaca.setBounds(80, 85, 150, 25);
        this.add(tPlaca);
        tPlaca.setBounds(200, 85, 150, 25);

        this.add(txtDisponivel);
        txtDisponivel.setBounds(80, 120, 150, 25);
        this.add(tDisponivelV);
        this.add(tDisponivelF);
        tDisponivelV.setText("Disponível");
        tDisponivelF.setText("Indisponível");
        tDisponivelV.setBounds(200, 120, 100, 25);
        tDisponivelF.setBounds(300, 120, 150, 25);
        group.add(tDisponivelV);
        group.add(tDisponivelF);

        this.add(txtRev);
        txtRev.setBounds(80, 155, 150, 25);
        this.add(tRev);
        tRev.setBounds(200, 155, 150, 25);

        this.add(txtObs);
        txtObs.setBounds(80, 190, 150, 25);
        this.add(tObs);
        tObs.setBounds(200, 190, 150, 100);
    }
}
