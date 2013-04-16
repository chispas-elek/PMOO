//Author -> Mulero Martínez, Rubén
//Author -> Esteban García, Asier

package org.pmoo.packlaboratorio7;

public class CursoBaile
{
	// atributos
	private static CursoBaile miCursoBaile = null;

	
	// constructora
	private CursoBaile()
	{
	}

	// getters y setters

	/**
	 * @return la única instancia de CursoBaile
	 */
	public static CursoBaile getCursoBaile()
	{
		// TODO completar
		if(miCursoBaile == null) {
			 miCursoBaile = new CursoBaile();
		}
		return miCursoBaile;
	}

	// otros métodos

	/**
	 * 
	 * @param pDNI1
	 * @param pDNI2
	 *            post: se da de alta la pareja compuesta por los alumnos cuyos
	 *            DNI son pDNI1 y pDNI2, excepto si el DNI de alguno de los dos
	 *            no se corresponde con el de ningún alumno de la lista de alumnos
	 *            del curso de baile, se trata de dos alumnos del mismo sexo, o
	 *            alguno de ellos ya tiene pareja en el curso, en cuyo caso se
	 *            avisa por pantalla con el mensaje correspondiente y no se da
	 *            de alta la nueva pareja.
	 */
	public void darDeAltaPareja(String pDNI1, String pDNI2)
	{
		// TODO completar
		ListaAlumnosCurso lAlumnos = ListaAlumnosCurso.getListaAlumnosCurso();
		ListaParejas lParejas = ListaParejas.getListaParejas();
		Pareja par = null;
		Alumno al1 = lAlumnos.buscarAlumnoPorDNI(pDNI1);
		Alumno al2 = lAlumnos.buscarAlumnoPorDNI(pDNI2);
		if(al1 == null || al2 == null || lParejas.obtenerParejaDe(al1) != null || lParejas.obtenerParejaDe(al2) != null || (al1 instanceof Hombre && al2 instanceof Hombre) || (al1 instanceof Mujer && al2 instanceof Mujer)) {
			System.out.println("No se cumplen las condiciones");
		}
		else {
			par = new Pareja(al1,al2);
			lParejas.anadirOrdenadoPareja(par);
		}
	}

	/**
	 * 
	 * @param pDNI
	 * @param pNombre
	 * @param pApellido
	 * @param pEdad
	 * @param pSexo
	 *            post: si el carácter pSexo es 'h' o 'H' se da de alta un nuevo
	 *            alumno de tipo Hombre. si el carácter pSexo es 'm' o 'M' se da
	 *            de alta un nuevo alumno de tipo Mujer. El DNI, nombre,
	 *            apellido y edad del nuevo alumno vienen dados por los
	 *            parámetros pDNI, pNombre pApellido y pEdad. si el carácter
	 *            pSexo tiene cualquier otro valor, se avisa por pantalla y no
	 *            se da de alta a ningún alumno.
	 */
	public void darDeAltaAlumno(String pDNI, String pNombre, String pApellido,
			int pEdad, char pSexo)
	{
		// TODO completar
		ListaAlumnosCurso lAlumnos = ListaAlumnosCurso.getListaAlumnosCurso();
		Alumno al = null;
		boolean eSex = false;
		switch(pSexo){
		case 'M': {
			al = new Mujer(pDNI, pNombre, pApellido, pEdad);
			break;
		}
		case 'm': {
			al = new Mujer(pDNI, pNombre, pApellido, pEdad);
			break;
		}
		case 'H': {
			al = new Hombre(pDNI, pNombre, pApellido, pEdad);
			break;
		}
		case 'h': {
			al = new Hombre(pDNI, pNombre, pApellido, pEdad);
			break;
		}
		default : {
			System.out.println("Sexo no valido");
			eSex = true;
			break;
		}
			
		}//switch
		
		if(lAlumnos.buscarAlumnoPorDNI(al.getDNI()) != null) {
			System.out.println("El alumno ya existe");
		}
		else if(!eSex) {
			lAlumnos.anadirAlumnoCurso(al);
		}
	}

	/**
	 * 
	 * @param pIdQuien
	 * @param pIdSuPreferencia
	 *            post: se añade el alumno con DNI pIdSuPreferencia a la lista
	 *            de preferencias del alumno con DNI pIdQuien
	 */
	public void anadirPreferencia(String pIdQuien, String pIdSuPreferencia)
	{
		// TODO completar
		ListaAlumnosCurso lAlumnos = ListaAlumnosCurso.getListaAlumnosCurso();
		Alumno al1 = lAlumnos.buscarAlumnoPorDNI(pIdQuien);
		Alumno al2 = lAlumnos.buscarAlumnoPorDNI(pIdSuPreferencia);
		if(al1 == null || al2 == null) {
			System.out.println("Algun dato es erroneo");
		}
		else {
			al1.anadirPreferencia(al2);
		}
	}

	/**
	 * post: se resetean las listas de parejas y de alumnos del curso
	 */
	public void empezarCurso()
	{
		// TODO completar
		ListaParejas lParejas = ListaParejas.getListaParejas();
		ListaAlumnosCurso lAlumnos = ListaAlumnosCurso.getListaAlumnosCurso();
		lParejas.resetear();
		lAlumnos.resetear();
	}

	/**
	 * post: si quedan alumnos sin emparejar se muestra un mensaje por consola,
	 * y si no, se reajustan las parejas del curso.
	 */
	public void ajustarParejasSegunPreferencias()
	{
		// TODO completar
		ListaParejas lParejas = ListaParejas.getListaParejas();
		lParejas.reajustarParejas();
	}
}
