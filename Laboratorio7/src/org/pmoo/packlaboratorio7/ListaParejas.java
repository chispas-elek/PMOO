//Author -> Mulero Martínez, Rubén
//Author -> Esteban García, Asier

package org.pmoo.packlaboratorio7;

import java.util.*;

public class ListaParejas
{
	// atributos

	// constructora
	private ListaParejas()
	{
		// TODO completar
	}

	// getters y setters

	/**
	 * @return la única instancia de ListaParejas
	 */
	public static ListaParejas getListaParejas()
	{
		// TODO completar
		return null;
	}

	// otros métodos
	
	/**
	 * 
	 * @return el iterador de la lista de parejas
	 */
	private Iterator<Pareja> getIterador()
	{
		// TODO completar
		return null;
	}
	
	/**
	 * pre: la lista de parejas está ordenada por edad de ella, de mayor a menor
	 * post: se añade la pareja pPareja manteniendo el orden PISTA: primero
	 * habrá que usar un iterador para buscar en qué posición debe ir la pareja
	 * a añadir (recuérdese que la primera posición es la 0) y después añadirla
	 * usando el método add(index, element).
	 */
	public void anadirOrdenadoPareja(Pareja pPareja)
	{
		// TODO completar
	}

	/**
	 * 
	 * @param pAlumno
	 * @return la pareja del alumno pAlumno. Si no existe tal pareja se devuelve
	 *         el valor null.
	 */
	public Alumno obtenerParejaDe(Alumno pAlumno)
	{
		// TODO completar
		return null;
	}

	/**
	 * post: si ha sido posible, se han reajustado las parejas. Si no ha sido posible,
	 *       la lista de parejas se ha dejado como al principio.
	 *       Se utiliza una lista auxiliar para ir recolocando las parejas en orden descendente de
	 *       edad de la mujer, y una lista con todos los hombres disponibles.
	 *       Para cada mujer, se busca entre la lista de hombres disponibles uno con el que poder emparejarla
	 *       hasta llegar al final de la lista (en cuyo caso se modifica la lista de parejas dejando en su
	 *       lugar la lista de parejas auxiliar) o hasta encontrar una mujer que no se pueda emparejar (en 
	 *       cuyo caso el proceso termina, se muestra un aviso por pantalla y se deja la lista de parejas
	 *       como estaba).
	 * 
	 *       (Ver el enunciado del ejercicio para más detalles sobre el algoritmo de reajuste de
	 *       las parejas.)
	 */
	public void reajustarParejas()
	{
		
		// TODO completar
	}

	/**
	 * vacía la lista de parejas del curso
	 */
	public void resetear()
	{
		//TODO completar
	}
}
