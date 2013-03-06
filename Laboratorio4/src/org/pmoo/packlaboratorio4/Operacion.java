//Author -> Mulero Martínez, Rubén
//Author -> Esteban García, Asier

package org.pmoo.packlaboratorio4;

public class Operacion
{
   // atributos
	private int idOperacion;
	private int idCliente;
	private String claveTecleada;
	private double cantidad;
	
   // constructora
	
   public Operacion(int pIdOper, int pIdCliente, String pClaveTecleada, double pCant)
   {
	   this.idOperacion = pIdOper;
	   this.idCliente = pIdCliente;
	   this.claveTecleada = pClaveTecleada;
	   this.cantidad = pCant;
   }
   
   // getters y setters
   
   private int getIdOperacion()
   {
	   return this.idOperacion;
   }
   
   private int getIdCliente()
   {
	   return this.idCliente;
   }
   
   private String getClaveTecleada()
   {
	   return this.claveTecleada;
   }
   
   private double getCantidad()
   {
	   return this.cantidad;
   }
   
   // otros métodos
   
   public boolean tieneMismoId(int pIdOperacion)
   {
	   boolean result = false;
	   if(this.getIdOperacion() == pIdOperacion) {
		   result = true;
	   }
	   return result;
   }
   
   public void realizarOperacion ()
   {
	   ListaClientes lc = ListaClientes.getListaClientes();
	   Cliente cli = lc.buscarClientePorId(this.getIdCliente());
	   if(cli != null) {
		   cli.actualizarSaldo(this.getClaveTecleada(), this.getCantidad());
	   }else {
		   System.out.println("El cliente asociado a ésta operación no existe");
	   }
   }
}
