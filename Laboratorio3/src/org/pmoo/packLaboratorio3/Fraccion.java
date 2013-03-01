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
		int i = 2;
		if(this.getDenominador() < 0) {
			this.setNumerador(this.getNumerador() * -1);
			this.setDenominador(this.getDenominador() * -1);
		}
		while(i<= this.getDenominador() && this.getDenominador() > 1 && this.getNumerador() > 1) {
			if(this.getNumerador() % this.getDenominador() == 0) {
				//La fracción es divisible entre si misma
				this.setNumerador(this.getNumerador() / this.getDenominador());
				this.setDenominador(1);
			}
			if(this.getNumerador() % i == 0 && this.getDenominador() % i == 0) {
				this.setNumerador(this.getNumerador() / i);
				this.setDenominador(this.getDenominador() / i);
			}
			if(this.getNumerador() % i !=0 || this.getDenominador() % i !=0) {
				i++;
			}
			
		}
		
	}

	public Fraccion sumar(Fraccion pFraccion) {
		Fraccion resultado = pFraccion;
		resultado.setNumerador(this.getNumerador() + pFraccion.getNumerador());
		resultado.setDenominador(this.getDenominador() + pFraccion.getDenominador());
		resultado.simplificar();
		return resultado;
	}

	public Fraccion restar(Fraccion pFraccion) {
		Fraccion resultado = pFraccion;
		resultado.setNumerador(this.getNumerador() - pFraccion.getNumerador());
		resultado.setDenominador(this.getDenominador() - pFraccion.getDenominador());
		resultado.simplificar();
		return resultado;
	}

	public Fraccion multiplicar(Fraccion pFraccion) {
		Fraccion resultado = pFraccion;
		resultado.setNumerador(this.getNumerador() * pFraccion.getNumerador());
		resultado.setDenominador(this.getDenominador() * pFraccion.getDenominador());
		resultado.simplificar();
		return pFraccion;
	}
	
	public Fraccion dividir(Fraccion pFraccion) {
		Fraccion resultado = pFraccion;
		resultado.setNumerador(this.getNumerador() * pFraccion.getDenominador());
		resultado.setDenominador(this.getDenominador() * pFraccion.getNumerador());
		resultado.simplificar();
		return resultado;
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

