package roadcompany;

import java.util.ArrayList;
import roadcompany.framework.IDAOMotorista;

public class DAOMotorista implements IDAOMotorista{
    private ArrayList<EMotorista> motoristas;
    private static DAOMotorista daoMotorista;
    
    public DAOMotorista(){
        this.motoristas = new ArrayList<>();
        EMotorista teste1 = new EMotorista("Marcos", "10010010011", "111111111", "11 36987412");
        EMotorista teste2 = new EMotorista("Aurelio", "20020020022", "222222222", "22 74123698");
        EMotorista teste3 = new EMotorista("Julio", "30030030033", "333333333", "33 69874123");
        EMotorista teste4 = new EMotorista("Zico", "40040040044", "444444444", "44 41236987");
        motoristas.add(teste1);
        motoristas.add(teste2);
        motoristas.add(teste3);
        motoristas.add(teste4);
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
        ArrayList<EMotorista> array = new ArrayList<>();
        String resultado;
        resultado = new String("");
        if(null != (String)parametro) switch ((String)parametro) {
            case "Nome":
                for(EMotorista m:motoristas){
                    if(m.getNome().equals((String)campo)){
                        array.add(m);
                    }
                }   break;
            case "CPF":
                for(EMotorista m:motoristas){
                    if(m.getCPF().equals((String)campo)){
                        resultado = m.print();
                    }
            }   break;
            case "Habilitação":
                for(EMotorista m:motoristas){
                    if(m.getHabilitacao().equals((String)campo)){
                        array.add(m);
                    }
            }   break;
            case "Telefone":
                for(EMotorista m:motoristas){
                    if(m.getTelefone().equals((String)campo)){
                        array.add(m);
                }
            }   break;
        }
        
        for(EMotorista m:array){
            resultado += m.print();
            resultado += "\n";
        }
        
        if(!resultado.contains("Nome:")){
            resultado += "Não foram encontrados motoristas com esses parametros";
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
