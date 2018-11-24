package mx.itesm.poo.proyectoFinal;

public class Assasin extends Piloto implements Volador{
	//Atributos
	private int velocidad = 20;

	//Constructores
	public Assasin(int numID, String bando, double salud, Arma arma, int idPiloto, Titan titan, int velocidad) {
		super(numID, bando, salud, arma, idPiloto, titan);
		this.velocidad = velocidad;
	}
	
	public Assasin(int velocidad) {
		super();
		this.velocidad = velocidad;
	}
	
	public Assasin() {
	}

	//Metodos Heredados
	@Override
	public void parkour() {
		double vel = this.velocidad * 5;
		System.out.println("Modo Parkour activado, velocidoad= " + vel);
	}

	@Override
	public void correr() {
		double vel = this.velocidad * 2;
		System.out.println("Corriendo a una velocidad= " + vel);
	}

	@Override
	public void teleport() {
		System.out.println("Moviendose a base en 2 segundos");
	}
	
	//Metodos Interfase
	@Override
	public void volar() {
		System.out.println("Elevandose a una velocidad: " + this.velocidad);
	}

	@Override
	public void pisoton() {
		System.out.println("Se raliza daño en radio de 2m");
	}

	@Override
	public boolean apagarCoohete() {
		System.out.println("Apagando cohete");
		return true;
	}
	
	//Metodos Generales
	
	public void apuñalar(Piloto objetivo) {
		objetivo.setSalud(0);
		System.out.println("Se mato al piloto: " + objetivo.getIdPiloto());
	}

	//Getters, Setters y toString
	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public String toString() {
		return "Assasin [velocidad=" + velocidad + ", idPiloto=" + idPiloto + ", titan=" + titan + ", arma=" + arma
				+ ", numUnidad=" + numUnidad + ", bando=" + bando + ", salud=" + salud + "]";
	}


	
	
	
	
	
	
	
	
	
	
}
	