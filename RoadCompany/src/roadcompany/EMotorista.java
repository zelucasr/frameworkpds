/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadcompany;

/**
 *
 * @author CH1CO
 */
public class EMotorista {
    private String Nome;
    private String CPF;
    private String Habilitacao;
    private String Telefone;

    public EMotorista(String Nome, String CPF, String Habilitacao, String Telefone) {
        this.Nome = Nome;
        this.CPF = CPF;
        this.Habilitacao = Habilitacao;
        this.Telefone = Telefone;
    }
    
    public EMotorista(EMotorista motorista) {
        this.Nome = motorista.getNome();
        this.CPF = motorista.getCPF();
        this.Habilitacao = motorista.getHabilitacao();
        this.Telefone = motorista.getTelefone();
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getHabilitacao() {
        return Habilitacao;
    }

    public void setHabilitacao(String Habilitacao) {
        this.Habilitacao = Habilitacao;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
    
    public String print(){
        String resultado = "";
        resultado += "Nome: " + this.Nome + "\n";
        resultado += "CPF: " + this.CPF + "\n";
        resultado += "Habilitação: " + this.Habilitacao + "\n";
        resultado += "Telefone: " + this.Telefone + "\n";
        return resultado;
    }
    
}
