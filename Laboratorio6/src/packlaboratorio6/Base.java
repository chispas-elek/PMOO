//Author -> Mulero Martínez, Rubén
//Author -> Esteban García, Asier

package packlaboratorio6;

public class Base extends Taxed {

	//Variables
	private int id;
	
	//Constructor
	public Base(double pImporte, int pId) {
		super(pImporte);
		this.id = pId;	
	}
	
	//Getters & Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
