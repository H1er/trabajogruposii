package Entidades;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entity implementation class for Entity: Informe
 *
 */
@Entity

public class Informe implements Serializable {

	@Id
	private Integer id_informe; 
	private String Observacion;
	@Temporal(TemporalType.DATE)
	private Date FechaRealizacion;
	@OneToOne
	private Entidad ent; 
	@OneToMany
	private List <Docente> realizado_por; 
	private static final long serialVersionUID = 1L;

	public Informe(Integer id_informe,String Observacion,Date FechaREalizacion,Entidad ent,List<Docente> lista) {
		this.id_informe=id_informe;
		this.Observacion=Observacion;
		this.FechaRealizacion=FechaREalizacion;
		this.ent=ent;
		this.realizado_por=lista;
	}
	
	public Informe()
	{
		super();
	}
	public String getObservacion() {
		return this.Observacion;
	}

	public void setObservacion(String Observacion) {
		this.Observacion = Observacion;
	}   
	public Date getFechaRealizacion() {
		return this.FechaRealizacion;
	}

	public void setFechaRealizacion(Date FechaRealizacion) {
		this.FechaRealizacion = FechaRealizacion;
	}
	
	@Embeddable
	public class InformePK implements java.io.Serializable {
		@EmbeddedId
		@Column(name="id_informe",nullable=false)
		private Integer id_informe; 
		@EmbeddedId
		@Column(name="id_actividad",nullable=false)
		private Integer id_actividad; 
		
		
	}
	
	
   
}
