package Logic;

import static Conexion.Connect.getConexion;

import java.io.File;
import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Interfaces.EmpleoDAO;

public class Empleo implements Serializable, EmpleoDAO{
	
	private int monto;
	private Boolean[] habilidades = new Boolean[10];
	private String cualidad;
	
	public Empleo( Boolean[] habilidades, int monto, String cualidad) {
		this.habilidades = habilidades;
		this.monto = monto;
		this.setCualidad(cualidad);
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
    public void Registrar(Empleo Nuevo) throws Exception {
    	CallableStatement entrada  = getConexion().prepareCall("{Call GuardarSolicitudPersona(?,?,?,?,?,?,?,?,?,?,?,?)}");
        
        for(int i = 1, i2 = 0; i < 11; i++, i2++ ) {
        	entrada.setBoolean(i,Nuevo.habilidades[i2]);
        }
        entrada.setString(11, Nuevo.cualidad);
        entrada.setInt(12, monto);
        entrada.execute();
    }

    @Override
    public void Modificar(Empleo Nuevo) throws Exception {
    }

    @Override
    public void Eliminar(Empleo Nuevo) throws Exception {
    }

    @Override
    public void RetornarEmpleo() throws Exception {
   
    }
}
