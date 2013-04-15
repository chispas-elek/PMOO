//Author -> Mulero Martínez, Rubén
//Author -> Esteban García, Asier

package org.pmoo.packlaboratorio7;

import java.util.*;

public class ListaAlumnosCurso
{
	// atributos

	// constructora
	private ListaAlumnosCurso()
	{
		// TODO completar
	}

	// getters y setters

	/**
	 * @return la única instancia de ListaAlumnosCurso
	 */
	public static ListaAlumnosCurso getListaAlumnosCurso()
	{
		// TODO completar
		return null;
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
	}

	/**
	 * 
	 * @return el iterador de la lista de alumnos del curso
	 */
	private Iterator<Alumno> getIterador()
	{
		// TODO completar
		return null;
	}

	/**
	 * vacía la lista de alumnos del curso
	 */
	public void resetear()
	{
		// TODO completar
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
		return null;
	}

	/**
	 * 
	 * @return un booleano que indica si hay algún alumno del curso que no tenga
	 *         pareja en la lista de parejas
	 */
	public boolean hayAlumnosSinPareja()
	{
		// TODO completar
		return true;
	}
}