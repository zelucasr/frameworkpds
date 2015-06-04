package roadcompany;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public final class TelaPrincipal extends JFrame{  
    JPanel corpo = new JPanel();
    JLabel busao = new JLabel();
    JMenuBar menuBar = new JMenuBar();
    JMenu menuCadastrar = new JMenu("Cadastrar");  
    JMenuItem menuCVeiculo = new JMenuItem("Veiculo");  
    JMenuItem menuCMotorista = new JMenuItem("Motorista"); 
    JMenuItem menuCCliente = new JMenuItem("Cliente"); 
    
    public TelaPrincipal(){
        super();  
        this.setLayout(null);
        this.setPreferredSize(new java.awt.Dimension(800, 600));
        this.setSize(800, 600);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Agreste Companhia Rodoviária");
        this.setLocationRelativeTo(null);  
        initTelaPrincipal();
        menuCVeiculo.addActionListener((ActionEvent e) -> { TelaCVeiculo.getInstance().setVisible(true); } );  
        menuCMotorista.addActionListener( (ActionEvent e) -> { TelaCMotorista.getInstance().setVisible(true); } );
        menuCCliente.addActionListener( (ActionEvent e) -> { TelaCCliente.getInstance().setVisible(true); } );
        this.setVisible(true);
    }
    
    public void initTelaPrincipal() {
         this.setJMenuBar(menuBar);  
         this.add(busao);
         busao.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("img/busao.jpg")));
         busao.setBounds(646, 406, 154, 134);
         menuCadastrar.add(menuCVeiculo);
         menuCadastrar.add(menuCMotorista);
         menuCadastrar.add(menuCCliente);
         menuBar.add(menuCadastrar);  
         menuCadastrar.setBounds(400, 300, 800, 10);         
    }
}


