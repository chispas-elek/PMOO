//Author -> Mulero Martínez, Rubén
//Author -> Esteban García, Asier

package org.pmoo.packlaboratorio7;

import java.util.*;

public class ListaAlumnosCurso
{
	// atributos
	private static ListaAlumnosCurso mListaAlumnosCurso = null;
	private ArrayList<Alumno> lista;

	// constructora
	private ListaAlumnosCurso()
	{
		// TODO completar
		lista = new ArrayList<Alumno>();
	}

	// getters y setters

	/**
	 * @return la única instancia de ListaAlumnosCurso
	 */
	public static ListaAlumnosCurso getListaAlumnosCurso()
	{
		// TODO completar
		if(mListaAlumnosCurso == null) {
			mListaAlumnosCurso = new ListaAlumnosCurso();
		}
		return mListaAlumnosCurso;
	}

	// otros métodos
	
	/**
	 * 
	 * @param pAlumno
	 *            post: si el alumno no está dado de alta en el curso, lo añade.
	 *            Si no, escribe un mensaje y no hace nada más
	 */
	public void anadirAlumnoCurso(Alumno pAlumno)
	{
		// TODO completar
		if(!this.lista.contains(pAlumno)) {
			this.lista.add(pAlumno);
		}
		else {
			System.out.println("Alumno ya existente");
		}
		
	}

	/**
	 * 
	 * @return el iterador de la lista de alumnos del curso
	 */
	private Iterator<Alumno> getIterador()
	{
		// TODO completar
		return this.lista.iterator();
	}

	/**
	 * vacía la lista de alumnos del curso
	 */
	public void resetear()
	{
		// TODO completar
		this.lista = new ArrayList<Alumno>();
	}

	/**
	 * 
	 * @param pDNI
	 * @return el alumno del curso cuyo DNI es pDNI. Si no existe tal alumno,
	 *         devuelve el objeto null.
	 */
	public Alumno buscarAlumnoPorDNI(String pDNI)
	{
		// TODO completar
		Alumno lAl = null;
		Iterator<Alumno> it = this.getIterador();
		boolean flag = false;
		while(it.hasNext() && !flag) {
			lAl =it.next();
			if(lAl.getDNI() == pDNI) {
				flag = true;
			}
		}
		return lAl;
	}

	/**
	 * 
	 * @return un booleano que indica si hay algún alumno del curso que no tenga
	 *         pareja en la lista de parejas
	 */
	public boolean hayAlumnosSinPareja()
	{
		// TODO completar
		ListaParejas listaP = ListaParejas.getListaParejas();
		Iterator<Alumno> it = this.getIterador();
		Alumno al = null;
		boolean flag = false;
		
		while(it.hasNext() && !flag) {
			al = it.next();
			if(listaP.obtenerParejaDe(al) == null) {
				flag = true;
			}
		}
		return flag;
	}
}