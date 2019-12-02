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
public class DAOConstructor {
    private static PersonaDAO persona;
    private EmpresaDAO empresa = null;
    private EmpleoDAO empleo = null;
    private VacanteDAO vacante = null;

    
    
    public static PersonaDAO getPersona() throws DAOExeption{
        if(persona == null){
            persona = new PersonaDAO() {
                @Override
                public void Registrar(Persona Nuevo) throws DAOExeption {
                     Nuevo.Registrar(Nuevo);
                }

                @Override
                public void Modificar(Persona Nuevo) throws DAOExeption {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void Eliminar(Persona Nuevo) throws DAOExeption {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void RetornarPersonas() throws DAOExeption {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            };
        }
        return persona;
    }
}
