package Logic;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public class Empleo implements Serializable{
	
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

	
}
