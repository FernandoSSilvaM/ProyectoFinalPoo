package mx.itesm.poo.proyectoFinal;

public abstract class UnidadDeBatalla {
	//Atributos
	int numUnidad = 0000;
	String bando = "Milicia";
	
	//Constructores
	public UnidadDeBatalla(int numID, String bando) {
		this.numUnidad = numID;
		this.bando = bando;
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

	@Override
	public String toString() {
		return "UnidadDeBatalla [numUnidad=" + numUnidad + ", bando=" + bando + "]";
	}
	
	

}
