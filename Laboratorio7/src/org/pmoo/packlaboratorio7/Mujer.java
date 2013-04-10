package org.pmoo.packlaboratorio7;

public class Mujer extends Alumno
{
	// constructora
	/**
	 * @param pDNI
	 * @param pNombre
	 * @param pApellido
	 * @param pEdad
	 *            post: invoca a la constructora de la superclase para
	 *            instanciar un alumno Mujer
	 */
	public Mujer(String pDNI, String pNombre, String pApellido, int pEdad)
	{
		// TODO completar
		super(null, null, null, 0);
	}
	
// otros métodos
	
	/**
	 * 
	 * @param pHombreDisponibles
	 * @return devuelve el primer Hombre de los que hay en la lista de preferencias
	 *         de la mujer que se encuentre en la lista de alumnos pHombresDisponibles
	 *         y que acepta a la mujer actual (esto es, la tiene entre sus propias
	 *         preferencias).
	 *         Si no existe tal hombre, se devuelve el objeto null.
	 *         Si en la lista pHombresDisponibles se encuentra alguna mujer, se muestra
	 *         un aviso por consola y se devuelve null.
	 */
	public Hombre emparejar(ListaAlumnos pHombreDisponibles)
	{
		// TODO completar
		return null;
	}

	/**
	 * @param pAlumno
	 *            post: si el parámetro pAlumno es una instancia de Hombre, la
	 *            añade a la lista de preferencias de la mujer si no, muestra un
	 *            mensaje de aviso por pantalla y no modifica la lista de
	 *            preferencias.
	 */
	public void anadirPreferencia(Alumno pAlumno)
	{
		// TODO completar
	}
}
