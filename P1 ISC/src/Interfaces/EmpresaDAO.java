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
public interface EmpresaDAO {
    public void Registrar(Empresa Nuevo) throws DAOExeption;
    public void Modificar(Empresa Nuevo) throws DAOExeption;
    public void Eliminar(Empresa Nuevo) throws DAOExeption;
    public void RetornarEmpresa() throws DAOExeption;
}
