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
    private int CPF;
    private int Telefone;
    private String EMail;

    public ECliente(String nome, int CPF, int Telefone, String EMail) {
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

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int Telefone) {
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
