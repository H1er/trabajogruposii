package Entidades;
import java.io.Serializable;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Entidad
 *
 */
@Entity

public class Entidad extends Usuario implements Serializable {


	private String Direccion;
	private String Direccionaux;
	
	private String Telefono;
	private String Telefonoaux;

	private String Pais;
	private String Paisaux;
	
	private String Ciudad;
	private String Ciudadaux;
	
	private String Tipo_origen;
	private String Tipo_origenaux;
	
	private String Pagina_web;
	private String Pagina_webaux;
	
	
	private static final long serialVersionUID = 1L;

	public Entidad(String mail,String DNI,String Contrasenia,String Nombre,String Direccion,String Telefono,String Pais,String Ciudad,String tipo_origen,String pagina_web) {
		super(mail,DNI,Contrasenia,Nombre,"5");
		this.Direccion=Direccion;
		this.Telefono=Telefono;
		this.Pais=Pais;
		this.Ciudad=Ciudad;
		this.Tipo_origen=tipo_origen;
		this.Pagina_web=pagina_web;
		
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getDireccionaux() {
		return Direccionaux;
	}

	public void setDireccionaux(String direccionaux) {
		Direccionaux = direccionaux;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getTelefonoaux() {
		return Telefonoaux;
	}

	public void setTelefonoaux(String telefonoaux) {
		Telefonoaux = telefonoaux;
	}

	public String getPais() {
		return Pais;
	}

	public void setPais(String pais) {
		Pais = pais;
	}

	public String getPaisaux() {
		return Paisaux;
	}

	public void setPaisaux(String paisaux) {
		Paisaux = paisaux;
	}

	public String getCiudad() {
		return Ciudad;
	}

	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}

	public String getCiudadaux() {
		return Ciudadaux;
	}

	public void setCiudadaux(String ciudadaux) {
		Ciudadaux = ciudadaux;
	}

	public String getTipo_origen() {
		return Tipo_origen;
	}

	public void setTipo_origen(String tipo_origen) {
		Tipo_origen = tipo_origen;
	}

	public String getTipo_origenaux() {
		return Tipo_origenaux;
	}

	public void setTipo_origenaux(String tipo_origenaux) {
		Tipo_origenaux = tipo_origenaux;
	}

	public String getPagina_web() {
		return Pagina_web;
	}

	public void setPagina_web(String pagina_web) {
		Pagina_web = pagina_web;
	}

	public String getPagina_webaux() {
		return Pagina_webaux;
	}

	public void setPagina_webaux(String pagina_webaux) {
		Pagina_webaux = pagina_webaux;
	}      

	
}
