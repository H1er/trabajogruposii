package Entidades;

public class ServicioVoluntariado  extends Servicio{
	
	private ValoracionVoluntariado val;
	private Informe inf;
	
	public ServicioVoluntariado(Integer codigo,String pais,String ciudad,Integer horas,Integer numParticipantes,String descripcion, Actividad act) {
		super(codigo,pais,ciudad,horas,numParticipantes,descripcion, act);
		this.val = new ValoracionVoluntariado();
		this.inf = new Informe();
	}

	public ValoracionVoluntariado getVal() {
		return val;
	}

	public void setVal(ValoracionVoluntariado val) {
		this.val = val;
	}

	public Informe getInf() {
		return inf;
	}

	public void setInf(Informe inf) {
		this.inf = inf;
	}
}
