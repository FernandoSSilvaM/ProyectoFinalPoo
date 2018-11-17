package mx.itesm.poo.proyectoFinal;

public class Mira {
	//Atributos
	private Cristal cristal = new Cristal();
	private double zoom = 1;
	private boolean IR = false;
	

	public Mira() {
		// TODO Auto-generated constructor stub
	}


	public Mira(Cristal cristal, double zoom, boolean iR) {
		this.cristal = cristal;
		this.zoom = zoom;
		IR = iR;
	}

	//Metodos Generales
	public void hacerZoom() {
		System.out.println("Ampliando vison a :" + this.zoom + "x");
	}
	
	public boolean prenderIR() {
		if(this.IR) {
			System.out.println("Prendiendo IR");
			return true;
		
		} else {
			System.out.println("No cuenta con esa funcion");
			return false;
		}
	}
	
    //Getters, Setters, toString
	public Cristal getCristal() {
		return cristal;
	}


	public void setCristal(Cristal cristal) {
		this.cristal = cristal;
	}


	public double getZoom() {
		return zoom;
	}


	public void setZoom(double zoom) {
		this.zoom = zoom;
	}


	public boolean isIR() {
		return IR;
	}


	public void setIR(boolean iR) {
		IR = iR;
	}


	@Override
	public String toString() {
		return "Mira [cristal=" + cristal + ", zoom=" + zoom + ", IR=" + IR + "]";
	}
	
	
	

}
