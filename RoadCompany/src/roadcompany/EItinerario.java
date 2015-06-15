/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadcompany;

import java.util.Date;

public class EItinerario {
    private final String saida;
    private final String destino;
    private final String PlacaVeiculo;
    private String CPFMotorista;
    private String Horario;
    private ECliente[] clientes;
    
    public EItinerario(String saida, String destino, String placa, String CPF, String horario, int vagas){
        this.saida = saida;
        this.destino = destino;
        this.PlacaVeiculo = placa;
        this.CPFMotorista = CPF;
        this.Horario = horario;
        this.clientes = new ECliente[vagas];
    }
    
    public EItinerario(EItinerario i){
        this.saida = i.saida;
        this.destino = i.destino;
        this.PlacaVeiculo = i.PlacaVeiculo;
        this.CPFMotorista = i.CPFMotorista;
        this.Horario = i.Horario;
        this.clientes = i.clientes;
    }
    
    public void inserirCliente(ECliente cliente){
        boolean alocou = false;
        for(ECliente c:clientes){
            if(c==null){
                c = cliente;
                alocou = true;
            }
        }
        if(!alocou){
            
        }
    }
    
    public String print(){
        String resultado = "";
        boolean hasClients = false;
        resultado += "Saida: "+this.saida+"\n";
        resultado += "Destino: "+this.destino+"\n";
        resultado += "Veiculo: "+this.PlacaVeiculo+"\n";
        resultado += "Motorista: "+this.CPFMotorista+"\n";
        resultado += "Horario: "+this.Horario+"\n";
        resultado += "Clientes:\n";
        int i = 0;
        for(ECliente c:clientes){
            if(c != null){
                resultado += ""+ ++i +".\t"+c.getNome()+"\tCPF: "+c.getCPF();
                hasClients = true;
            }
        }
        if(!hasClients){
            resultado += "Ainda não foram cadastrados clientes para esta viagem ("+clientes.length+" vagas restantes).";
        }
        else{
            resultado += "\n"+(clientes.length - i)+" vagas restantes.";
        }
        resultado += "\n\n";
        return resultado;
    }

    public String getSaida() {
        return saida;
    }

    public String getDestino() {
        return destino;
    }
    
    public String getPlacaVeiculo() {
        return PlacaVeiculo;
    }

    public String getCPFMotorista() {
        return CPFMotorista;
    }

    public void setCPFMotorista(String CPFMotorista) {
        this.CPFMotorista = CPFMotorista;
    }
    
    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }
}