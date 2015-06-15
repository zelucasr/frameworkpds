/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadcompany.framework;

import java.util.ArrayList;

/**
 *
 * @author CH1CO
 */
public interface IDAOVeiculo {
    void cadastrarVeiculo(Object veiculo);
    void atualizarVeiculo(Object veiculo, Object id);
    Object imprimirTudo();
    Object buscarVeiculo(Object campo, Object parametro);
}
