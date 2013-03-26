//Author -> Mulero Martínez, Rubén
//Author -> Esteban García, Asier

package packlaboratorio6;

import java.util.ArrayList;
import java.util.Iterator;

public class Empleado {
	
	//Variables
	private int id;
	private String nombre,apellido;
	private ArrayList<Concepto> lista;
	
	//Constructor
	public Empleado(int pId, String pNombre, String pApellido, ArrayList<Concepto> pLista) {
		this.id = pId;
		this.nombre = pNombre;
		this.apellido = pApellido;
		this.lista = pLista;
	}
	
	//Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int pId) {
		this.id = pId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String pNombre) {
		this.nombre = pNombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String pApellido) {
		this.apellido = pApellido;
	}

	public ArrayList<Concepto> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Concepto> pLista) {
		this.lista = pLista;
	}
	
	//Methods
	
	public Iterator<Concepto> obtIterator() {
		return this.lista.iterator();
	}
	
	public double calcularNeto() {
		double result = 0;
		Iterator<Concepto> it = this.obtIterator();
		Concepto pCon;
		TaxFree pTF;
		Complemento pCM;
		Extra pEX;
		Base pBS;
		while(it.hasNext()) {
			pCon = (Concepto)it.next();
			if(pCon instanceof TaxFree) {
				pTF = (TaxFree)pCon;
				result = result + pTF.calcularImporte();
			}
			else if(pCon instanceof Taxed) {
				if(pCon instanceof Base) {
					pBS = (Base)pCon;
					result = result + pBS.calcularNeto();
				}
				else if(pCon instanceof Extra) {
					pEX = (Extra)pCon;
					result = result + pEX.calcularNeto();
				}
				else if(pCon instanceof Complemento) {
					pCM = (Complemento)pCon;
					result = result + pCM
				}
			}
		}
		return result;
	}
	
	
	

}
