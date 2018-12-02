package mx.itesm.poo.proyectoFinal;

public abstract class Infanteria extends UnidadDeBatalla {
	//Atributos
	protected Arma arma = new Arma();
	
	//Constructores
	public Infanteria(int numID, String bando, double salud, Arma arma) {
		super();
		this.arma = arma;
	}
	
	public Infanteria(Arma arma) {
		super();
		this.arma = arma;
	}

	public Infanteria() {
		super();
		this.arma.setBoolTitan(false);
	}
	
	//Metodos Generales	
	public boolean tomarArma(Arma arma) {
		if(arma.isBoolTitan()) {
			System.out.println("No puedo tomar esa arma!");
			return false;
		
		} else {
			this.setArma(arma);
			System.out.println("Se a tomado otra arma");
			return true;
		}
	}
	
	public void aparecer() {
		System.out.println("Entrando a mapa");
	}
	
	public boolean morir() {
		if(this.salud <= 0) {
			System.out.println("Estas muerto!");
			this.aparecer();
			return true;
		
		} else {
			System.out.println("Sigues con vida.");
			return false;
		}
	}
	
	//Getters, Setters y toString
	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	@Override
	public String toString() {
		return "Infanteria [arma=" + arma + ", numUnidad=" + numUnidad + ", bando=" + bando + ", salud=" + salud + "]";
	}
	
	
	

}
