package packlaboratorio6;

public class TaxFree extends Concepto {
	
	//Variables
	private String descripcion;
	private int horas;
	
	//Constructor
	public TaxFree(String pDescripcion, int pHoras, double pImporte) {
		super(pImporte);
		this.descripcion = pDescripcion;
		this.horas = pHoras;
	}
	
	//Getters & Setters
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public void setDescripcion(String pDescripcion) {
		this.descripcion = pDescripcion;
	}
	
	public int getHoras() {
		return this.horas;
	}
	
	public void setHoras(int pHoras) {
		this.horas = pHoras;
	}
	
	public double calcularImporte() {
		return (this.horas * this.getImporte());
	}

}
