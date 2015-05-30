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

public class CLayout {
        JFrame frame = new JFrame("CardLayout do sistema");
        JPanel panelCont = new JPanel();
        JLabel jLabel2 = new JLabel();
        JPanel TelaGeral = new JPanel();
        JButton btCVeiculo = new JButton();
        JLabel jLabel1 = new JLabel();
        JPanel CadastroVeiculo = new JPanel();
        
        
        
        public CLayout(){
            initComponents();
            CardLayout c1 = new CardLayout();
            panelCont.add(TelaGeral,"1");
            panelCont.add(CadastroVeiculo,"2");
            c1.show(panelCont,"1");
            
            frame.add(panelCont);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
            
            btCVeiculo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
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
        
        
     private void initComponents() {
         TelaGeral.setPreferredSize(new java.awt.Dimension(800, 620));
         CadastroVeiculo.setPreferredSize(new java.awt.Dimension(800, 620));
         jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ad\\Documents\\GitHub\\frameworkpds\\RoadCompany\\src\\roadcompany\\img\\mainwindow.jpg"));
         TelaGeral.add(jLabel1);
         CadastroVeiculo.add(jLabel1);
         jLabel1.setBounds(0, 0, 800, 600);
         TelaGeral.setBounds(0, 0, 800, 620);
         
         
     }   
        
}
