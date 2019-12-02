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
    public void Registrar(Vacante Nuevo) throws DAOExeption;
    public void Modificar(Vacante Nuevo) throws DAOExeption;
    public void Eliminar(Vacante Nuevo) throws DAOExeption;
    public void RetornarVacantes() throws DAOExeption;
}
