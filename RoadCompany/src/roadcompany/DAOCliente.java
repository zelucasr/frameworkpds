package roadcompany;

import java.util.ArrayList;
import roadcompany.framework.IDAOCliente;

public class DAOCliente implements IDAOCliente{
    private ArrayList<ECliente> clientes;
    private static DAOCliente daoCliente;
    
    public DAOCliente(){
        this.clientes = new ArrayList<>();
        ECliente teste1 = new ECliente("Mauricio", "10010010011", "maurissoca@gmsil.com", "99101010");
        ECliente teste2 = new ECliente("Aline", "20020020022", "aline1@gmsil.com", "96202020");
        ECliente teste3 = new ECliente("Eurico", "30030030033", "richguy@hotmsil.com", "88303030");
        ECliente teste4 = new ECliente("Zé", "40040040044", "zer@bol.com", "91404040");
        clientes.add(teste1);
        clientes.add(teste2);
        clientes.add(teste3);
        clientes.add(teste4);
    }
    
    public void cadastrarCliente(Object cliente){
        boolean alreadyIn = false;
        ECliente add = (ECliente)cliente; 
        for(ECliente c:clientes){
            if(c.getCPF()==add.getCPF()){
                alreadyIn = true;
                atualizarCliente(add, clientes.indexOf(c));
            }
        }
        if(!alreadyIn){
            clientes.add(add);
        }
    }
    
    public void atualizarCliente(ECliente cliente, int id) {
        clientes.set(id, cliente);
    }
    
    public String imprimirTudo() {
        String resultado = "";
        for(ECliente c:clientes){
            resultado += c.print();
            resultado += "\n";
        }
        return resultado;
    }
    
    public Object buscarCliente(Object campo, Object parametro) {
        ArrayList<ECliente> array = new ArrayList<>();
        String resultado;
        resultado = new String("");
        if(null != (String)parametro) switch ((String)parametro) {
            case "Nome":
                for(ECliente c:clientes){
                    if(c.getNome().equals((String)campo)){
                        array.add(c);
                    }
                }   break;
            case "CPF":
                for(ECliente c:clientes){
                    if(c.getCPF().equals((String)campo)){
                        resultado = c.print();
                    }
            }   break;
            case "Telefone":
                for(ECliente c:clientes){
                    if(c.getTelefone().equals((String)campo)){
                        array.add(c);
                }
            }   break;
            case "E-Mail":
                for(ECliente c:clientes){
                    if(c.getEMail().equals((String)campo)){
                        array.add(c);
                    }
            }   break;
        }
        
        for(ECliente c:array){
            resultado += c.print();
            resultado += "\n";
        }
        
        if(!resultado.contains("Nome:")){
            resultado += "Não foram encontrados clientes com esses parametros";
        }
        
        return resultado;
    }
    
    public static DAOCliente getInstance(){
        if(daoCliente == null){
            daoCliente = new DAOCliente();
        }        
        return daoCliente;
    }
    
    
}