/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author r_rok
 */
public class Connect {
    static Connection Conexion = null;
    
    public static Connection getConexion() throws ClassNotFoundException, SQLException{
        String url = "jdbc:sqlserver://astroserver.database.windows.net:1433;databaseName=Bolsa_de_empleo";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        }
        catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "No se encontro la base de datos, revisar driver "+e.getMessage(),"Error de conexion",JOptionPane.ERROR_MESSAGE);
        }
        try{
            Conexion = DriverManager.getConnection(url,"Master","Astrocaribeean01");
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error "+e.getMessage(),"Error de conexion",JOptionPane.ERROR_MESSAGE);
        }
        return Conexion;
    }
    public static ResultSet Consulta(String consulta) throws ClassNotFoundException, SQLException{
        Connection con = getConexion();
        Statement declara;
        try {
            declara = con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error "+e.getMessage(),"Error de conexion",JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    
   
    
}
