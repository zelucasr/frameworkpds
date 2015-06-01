package roadcompany;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
    Layouts:
    1-TelaPrincipal
    2-CadastroVeiculo
    3-CadastroCliente
    4-CadastroMotorista
    5-
*/

public class CLayout {
        JFrame frame = new JFrame("RoadCompany");
        JPanel panelCont = new JPanel();
        CardLayout c1 = new CardLayout();
        
        TelaCVeiculo telaCVeiculo = new TelaCVeiculo();
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        TelaCCliente telaCCliente = new TelaCCliente();
        TelaCMotorista telaCMotorista = new TelaCMotorista();
        
        public CLayout(){
            
        }
        
        public void iniciar(){
            panelCont.setLayout(c1);
            panelCont.add(telaPrincipal.getTelaPrincipal(),"1");
            panelCont.add(telaCVeiculo.getCadastroVeiculo(),"2");
            panelCont.add(telaCCliente.getCadastroCliente(),"3");
            panelCont.add(telaCMotorista.getCadastroMotorista(),"4");
            System.out.println("teste2");
            telaPrincipal.setControlador(this);
            telaCVeiculo.setControlador(this);
            telaCCliente.setControlador(this);
            telaCMotorista.setControlador(this);
            frame.add(panelCont);
            frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
            setLayout(1);
        }

        public CardLayout getC1() {
            return c1;
        }
        
        
        
        public void setLayout(int n){
            c1.show(panelCont,Integer.toString(n));
        }
     
}
