package Logic;

import Interfaces.VacanteDAO;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class Vacante implements Serializable, VacanteDAO{
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
	
	public Vacante(Empresa empresa, String puesto, String tipoPersonal, Boolean[] requisitos,Boolean estado,int CP, int Monto,int CInicial,int codigo) {
		
		this.empresa = empresa;
		this.puesto = puesto;
		TipoPersonal = tipoPersonal;
		this.requisitos = requisitos;
		CantPuestos = CP;
		Solicitantes = new ArrayList();
		this.monto = Monto;
		codigoVacante = codigo;
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
		sumCant();
	}

	public void solicitar(Persona nueva) throws ClassNotFoundException, IOException {
		Solicitantes.add( nueva);
		Principal.getInstance().dataSalida();
	//	Organizar();
	}
	
	public void sumCant() {
		this.CantPuestos++;
		if(CantPuestos > cantInicial) {
			CantPuestos = cantInicial;
		}
	}
	public void restCant() {
		this.CantPuestos--;
		if(CantPuestos < 0) {
			CantPuestos = 0;
		}
	}
        
        
	
	// Despues de determinar si el reemplazo aplica se 
	//usa esta funcion para reemplazar una persona con menos habilidades
	public void Reemplazo(Persona user,int ind) throws ClassNotFoundException, IOException {
		cancelar(ind);
		Solicitantes.add(ind,user);
		Principal.getInstance().dataSalida();
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
        
        

    public void setSolicitantes(ArrayList<Persona> Solicitantes) {
        this.Solicitantes = Solicitantes;
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
			if(aux.correo.equalsIgnoreCase(txt) && aux.estado == false) {
				return true;
			}
		}
		return false;
	}
	
	public Boolean vacanteEstadistica(String txt) {
		for(Persona aux:Solicitantes ) {
			if(aux.correo.equalsIgnoreCase(txt) ) {
				return true;
			}
		}
		return false;
	}

	
	 
	 public int getCantSolicitantes() {
		return Solicitantes.size();
	}

    @Override
    public void Registrar(Vacante Nuevo) throws Exception {
        
    }

    @Override
    public void Modificar(Vacante Nuevo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Eliminar(Vacante Nuevo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void RetornarVacantes() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	 
	

}


