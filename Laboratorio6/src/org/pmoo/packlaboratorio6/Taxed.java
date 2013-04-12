//Author -> Mulero Martínez, Rubén
//Author -> Esteban García, Asier

package org.pmoo.packlaboratorio6;

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
	
	public double calcular() {
		return (this.getImporte() - (this.getImporte() * this.getRetencion()/100));
	}
}
