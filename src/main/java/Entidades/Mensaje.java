package Entidades;


import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.inject.Named;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 * Entity implementation class for Entity: Mensaje
 *
 */
@Entity
@Named(value="mensaje")
public class Mensaje implements Serializable {

	   
	@Id
	private Integer id;
	@Temporal(TemporalType.DATE)
	private Date Fecha;
	private String Asunto;
	private String Texto;
	private String dniremitente;
	private String dnidestinatario;
	private static final long serialVersionUID = 1L;

	public Mensaje(Integer id,Date Fecha,String Asunto,String Texto,String remitente,String destinatario) {
		this.id=id;
		this.Fecha=Fecha;
		this.Asunto=Asunto;
		this.Texto=Texto;
		this.dniremitente=remitente;
		this.dnidestinatario=destinatario;
	}   
	public String getDniremitente() {
		return dniremitente;
	}
	public void setDniremitente(String dniremitente) {
		this.dniremitente = dniremitente;
	}
	public String getDnidestinatario() {
		return dnidestinatario;
	}
	public void setDnidestinatario(String dnidestinatario) {
		this.dnidestinatario = dnidestinatario;
	}
	public Mensaje() {
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   

	public Date getFecha() {
		return Fecha;
	}
	public void setFecha(Date fecha) {
		Fecha = fecha;
	}
	public String getAsunto() {
		return this.Asunto;
	}

	public void setAsunto(String Asunto) {
		this.Asunto = Asunto;
	}   
	public String getTexto() {
		return this.Texto;
	}

	public void setTexto(String Texto) {
		this.Texto = Texto;
	}
	
	@Embeddable
	public class MensajePK implements java.io.Serializable {
		@EmbeddedId
		@Column(name="Codigo_mensaje",nullable=false)
		private Integer Codigo_mensaje; 
		@EmbeddedId
		@Column(name="Codigo_emisor",nullable=false)
		private Integer Codigo_emisor; 
		@EmbeddedId
		@Column(name="Codigo_receptor",nullable=false)
		private Integer Codigo_receptor; 
		
	}
   
}

