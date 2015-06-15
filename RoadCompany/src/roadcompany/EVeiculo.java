/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadcompany;

import java.util.Objects;

public class EVeiculo {
    private final String modelo;
    private final String placa;
    private boolean disponibilidade;
    private String uRevisao;
    private String obs;

    EVeiculo(String modelo, String placa, boolean disponibilidade, String uRevisao, String obs) {
        this.modelo = modelo;
        this.placa = placa;
        this.disponibilidade = disponibilidade;
        this.uRevisao = uRevisao;
        this.obs = obs;
    }
    
    EVeiculo(EVeiculo veiculo) {
        this.modelo = veiculo.getModelo();
        this.placa = veiculo.getPlaca();
        this.disponibilidade = veiculo.isDisponivel();
        this.uRevisao = veiculo.getURevisao();
        this.obs = veiculo.getObs();
    }
    
    public String print(){
        String resultado = "";
        resultado += "Modelo: " + this.modelo + "\n";
        resultado += "Placa: " + this.placa + "\n";
        resultado += "Diponibilidade: ";
        if(this.disponibilidade){
            resultado += "Disponivel\n";
        }
        else{
            resultado += "Indisponivel\n";
        }
        resultado += "Ultima Revisao: " + this.uRevisao + "\n";
        resultado += "Observações: " + this.obs + "\n";
        return resultado;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EVeiculo other = (EVeiculo) obj;
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.placa, other.placa)) {
            return false;
        }
        if (this.disponibilidade != other.disponibilidade) {
            return false;
        }
        if (!Objects.equals(this.uRevisao, other.uRevisao)) {
            return false;
        }
        if (!Objects.equals(this.obs, other.obs)) {
            return false;
        }
        return true;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }
    
    public boolean isDisponivel() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getURevisao() {
        return uRevisao;
    }

    public void setURevisao(String uRevisao) {
        this.uRevisao = uRevisao;
    }
    
    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
}
