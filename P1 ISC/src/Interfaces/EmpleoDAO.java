/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Logic.*;

/**
*
* @author r_rok
*/
public interface EmpleoDAO {
    public void Registrar(Empleo Nuevo) throws Exception;
    public void Modificar(Empleo Nuevo) throws Exception;
    public void Eliminar(Empleo Nuevo) throws Exception;
    public void RetornarEmpleo() throws Exception;
}
