/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadcompany;

/**
 *
 * @author CH1CO
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import roadcompany.framework.TelaBaseItinerario;

public class TelaEItinerario extends TelaBaseItinerario{
    private static TelaEItinerario tela;
    JButton btSalvar = new JButton("Salvar");
    JScrollPane scrollPane;
    JTextArea tArea = new JTextArea("");
    

    private TelaEItinerario(){
        super();
        //CONFIGS DA TELA
        this.setTitle("Agreste Road Company - Itinerarios");
        
        //LAYOUT
        initb();
        
        //CONFIG BOTOES
        btSalvar.addActionListener( (ActionEvent e) -> {
            try {
                new SalvaArquivo(tArea.getText());
            }
            catch (IOException ex) {
                Logger.getLogger(TelaEVeiculo.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
    
    public void setText(String str){
        this.tArea.setText(str);
    }
    
    public static TelaEItinerario getInstance(){
        if(tela == null){
            tela = new TelaEItinerario();
        }
        return tela;
    }
    
    @Override
    public void inita(){
        btCancelar.setBounds(255, 330, 120, 25);
        btCancelar.setText("Voltar");
        this.add(btCancelar);
    }
    
    public void initb(){
        this.add(btSalvar);
        btSalvar.setBounds(125, 330, 120, 25);
        Box box = Box.createHorizontalBox();
        tArea.setEditable(false);
        box.add(scrollPane = new JScrollPane(tArea));
        box.setBounds(10, 10, 480, 310);
        add(box);
    }
}
