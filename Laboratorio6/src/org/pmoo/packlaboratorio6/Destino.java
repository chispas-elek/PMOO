//Author -> Mulero Martínez, Rubén
//Author -> Esteban García, Asier

package org.pmoo.packlaboratorio6;

public class Destino extends Complemento {
	
	//Variables
	private String detino;
	private int impuesto = 50;
	
	//Constructor
	public Destino(double pImporte, String pDestino) {
		super(pImporte);
		this.detino = pDestino;
	}

	//Getters & Setters
	public String getDetino() {
		return detino;
	}

	public void setDetino(String pDetino) {
		this.detino = pDetino;
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
