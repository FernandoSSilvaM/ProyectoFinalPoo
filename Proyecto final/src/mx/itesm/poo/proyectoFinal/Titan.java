package mx.itesm.poo.proyectoFinal;

public abstract class Titan extends UnidadDeBatalla {
	//Atributos
	protected double escudos;
	protected int tamano;
	protected Arma arma = new Arma();

	//Constructores
	public Titan(int numID, String bando, double salud, double escudos, int tamano, Arma arma) {
	super(numID, bando, salud);
	this.escudos = escudos;
	this.tamano = tamano;
	this.arma = arma;
	}
	
	public Titan(double escudos, int tamano, Arma arma) {
		super();
		this.escudos = escudos;
		this.tamano = tamano;
		this.arma = arma;
	}
	
	public Titan() {
		super();
		this.escudos= 100;
		this.tamano = 10;
	}

	//Metodos Generales
	
	public boolean aparecer() {
		System.out.println("Creando titan...");
		return true;
		}
	
	public abstract void correr();
	
	
	public abstract void especial();
	
	
	public boolean tomarArma(Arma arma) {
		if(arma.isBoolTitan()) { //Es un arma de Titan?
			System.out.println("Se cambio la arma: " + this.arma.toString() + "\n por: " + arma.toString());			
			this.setArma(arma);
			return true;
			
		} else {
			System.out.println("No puedes tomar esa arma!");
			return false;
		}
	}
	public boolean desruirse() {
		if(this.salud <= 0) {
			System.out.println("Has sido destruido!");
			return true;
		
		} else {
			System.out.println("Puede seguir peleando.");
			return false;
		}
	}
	
	public abstract void autodestruirse();
	
	//Getters, Setters y toString
	public double getEscudos() {
		return escudos;
	}

	public void setEscudos(double d) {
		this.escudos = d;
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}
	
	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	@Override
	public String toString() {
		return "Titan [escudos=" + escudos + ", tamano=" + tamano  + ", arma=" + arma
				+ ", numUnidad=" + numUnidad + ", bando=" + bando + ", salud=" + salud + "]";
	}
	
	
}

