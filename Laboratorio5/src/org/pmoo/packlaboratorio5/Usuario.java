package org.pmoo.packlaboratorio5;

public class Usuario
{
	//atributos
	private int idUsuario;
	private String nombreCompleto;
	private int maxLibros;
	private ListaLibros librosEnPrestamo;
		
	//constructora
	
	public Usuario(String pNombreCompleto, int pIdUsuario)
	{
		this.nombreCompleto = pNombreCompleto;
		this.idUsuario = pIdUsuario;
		this.maxLibros = 3;
		this.librosEnPrestamo = new ListaLibros();
	}
	
	// getters y setters
	
	private int getMaxLibros()
	{
		return this.maxLibros;
	}
	
	private String getNombreCompleto()
	{
		return this.nombreCompleto;
	}
	
	private int getIdUsuario()
	{
		return this.idUsuario;
	}
	
	// otros métodos
	
	public boolean tieneEsteId(int pId)
	{
		boolean found = false;
		if(this.getIdUsuario() == pId) {
			found = true;
		}
		return found;
	}
		
	public boolean tieneMismoId(Usuario pUsuario)
	{
		return this.tieneEsteId(pUsuario.getIdUsuario());
	}
	
	private int cuantosLibrosTiene()
	{
		return this.librosEnPrestamo.getTamano();
	}
		
	public boolean haAlcanzadoElMaximo()
	{
		boolean max = false;
		if(this.cuantosLibrosTiene() == this.getMaxLibros()) {
			max = true;
		}
		return max;
	}
	
	public void anadirLibro(Libro pLibro)
	{
		if(!this.haAlcanzadoElMaximo()) {
			this.librosEnPrestamo.anadirLibro(pLibro);
		}
	}
	
	public void eliminarLibro(Libro pLibro)
	{
		if(this.cuantosLibrosTiene() > 0) {
			this.librosEnPrestamo.eliminarLibro(pLibro);
		}
	}
	
	public boolean loTieneEnPrestamo(Libro pLibro)
	{
		boolean found = false;
		if(this.cuantosLibrosTiene() > 0) {
			found = this.librosEnPrestamo.esta(pLibro);
		}
		return found;
	}
	
	public void imprimir()
	{
	
	}
}