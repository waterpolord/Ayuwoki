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
public interface VacanteDAO {
    public void Registrar(Vacante Nuevo) throws Exception;
    public void Modificar(Vacante Nuevo) throws Exception;
    public void Eliminar(Vacante Nuevo) throws Exception;
    public void RetornarVacantes() throws Exception;
}
