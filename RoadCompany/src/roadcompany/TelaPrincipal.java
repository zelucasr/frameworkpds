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
import roadcompany.framework.GUIFacade;

public final class TelaPrincipal extends JFrame{  
    JPanel corpo = new JPanel();
    JLabel busao = new JLabel();
    JMenuBar menuBar = new JMenuBar();
    JMenu menuCadastrar = new JMenu("Cadastrar");  
    JMenu menuBuscar = new JMenu ("Buscar");
    JMenu menuExibir = new JMenu ("Exibir");
    JMenuItem menuCVeiculo = new JMenuItem("Veiculo");  
    JMenuItem menuCMotorista = new JMenuItem("Motorista"); 
    JMenuItem menuCCliente = new JMenuItem("Cliente"); 
    JMenuItem menuCItinerario = new JMenuItem("Itinerario"); 
    JMenuItem menuBVeiculo = new JMenuItem("Veiculos");
    JMenuItem menuBMotorista = new JMenuItem("Motoristas");
    JMenuItem menuBCliente = new JMenuItem("Clientes");
    JMenuItem menuBItinerario = new JMenuItem("Itinerarios"); 
    JMenuItem menuEVeiculo = new JMenuItem("Veiculos");
    JMenuItem menuEMotorista = new JMenuItem("Motoristas");
    JMenuItem menuECliente = new JMenuItem("Clientes");
    JMenuItem menuEItinerario = new JMenuItem("Itinerarios");
    
    GUIFacade guiFacade;
    
    public TelaPrincipal(GUIFacade guiFacade){
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
        menuCVeiculo.addActionListener((ActionEvent e) -> { guiFacade.showCVeiculo(); } );  
        menuCMotorista.addActionListener( (ActionEvent e) -> { guiFacade.showCMotorista(); } );
        menuCCliente.addActionListener( (ActionEvent e) -> { guiFacade.showCCliente(); } );
        menuCItinerario.addActionListener( (ActionEvent e) -> { guiFacade.showCItinerario(); } );
        menuBVeiculo.addActionListener((ActionEvent e) -> { guiFacade.showBVeiculo(); } );
        menuBMotorista.addActionListener( (ActionEvent e) -> { guiFacade.showBMotorista(); } );
        menuBCliente.addActionListener( (ActionEvent e) -> { guiFacade.showBCliente(); } ); 
        menuBItinerario.addActionListener( (ActionEvent e) -> { guiFacade.showBItinerario(); } );
        menuEVeiculo.addActionListener((ActionEvent e) -> { guiFacade.showEVeiculo(); } );
        menuEMotorista.addActionListener( (ActionEvent e) -> { guiFacade.showEMotorista(); } );
        menuECliente.addActionListener( (ActionEvent e) -> { guiFacade.showECliente(); } ); 
        menuEItinerario.addActionListener( (ActionEvent e) -> { guiFacade.showEItinerario(); } );
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
         menuExibir.add(menuEVeiculo);
         menuExibir.add(menuEMotorista);
         menuExibir.add(menuECliente);
         menuExibir.add(menuEItinerario);
         menuBar.add(menuCadastrar);  
         menuBar.add(menuBuscar);        
         menuBar.add(menuExibir); 
    }
}


