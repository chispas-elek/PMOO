//Author -> Mulero Martínez, Rubén
//Auhtor -> Esteban García, Asier

package org.pmoo.packLaboratorio3;

public class Operando {

	//Variables
	private int valor;

	
	//Methods
	public Operando(int pValor) {
		this.valor = pValor;
	}


	public int getValor() {
		return valor;
	}


	public void setValor(int pValor) {
		this.valor = pValor;
	}
	
	public Operando sumar(Operando pOperando) {
		int result = this.getValor() + pOperando.getValor();
		Operando value = new Operando(result);
		return value;
	}
	
	public Operando restar(Operando pOperando) {
		Operando value = new Operando(this.getValor() - pOperando.getValor());
		return value;
	}
	
	public Operando multiplicar(Operando pOperando) {
		Operando value = new Operando(this.getValor() * pOperando.getValor());
		return value;
	}
	
	public Operando dividir(Operando pOperando) {
		Operando value = new Operando(this.getValor() / pOperando.getValor());
		return value; 
	}
	
	public Operando getResto(Operando pOperando) {
		Operando value = new Operando(this.getValor() % pOperando.getValor());
		return value;
	}
	
}
