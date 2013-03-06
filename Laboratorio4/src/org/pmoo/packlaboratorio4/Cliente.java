//Author -> Mulero Martínez, Rubén
//Author -> Esteban García, Asier

package org.pmoo.packlaboratorio4;


public class Cliente
{
   // atributos
	private int idCliente;
	private String nombre;
	private String clave;
	private double saldo;
	private boolean esPreferente;
	
	
   // constructora
	
   public Cliente(int pId, String pNombre, String pClave,
		   double pSaldo, boolean pPref)
   {
	
   }
   
   // getters y setters 
   
   private int getIdCliente()
   {
	   return this.idCliente;
   }
   
   private String getNombre()
   {
	   return this.nombre;
   }
   
   private String getClave()
   {
	   return this.clave;
   }
      
   private double getSaldo()
   {
	   return this.saldo;
   }
   private void setSaldo(double pSaldo)
   {
	   this.saldo = pSaldo;
   }
   
   public boolean getEsPreferente()
   {
	      return this.esPreferente;
   }
   
   public boolean tieneMismoId(int pId)
   {
	   boolean result = false;
	   if(this.getIdCliente() == pId) {
		   result = true;
	   }
	   return result;
   }
   
   // otros métodos
   
   public double obtenerSaldo(String pClaveTecleada)
   {
	   double saldo = 0.0;
	   if(this.comprobarClave(pClaveTecleada)) {
		   saldo = this.getSaldo(); 
	   }
	   return saldo;
   }
   
   private boolean comprobarClave(String pClave)
   {
	 boolean result = false;
	 if(this.getClave() == pClave) {
		 result = true;
	 }
	 return result;
   }
   
   public void actualizarSaldo(String pClaveTecleada, double pCantidad)
   {
	   if(this.comprobarClave(pClaveTecleada)) {
		   if(pCantidad >= 0 && (this.getSaldo() - pCantidad) >= 0) {
		   this.setSaldo(this.getSaldo()-pCantidad);
		   System.out.println(this.getSaldo());
		   }
	   }else if(pCantidad < 0) {
		   System.out.println("Cantidad introducida negativa");
	   }
	   else if((this.getSaldo() - pCantidad) < 0) {
		   System.out.println("Cantidad introducida demasiado grande");
	   }
	   else {
		   System.out.println("Código incorrecto");
	   }
	     
   }

}
