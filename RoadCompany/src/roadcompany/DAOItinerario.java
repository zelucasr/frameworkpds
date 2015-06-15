/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadcompany;
import java.util.ArrayList;
import java.util.Objects;
import roadcompany.framework.IDAOItinerario;

public class DAOItinerario implements IDAOItinerario{
    private ArrayList<EItinerario> itinerarios;
    private static DAOItinerario daoItinerario;
    
    private DAOItinerario(){
        this.itinerarios = new ArrayList<>();
        EItinerario teste1 = new EItinerario("daqui1:teste", "prala1", "CAM-1111", "12345678910", "12:12", 5);
        EItinerario teste2 = new EItinerario("daqui1:teste", "praca2", "CAM-1234", "98765432100", "12:13", 6);
        EItinerario teste3 = new EItinerario("devolta3", "praca2", "BRA-4444", "15948267391", "12:14", 7);
        EItinerario teste4 = new EItinerario("voltando4", "praca4", "BRA-4444", "78945612307", "12:15", 8);
        EItinerario teste5 = new EItinerario("voltando4", "praca4", "BRA-3333", "78945612307", "12:16", 9);
        EItinerario teste6 = new EItinerario("voltando4", "praca4", "BRA-3333", "78945612321", "12:16", 10);
        itinerarios.add(teste1);
        itinerarios.add(teste2);
        itinerarios.add(teste3);
        itinerarios.add(teste4);
        itinerarios.add(teste5);
        itinerarios.add(teste6);
    }
    
    @Override
    public void inserirCliente(Object cliente, Object saida, Object destino, Object horario, Object placa){
        for(EItinerario i:itinerarios){
            if(i.getSaida().equals((String)saida) &&
               i.getDestino().equals((String)destino) &&
               i.getHorario().equals((String)horario) &&
               i.getPlacaVeiculo().equals((String)placa)){
                i.inserirCliente((ECliente)cliente);
            }
        }
    }
    
    @Override
    public void cadastrarItinerario(Object itinerario){
        boolean alreadyIn = false;
        EItinerario add = (EItinerario)itinerario; 
        for(EItinerario i:itinerarios){
            if(add.getSaida().equals((String)i.getSaida()) &&
               add.getDestino().equals((String)i.getDestino()) &&
               add.getHorario().equals((String)i.getHorario()) &&
               add.getPlacaVeiculo().equals((String)i.getPlacaVeiculo())){
                alreadyIn = true;
            }
        }
        if(!alreadyIn){
            itinerarios.add(add);
        }
    }
    
    @Override
    public String imprimirTudo(){
        String resultado = "";
        for(EItinerario i:itinerarios){
            resultado += i.print();
        }
        return resultado;
    }
    
    @Override
    public String buscarItinerario(Object campo, Object parametro){
        String resultado;
        ArrayList<Object> array = new ArrayList<>();
        resultado = new String();
        if(null != (String)parametro) switch ((String)parametro) {
            case "End. Saida":
                for(EItinerario i:itinerarios){
                    if(i.getSaida().equals((String)campo)){
                        array.add(i);
                    }
                }   break;
            case "End. Destino":
                for(EItinerario i:itinerarios){
                    if(i.getDestino().equals((String)campo)){
                        array.add(i);
                    }
                }   break;
            case "Motorista":
                for(EItinerario i:itinerarios){
                    if(i.getCPFMotorista().equals((String)campo)){
                        array.add(i);
                    }
                }   break;
            case "Placa do Veiculo":
                for(EItinerario i:itinerarios){
                    if(i.getPlacaVeiculo().equals((String)campo)){
                        array.add(i);
                    }
                }   break;
            case "Horário":
                for(EItinerario i:itinerarios){
                    if(i.getHorario().equals((String)campo)){
                        array.add(i);
                    }
                }   break;
        }
        
        for(Object v:array){
            EItinerario add = (EItinerario)v;
            resultado += add.print();
            resultado += "\n";
        }
        
        return resultado;
    } 
    
    public static DAOItinerario getInstance(){
        if(daoItinerario == null){
            daoItinerario = new DAOItinerario();
            return daoItinerario;
        }
        else{
            return daoItinerario;
        }
    }
}
