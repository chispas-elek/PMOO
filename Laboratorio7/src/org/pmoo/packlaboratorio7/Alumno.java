package org.pmoo.packlaboratorio7;

public abstract class Alumno extends Object
{
	// atributos

	// constructora
	/**
	 * 
	 * @param pDNI
	 * @param pNombre
	 * @param pApellido
	 * @param pEdad
	 *            post: se inicializa un nuevo objeto de la clase Alumno con dni
	 *            pDNI, nombre pNombre apellido pApellido, edad pEdad y una
	 *            lista de preferencias vacia
	 */
	public Alumno(String pDNI, String pNombre, String pApellido, int pEdad)
	{
		// TODO completar
	}

	// getters y setters

	/**
	 * 
	 * @return la lista de preferencias del alumno
	 */
	protected ListaAlumnos getListaPreferencias()
	{
		// TODO completar
		return null;
	}

	/**
	 * 
	 * @return el nombre del alumno
	 */
	public String getNombre()
	{
		// TODO completar
		return null;
	}

	/**
	 * 
	 * @return el apellido del alumno
	 */
	public String getApellido()
	{
		// TODO completar
		return null;
	}

	/**
	 * 
	 * @return la edad del alumno
	 */
	public int getEdad()
	{
		// TODO completar
		return 0;
	}

	/**
	 *  
	 * @return el dni del alumno
	 */
	public String getDNI()
	{
		// TODO completar
		return null;
	}

	// otros métodos
	
	// hace falta cabecera aunque no se implemente.
	public abstract void anadirPreferencia(Alumno pAlumno);

}

