//Oscar Zuñiga Lara A01654827
//Fernando Sebastian Silva Miramontes
package mx.itesm.poo.proyectoFinal;

public abstract class UnidadDeBatalla {
	//Atributos
	protected int numUnidad = 0000;
	protected String bando = "Milicia";
	protected double salud = 100;
	
	//Constructores
	public UnidadDeBatalla(int numID, String bando, double salud) {
		this.numUnidad = numID;
		this.bando = bando;
		this.salud = salud;
	}

	public UnidadDeBatalla() {
	}

	//Getters, Setters y toString
	public int getNumUnidad() {
		return numUnidad;
	}

	public void setNumUnidad(int numUnidad) {
		this.numUnidad = numUnidad;
	}

	public String getBando() {
		return bando;
	}

	public void setBando(String bando) {
		this.bando = bando;
	}
	
	public double getSalud() {
		return salud;
	}

	public void setSalud(double salud) {
		this.salud = salud;
	}

	@Override
	public String toString() {
		return "UnidadDeBatalla [numUnidad=" + numUnidad + ", bando=" + bando + ", salud=" + salud + "]";
	}
	
	

}
