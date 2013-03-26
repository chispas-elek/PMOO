package packlaboratorio6;

public class Cargo extends Complemento {

	//Variables
	private String descrip;
	private int impuesto = 20;
	
	//Constructor
	public Cargo(double pImporte, String pDescrip) {
		super(pImporte);
		this.descrip = pDescrip;
	}
	
	//Getters & Setters

	public String getDescrip() {
		return descrip;
	}

	public void setDescrip(String pDescrip) {
		this.descrip = pDescrip;
	}

	public int getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(int pImpuesto) {
		this.impuesto = pImpuesto;
	}
	
	public double calcularNeto() {
		double result = this.calcular();
		result = result - this.getImpuesto();
		return result;
	}
	
}
