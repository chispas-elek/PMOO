//Author -> Mulero Martínez, Rubén
//Author -> Esteban García, Asier

package packlaboratorio6;

import java.util.ArrayList;

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
	
	
	
	
	

}
