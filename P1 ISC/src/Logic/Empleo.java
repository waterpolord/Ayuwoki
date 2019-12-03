package Logic;

import static Conexion.Connect.getConexion;
import Interfaces.DAOExeption;

import java.io.File;
import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Interfaces.EmpleoDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Empleo implements Serializable, EmpleoDAO{
	
	
	private int monto;
        private int codPersona;
	private Boolean[] habilidades = new Boolean[10];
	private String cualidad;
	
	public Empleo(int cod,Boolean[] habilidades, int monto, String cualidad) {
		
		this.habilidades = habilidades;
		this.monto = monto;
		this.setCualidad(cualidad);
                this.codPersona = cod;
	}
	

	public Boolean[] getHab() {
		return habilidades;
	}
	public int getMonto() {
		return monto;
	}


	public String getCualidad() {
		return cualidad;
	}


	public void setCualidad(String cualidad) {
		this.cualidad = cualidad;
	}

	@Override
    public void Registrar(Empleo Nuevo) throws DAOExeption {
    	CallableStatement entrada;
        
        
        
            try {
                entrada = getConexion().prepareCall("{Call GuardarSolicitudPersona(?,?,?,?,?,?,?,?,?,?,?,?,?)}");
                
                entrada.setInt(1, Nuevo.codPersona);
                
                for(int i = 2, i2 = 0; i < 12; i++, i2++ ) {
                        entrada.setBoolean(i,Nuevo.habilidades[i2]);
                }
                entrada.setString(12, Nuevo.cualidad);
                entrada.setInt(13, monto);
                entrada.execute();
                entrada.close();
         }  catch (SQLException ex) {
                throw new DAOExeption("Error en SQL",ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Empleo.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    @Override
    public void Modificar(Empleo Nuevo) throws DAOExeption {
    }

    @Override
    public void Eliminar(Empleo Nuevo) throws DAOExeption {
    }

    @Override
    public void RetornarEmpleo() throws DAOExeption {
   
    }


	public int getCodPersona() {
		return codPersona;
	}


	public void setCodPersona(int codPersona) {
		this.codPersona = codPersona;
	}
}
