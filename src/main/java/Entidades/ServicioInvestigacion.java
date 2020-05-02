package Entidades;

public class ServicioInvestigacion extends Servicio{
	
	private ValoracionFormacionInvestigacion val;
	private Informe inf;
	
	public ServicioInvestigacion(Integer codigo,String pais,String ciudad,Integer horas,Integer numParticipantes,String descripcion, Actividad act ) {
		super(codigo,pais,ciudad,horas,numParticipantes,descripcion, act);
		this.val = new ValoracionFormacionInvestigacion();
		this.inf = new Informe();
	}
	
	public ValoracionFormacionInvestigacion getVal() {
		return val;
	}

	public void setVal(ValoracionFormacionInvestigacion val) {
		this.val = val;
	}

	public Informe getInf() {
		return inf;
	}

	public void setInf(Informe inf) {
		this.inf = inf;
	}
}
