package roadcompany;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public final class TelaPrincipal extends JFrame{  
    JPanel corpo = new JPanel();
    JLabel busao = new JLabel();
    JMenuBar menuBar = new JMenuBar();
    JMenu menuCadastrar = new JMenu("Cadastrar");  
    JMenu menuBuscar = new JMenu ("Buscar");
    JMenuItem menuCVeiculo = new JMenuItem("Veiculo");  
    JMenuItem menuCMotorista = new JMenuItem("Motorista"); 
    JMenuItem menuCCliente = new JMenuItem("Cliente"); 
    JMenuItem menuCItinerario = new JMenuItem("Itinerario"); 
    JMenuItem menuBVeiculo = new JMenuItem("Veiculo");
    JMenuItem menuBMotorista = new JMenuItem("Motorista");
    JMenuItem menuBCliente = new JMenuItem("Cliente");
    JMenuItem menuBItinerario = new JMenuItem("Itinerario");
    
    public TelaPrincipal(){
        super();  
        this.setLayout(null);
        this.setPreferredSize(new java.awt.Dimension(800, 600));
        this.setSize(800, 600);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {  
            @Override
            public void windowClosing(WindowEvent evt) { 
                TelaConfirmSair.getInstance().setVisible(true);
            }
        });
        this.setTitle("Agreste Road Company");
        this.setLocationRelativeTo(null);  
        initTelaPrincipal();
        menuCVeiculo.addActionListener((ActionEvent e) -> { TelaCVeiculo.getInstance().setVisible(true); } );  
        menuCMotorista.addActionListener( (ActionEvent e) -> { TelaCMotorista.getInstance().setVisible(true); } );
        menuCCliente.addActionListener( (ActionEvent e) -> { TelaCCliente.getInstance().setVisible(true); } );
        menuCItinerario.addActionListener( (ActionEvent e) -> { TelaCItinerario.getInstance().setVisible(true); } );
        menuBVeiculo.addActionListener((ActionEvent e) -> { TelaBVeiculo.getInstance().setVisible(true); } );
        menuBMotorista.addActionListener( (ActionEvent e) -> { TelaBMotorista.getInstance().setVisible(true); } );
        menuBCliente.addActionListener( (ActionEvent e) -> { TelaBCliente.getInstance().setVisible(true);} ); 
        menuBItinerario.addActionListener( (ActionEvent e) -> { TelaBItinerario.getInstance().setVisible(true); } );
        this.setVisible(true);
    }
    
    public void initTelaPrincipal() {
         this.setJMenuBar(menuBar);  
         this.add(busao);
         busao.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("img/telaprincipal.jpg")));
         busao.setBounds(0, -50, 800, 600);
         menuCadastrar.add(menuCVeiculo);
         menuCadastrar.add(menuCMotorista);
         menuCadastrar.add(menuCCliente);
         menuCadastrar.add(menuCItinerario);
         menuBuscar.add(menuBVeiculo);
         menuBuscar.add(menuBMotorista);
         menuBuscar.add(menuBCliente);
         menuBuscar.add(menuBItinerario);
         menuBar.add(menuCadastrar);  
         menuBar.add(menuBuscar);
         menuCadastrar.setBounds(400, 300, 800, 10);         
    }
}


