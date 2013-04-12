package org.pmoo.packlaboratorio7;

import java.util.*;

public class ListaAlumnos
{
	// atributos
	private ArrayList<Alumno> lista;
	/**
	 * post: inicializa la lista de alumnos a una lista vacía
	 */
	public ListaAlumnos()
	{
		// TODO completar
		lista = null;
	}

			
	// otros métodos

	/**
	 * @param pAlumno
	 *            post: añade el alumno pAlumno a la lista de alumnos
	 */
	public void anadirAlumno(Alumno pAlumno)
	{
		// TODO completar
		if(this.esta(pAlumno)) {
			System.out.println("Alumno ya existente");
		}
		else {
			this.lista.add(pAlumno);
		}
	}

	/**
	 * @param pAlumno
	 *            post: retira el alumno pAlumno de la lista de alumnos
	 */
	public void retirarAlumno(Alumno pAlumno)
	{
		// TODO completar
		if(!this.esta(pAlumno)) {
			System.out.println("Alumno no existente");
		}
		else {
			this.lista.remove(pAlumno);
		}
	}

	/**
	 * @param pAlumno
	 * @return un booleano que indica si el alumno pAlumno está en la lista de
	 *         alumnos
	 */
	public boolean esta(Alumno pAlumno)
	{
		Iterator<Alumno> it = this.lista.iterator();
		Alumno al;
		boolean flag = false;
		while(it.hasNext()) {
			al = it.next();
			if (al == pAlumno) {
				flag = true;
			}
		}
		return flag;
	}
	
	/**
	 * @return el número de elementos de la lista de alumnos
	 */  
	public int getTamano()
	{
		// TODO completar
		return this.lista.size();
	}

	/**
	 * @param pPos
	 * @return el alumno que ocupa la posición pPos de la lista de alumnos
	 *					post: si el parámetro pPos no es válido, se muestra un
	 *						mensaje por pantalla y se devuelve null. Las posiciones
	 *                      de la lista se cuentan empezando en 0 y terminando en
	 *                      n-1, siendo n el número de alumnos que hay en ella.
	 *           
	 */
	 public Alumno getAlumnoEnPos(int pPos)
	 {
			// TODO completar
		 int i = 0;
		 Iterator<Alumno> it = this.lista.iterator();
		 Alumno al = null;
		 while(it.hasNext()){
			while(i <= (pPos -1)) {
				it.next();
			}
			al = it.next();
		 }
		 return al;
	 }	 
}
