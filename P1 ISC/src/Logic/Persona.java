package Logic;
import static Conexion.Connect.getConexion;
import Interfaces.PersonaDAO;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.Date;

public abstract class Persona implements Serializable,PersonaDAO{
	
	protected String PrimerNombre;
	protected String PrimerApellido;
        protected String SegundoNombre;
	protected String SegundoApellido;
        protected java.sql.Date FechaNacimiento;
	protected String correo;
	protected String clave;
	protected Boolean estado;
	protected Empleo Solicitud;
	protected Boolean Sesion;
	protected int tieneSolicitud = 0;
        protected String Pais;
	
	
	public Persona(String nombre,String nombre2, String apellido, String apellido2,Date fecha, String correo, String clave, Boolean estado, String pais) {
                this.PrimerNombre = nombre;
                this.SegundoNombre = nombre2;
                this.PrimerApellido = apellido;
                this.SegundoApellido = apellido2;
		this.correo = correo;
		this.clave = clave;
		this.estado = estado;
		Sesion = true;
                this.Pais = pais;
	}
	
	public Empleo getSolicitud() {
		return Solicitud;
	}
	
	public void setSolicitud(Empleo guardar) throws FileNotFoundException, ClassNotFoundException, IOException {
		Solicitud = guardar;
		tieneSolicitud = 1;
		Principal.getInstance().setTEmpleos(guardar);
	}
	
	public int getSoli() {
		return tieneSolicitud;
	}

    public String getNombre() {
        return PrimerNombre;
    }

    public void setPrimerNombre(String PrimerNombre) {
        this.PrimerNombre = PrimerNombre;
    }

    public String getPrimerApellido() {
        return PrimerApellido;
    }

    public void setPrimerApellido(String PrimerApellido) {
        this.PrimerApellido = PrimerApellido;
    }

    public String getSegundoNombre() {
        return SegundoNombre;
    }

    public void setSegundoNombre(String SegundoNombre) {
        this.SegundoNombre = SegundoNombre;
    }

    public String getSegundoApellido() {
        return SegundoApellido;
    }

    public void setSegundoApellido(String SegundoApellido) {
        this.SegundoApellido = SegundoApellido;
    }
	
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public void setSesion(Boolean sesion) {
		this.Sesion = sesion;
	}
	
	public Boolean getSesion() {
		return this.Sesion;
	}
	
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
    @Override
    public void Registrar(Persona Nuevo) throws Exception {
        int getpais = 1;
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
        ResultSet cn = Conexion.Connect.Consulta("SELECT cod_pais FROM Pais WHERE Pais.Nombre = '"
                            +Nuevo.Pais+"'");
        while(cn.next()){
            getpais = cn.getInt(1);
        }
        entrada.setInt(9, getpais);
        entrada.execute();
        
    }

    @Override
    public void Modificar(Persona Nuevo) throws Exception {
    
    }

    @Override
    public void Eliminar(Persona Nuevo) throws Exception {
        
     }
	
	

}

