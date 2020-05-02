package Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

public class Usuario implements Serializable {


	private String tipouser;
	private String tipouseraux;

	public Map<Actividad, Servicio> getParticipa() {
		return participa;
	}

	public void setParticipa(Map<Actividad, Servicio> participa) {
		this.participa = participa;
	}

	@Id
	private String mail;
	private String mailaux;
	
	private String DNI;
	private String DNIaux;
	
	private String Contrasenia;
	private String Contraseniaaux;
	
	private String Nombre;
	private String Nombreaux;
	
	private String Apellido1;
	private String Apellido1aux;
	
	private String Apellido2;
	private String Apellido2aux;
	
	@Temporal(TemporalType.DATE)
	private Date Fechanacimiento;
	private Date Fechanacimientoaux;
	
	Map<Actividad, Servicio> participa = new TreeMap<>();
	
	@ManyToMany (mappedBy = "servicios_en")
	private List <Servicio> participa_en = new ArrayList<>();
	@OneToMany
	private List <Actividad> act;
	@ManyToOne
	private Administrador admin; 
	private static final long serialVersionUID = 1L;

	public Usuario(String mail,String DNI,String Contrasenia,String Nombre,String apellido1,String apellido2,Date fecha_nacimiento) 
	{
		this.mail=mail;
		this.DNI=DNI;
		this.Contrasenia=Contrasenia;
		this.Nombre=Nombre;
		this.Apellido1=apellido1;
		this.Apellido2=apellido2;
		this.Fechanacimiento=fecha_nacimiento;
		this.tipouser="1";
	}

	public Usuario(String mail,String DNI,String Contrasenia,String Nombre,String apellido1,String apellido2,Date fecha_nacimiento,String tipo) {
		this.mail=mail;
		this.DNI=DNI;
		this.Contrasenia=Contrasenia;
		this.Nombre=Nombre;
		this.Apellido1=apellido1;
		this.Apellido2=apellido2;
		this.Fechanacimiento=fecha_nacimiento;
		this.tipouser=tipo;
	}
	
	public Usuario(String mail,String DNI,String Contrasenia,String Nombre,String tipo) {
		this.mail=mail;
		this.DNI=DNI;
		this.Contrasenia=Contrasenia;
		this.Nombre=Nombre;
		this.tipouser=tipo;
	}

	public String getTipouser() {
		return tipouser;
	}

	public void setTipouser(String tipouser) {
		this.tipouser = tipouser;
	}

	public String getTipouseraux() {
		return tipouseraux;
	}

	public void setTipouseraux(String tipouseraux) {
		this.tipouseraux = tipouseraux;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMailaux() {
		return mailaux;
	}

	public void setMailaux(String mailaux) {
		this.mailaux = mailaux;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getDNIaux() {
		return DNIaux;
	}

	public void setDNIaux(String dNIaux) {
		DNIaux = dNIaux;
	}

	public String getContrasenia() {
		return Contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		Contrasenia = contrasenia;
	}

	public String getContraseniaaux() {
		return Contraseniaaux;
	}

	public void setContraseniaaux(String contraseniaaux) {
		Contraseniaaux = contraseniaaux;
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

	public String getApellido1() {
		return Apellido1;
	}

	public void setApellido1(String apellido1) {
		Apellido1 = apellido1;
	}

	public String getApellido1aux() {
		return Apellido1aux;
	}

	public void setApellido1aux(String apellido1aux) {
		Apellido1aux = apellido1aux;
	}

	public String getApellido2() {
		return Apellido2;
	}

	public void setApellido2(String apellido2) {
		Apellido2 = apellido2;
	}

	public String getApellido2aux() {
		return Apellido2aux;
	}

	public void setApellido2aux(String apellido2aux) {
		Apellido2aux = apellido2aux;
	}


	public Date getFechanacimiento() {
		return Fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		Fechanacimiento = fechanacimiento;
	}

	public Date getFechanacimientoaux() {
		return Fechanacimientoaux;
	}

	public void setFechanacimientoaux(Date fechanacimientoaux) {
		Fechanacimientoaux = fechanacimientoaux;
	}

	public List<Servicio> getParticipa_en() {
		return participa_en;
	}

	public void setParticipa_en(List<Servicio> participa_en) {
		this.participa_en = participa_en;
	}

	public List<Actividad> getAct() {
		return act;
	}

	public void setAct(List<Actividad> act) {
		this.act = act;
	}

	public Administrador getAdmin() {
		return admin;
	}

	public void setAdmin(Administrador admin) {
		this.admin = admin;
	}
	
}
