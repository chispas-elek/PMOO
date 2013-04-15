package org.pmoo.packlaboratorio7;

public class Pareja
{
	// atributos
	private Hombre el;
	private Mujer ella;
	
	// constructora
	/**
	 * 
	 * @param pAlumno1
	 * @param pAlumno2
	 * post: si los alumnos pAlumno1 y pAlumno2 son instancias de un Hombre y de una Mujer (sin importar cuál
	 *       de ellos es el hombre cuál es la mujer - ESTO ES, el orden en el que vengan no importa mientras
	 *       sean uno de cada sexo), se crea una nueva pareja. 
	 *       Si los dos alumnos son del mismo sexo, se muestra un mensaje indicando que no se ha podido crear
	 *       la pareja y se dejan los atributos correspondientes con el valor null.
	 */
	public Pareja(Alumno pAlumno1, Alumno pAlumno2)
	{
		//TODO completar
		if( (pAlumno1 instanceof Hombre && pAlumno2 instanceof Hombre) || (pAlumno1 instanceof Mujer && pAlumno2 instanceof Mujer)) {
			System.out.println("Ambos son del mismo sexo");
		}
		else {
			if(pAlumno1 instanceof Hombre) {
				el = (Hombre)pAlumno1;
				ella = (Mujer)pAlumno2;
			}
			else {
				el = (Hombre)pAlumno2;
				ella = (Mujer)pAlumno1;
			}
		}
	}
	
	// getters y setters
	
	/**
	 * 
	 * @return el atributo de tipo Hombre de la pareja
	 */
	public Hombre getEl()
	{
		//TODO completar
		return this.el;
	}
		
	/**
	 * 
	 * @return el atributo de tipo Mujer de la pareja
	 */
	public Mujer getElla()
	{
		//TODO completar
		return this.ella;
	}
	
	/**
	 * 
	 * @param pAlumno
	 * @return un booleano que indica si el alumno pAlumno es alguno de los miembros de la pareja
	 */
	public boolean esta(Alumno pAlumno)
	{
		//TODO completar
		boolean flag = false;
		if(this.el == pAlumno || this.ella == pAlumno) {
			flag = true;
		}
		return flag;
	}
}
