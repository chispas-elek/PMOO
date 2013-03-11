//Author -> Mulero Martínez, Rubén
//Author -> Esteban García, Asier

package org.pmoo.packlaboratorio4;
import java.util.ArrayList;
import java.util.Iterator;

public class ListaOperaciones
{
	// atributos
	private ArrayList<Operacion> lista;
	private static ListaOperaciones mListaOperaciones = null;
	
	// constructora
	
	private ListaOperaciones()
	{ 
		lista = new ArrayList<Operacion>();
	}
	
	// getters y setters
	
  	public static ListaOperaciones getListaOperaciones()
	{
  		if(mListaOperaciones == null) {
  			mListaOperaciones = new ListaOperaciones();
  		}
  		return mListaOperaciones;
	}

  	// otros métodos
  	
 	private Iterator<Operacion> getIterador()
 	{
 		return this.lista.iterator();
 	}
 	
 	public int cantidadOperaciones()
 	{
 		return this.lista.size();
 	}
 	
 	public void anadirOperacion(int pIdOperacion, int pIdCliente, String pClaveTecleada, double pCantidad)
 	{
 		if(this.buscarOperacionPorId(pIdOperacion) == null) {
  			Operacion pOp = new Operacion(pIdOperacion,pIdCliente,pClaveTecleada,pCantidad);
  			this.lista.add(pOp);
  		}
  		else {
  			System.out.println("Ya existe esa ID de Operacion LOL!!!!");
  		}
 	}

  	
 	public Operacion buscarOperacionPorId(int pId)
 	{
 		Operacion lOp = null;
  		Iterator<Operacion> it = this.getIterador();
  		boolean existe = false;
  		while(it.hasNext() && !existe) {
  			lOp = it.next();
  			if(lOp.tieneMismoId(pId)) {
  				existe = true;
  			}
  		}
  		if (!existe) {
  			lOp = null;
  		}
  		return lOp;
 	}

 	public void realizarOperaciones()
 	{
 		Operacion lOp;
 		Iterator<Operacion> it = this.getIterador();
 		while(it.hasNext()) {
 			lOp = it.next();
 			lOp.realizarOperacion();
 		}
 	}
 	
 	public void resetear()
 	{
 		this.lista = null;
 		this.lista = new ArrayList<Operacion>();
 	}
}	