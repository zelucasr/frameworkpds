package roadcompany;

import java.util.ArrayList;
import roadcompany.framework.IDAOMotorista;

public class DAOMotorista implements IDAOMotorista{
    private ArrayList<EMotorista> motoristas;
    private static DAOMotorista daoMotorista;
    
    public DAOMotorista(){
        
    }
    
    
    public void cadastrarMotorista(Object motorista){
        boolean alreadyIn = false;
        EMotorista add = (EMotorista)motorista; 
        for(EMotorista m:motoristas){
            if(m.getCPF()==add.getCPF()){
                alreadyIn = true;
                atualizarMotorista((EMotorista)motorista, motoristas.indexOf(m));
            }
        }
        if(!alreadyIn){
            motoristas.add(new EMotorista(add));
        }
    }
    
    public void atualizarMotorista(Object motorista, Object id) {
        EMotorista m = (EMotorista)motorista;
        //falta completar
    }
    
    
    public String imprimirTudo() {
        String resultado = "";
        for(EMotorista m:motoristas){
            resultado += m.print();
            resultado += "\n";
        }
        return resultado;
    }
    
    public Object buscarMotorista(Object campo, Object parametro) {
        ArrayList<Object> array = new ArrayList<>();
        String resultado;
        resultado = new String();
        if(null != (String)parametro) switch ((String)parametro) {
            case "Nome":
                for(EMotorista m:motoristas){
                    if(m.getNome().equals((String)campo)){
                        array.add(m);
                    }
                }   break;
            case "CPF":
                for(EMotorista m:motoristas){
                    if(m.getCPF()==((int)campo)){
                        resultado = m.print();
                    }
            }   break;
            case "Habilitacao":
                for(EMotorista m:motoristas){
                    if(m.getHabilitacao()==((int)campo)){
                        array.add(m);
                    }
            }   break;
            case "Telefone":
                for(EMotorista m:motoristas){
                    if(m.getTelefone()==((int)campo)){
                        array.add(m);
                }
            }   break;
        }
        
        for(Object m:array){
            EMotorista add = (EMotorista)m;
            resultado += add.print();
            resultado += "\n";
        }
        
        return resultado;
    }
    
    public static DAOMotorista getInstance(){
        if(daoMotorista == null){
            daoMotorista = new DAOMotorista();
        }        
        return daoMotorista;
    }
    
}
