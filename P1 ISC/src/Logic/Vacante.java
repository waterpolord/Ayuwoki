package Logic;

import java.io.Serializable;
import java.util.ArrayList;

public class Vacante implements Serializable{
	private Empresa empresa;
	private String puesto;
	private String TipoPersonal;
	private Boolean[] requisitos = new Boolean[10];
	private Boolean estado;
	private int CantPuestos;
	private int monto;
	private int cantInicial;
	private ArrayList<Persona> Solicitantes;
	private int codigoVacante;
	
	public Vacante(Empresa empresa, String puesto, String tipoPersonal, Boolean[] requisitos,int CP, int Monto,int codigo) {
		
		this.empresa = empresa;
		this.puesto = puesto;
		TipoPersonal = tipoPersonal;
		this.requisitos = requisitos;
		CantPuestos = CP;
		Solicitantes = new ArrayList();
		this.monto = Monto;
		codigoVacante = codigo;
		this.estado = true;
		cantInicial = CantPuestos;
	}
	
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}
	public int getCantInicial() {
		return this.cantInicial;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public void solicitar(Persona nueva) {
		Solicitantes.add( nueva);
	//	Organizar();
	}
	
	public void sumCant() {
		this.CantPuestos++;
	}
	public void restCant() {
		this.CantPuestos--;
	}
	
	// Despues de determinar si el reemplazo aplica se 
	//usa esta funcion para reemplazar una persona con menos habilidades
	public void Reemplazo(Persona user,int ind) {
		cancelar(ind);
		Solicitantes.add(ind,user);
	//	Organizar();
	}
	
	public void Organizar() {

	}
	
	public int getCantPositivas(Empleo user) {
		int Positivas = 0,i = 0;
		for(Boolean var:user.getHab()) {
			if(var && requisitos[i]) {
				Positivas++;
			}
			if( !(var && requisitos[i])) {
				Positivas++;
			}
			i++;
		}
			return Positivas;
	}
	
	public void cancelar(int ind) {
		Solicitantes.remove(ind);
	}
	
	public Boolean getEstado() {
		return estado;
	}
	
	public ArrayList<Persona> getPersonas(){
		return Solicitantes;
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
	
	public int getCodigo() {
		return codigoVacante;
	}
	
	public int getCant() {
		return CantPuestos;
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
	
	public Boolean aplicaHabilidades(Empleo user) {
		int Positivas = 0,i = 0;
		for(Boolean var:user.getHab()) {
			if((var && requisitos[i]) ) {
				Positivas++;
			}
			if(!(var && requisitos[i])) {
				Positivas++;
			}
			i++;
		}
		if(Positivas >= 8) {
			return true;
		}
		return false;
	}
	/*
	 * El metodo reemplazoAplica sirve para analizar si existen nuevos 
	 * y mejores usuarios, con mejores habilidades que los que estan en la aolicitud (Vacante)
	 */
	public int reemplazoAplica(Empleo user) {
		int PositivasUser = 0,PositivaMenor = 0,i = 0,ind = 0;
		
		for(Boolean var:user.getHab()) {
			if(var && requisitos[i]) {
				PositivasUser++;
			}
			if( !(var && requisitos[i])) {
				PositivasUser++;
			}
			i++;
		}
		i = 0;
		
		for(Persona Todos:Solicitantes) {
			for(Boolean var:Todos.getSolicitud().getHab()) {
				if(var && requisitos[i]) {
					PositivaMenor++;
				}
				if(PositivasUser > PositivaMenor ) {
					return ind;
				}
				i++;
			}
			ind++;
		}
		// ind es el indice de la persona en el Arreglo para reemplazar si se aplica
		return -1;
	}
	
	public Boolean VacanteRepite(String txt) {
		for(Persona aux:Solicitantes ) {
			if(aux.correo.equalsIgnoreCase(txt)) {
				return true;
			}
		}
		return false;
	}

	
	 
	 public int getCantSolicitantes() {
		return Solicitantes.size();
	}
	 
	

}


