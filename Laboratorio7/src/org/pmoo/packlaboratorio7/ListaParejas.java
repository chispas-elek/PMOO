//Author -> Mulero Martínez, Rubén
//Author -> Esteban García, Asier

package org.pmoo.packlaboratorio7;

import java.util.*;

public class ListaParejas
{
	// atributos
	private static ListaParejas mListaParejas = null;
	private ArrayList<Pareja> lista;

	// constructora
	private ListaParejas()
	{
		// TODO completar
		this.lista = new ArrayList<Pareja>();
	}

	// getters y setters

	/**
	 * @return la única instancia de ListaParejas
	 */
	public static ListaParejas getListaParejas()
	{
		// TODO completar
		if(mListaParejas == null) {
			mListaParejas = new ListaParejas();
		}
		return mListaParejas;
	}

	// otros métodos
	
	/**
	 * 
	 * @return el iterador de la lista de parejas
	 */
	private Iterator<Pareja> getIterador()
	{
		// TODO completar
		return this.lista.iterator();
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
		Iterator<Pareja> it = this.getIterador();
		int i = 0;
		Pareja lPareja = null;
		ListaParejas listaP = ListaParejas.getListaParejas();
		boolean flag = false;
		while(it.hasNext() && !flag) {
			lPareja = it.next();
			if(lPareja.getElla().getEdad() < pPareja.getElla().getEdad()) {
				listaP.lista.add(i, pPareja);
				flag = true;
			}
			i++;
		}
		if(!flag) {
			listaP.lista.add(pPareja);
		}
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
		Alumno result = null;
		Pareja lPareja = null;
		Iterator<Pareja> it = this.getIterador();
		boolean flag = false;
		while(it.hasNext() && !flag) {
			lPareja = it.next();
			if(lPareja.esta(pAlumno) && pAlumno instanceof Hombre) {
					result = lPareja.getElla();
			}
			else {
				result = lPareja.getEl();
			}
		}
		return result;
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
		ArrayList<Pareja> parejas = new ArrayList<Pareja>();
		Pareja lPareja = null;
		Pareja pAux;
		ListaAlumnos lHombres = new ListaAlumnos();
		ListaAlumnosCurso lLista = ListaAlumnosCurso.getListaAlumnosCurso();
		Iterator<Pareja> itP = this.lista.iterator();
		Hombre hom = null;
		boolean flag = true;
		//==============================================
		while(itP.hasNext()) {
			lPareja = itP.next();
			lHombres.anadirAlumno(lPareja.getEl());
		}//Hombres cargados
		//==============================================
		itP = this.lista.iterator(); //Recargo iterador
		//==============================================
		if(!lLista.hayAlumnosSinPareja()) {
			while(itP.hasNext() && flag) {
				lPareja = itP.next();
				hom = lPareja.getElla().emparejar(lHombres);
				if(hom != null) {
					pAux = new Pareja(hom, lPareja.getElla());
					parejas.add(pAux);
				}
				else {
					flag = false;
				}
			}
			if(flag) {
				this.lista = parejas;
			}
		}
		
	}

	/**
	 * vacía la lista de parejas del curso
	 */
	public void resetear()
	{
		//TODO completar
		this.lista = new ArrayList<Pareja>();
	}
}
