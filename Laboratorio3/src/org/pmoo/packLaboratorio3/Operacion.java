//Author Mulero Martínez, Rubén
//Author Esteban García, Asier

package org.pmoo.packLaboratorio3;

public class Operacion {

	public enum Operador
	{ 
	  SUMA, RESTA, PRODUCTO, COCIENTE, RESTO
	};
	
	// atributos
	
	private int operando1;
	private int operando2;
	private Operador operador;
	// constructora
	
	public Operacion(int pOperando1, int pOperando2, Operador pOperador)
	{
	     this.operando1 = pOperando1;
	     this.operando2 = pOperando2;
	     this.operador = pOperador;
 	}

	public int getOperando1()
	{
		return this.operando1;
	}


	public void setOperando1(int pOperando1)
	{
		this.operando1 = pOperando1;
	}


	public int getOperando2()
	{
		return this.operando2;
	}


	public void setOperando2(int pOperando2)
	{
		this.operando2 = pOperando2;
	}


	public Operador getOperador()
	{
		return this.operador;
	}


	public void setOperador(Operador pOperador)
	{
		this.operador = pOperador;
	}

	public int obtenerResultado()
	{
		int resultado;
		switch(this.getOperador()) {
		case SUMA:
			resultado = this.getOperando1() + this.getOperando2();
			break;
		case RESTA:
			resultado = this.getOperando1() - this.getOperando2();
			break;
		case PRODUCTO:
			resultado = this.getOperando1() * this.getOperando2();
			break;
		case COCIENTE:
			resultado = this.getOperando1() / this.getOperando2();
			//ATENCIÓN SE DEBE CONTROLAR LAS DIVISIONES ENTRE 0
			break;
		case RESTO:
			resultado = this.getOperando1() % this.getOperando2();
			break;
		default:
			System.out.println("Has especificado una operación inválida");
			resultado = -1;
			break;
		}
		return resultado;
		
	}
	
}
