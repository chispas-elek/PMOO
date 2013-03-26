//Author -> Mulero Martínez, Rubén
//Author -> Esteban García, Asier

package packlaboratorio6;

public class Concepto {
	
	//Variables
	private double importe;
	
	//Constructor
	public Concepto(double pImporte) {
		this.importe = pImporte;
	}
	
	public Concepto() {
		
	}
	
	//Getters & Setters
	public double getImporte() {
		return this.importe;
	}
	
	public void setImporte(double pImporte) {
		this.importe = pImporte;
	}	
	public double calcularNeto() {
		return this.getImporte();
	}
}
