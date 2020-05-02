package BackingBeans;

import java.io.Serializable;

import javax.annotation.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import BackingBeans.Autenticacion.ControlAutorizacion;
import BasesDatos.BaseDatos;
import Entidades.Actividad;

@ManagedBean
@Named(value="misacts")
@ViewScoped
public class MisActividades implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	private Actividad actselec;
	
	@Inject
    private BaseDatos acts = new BaseDatos();
	
	@Inject 
	private ControlAutorizacion ctr;
	
	/**
	 * 
	 */
	public MisActividades()
	{
	
	}
	
	public ControlAutorizacion getCtr() {
		return ctr;
	}

	public void setCtr(ControlAutorizacion ctr) {
		this.ctr = ctr;
	}

	public BaseDatos getActs() {
		return acts;
	}

	public void setActs(BaseDatos acts) {
		this.acts = acts;
	}

	public Actividad getActselec() {
		return actselec;
	}

	public void setActselec(Actividad actselec) {
		this.actselec = actselec;
	}
	


}
