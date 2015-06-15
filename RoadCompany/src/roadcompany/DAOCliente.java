package roadcompany;

import java.util.ArrayList;
import roadcompany.framework.IDAOCliente;

public class DAOCliente implements IDAOCliente{
    private ArrayList<ECliente> clientes;
    private static DAOCliente daoCliente;
    
    public DAOCliente(){
        
    }
    
    public void cadastrarCliente(Object cliente){
        boolean alreadyIn = false;
        ECliente add = (ECliente)cliente; 
        for(ECliente c:clientes){
            if(c.getCPF()==add.getCPF()){
                alreadyIn = true;
                atualizarCliente((ECliente)cliente, clientes.indexOf(c));
            }
        }
        if(!alreadyIn){
            clientes.add(new ECliente(add));
        }
    }
    
    public void atualizarCliente(Object cliente, Object id) {
        ECliente c = (ECliente)cliente;
        //falta completar
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
        ArrayList<Object> array = new ArrayList<>();
        String resultado;
        resultado = new String();
        if(null != (String)parametro) switch ((String)parametro) {
            case "Nome":
                for(ECliente c:clientes){
                    if(c.getNome().equals((String)campo)){
                        array.add(c);
                    }
                }   break;
            case "CPF":
                for(ECliente c:clientes){
                    if(c.getCPF()==((int)campo)){
                        resultado = c.print();
                    }
            }   break;
            case "Telefone":
                for(ECliente c:clientes){
                    if(c.getTelefone()==((int)campo)){
                        array.add(c);
                }
            }   break;
            case "EMail":
                for(ECliente c:clientes){
                    if(c.getEMail().equals((String)campo)){
                        array.add(c);
                    }
            }   break;
        }
        
        for(Object c:array){
            ECliente add = (ECliente)c;
            resultado += add.print();
            resultado += "\n";
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