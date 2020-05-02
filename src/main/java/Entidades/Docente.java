package Entidades;


import java.io.Serializable;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Profesores
 *
 */
@Entity

public class Docente extends Usuario implements Serializable {

	private String Departamento;
	private String Departamentoaux;

	private static final long serialVersionUID = 1L;

	public Docente(String mail,String DNI,String Contrasenia,String Nombre,String apellido1,String apellido2,Date fecha_nacimiento,String Departamento) {
		super(mail,DNI,Contrasenia,Nombre,apellido1,apellido2,fecha_nacimiento,"2");
		this.Departamento=Departamento;
	}

	public String getDepartamento() {
		return Departamento;
	}

	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}

	public String getDepartamentoaux() {
		return Departamentoaux;
	}

	public void setDepartamentoaux(String departamentoaux) {
		Departamentoaux = departamentoaux;
	}   
	
}
