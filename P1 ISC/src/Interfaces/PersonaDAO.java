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
    public void Registrar(Persona Nuevo) throws Exception;
    public void Modificar(Persona Nuevo) throws Exception;
    public void Eliminar(Persona Nuevo) throws Exception;
    public void RetornarPersonas() throws Exception;
}
