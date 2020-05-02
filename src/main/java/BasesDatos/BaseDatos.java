package BasesDatos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import Entidades.Actividad;
import Entidades.Administrador;
import Entidades.Docente;
import Entidades.Entidad;
import Entidades.Estudiante;
import Entidades.Personal_Administracion;
import Entidades.Servicio;
import Entidades.ServicioFormacion;
import Entidades.ServicioInvestigacion;
import Entidades.ServicioVoluntariado;
import Entidades.Usuario;


@Named(value="datosact")
@SessionScoped
public class BaseDatos implements Serializable{

	
 public void setActividades(ArrayList<Actividad> actividades) {
		this.actividades = actividades;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

private ArrayList <Actividad> actividades = new ArrayList<>();
 private ArrayList <Servicio> servicios = new ArrayList<>();
	 
 
 public ArrayList<Servicio> getServicios() {
	return servicios;
}

public void setServicios(ArrayList<Servicio> servicios) {
	this.servicios = servicios;
}

private static final long serialVersionUID = 1L;
Usuario user1 = new Usuario("lopezcarlos@correo.com", "45681267P" , "lopez1234" , "Carlos" , "Lopez" , "Jimenez", new Date (85,04,6));
Usuario user2 = new Usuario("josefahg@correo.com", "48957123J" , "jhgcnt1" , "Josefa" , "Diaz" , "Rosado" ,new Date (100,8,4));
Usuario user3 = new Usuario("renato_TG@correo.com", "16452378S", "guacamayo23", "Renato" , "Toledo" , "Giraldo" , new Date (87,9,5));;
Usuario user4 = new Usuario("perezpp@correo.com", "78921640Q", "ppperez09", "Pepe", "Pérez" , "Fernández",new Date (94,3,9));

Administrador admin1 = new Administrador("C.jesa@correo.com", "61274395H" , "cloniSh", "Carolina" , "Solano" , "Hernández", new Date (80,01,07), "ADMINISTRADOR");
Administrador admin2 = new Administrador("Nuria.Pol45@correo.com", "19735151B" , "nurpassw1", "Nuria" , "Guerrero", "Cabeza", new Date (83,06,18), "ADMINISTRADOR");
Administrador admin3 = new Administrador("Gnzx19kl@correo.com" , "58973765L", "jolg456q" , "Gozalo" , "Huffman", "Sánchez", new Date(91,07,25), "ADMINISTRADOR");


Docente docent1 = new Docente("Antonio.LNG@correo.com" , "174893524C" , "Lngre6" , "Antonio" , "Merino", "Casado" , new Date (75,11,17), "LENGUA");
Docente docent2 = new Docente("Jb64mat@correo.com", "58941743I", "ghju789" , "Javier", "Barrios" , "Miranda", new Date (79,03,12), "MATEMATICAS");
Docente docent3 = new Docente("PinArtLuis@correo.com" , "62481577D", "LuisArte09", "Luis" , "Pinachho", "Rodriguez" , new Date(81,03,01), "ARTE");


Entidad enti1 = new Entidad("AyudaSinFronteras@correo.com", "K12345517P" , "helpu45" , "Ayuda Sin Fronteras", "Polígono Industrial el Viso" , "723489148" , "España" , "Málaga" , "Sin ánimo de lucro" ,"www.AyudaSinFronteras.com");
Entidad enti2 = new Entidad ("Alteza.alim@correo.com", "K4478937L", "Kontra57" , "Alteza alimentación" , "Polígono Industrial Moltaria" , "647892217", "España" , "Valencia" , "Con ánimo de lucro" , "www.AltezaAlimentacion.com");
Entidad enti3 = new Entidad("SeguresPPM@correo.com", "K7684345S", "jok56tre" , "Segures PPMarseille", "Calle Bon Nature" , "457896111", "Francia" , "Marsella" , "Con ánimo de lucro", "www.SeguresPPMarseille.com");

Estudiante est1 = new Estudiante("sergi_lm@correo.com" , "47895578Q" , "sergi123r" , "Sergio" , "Leandro", "Millán", new Date (109,05,17), "2" , "Ingeniería Informática");
Estudiante est2 = new Estudiante("Antonella.78@correo.com" , "77701487L", "AntxIn" , "Antonella", "Martín", "De los Ríos", new Date (107,06,07),"2", "Historia");
Estudiante est3 = new Estudiante("Litos.23@correo.com", "78621981M" , "12093jhg", "Carlos" , "Rodriguez" , "León", new Date (104,12,12),"2", "Derecho");

Personal_Administracion pa1 = new Personal_Administracion("GeraMon@correo.com", "41789854T", "jrdr.124" , "Gerardo" , "Montes" , "Serrano" , new Date (60,8,17), "JARDINERO");
Personal_Administracion pa2 = new Personal_Administracion("paquita.95@correo.com" , "74413578S" , "211jilq", "Paquita" , "Flores" , "Fernández" , new Date (71,9,04), "LIMPIADORA");
Personal_Administracion pa3 = new Personal_Administracion("Ner3@correo.com", "51463878R" , "FFnerea90" ,"Nerea" , "Gonzalez" , "Marques", new Date (84,9,22), "CONSERJE");

private List<Usuario> usuarios;




public List<Usuario> getUsuarios() {
	return usuarios;
}

 private Actividad actividad1 = new Actividad("Limpieza",new Date(120,6,9), "Málaga, España", "Limpiar escombros de la calle", "3 semanas", "Disponible",16, 284);
 private ServicioVoluntariado serviciovoluntariado1 = new ServicioVoluntariado(2841, "España" , "Málaga" , 2, 4, "Equipo de barrido", actividad1);
 private ServicioVoluntariado serviciovoluntariado2 = new ServicioVoluntariado(2842, "España" , "Málaga" , 6, 8, "Equipo de retirada de material", actividad1);
 private ServicioVoluntariado serviciovoluntariado3 = new ServicioVoluntariado(2843, "España" , "Málaga" , 8, 4, "Equipo de organización", actividad1);
 List<Servicio> lista1 = new ArrayList<>();
 
 
 
 private Actividad actividad2 = new Actividad("Profesor",new Date(121,6,9),"San Juan, Puerto Rico","Profesor auxiliar en una escuela","4 meses","Disponible",6, 143);
 private ServicioFormacion servicioformacion1 = new ServicioFormacion(1431, "Puerto Rico" , "San Juan" , 8, 3, "Profesor auxiliar de matemáticas", actividad2);
 private ServicioFormacion servicioformacion2 = new ServicioFormacion(1432, "Puerto Rico" , "San Juan" , 8, 3, "Profesor auxiliar de Inglés", actividad2);
 List<Servicio> lista2 = new ArrayList<>();
 
 private Actividad actividad3 = new Actividad("Profesor de Idiomas",new Date(121,6,9),"Tijuana, Mexico","Enseñanza de idiomas: Chino y Japones","2 meses","No Disponible",10, 798);
 private ServicioFormacion servicioformacion3 = new ServicioFormacion(7981, "Mexico" , "Tijuana" , 8, 5, "Profesor de japonés", actividad3);
 private ServicioFormacion servicioformacion4 = new ServicioFormacion(7982, "Mexico" , "Tijuana" , 8, 5, "Profesor de chino", actividad3);
 List<Servicio> lista3 = new ArrayList<>();
 
 private Actividad actividad4 = new Actividad("Ayuda Granja",new Date(122,6,9),"Caracas, Venezuela","Ayudar en una granja","2 semanas","Disponible",20, 649);
 private ServicioVoluntariado serviciovoluntariado4 = new ServicioVoluntariado(6492, "Cape Town" , "Sudáfrica" , 6, 7, "Equipo de recogida de legumbres", actividad4);
 private ServicioVoluntariado serviciovoluntariado5 = new ServicioVoluntariado(6493, "Cape Town" , "Sudáfrica" , 6, 6, "Equipo de bricolaje y fontanería", actividad4);
 List<Servicio> lista4 = new ArrayList<>();
 
 private Actividad actividad5 = new Actividad("Ayuda Hospital",new Date(120,6,9),"Cape Town, Sudáfrica","Ayudar en un hospital","4 meses","No Disponible",8, 463);
 private ServicioVoluntariado serviciovoluntariado6 = new ServicioVoluntariado(4631, "Cape Town" , "Sudáfrica" , 4, 6, "Equipo de transporte de material", actividad5);
 private ServicioInvestigacion servicioinvestigacion1 = new ServicioInvestigacion(4632, "Cape Town" , "Sudáfrica" , 8, 2, "Investigación sobre el impacto de la calidad del agua en la esperanza de vida media", actividad5);
 List<Servicio> lista5 = new ArrayList<>();
 


	public BaseDatos() 
	{
		
		usuarios = new ArrayList<>();
		
		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);
		usuarios.add(user4);
		
		usuarios.add(admin1);
		usuarios.add(admin2);
		usuarios.add(admin3);
		
		usuarios.add(docent1);
		usuarios.add(docent2);
		usuarios.add(docent3);
		
		usuarios.add(enti1);
		usuarios.add(enti2);
		usuarios.add(enti3);
		
		usuarios.add(est1);
		usuarios.add(est2);
		usuarios.add(est3);
		
		usuarios.add(pa1);
		usuarios.add(pa2);
		usuarios.add(pa3);
		
		lista1.add(this.serviciovoluntariado1);
		lista1.add(this.serviciovoluntariado2);
		lista1.add(this.serviciovoluntariado3);
		this.actividad1.setLista_servicio(lista1);
		
		lista2.add(this.servicioformacion1);
		lista2.add(this.servicioformacion2);
		this.actividad2.setLista_servicio(lista2);
		
		lista3.add(this.servicioformacion3);
		lista3.add(this.servicioformacion4);
		this.actividad3.setLista_servicio(lista3);
		
		lista4.add(this.serviciovoluntariado4);
		lista4.add(this.serviciovoluntariado5);
		this.actividad4.setLista_servicio(lista4);
		
		lista5.add(this.serviciovoluntariado6);
		lista5.add(this.servicioinvestigacion1);
		this.actividad5.setLista_servicio(lista5);
		
		
		this.actividades.add(actividad1);
		this.actividades.add(actividad2);
		this.actividades.add(actividad3);
		this.actividades.add(actividad4);
		this.actividades.add(actividad5);
		
	
		user1.getParticipa().put(actividad1, serviciovoluntariado1);
		user1.getParticipa().put(actividad2, servicioformacion1);
		
		user2.getParticipa().put(actividad4,serviciovoluntariado5);
		
		user2.getParticipa().put(actividad3,servicioformacion3);
		user3.getParticipa().put(actividad1,serviciovoluntariado3);
		user3.getParticipa().put(actividad5,servicioinvestigacion1);
		user4.getParticipa().put(actividad1,serviciovoluntariado1);
		user4.getParticipa().put(actividad2,servicioformacion1);
		
		
		docent1.getParticipa().put(actividad1,serviciovoluntariado3);
		docent1.getParticipa().put(actividad1,serviciovoluntariado2);	
		docent2.getParticipa().put(actividad4,serviciovoluntariado4);
		docent2.getParticipa().put(actividad3,servicioformacion3);
		docent3.getParticipa().put(actividad4,serviciovoluntariado5);
		docent3.getParticipa().put(actividad3,servicioformacion4);
		
		enti1.getParticipa().put(actividad4,serviciovoluntariado4);
		enti1.getParticipa().put(actividad3,servicioformacion4);
		
		enti2.getParticipa().put(actividad1,serviciovoluntariado2);
		enti2.getParticipa().put(actividad2,servicioformacion2);
		
		enti3.getParticipa().put(actividad1,serviciovoluntariado1);
		enti3.getParticipa().put(actividad5,serviciovoluntariado6);
		
		
		
		
		
		
	}
	
	public ArrayList<Actividad> getActividades() {
		return actividades;
	}
	 
	 public void AnadirActividad (Actividad a) {
		 actividades.add(a);
	 }
	 
	 public void EliminarActividad (Actividad a) {
		 actividades.remove(a);
	 }
	
}