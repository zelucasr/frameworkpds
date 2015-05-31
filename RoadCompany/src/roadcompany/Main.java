
package roadcompany;

public class Main {
    
    static CLayout controlador = new CLayout();
    static TelaPrincipal telaPrincipal;
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                controlador.iniciar();
            }
        });
        }
    
}
