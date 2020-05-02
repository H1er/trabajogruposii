package Entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


/**
 * Entity implementation class for Entity: Servicio
 *
 */
@Entity

public class Servicio implements Serializable {

	 
	

	@Id
	private Integer Codigo;
	private String descripcionaux;
	private String paisaux;
	private String ciudadaux;
	private String horasaux;
	private String numParticipantesaux;
	
	public String getDescripcionaux() {
		return descripcionaux;
	}
	public void setDescripcionaux(String descripcionaux) {
		this.descripcionaux = descripcionaux;
	}

	private String Pais;
	private String Ciudad;
	private Integer Horas;
	private Integer NumParticipantes;
	private String Descripcion;
	@ManyToMany 
	private List <Usuario> servicios_en; 
	private static final long serialVersionUID = 1L;
	@ManyToOne 
	private Actividad Act; 
	
	public Servicio(Integer codigo,String pais,String ciudad,Integer horas,Integer numParticipantes,String descripcion, Actividad act) 
	{
		this.Codigo=codigo;
        this.Pais=pais;
        this.Ciudad=ciudad;
        this.Horas=horas;
        this.NumParticipantes=numParticipantes;
        this.Descripcion=descripcion;
        this.Act = act;
	}   
	
	public String getPaisaux() {
		return paisaux;
	}
	public void setPaisaux(String paisaux) {
		this.paisaux = paisaux;
	}
	public String getCiudadaux() {
		return ciudadaux;
	}
	public void setCiudadaux(String ciudadaux) {
		this.ciudadaux = ciudadaux;
	}
	public String getHorasaux() {
		return horasaux;
	}
	public void setHorasaux(String horasaux) {
		this.horasaux = horasaux;
	}
	public String getNumParticipantesaux() {
		return numParticipantesaux;
	}
	public void setNumParticipantesaux(String numParticipantesaux) {
		this.numParticipantesaux = numParticipantesaux;
	}
	public List<Usuario> getServicios_en() {
		return servicios_en;
	}
	public void setServicios_en(List<Usuario> servicios_en) {
		this.servicios_en = servicios_en;
	}
	public Integer getCodigo() {
		return this.Codigo;
	}

	public void setCodigo(Integer codigo) {
		this.Codigo = codigo;
	}   
	public String getPais() {
		return this.Pais;
	}

	public void setPais(String Pais) {
		this.Pais = Pais;
	}   
	public String getCiudad() {
		return this.Ciudad;
	}

	public void setCiudad(String Ciudad) {
		this.Ciudad = Ciudad;
	}   
	public Integer getHoras() {
		return this.Horas;
	}

	public void setHoras(Integer Horas) {
		this.Horas = Horas;
	}   
	public Integer getNumParticipantes() {
		return this.NumParticipantes;
	}

	public void setNumParticipantes(Integer NumParticipantes) {
		this.NumParticipantes = NumParticipantes;
	}   
	public String getDescripcion() {
		return this.Descripcion;
	}

	public void setDescripcion(String Descripcion) {
		this.Descripcion = Descripcion;
	}
   
}
