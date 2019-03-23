package Logic;

import java.util.ArrayList;

public class Vacante {
	private Empresa empresa;
	private String puesto;
	private String TipoPersonal;
	private ArrayList<String> requisitos;
	
	public Vacante(Empresa empresa, String puesto, String tipoPersonal, ArrayList<String> requisitos) {
		super();
		this.empresa = empresa;
		this.puesto = puesto;
		TipoPersonal = tipoPersonal;
		this.requisitos = requisitos;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getTipoPersonal() {
		return TipoPersonal;
	}

	public void setTipoPersonal(String tipoPersonal) {
		TipoPersonal = tipoPersonal;
	}

	public ArrayList<String> getRequisitos() {
		return requisitos;
	}

	public void setRequisitos(ArrayList<String> requisitos) {
		this.requisitos = requisitos;
	}
	

}
