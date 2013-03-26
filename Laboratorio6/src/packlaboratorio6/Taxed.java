package packlaboratorio6;

public class Taxed extends Concepto {
	
	//Variables
	private int retencion = 5;
	
	//Constructor
	public Taxed(double pImporte) {
		super(pImporte);
	}
	
	//Getters & Setters

	public int getRetencion() {
		return retencion;
	}

	public void setRetencion(int retencion) {
		this.retencion = retencion;
	}
}
