package mx.itesm.poo.proyectoFinal;

public abstract class UnidadDeBatalla {
	//Atributos
	protected int numUnidad = 0000;
	protected String bando = "Milicia";
	protected double salud = 100;
	
	public UnidadDeBatalla(int numID, String bando, double salud) {
		this.numUnidad = numID;
		this.bando = bando;
		this.salud = salud;
	}

	public UnidadDeBatalla() {
	}

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
