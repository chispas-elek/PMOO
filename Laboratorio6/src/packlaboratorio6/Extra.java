package packlaboratorio6;

public class Extra extends Taxed {
	
	//Variables
	private int horas;
	private double precioHora;
	private String decripcion;
	
	//Constructor
	
	public Extra(double pImporte, int pHoras, double pPrecioHora, String pDescripcion) {
		super(pImporte);
		this.horas = pHoras;
		this.precioHora = pPrecioHora;
		this.decripcion = pDescripcion;
	}

	//Getters & Setters
	public int getHoras() {
		return horas;
	}

	public void setHoras(int pHoras) {
		this.horas = pHoras;
	}

	public double getPrecioHora() {
		return precioHora;
	}

	public void setPrecioHora(double pPrecioHora) {
		this.precioHora = pPrecioHora;
	}

	public String getDecripcion() {
		return decripcion;
	}

	public void setDecripcion(String pDecripcion) {
		this.decripcion = pDecripcion;
	}
	
	//Methods
	
	public double calcularNeto() {
		double result = 0;
		this.setRetencion(10);
		result = this.getImporte()-(this.getImporte() * this.getRetencion()/100);
		result = result + (this.getHoras() * this.getPrecioHora());
		return result;
	}

}
