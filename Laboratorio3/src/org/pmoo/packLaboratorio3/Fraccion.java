//Author Mulero Martínez, Rubén
//Author Esteban García, Asier

package org.pmoo.packLaboratorio3;
import org.pmoo.packInterfacesLaboratorio3.IFraccion;

public class Fraccion implements IFraccion {

	//Atributos
	private int numerador;
	private int denominador;
	
	//Constructora
	public Fraccion(int pNumerador, int pDenominador) {
		this.numerador = pNumerador;
		if(pDenominador != 0) {
			this.denominador = pDenominador;
		}else {
			System.out.println("No puedes introducir un denominador con valor igual a 0");
		}
	}
	
	//Métodos
	public int getNumerador() {
		return this.numerador;
	}

	public void setNumerador(int pNumerador) {
		this.numerador = pNumerador;
	}

	public int getDenominador() {
		return this.denominador;
	}

	public void setDenominador(int pDenominador) {
		if(pDenominador != 0) {
			this.denominador = pDenominador;
		}else {
			System.out.println("No puedes introducir un denominador con valor igual a 0");
		}
	}

	public void simplificar() {
		
		
	}

	public Fraccion sumar(Fraccion pFraccion) {
		//Recuerda que luego hay que ejecutar simplificar para devolver el resultado simplificado
		pFraccion.setNumerador(this.getNumerador() + pFraccion.getNumerador());
		pFraccion.setDenominador(this.getDenominador() + pFraccion.getDenominador());
		return pFraccion;
	}

	public Fraccion restar(Fraccion pFraccion) {
		//Recuerda que luego hay que ejecutar simplificar para devolver el resultado simplificado
		pFraccion.setNumerador(this.getNumerador() - pFraccion.getNumerador());
		pFraccion.setDenominador(this.getDenominador() - pFraccion.getDenominador());
		return pFraccion;
	}

	public Fraccion multiplicar(Fraccion pFraccion) {
		//Recuerda que luego hay que ejecutar simplificar para devolver el resultado simplificado
		pFraccion.setNumerador(this.getNumerador() * pFraccion.getNumerador());
		pFraccion.setDenominador(this.getDenominador() * pFraccion.getDenominador());
		return pFraccion;
	}
	
	public Fraccion dividir(Fraccion pFraccion) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean esIgualQue(Fraccion pFraccion) {
		if((this.getNumerador() / this.getDenominador()) == (pFraccion.getNumerador() / pFraccion.getDenominador())) {
			return true;
		}else {
			return false;
		}
	}

	public boolean esMayorQue(Fraccion pFraccion) {
		if((this.getNumerador() / this.getDenominador()) > (pFraccion.getNumerador() / pFraccion.getDenominador())) {
			return true;
		}else {
			return false;
		}
	}

	public boolean esMenorQue(Fraccion pFraccion) {
		if((this.getNumerador() / this.getDenominador()) < (pFraccion.getNumerador() / pFraccion.getDenominador())) {
			return true;
		}else {
			return false;
		}
	}

	public boolean esMayorOIgualQue(Fraccion pFraccion) {
		if((this.getNumerador() / this.getDenominador()) >= (pFraccion.getNumerador() / pFraccion.getDenominador())) {
			return true;
		}else {
			return false;
		}
	}

	public boolean esMenorOIgualQue(Fraccion pFraccion) {
		if((this.getNumerador() / this.getDenominador()) <= (pFraccion.getNumerador() / pFraccion.getDenominador())) {
			return true;
		}else {
			return false;
		}
	}
	
}

