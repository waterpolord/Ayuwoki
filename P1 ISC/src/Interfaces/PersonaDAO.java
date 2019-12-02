/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Logic.Persona;

/**
 *
 * @author r_rok
 */
public interface PersonaDAO {
    public void Registrar(Persona Nuevo) throws DAOExeption;
    public void Modificar(Persona Nuevo) throws DAOExeption;
    public void Eliminar(Persona Nuevo) throws DAOExeption;
    public void RetornarPersonas() throws DAOExeption;
    
    
}
