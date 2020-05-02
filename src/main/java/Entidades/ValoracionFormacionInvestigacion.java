package Entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: ValoracionFormacionInvestigacion
 *
 */
@Entity

public class ValoracionFormacionInvestigacion implements Serializable {

	@Id
	private Integer Codigo; 
	private Integer CalificacionDocente;
	private Integer CalificacionEntidad;
	private String Descripcion;
	@OneToMany
	private List <Docente> realizado_por;
	private List <Entidad> valorado_por; 
	private static final long serialVersionUID = 1L;

	public ValoracionFormacionInvestigacion() {
		super();
	}   

	public Integer getCalificacionDocente() {
		return CalificacionDocente;
	}

	public void setCalificacionDocente(Integer calificacionDocente) {
		CalificacionDocente = calificacionDocente;
	}

	public Integer getCalificacionEntidad() {
		return CalificacionEntidad;
	}

	public void setCalificacionEntidad(Integer calificacionEntidad) {
		CalificacionEntidad = calificacionEntidad;
	}

	public String getDescripcion() {
		return this.Descripcion;
	}

	public void setDescripcion(String Descripcion) {
		this.Descripcion = Descripcion;
	}
   
	@Embeddable
	public class ValoracionFomracionInestigacionPK implements java.io.Serializable {
		@EmbeddedId
		@Column(name="Codigo",nullable=false)
		private Integer Codigo; 
		@EmbeddedId
		@Column(name="tipo_formacion",nullable=false)
		private Integer tipo_formacion; 
		@EmbeddedId
		@Column(name="tipo_investigacion",nullable=false)
		private Integer tipo_investigacion; 
		
	}
}
