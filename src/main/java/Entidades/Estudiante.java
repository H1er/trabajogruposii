package Entidades;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: Estudiante
 *
 */
@Entity

public class Estudiante extends Usuario implements Serializable {

	private String Curso;
	private String Cursoaux;
	
	private String Titulacion;
	private String Titulacionaux;
	
	private static final long serialVersionUID = 1L;

	public Estudiante(String mail,String DNI,String Contrasenia,String Nombre,String apellido1,String apellido2,Date fecha_nacimiento,String Curso,String titulacion) {
		super(mail,DNI,Contrasenia,Nombre,apellido1,apellido2,fecha_nacimiento,"3");
		this.Curso=Curso;
		this.Titulacion=titulacion;
	}

	public String getCurso() {
		return Curso;
	}

	public void setCurso(String curso) {
		Curso = curso;
	}

	public String getCursoaux() {
		return Cursoaux;
	}

	public void setCursoaux(String cursoaux) {
		Cursoaux = cursoaux;
	}

	public String getTitulacion() {
		return Titulacion;
	}

	public void setTitulacion(String titulacion) {
		Titulacion = titulacion;
	}

	public String getTitulacionaux() {
		return Titulacionaux;
	}

	public void setTitulacionaux(String titulacionaux) {
		Titulacionaux = titulacionaux;
	}     
	
   
}
