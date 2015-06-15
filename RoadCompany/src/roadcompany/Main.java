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
public class Main {
    public static void main(String[] args){
        GUIFacade guiFacade = new GUIFacadeRoadCompany();
        new TelaPrincipal(guiFacade);
    }
}