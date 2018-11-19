package mx.itesm.poo.proyectoFinal;

public class Infanteria extends UnidadDeBatalla {
	//Atributos
	int vida = 100;
	Arma arma = new Arma();
	int velocidad= 1;
	
	//Constructores
	
	public Infanteria(int vida, Arma arma, int velocidad, int numUnidad, String bando) {
		super(numUnidad, bando);
		this.vida = vida;
		this.arma = arma;
		this.velocidad = velocidad;
	}
	
	public Infanteria() {
		super();
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
		if(this.vida <= 0) {
			System.out.println("Estas muerto!");
			this.aparecer();
			return true;
		
		} else {
			System.out.println("Sigues con vida.");
			return false;
		}
	}
	
	public void correr() {
		int velocidadMax = 2*this.velocidad;
		System.out.println("Estas corriendo a una velicidad" + velocidadMax);
	}
	
	//Getters, Setters y toString
	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public String toString() {
		return "Infanteria [vida=" + vida + ", arma=" + arma + ", velocidad=" + velocidad + "]";
	}

}
