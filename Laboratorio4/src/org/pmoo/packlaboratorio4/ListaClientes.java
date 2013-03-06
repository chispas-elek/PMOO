//Author -> Mulero Martínez, Rubén
//Author -> Esteban García, Asier
//MAE ATRIBUTOS ESTATICOS Y METODOS ESTATICOS
package org.pmoo.packlaboratorio4;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaClientes
{
	// atributos
	private ArrayList<Cliente> lista;
	private static ListaClientes mListaClientes = null;
	// constructora
	
	private ListaClientes()
	{ 
		lista = new ArrayList<Cliente>();
	}
	
	// getters y setters
	
  	public static ListaClientes getListaClientes()
	{
  		if(mListaClientes == null) {
  			mListaClientes = new ListaClientes();
  		}
  		return mListaClientes;
	}	
 	// otros métodos
 	
  	private Iterator<Cliente> getIterador()
 	{
  		return this.lista.iterator();
 	}
  	
 	public int cantidadClientes()
 	{
 		return this.lista.size();
 	}
 	
  	public void anadirCliente(int pIdCliente, String pNombre, String pClave, double pSaldo, boolean pEsPreferente)
 	{
  		if(this.buscarClientePorId(pIdCliente) == null) {
  			Cliente pCli = new Cliente(pIdCliente, pNombre, pClave, pSaldo, pEsPreferente);
  			this.lista.add(pCli);
  		}
  		else {
  			System.out.println("Ya existe esa ID de cliente");
  		}
 	}
 
	public Cliente buscarClientePorId(int pId)
 	{
		Cliente lCli = null;
  		Iterator<Cliente> it = this.getIterador();
  		boolean existe = false;
  		while(it.hasNext() && !existe) {
  			lCli = it.next();
  			if(lCli.tieneMismoId(pId)) {
  				existe = true;
  			}
  		}
  		if (!existe) {
  			lCli = null;
  		}
  		return lCli;
 	}
  	
  	public void resetear()
 	{
 		this.lista = null;
 		this.lista = new ArrayList<Cliente>();
 	}
}	