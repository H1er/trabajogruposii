package BackingBeans;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import Entidades.Mensaje;

@Named(value="nuevom")
@SessionScoped
public class NuevoMensaje implements Serializable
{
	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}

	private Mensaje mensaje;
	private String asunto;
	private String texto;
	private String destinatario;
	
	
	
	public NuevoMensaje()
	{
		mensaje = new Mensaje();
	}
	
	public void enviarMensaje()
	{
		mensaje.setTexto(this.texto);
		mensaje.setAsunto(this.asunto);
		mensaje.setDnidestinatario(this.destinatario);
		//Faltaaa  mensaje.setDniremitente(dniremitente);
		
	}
	
	public Mensaje getMensaje()
	{
		return mensaje;
	}
	
}