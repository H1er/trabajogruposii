package BackingBeans;

import java.io.Serializable;

import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import BasesDatos.BaseDatos;
import Entidades.Actividad;

@ManagedBean
@Named(value="admin")
@SessionScoped
public class PanelAdmin implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	private Actividad actselec = null;
	@Inject
    private BaseDatos acts = new BaseDatos();
	
	public PanelAdmin() {
		super();

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