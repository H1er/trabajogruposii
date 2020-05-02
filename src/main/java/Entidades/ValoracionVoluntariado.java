package Entidades;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: ValoracionVoluntariado
 *
 */
@Entity

public class ValoracionVoluntariado implements Serializable {

	@Id
	private Integer Codigo; 
	private Integer CalificacionEstudiante;
	private Integer CalificacionDocente;
	private Integer CalificacionEntidad;
	private String Descripcion;
	@OneToOne
	private Estudiante est;
	@OneToMany
	private List <Docente> realizado_por;
	private List <Entidad> valorado_por; 
	private static final long serialVersionUID = 1L;

	public ValoracionVoluntariado() {
		super();
	}   

	public Integer getCalificacionEstudiante() {
		return CalificacionEstudiante;
	}

	public void setCalificacionEstudiante(Integer calificacionEstudiante) {
		CalificacionEstudiante = calificacionEstudiante;
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
	public class VoluntariadoPK implements java.io.Serializable {
		@EmbeddedId
		@Column(name="Codigo_voluntariado",nullable=false)
		private Integer Codigo_voluntariado; 
		@EmbeddedId
		@Column(name="Codigo_valoracion",nullable=false)
		private Integer Codigo_valoracion; 
		
	}
	
}
