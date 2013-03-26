package packlaboratorio6;

public class Antiguedad extends Complemento {
	
	//Variables
	private int impuesto = 10;
	private int anyos;
	
	//Constructor
	public Antiguedad(double pImporte, int pAnyos) {
		super(pImporte);
		this.anyos = pAnyos;
	}
	
	//Getters & Setters
	public int getImpuesto() {
		return this.impuesto;
	}
	
	public int getAnyos() {
		return this.anyos;
	}
	
	//Methods
	public double calcularNeto() {
		double result = this.calcular();
		result = result - this.getImpuesto();
		result = result * this.getAnyos() / 10;
		return result;
	}

}
