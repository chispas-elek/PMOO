package org.pmoo.packlaboratorio5;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaUsuarios
{
	// atributos
	private ArrayList<Usuario> lista;
	private static ListaUsuarios miListaUsuarios = null;
	
	// constructora
	
    private ListaUsuarios()
    { 
    	lista = new ArrayList<Usuario>();
    }
   	
    // getters y setters
    
   	public synchronized static ListaUsuarios getListaUsuarios()
   	{
   		if(miListaUsuarios == null) {
   			miListaUsuarios = new ListaUsuarios();
   		}
   		return miListaUsuarios;
   	}

   	// otros métodos
   	
   	public int getTamano()
   	{
   		return lista.size();
   	}
   	
   	private Iterator<Usuario> getIterador()
   	{
   		return lista.iterator();
   	}
    
   	public Usuario buscarUsuarioPorId(int pId)
   	{
   		Iterator<Usuario> it = this.getIterador();
   		boolean encontrado = false;
   		Usuario usu = null;
   		while(it.hasNext() && !encontrado ) {
   			usu = it.next();
   			if(usu.tieneEsteId(pId)) {
   				encontrado = true;
   			}else {
   				usu = null;
   			}
   		}
   		return usu;
   	}
   	
   	public boolean existeUsuarioConMismoId(Usuario pUsuario)
   	{
   		Iterator<Usuario> it = this.getIterador();
   		boolean existe = false;
   		Usuario usu;
   		while(it.hasNext() && !existe) {
   			usu = it.next();
   			if(usu.tieneMismoId(pUsuario)) {
   				existe = true;
   			}
   		}
   		return existe;
   	}
   	
   	public void darDeAltaUsuario(Usuario pUsuario)
   	{
	   	if(!this.existeUsuarioConMismoId(pUsuario)) {
	   		this.lista.add(pUsuario);
	   	}else {
	   		System.out.print("El usuario que intenta añadir, ya existe en la lista de usuarios");
	   	}
   	}

	public void darDeBajaUsuario(int pIdUsuario)
	{
		Usuario usu = this.buscarUsuarioPorId(pIdUsuario);
		if(usu != null) {
				this.lista.remove(usu);
		}else {
			System.out.println("El ususarios que intenta eliminar, no existe en la lista de usuarios");
		}
   	}

   	public Usuario quienLoTienePrestado(Libro pLibro)
   	{
   		Usuario usu = null;
   		Iterator<Usuario> it = this.getIterador();
   		boolean encontrado = false;
   		while(!encontrado && it.hasNext()) {
   			usu = it.next();
   			if(usu.loTieneEnPrestamo(pLibro)) {
   				encontrado = true;
   			}else {
   				usu = null;
   			}
   		}
   		return usu;
   	}

   	public void imprimir()
   	{	
   		 System.out.println("En total el sistema tiene "+this.lista.size()+" usuarios");
   		 Usuario usu;
   		 Iterator<Usuario> it = this.getIterador();
   		 while(it.hasNext()) {
   			 usu = it.next();
   			 usu.imprimir();
   		 }
   	}
   
   	public void resetear()
   	{
   		this.lista = null;
   		this.lista = new ArrayList<Usuario>();
   	}

}
