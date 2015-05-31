/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadcompany;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CLayout {
        JFrame frame = new JFrame("RoadCompany");
        JPanel panelCont = new JPanel();
        JPanel TelaGeral = new JPanel();
        JButton btCVeiculo = new JButton("Ir para a outra tela");
        JLabel busao = new JLabel();
        JPanel CadastroVeiculo = new JPanel();
        CardLayout c1 = new CardLayout();
        
        
        
        public CLayout(){
            initComponents();
            initTelaGeral();
            panelCont.setLayout(c1);
            panelCont.add(TelaGeral,"1");
            panelCont.add(CadastroVeiculo,"2");
            
            frame.add(panelCont);
            frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
            
            c1.show(panelCont,"1");
            
            btCVeiculo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                initCadastroVeiculo();
                c1.show(panelCont,"2");
                
            }
            });
            
        }
        
        public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CLayout();
            }
        });
        }
        
        
     private void initComponents(){
         busao.setIcon(new javax.swing.ImageIcon("C:\\Users\\Zé\\Documents\\GitHub\\projetopds\\frameworkpds\\RoadCompany\\src\\roadcompany\\img\\mainwindow.jpg"));
     }
     
     private void initTelaGeral() {
         TelaGeral.setLayout(null);
         TelaGeral.setPreferredSize(new java.awt.Dimension(800, 600));
         TelaGeral.setSize(800, 600);
         
         TelaGeral.add(busao);
         
         busao.setBounds(0, 0, 800, 600);
         btCVeiculo.setBounds(50, 40, 200, 120);
         
         TelaGeral.add(btCVeiculo);
     }
     
     private void initCadastroVeiculo(){ //Tela de cadastro de Veículo
         CadastroVeiculo.setLayout(null);
         CadastroVeiculo.setPreferredSize(new java.awt.Dimension(800, 600));
         CadastroVeiculo.setSize(800, 600);
         
            /*-Modelo
            -Ano
            -Placa
            -Disponibilidade (bool)
            -DataRevisão
            -Observações*/
         JTextField tModelo = new JTextField();
         JTextField tPlaca = new JTextField();
         JTextField tDisponivel = new JTextField();
         JTextField tRev = new JTextField();
         JTextField tObs = new JTextField();
         CadastroVeiculo.add(tModelo);
         CadastroVeiculo.add(tPlaca);
         CadastroVeiculo.add(tDisponivel);
         CadastroVeiculo.add(tRev);
         CadastroVeiculo.add(tObs);
         
         tModelo.setBounds(50, 40, 150, 25);
         tPlaca.setBounds(50, 85, 150, 25);
         tDisponivel.setBounds(50, 130, 150, 25);
         tRev.setBounds(50, 175, 150, 25);
         tObs.setBounds(50, 220, 150, 25);
         CadastroVeiculo.add(busao);
         busao.setBounds(0, 0, 800, 600);
     }
     
     
     
}
