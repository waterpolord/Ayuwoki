/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author r_rok
 */
public class DAOExeption extends Exception {

    public DAOExeption(String string) {
        super(string);
    }

    public DAOExeption(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public DAOExeption(Throwable thrwbl) {
        super(thrwbl);
    }
    
}
