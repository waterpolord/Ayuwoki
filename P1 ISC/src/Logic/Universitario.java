package Logic;

import static Conexion.Connect.getConexion;
import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Universitario extends Persona {
	private ArrayList<String> carrera;

	public Universitario(String nombre,String nombre2, String apellido, String apellido2, Date fecha, String correo, String clave, Boolean estado, String pais, ArrayList<String> carr) {
		super(nombre, nombre2,  apellido,  apellido2, fecha,  correo,  clave, estado, pais);
		carrera = new ArrayList();
                carrera = carr;
	}

	public ArrayList<String> getCarreras() {
		return carrera;
	}
        
     @Override
    public void Registrar(Persona Nuevo) throws Exception {
        
        int getpais = 1,gethab = 1,cod_persona = 1;
        
        ResultSet cn = Conexion.Connect.Consulta("SELECT cod_persona FROM Persona WHERE Persona.correo_persona = '"
                            +Nuevo.correo+"'");
        while(cn.next()){
            cod_persona = cn.getInt(1);
        }
        
        CallableStatement entrada  = getConexion().prepareCall("{Call GuardarPersona(?,?,?,?,?,?,?,?,?)}");
        entrada.setString(1,Nuevo.PrimerNombre);
        if(!(Nuevo.SegundoNombre.isEmpty())){
            entrada.setString(2,Nuevo.SegundoNombre);
        }
        entrada.setString(3,Nuevo.PrimerApellido);
        if(!(Nuevo.SegundoApellido.isEmpty())){
            entrada.setString(4,Nuevo.SegundoApellido);
        }
        entrada.setDate(5,Nuevo.FechaNacimiento);
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
        // creamos el nuevo universitario
        cn = Conexion.Connect.Consulta("INSERT INTO Estudiante_Universitario values ('"
                                +cod_persona+"')" );
        // agregar las carreras
        for (int i = 0; i < carrera.size(); i++) {
            
            cn = Conexion.Connect.Consulta("SELECT cod_carrera FROM Carreras WHERE Carreras.nombre = '"
                                +carrera.get(i) +"'");
            while(cn.next()){
                gethab = cn.getInt(1);
            }
            // despues de obtener la carrera, se agrega  a la tabla carreras del universitario
            cn = Conexion.Connect.Consulta("INSERT INTO Carreras_De_Universitario values ('"
                                +cod_persona +"'"+",'"+gethab+"')" );
        }
  }

    @Override
    public void Modificar(Persona Nuevo) throws Exception {
 }

    @Override
    public void Eliminar(Persona Nuevo) throws Exception {
        int cod_persona = 1;
        ResultSet cn = Conexion.Connect.Consulta("DELETE FROM Persona WHERE Persona.correo_persona = '"
                            +Nuevo.correo+"'");
        while(cn.next()){
                cod_persona = cn.getInt(1);
            }
   }

    @Override
    public void RetornarPersonas() throws Exception {
   }
	

	


}
