/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadcompany.framework;

/**
 *
 * @author CH1CO
 */
public interface IDAOItinerario {
    void inserirCliente(Object cliente, Object saida, Object destino, Object horario, Object placa);
    void cadastrarItinerario(Object itineario);
    Object imprimirTudo();
    Object buscarItinerario(Object campo, Object parametro);    
}
