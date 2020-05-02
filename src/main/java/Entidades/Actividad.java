package Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@MappedSuperclass  
public class Actividad implements Serializable, Comparable<Actividad> {
	
	@Temporal(TemporalType.DATE)
	private Date Fecha;
	private Date Fechaaux;
	
	private String Nombre;
	private String Nombreaux;
	
	private String Localizacion;
	private String Localizacionaux;
	
	private String Descripcion;
	private String Descripcionaux;
	
	private String Duracion;
	private String Duracionaux;
	
	private String Disponibilidad;
	private String Disponibilidadaux;
	
	private Integer plazas;  
	private Integer plazasaux; 
	
	@Id
	private Integer Codigo;
	private Integer Codigoaux;
	@OneToOne
	private Usuario usrx; 
	
	public int compareTo(Actividad act)
	{
		return this.hashCode()-act.hashCode();
	}


	public Date getFecha() {
		return Fecha;
	}
	public void setFecha(Date fecha) {
		Fecha = fecha;
	}
	public Date getFechaaux() {
		return Fechaaux;
	}
	public void setFechaaux(Date fechaaux) {
		Fechaaux = fechaaux;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getNombreaux() {
		return Nombreaux;
	}
	public void setNombreaux(String nombreaux) {
		Nombreaux = nombreaux;
	}
	public String getLocalizacion() {
		return Localizacion;
	}
	public void setLocalizacion(String localizacion) {
		Localizacion = localizacion;
	}
	public String getLocalizacionaux() {
		return Localizacionaux;
	}
	public void setLocalizacionaux(String localizacionaux) {
		Localizacionaux = localizacionaux;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public String getDescripcionaux() {
		return Descripcionaux;
	}
	public void setDescripcionaux(String descripcionaux) {
		Descripcionaux = descripcionaux;
	}
	public String getDuracion() {
		return Duracion;
	}
	public void setDuracion(String duracion) {
		Duracion = duracion;
	}
	public String getDuracionaux() {
		return Duracionaux;
	}
	public void setDuracionaux(String duracionaux) {
		Duracionaux = duracionaux;
	}
	public String getDisponibilidad() {
		return Disponibilidad;
	}
	public void setDisponibilidad(String disponibilidad) {
		Disponibilidad = disponibilidad;
	}
	public String getDisponibilidadaux() {
		return Disponibilidadaux;
	}
	public void setDisponibilidadaux(String disponibilidadaux) {
		Disponibilidadaux = disponibilidadaux;
	}
	public Integer getPlazas() {
		return plazas;
	}
	public void setPlazas(Integer plazas) {
		this.plazas = plazas;
	}
	public Integer getPlazasaux() {
		return plazasaux;
	}
	public void setPlazasaux(Integer plazasaux) {
		this.plazasaux = plazasaux;
	}
	public Integer getCodigo() {
		return Codigo;
	}
	public void setCodigo(Integer codigo) {
		Codigo = codigo;
	}
	public Integer getCodigoaux() {
		return Codigoaux;
	}
	public void setCodigoaux(Integer codigoaux) {
		Codigoaux = codigoaux;
	}
	public Usuario getUsrx() {
		return usrx;
	}
	public void setUsrx(Usuario usrx) {
		this.usrx = usrx;
	}

	@OneToMany 
	private List <Servicio> lista_servicio= new ArrayList<>(); 
	
	public List<Servicio> getLista_servicio() {
		return lista_servicio;
	}
	public void setLista_servicio(List<Servicio> lista_servicio) {
		this.lista_servicio = lista_servicio;
	}

	private static final long serialVersionUID = 1L;
	

	public Actividad(String Nombre,Date f,String l,String d,String dur,String dis,Integer nump,Integer codigo) {
		this.Fecha=f;
		this.Localizacion=l;
		this.Descripcion=d;
		this.Duracion=dur;
		this.Disponibilidad=dis;
		this.plazas=nump;
		this.lista_servicio=new ArrayList<>();
		this.Codigo=codigo;
		this.Nombre=Nombre;
	}  
}
