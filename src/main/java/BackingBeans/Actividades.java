package BackingBeans;

import java.io.Serializable;

import javax.annotation.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import BasesDatos.BaseDatos;
import Entidades.Actividad;

@ManagedBean
@Named(value="acts")
@ViewScoped
public class Actividades implements Serializable
{
	
	public Actividades()
	{
		if(!this.acts.getActividades().isEmpty())
		{
			this.setActselec(this.acts.getActividades().get(0));
			
		}
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Actividad actselec;
	
	@Inject
    private BaseDatos acts = new BaseDatos();
	
	public BaseDatos getBada() {
		return acts;
	}

	public void setBada(BaseDatos acts) {
		this.acts = acts;
	}

	public Actividad getActselec() {
		return actselec;
	}

	public void setActselec(Actividad actselec) {
		this.actselec = actselec;
	}

}