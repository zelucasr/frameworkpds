package roadcompany;

public class RoadCompany {
    
    static CLayout controlador = new CLayout();
    static TelaPrincipal telaPrincipal;
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                controlador.iniciar();
            }
        });
        }
}
