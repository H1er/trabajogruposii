package Entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: Administrador
 *
 */
@Entity

public class Administrador extends Usuario implements Serializable {


	

	private String Rango;
	private String Rangoaux;
	private static final long serialVersionUID = 1L;

	public Administrador(String mail,String DNI,String Contrasenia,String Nombre,String apellido1,String apellido2,Date fecha_nacimiento,String Rango) {
		super(mail,DNI,Contrasenia,Nombre,apellido1,apellido2,fecha_nacimiento,"6");
		this.Rango=Rango;
	}

	public String getRango() {
		return Rango;
	}

	public void setRango(String rango) {
		Rango = rango;
	}

	public String getRangoaux() {
		return Rangoaux;
	}

	public void setRangoaux(String rangoaux) {
		Rangoaux = rangoaux;
	}   
   
}
