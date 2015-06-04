 import javax.swing.JFrame;  
import javax.swing.JMenu;  
import javax.swing.JMenuBar;  
import javax.swing.JMenuItem;  
import javax.swing.WindowConstants;  
  
public class principal extends JFrame{  
      
    private JMenuBar BarraMenu = null;  
    private JMenu mnuArquivo = null;  
    private JMenuItem mnuSair = null;  
  
    public principal() {  
        super();  
        // TODO Auto-generated constructor stub  
        initialize();  
    }  
      
    private void initialize(){  
        this.setTitle("Aplicação com menu");  
        this.setJMenuBar(getBarraMenu());  
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  
        this.setSize(800,600);  
        this.setVisible(true);  
    }  
  
    private JMenuBar getBarraMenu() {  
        if (BarraMenu == null){  
            BarraMenu = new JMenuBar();  
            BarraMenu.add(getMnuArquivo());  
        }  
        return BarraMenu;  
    }  
  
    private JMenu getMnuArquivo() {  
        if (mnuArquivo == null){  
            mnuArquivo = new JMenu();  
            mnuArquivo.setText("Arquivo");  
            mnuArquivo.add(getMnuSair());  
        }  
        return mnuArquivo;  
    }  
  
    private JMenuItem getMnuSair() {  
        if (mnuSair == null){  
            mnuSair = new JMenuItem();  
            mnuSair.setText("Sair");  
        }  
        return mnuSair;  
    }  
  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
                new principal();  
    }  
  
} 