package roadcompany.framework;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public abstract class TelaBaseCliente extends JFrame{
    protected JButton btCancelar = new JButton("Cancelar");
    protected JLabel txtNome = new JLabel("Nome:");
    protected JTextField tNome = new JTextField();
    protected JLabel txtCpf = new JLabel("CPF:");
    protected JTextField tCpf = new JTextField();
    protected JLabel txtEmail = new JLabel("E-Mail:");
    protected JTextField tEmail = new JTextField();
    protected JLabel txtTel = new JLabel("Telefone:");
    protected JTextField tTel = new JTextField();
    
    public TelaBaseCliente(){
        super();
        this.setLayout(null);
        this.setPreferredSize(new java.awt.Dimension(500, 400));
        this.setSize(500, 400);
        this.setResizable(false);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);  
        this.setLocationRelativeTo(null);  
        this.setAutoRequestFocus(true);
        btCancelar.addActionListener( (ActionEvent e) -> {  this.dispose();} );
        init();
    }
    
    public void init(){
        btCancelar.setBounds(260, 330, 120, 25);
        this.add(btCancelar);
        
        this.add(txtNome);
        txtNome.setBounds(70, 85, 150, 25);
        this.add(tNome);          
        tNome.setBounds(180, 85, 200, 25);
        
        this.add(txtCpf);
        txtCpf.setBounds(70, 120, 150, 25);
        this.add(tCpf);
        tCpf.setBounds(180, 120, 200, 25);
        
        this.add(txtEmail);
        txtEmail.setBounds(70, 155, 150, 25);
        this.add(tEmail);
        tEmail.setBounds(180, 155, 200, 25);
        
        this.add(txtTel);
        txtTel.setBounds(70, 190, 150, 25);
        this.add(tTel);
        tTel.setBounds(180, 190, 200, 25);
    }
}
