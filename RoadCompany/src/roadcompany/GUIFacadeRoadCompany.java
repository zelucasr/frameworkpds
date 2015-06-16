/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadcompany;

import roadcompany.framework.GUIFacade;

/**
 *
 * @author CH1CO
 */
public class GUIFacadeRoadCompany implements GUIFacade{
    public void showCCliente(){
        TelaCCliente.getInstance().setVisible(true);
    };
    public void showCItinerario(){
        TelaCItinerario.getInstance().setVisible(true);
    };
    public void showCVeiculo(){
        TelaCVeiculo.getInstance().setVisible(true);
    };
    public void showCMotorista(){
        TelaCMotorista.getInstance().setVisible(true);
    };
    public void showBCliente(){
        TelaBCliente.getInstance().setVisible(true);
    };
    public void showBItinerario(){
        TelaBItinerario.getInstance().setVisible(true);
    };
    public void showBVeiculo(){
        TelaBVeiculo.getInstance().setVisible(true);
    };
    public void showBMotorista(){
        TelaBMotorista.getInstance().setVisible(true);
    };
    public void showECliente(){
        String resultado = DAOCliente.getInstance().imprimirTudo();
        TelaECliente.getInstance().setText(resultado);
        TelaECliente.getInstance().setVisible(true);
    };
    public void showEItinerario(){
        String resultado = DAOItinerario.getInstance().imprimirTudo();
        TelaEItinerario.getInstance().setText(resultado);
        TelaEItinerario.getInstance().setVisible(true);
    };
    public void showEVeiculo(){
        String resultado = DAOVeiculo.getInstance().imprimirTudo();
        TelaEVeiculo.getInstance().setText(resultado);
        TelaEVeiculo.getInstance().setVisible(true);
    };
    public void showEMotorista(){
        String resultado = DAOMotorista.getInstance().imprimirTudo();
        TelaEMotorista.getInstance().setText(resultado);
        TelaEMotorista.getInstance().setVisible(true);
    };
}
