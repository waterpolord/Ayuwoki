package Logic;

import static Conexion.Connect.getConexion;
import Interfaces.DAOExeption;
import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Obrero extends Persona {
	
	private ArrayList<String> habilidades = new ArrayList();
	
	public Obrero(String nombre,String nombre2, String apellido, String apellido2,Date fecha, String correo, String clave, Boolean estado, String pais,ArrayList<String> hab) {
		super( nombre, nombre2,  apellido,  apellido2,fecha,  correo,  clave, estado, pais);
		habilidades = hab;
	}

	public ArrayList<String> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(String hab) {
		habilidades.add(hab);
	}
	
	public Boolean HabilidadExiste(String txt) {
		for(String hab:habilidades) {
			if(hab.equalsIgnoreCase(txt)) {
				return true;
			}
		}
		return false;
	}


    @Override
    public void Registrar(Persona Nuevo) throws DAOExeption {
        
            try {
                int getpais = 1,gethab = 1,cod_persona = 1;
                ResultSet cn;
                CallableStatement entrada  = getConexion().prepareCall("{Call GuardarPersona(?,?,?,?,?,?,?,?,?)}");
                entrada.setString(1,Nuevo.PrimerNombre);
                
                    entrada.setString(2,Nuevo.SegundoNombre);
                       entrada.setString(3,Nuevo.PrimerApellido);
             
                    entrada.setString(4,Nuevo.SegundoApellido);
                       entrada.setDate(5,new Date(Nuevo.FechaNacimiento.getDate()));
                entrada.setString(6, Nuevo.correo);
                // ENCRYPTBYPASSPHRASE('password', @llave) en el SP para guardar encriptacion
                entrada.setString(7,Nuevo.clave);
                entrada.setBoolean(8,Nuevo.estado);
                cn = Conexion.Connect.Consulta("SELECT cod_pais FROM Pais WHERE Pais.Nombre_pais = '"
                        +Nuevo.Pais+"'");
                while(cn.next()){
                    getpais = cn.getInt(1);
                }       
                entrada.setInt(9, getpais);
                entrada.execute();
                entrada.close();
                cn = Conexion.Connect.Consulta("SELECT cod_persona FROM Persona WHERE Persona.correo_persona = '"
                        +Nuevo.correo+"'");
                 while(cn.next()){
                    cod_persona = cn.getInt(1);
                }
                
                // creamos el nuevo obrero
                CallableStatement en  = getConexion().prepareCall("{Call DeclararObrero(?)}");
                en.setInt(1,cod_persona);
                en.execute();
                en.close();
                // agregar las carreras
                for (int i = 0; i < habilidades.size(); i++) {
                    
                    cn = Conexion.Connect.Consulta("SELECT cod_habilidad FROM Habilidades WHERE Habilidades.nombre = '"
                            +habilidades.get(i) +"'");
                    while(cn.next()){
                        gethab = cn.getInt(1);
                    }
                    // despues de obtener la carrera, se agrega  a la tabla carreras del universitario
                    en  = getConexion().prepareCall("{Call InsertarHabilidadesDeObrero(?,?)}");
                    en.setInt(1,cod_persona);
                    en.setInt(2, gethab);
                    en.execute();
                    en.close();
                }   } catch (ClassNotFoundException ex) {
                Logger.getLogger(Obrero.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
               throw new DAOExeption("Error en SQL",ex);
            }
  }

    @Override
    public void Modificar(Persona Nuevo) throws DAOExeption {
 }

    @Override
    public void Eliminar(Persona Nuevo) throws DAOExeption {
   }

    @Override
    public void RetornarPersonas() throws DAOExeption {
   }



	
	
	
}
