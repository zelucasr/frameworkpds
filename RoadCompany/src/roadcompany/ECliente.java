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
public class ECliente {
    private String nome;
    private String CPF;
    private String Telefone;
    private String EMail;

    public ECliente(String nome, String CPF, String EMail, String Telefone) {
        this.nome = nome;
        this.CPF = CPF;
        this.Telefone = Telefone;
        this.EMail = EMail;
    }
    
    public ECliente(ECliente cliente) {
        this.nome = cliente.getNome();
        this.CPF = cliente.getCPF();
        this.Telefone = cliente.getTelefone();
        this.EMail = cliente.getEMail();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEMail() {
        return EMail;
    }

    public void setEMail(String EMail) {
        this.EMail = EMail;
    }
    
    public String print(){
        String resultado = "";
        resultado += "Nome: " + this.nome + "\n";
        resultado += "CPF: " + this.CPF + "\n";
        resultado += "Telefone: " + this.Telefone + "\n";
        resultado += "EMail: " + this.EMail + "\n";
        return resultado;
    }
    
}
