/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadcompany;

import java.util.ArrayList;
import java.util.Objects;
import roadcompany.framework.IDAOVeiculo;

public class DAOVeiculo implements IDAOVeiculo{
    private ArrayList<EVeiculo> veiculos;
    private static DAOVeiculo daoVeiculo;
    
    public DAOVeiculo(){
        this.veiculos = new ArrayList<EVeiculo>();
        EVeiculo teste = new EVeiculo("Camaro", "CAM-1111", true, "12/06/2015", "Amarelo");
        EVeiculo teste2 = new EVeiculo("Camaro", "CAM-2222", false, "12/05/2015", "Prata");
        EVeiculo teste3 = new EVeiculo("Brasilia", "BRA-3333", false, "12/05/2015", "Cuidado");
        EVeiculo teste4 = new EVeiculo("Brasilia", "BRA-4444", true, "15/04/2015", "Calibrar os pneus antes da prox viagem");
        EVeiculo teste5 = new EVeiculo("Brasilia", "BRA-5555", false, "12/06/2015", "Essa ta 100%");
        EVeiculo teste6 = new EVeiculo("C-A/M*A+R()", "CAM-1234", false, "12/06/2015", "Essa ta SHOW");
        veiculos.add(teste);
        veiculos.add(teste2);
        veiculos.add(teste3);
        veiculos.add(teste4);
        veiculos.add(teste5);
        veiculos.add(teste6);
    }
    
    @Override
    public void cadastrarVeiculo(Object veiculo) {
        boolean alreadyIn = false;
        EVeiculo add = (EVeiculo)veiculo; 
        for(EVeiculo v:veiculos){
            if(v.getPlaca().equals(add.getPlaca())){
                alreadyIn = true;
                atualizarVeiculo((EVeiculo)veiculo, veiculos.indexOf(v));
            }
        }
        if(!alreadyIn){
            veiculos.add(new EVeiculo(add));
        }
    }
    
    @Override
    public void atualizarVeiculo(Object veiculo, Object id) {
        EVeiculo v = (EVeiculo)veiculo;
        veiculos.get((Integer)id).setDisponibilidade(v.isDisponivel());
        if(v.getURevisao() != null){
            veiculos.get((Integer)id).setURevisao(v.getURevisao());
        }
        if(v.getObs() != null){
            veiculos.get((Integer)id).setObs(v.getObs());
        }
    }

    @Override
    public String imprimirTudo() {
        String resultado = "";
        for(EVeiculo v:veiculos){
            resultado += v.print();
            resultado += "\n";
        }
        return resultado;
    }
    
    @Override
    public Object buscarVeiculo(Object campo, Object parametro) {
        ArrayList<Object> array = new ArrayList<>();
        String resultado;
        resultado = new String("");
        if(null != (String)parametro) switch ((String)parametro) {
            case "Modelo":
                for(EVeiculo v:veiculos){
                    if(v.getModelo().equals((String)campo)){
                        array.add(v);
                    }
                }   break;
            case "Placa":
                for(EVeiculo v:veiculos){
                    if(v.getPlaca().equals((String)campo)){
                        resultado = v.print();
                    }
            }   break;
            case "Disponibilidade":
                for(EVeiculo v:veiculos){
                    if(v.isDisponivel() == (boolean)campo){
                        array.add(v);
                    }
            }   break;
            case "Ultima Revisão":
                for(EVeiculo v:veiculos){
                    if(v.getURevisao().equals((String)campo)){
                        array.add(v);
                }
            }   break;
        }
        
        for(Object v:array){
            EVeiculo add = (EVeiculo)v;
            resultado += add.print();
            resultado += "\n";
        }
        
        if(!resultado.contains("Modelo:")){
            resultado += "Não foram encontrados veiculos com esses parametros";
        }
        
        return resultado;
    }
    
    public static DAOVeiculo getInstance(){
        if(daoVeiculo == null){
            daoVeiculo = new DAOVeiculo();
        }        
        return daoVeiculo;
    }
}