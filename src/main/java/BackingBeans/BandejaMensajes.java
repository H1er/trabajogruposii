package BackingBeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import BasesDatos.DatosMensajes;
import Entidades.Mensaje;


@Named(value="bandeja")
@RequestScoped
public class BandejaMensajes implements Serializable{
	
	
	private DatosMensajes total=new DatosMensajes();
	private List<Mensaje> enviados=total.getListamensajes();
	private List<Mensaje> recibidos=total.getListamensajes();


	private Mensaje seleccionado;
	private Mensaje seleccionado2;
	
	public Mensaje getSeleccionado2() {
		return seleccionado2;
	}

	public void setSeleccionado2(Mensaje seleccionado2) {
		this.seleccionado2 = seleccionado2;
	}

	public BandejaMensajes() {
		
	}

	public List<Mensaje> getEnviados() {
		return enviados;
	}

	public void setEnviados(List<Mensaje> enviados) {
		this.enviados = enviados;
	}

	public List<Mensaje> getRecibidos() {
		return recibidos;
	}

	public void setRecibidos(List<Mensaje> recibidos) {
		this.recibidos = recibidos;
	}

	public Mensaje getSeleccionado() {
		return seleccionado;
	}

	public void setSeleccionado(Mensaje seleccionado) {
		this.seleccionado = seleccionado;
	}

	
	

}
