package BackingBeans;

import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.primefaces.event.CloseEvent;
import org.primefaces.event.MoveEvent;

@Named (value="publicaractividad")
@RequestScoped
public class publicarActividad {

    public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}



	@Temporal(TemporalType.DATE)
    private Date fecha; 
    private String localizacion;
    private String descripcion;
    private String duracion;
    private String num;
    private String disponibilidad= "No disponible";
 


    public String getDisponibilidad() {
		return disponibilidad;
	}
    
    public String aniade()
    {
    	try
    	{
    		if(!this.faltanDatos())
        	{
        		//comprobar que todos los campos han sido rellenados y añadir la actividad
            	this.addMessage("Su actividad ha sido propuesta","esta será evaluada por nuestros administradores y evaluada en caso de que proceda" );
            	return "publicar.xhtml";
        	}
        	else
        	{
        		this.addMessage("Faltan Datos", "Para registrarse correctamente debe introducir los datos indicados con *  ");
        		return null;
        	}
    		
    	}
    	catch(NullPointerException e)
    	{
    		this.addMessage("Faltan Datos", "Para registrarse correctamente debe introducir los datos indicados con *  ");
    		return null;
    		
    	}
    	
    
    	
    	
    }
    
    public boolean faltanDatos() //devuelve true si faltan datos
	{
		
			return this.fecha.equals("") || this.localizacion.equals("") || this.descripcion.equals("") || this.duracion.equals("") || this.num.equals("");
				
	}

	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}


    public void addMessage(String mensaje1, String mensaje2) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, mensaje1, mensaje2);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}