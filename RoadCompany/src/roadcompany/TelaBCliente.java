package roadcompany;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

import java.awt.ItemSelectable;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import roadcompany.framework.TelaBaseCliente;

public class TelaBCliente extends TelaBaseCliente{
    private static TelaBCliente tela;
    JButton btBuscar = new JButton("Buscar");
    //Campos para preencher:
    JLabel txtBuscar = new JLabel("Buscar por:");
    String[] Opcoes = {"Selecionar" ,"Nome", "CPF", "E-Mail", "Telefone"};
    JComboBox tBuscar = new JComboBox(Opcoes);
        
    private TelaBCliente() {
        super();
        //CONFIGS DA TELA
          
        this.setTitle("Buscar Cliente");

        //LAYOUT DA TELA
        initb();

        //FUNCOES DE BOTOES
        
        btBuscar.addActionListener( (ActionEvent e) -> { 
            Object campo = new Object();
            String resultado = new String();
            if((String)tBuscar.getSelectedItem() == "Nome"){
                campo = (String)tNome.getText();
                resultado = (String)DAOCliente.getInstance().buscarCliente(campo,(String)tBuscar.getSelectedItem());
                TelaECliente.getInstance().setText(resultado);
            }
            if((String)tBuscar.getSelectedItem() == "CPF"){
                campo = (String)tCpf.getText();
                resultado = (String)DAOCliente.getInstance().buscarCliente(campo,(String)tBuscar.getSelectedItem());
                TelaECliente.getInstance().setText(resultado);
            }
            if((String)tBuscar.getSelectedItem() == "E-Mail"){
                campo = (String)tEmail.getText();
                resultado = (String)DAOCliente.getInstance().buscarCliente(campo,(String)tBuscar.getSelectedItem());
                TelaECliente.getInstance().setText(resultado);
            }
            if((String)tBuscar.getSelectedItem() == "Telefone"){
                campo = (String)tTel.getText();
                resultado = (String)DAOCliente.getInstance().buscarCliente(campo,(String)tBuscar.getSelectedItem());
                TelaECliente.getInstance().setText(resultado);
            }
            TelaECliente.getInstance().setVisible(true);  
        });
    }
    
    public static TelaBCliente getInstance(){
        if(tela == null){
            tela = new TelaBCliente();
        }
        return tela;
    };    
    
    private void initb(){
        btBuscar.setBounds(115, 330, 120, 25);
        this.add(btBuscar);
        txtBuscar.setBounds(25, 25, 100, 25);
        this.add(txtBuscar);
        tBuscar.setBounds(135, 25, 200, 25);
        tBuscar.addActionListener(tBuscar);
        
        this.add(txtNome);
        txtNome.setBounds(70, 120, 150, 25);
        this.add(tNome);          
        tNome.setBounds(180, 120, 200, 25);
        
        this.add(txtCpf);
        txtCpf.setBounds(70, 120, 150, 25);
        this.add(tCpf);
        tCpf.setBounds(180, 120, 200, 25);
        
        this.add(txtEmail);
        txtEmail.setBounds(70, 120, 150, 25);
        this.add(tEmail);
        tEmail.setBounds(180, 120, 200, 25);
        
        this.add(txtTel);
        txtTel.setBounds(70, 120, 150, 25);
        this.add(tTel);
        tTel.setBounds(180, 120, 200, 25);
        
        setAllInvisible();
         
        ItemListener itemListener = new ItemListener() {
            public void itemStateChanged(ItemEvent itemEvent) {
                if(itemEvent.getItem() == "Selecionar"){
                    setAllInvisible();
                }
                if(itemEvent.getItem() == "Nome"){
                    setNomeVisible();
                }
                if(itemEvent.getItem() == "CPF"){
                    setCpfVisible();
                }
                if(itemEvent.getItem() == "E-Mail"){
                    setHabilVisible();
                }
                if(itemEvent.getItem() == "Telefone"){
                    setTelVisible();
                }
            }
        };
        tBuscar.addItemListener(itemListener);
        this.add(tBuscar);
        }
    
    static private String selectedString(ItemSelectable is) {
        Object selected[] = is.getSelectedObjects();
        return ((selected.length == 0) ? "null" : (String) selected[0]);
    }
    
    private void setNomeVisible(){
        limpaCampos();
        txtNome.setVisible(true);
        tNome.setVisible(true);
        txtCpf.setVisible(false);
        tCpf.setVisible(false);
        txtEmail.setVisible(false);
        tEmail.setVisible(false);
        txtTel.setVisible(false);
        tTel.setVisible(false);
    }
    
    private void setCpfVisible(){
        limpaCampos();
        txtNome.setVisible(false);
        tNome.setVisible(false);
        txtCpf.setVisible(true);
        tCpf.setVisible(true);
        txtEmail.setVisible(false);
        tEmail.setVisible(false);
        txtTel.setVisible(false);
        tTel.setVisible(false);
    }
    
    private void setHabilVisible(){
        limpaCampos();
        txtNome.setVisible(false);
        tNome.setVisible(false);
        txtCpf.setVisible(false);
        tCpf.setVisible(false);
        txtEmail.setVisible(true);
        tEmail.setVisible(true);
        txtTel.setVisible(false);
        tTel.setVisible(false);
    }
    
    private void setTelVisible(){
        limpaCampos();
        txtNome.setVisible(false);
        tNome.setVisible(false);
        txtCpf.setVisible(false);
        tCpf.setVisible(false);
        txtEmail.setVisible(false);
        tEmail.setVisible(false);
        txtTel.setVisible(true);
        tTel.setVisible(true);
    }
    
    private void setAllInvisible(){
        limpaCampos();
        txtNome.setVisible(false);
        tNome.setVisible(false);
        txtCpf.setVisible(false);
        tCpf.setVisible(false);
        txtEmail.setVisible(false);
        tEmail.setVisible(false);
        txtTel.setVisible(false);
        tTel.setVisible(false);
    }
    
    private void limpaCampos(){
        tNome.setText("");
        tCpf.setText("");
        tEmail.setText("");
        tTel.setText("");
    }
}