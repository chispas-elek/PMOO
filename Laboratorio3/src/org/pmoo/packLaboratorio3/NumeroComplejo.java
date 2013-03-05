//Author -> Mulero Martínez, Rubén
//Auhtor -> Esteban García, Asier

package org.pmoo.packlaboratorio3;

import org.pmoo.packInterfacesLaboratorio3.IComplejo;
import java.lang.Math;

public class NumeroComplejo implements IComplejo {

	//Atributos
	private double real;
	private double imaginaria; 
	
	//Contructora
	public NumeroComplejo (double pReal, double pImaginaria) {
		this.real = pReal;
		this.imaginaria = pImaginaria;
	}
	
	//Métodos
	public double getParteImaginaria() {
		return this.imaginaria;
	}

	public double getParteReal() {
		return this.real;
	}

	public double getAngulo() {
		return Math.atan2(this.getParteImaginaria(),this.getParteReal());
	}

	public double getModulo() {
		return Math.sqrt((Math.pow(this.getParteReal(), 2) + Math.pow(this.getParteImaginaria(), 2)));
	}

	public IComplejo sumar(IComplejo pNumComp) {
		NumeroComplejo resultado = new NumeroComplejo(this.getParteReal() + pNumComp.getParteReal(), this.getParteImaginaria() + pNumComp.getParteImaginaria());
		return resultado;
		
	}

	public IComplejo multiplicar(IComplejo pNumComp) {
		NumeroComplejo resultado = new NumeroComplejo((this.getParteReal() * pNumComp.getParteReal()) - (this.getParteImaginaria() * pNumComp.getParteImaginaria()), (this.getParteReal() * pNumComp.getParteImaginaria()) + (pNumComp.getParteReal() * this.getParteImaginaria()));
		return resultado;
	}

	public boolean esIgual(IComplejo pNumComp) {
		boolean devolver = false;
		if(this.getParteReal() == pNumComp.getParteReal() && this.getParteImaginaria() == pNumComp.getParteImaginaria()) {
			devolver = true;
		}
		return devolver;
	}

}
