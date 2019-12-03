package Logic;

import Interfaces.VacanteDAO;

import static Conexion.Connect.getConexion;
import Interfaces.DAOExeption;

import java.io.IOException;
import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Vacante implements Serializable, VacanteDAO{
	private int codigoVacanteEmpresa;
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
	
	public Vacante(int codigoVacanteEmpresa, Empresa empresa, String puesto, String tipoPersonal, Boolean[] requisitos,Boolean estado,int CP, int Monto,int CInicial,int codigo) {
		
		this.codigoVacanteEmpresa = codigoVacanteEmpresa;
		this.empresa = empresa;
		this.puesto = puesto;
		TipoPersonal = tipoPersonal;
		this.requisitos = requisitos;
		CantPuestos = CP;
		Solicitantes = new ArrayList();
		this.monto = Monto;
		codigoVacante = codigo;
		cantInicial = CantPuestos;
                this.estado = estado;
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
	public void Reemplazo(Persona user,int ind) throws ClassNotFoundException, IOException, DAOExeption {
		cancelar(ind);
		Solicitantes.add(ind,user);
		this.Modificar(this);
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
    public void Registrar(Vacante Nuevo) throws DAOExeption {
            try {
                int getCodEmpresa = 1,ind;
                CallableStatement entrada  = getConexion().prepareCall("{Call GuardarVacanteEmpresa(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
                CallableStatement entrada2 = getConexion().prepareCall("{Call PersonasRelacionadas(?,?)}");
                entrada.setInt(1, Nuevo.codigoVacanteEmpresa);
                
                ResultSet cn = Conexion.Connect.Consulta("SELECT cod_empresa FROM Empresa WHERE correo_empresa = '"
                        +Nuevo.empresa.getCorreo().toString()+"'");
                ResultSet cn2;
                while(cn.next()){
                    getCodEmpresa = cn.getInt(1);
                }
                entrada.setInt(2, getCodEmpresa);
                for(int i = 3, i2 = 0; i < 13; i++, i2++ ) {
                    entrada.setBoolean(i,Nuevo.requisitos[i2]);
                 
                }
                entrada.setString(13,Nuevo.puesto);
                entrada.setInt(14,Nuevo.cantInicial);
                entrada.setInt(15,Nuevo.CantPuestos);
                entrada.setString(16,Nuevo.TipoPersonal);
                entrada.setInt(17,Nuevo.monto);
                entrada.setInt(18,Nuevo.codigoVacante);
                entrada.setBoolean(19,Nuevo.estado);
                
                ind = 0;
                for(Persona correo:Nuevo.getPersonas()){
                    cn = Conexion.Connect.Consulta("SELECT cod_persona FROM Persona WHERE correo_persona = '"
                            +Nuevo.getPersonas().get(ind).correo+"'");
                    cn2 = Conexion.Connect.Consulta("SELECT cod_vacante_empresa FROM Vacante_Empresa INNER JOIN"
                            + "Empresa ON Empresa.cod_empresa = Vacante_Empresa.cod_empresa WHERE Empresa.cod_empresa = '"+getCodEmpresa+"'");
                    while(cn.next()){
                        while(cn2.next()){
                            entrada2.setInt(cn.getInt(1),cn2.getInt(1));
                            entrada2.execute();
                            entrada2.close();
                        }
                    }
                    ind++;
                }
                entrada.execute();
                entrada.close();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Vacante.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                throw new DAOExeption("Error en SQL",ex);
            }
    }

    @Override
    public void Modificar(Vacante Nuevo) throws DAOExeption {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Eliminar(Vacante Nuevo) throws DAOExeption {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void RetornarVacantes() throws DAOExeption {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	public int getCodigoVacanteEmpresa() {
		return codigoVacanteEmpresa;
	}

	public void setCodigoVacanteEmpresa(int codigoVacanteEmpresa) {
		this.codigoVacanteEmpresa = codigoVacanteEmpresa;
	}
	 
	

}


