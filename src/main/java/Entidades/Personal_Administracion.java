package Entidades;
import java.io.Serializable;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

@Entity

public class Personal_Administracion extends Usuario implements Serializable {

	private String Tipoo;
	private String Tipooaux;

	public Personal_Administracion(String mail,String DNI,String Contrasenia,String Nombre,String apellido1,String apellido2,Date fecha_nacimiento,String tipo) {
		super(mail,DNI,Contrasenia,Nombre,apellido1,apellido2,fecha_nacimiento,"4");
		this.Tipoo=tipo;
	}

	public String getTipoo() {
		return Tipoo;
	}

	public void setTipoo(String tipoo) {
		Tipoo = tipoo;
	}

	public String getTipooaux() {
		return Tipooaux;
	}

	public void setTipooaux(String tipooaux) {
		Tipooaux = tipooaux;
	}
   
}
