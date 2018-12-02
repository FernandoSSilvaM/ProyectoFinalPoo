package mx.itesm.poo.proyectoFinal;

public class BattleRifle extends Piloto {
	//Atributos
	private int velocidad = 10;

	//Constructores
	public BattleRifle(int numID, String bando, double salud, Arma arma, int idPiloto, Titan titan, int velocidad) {
		super(numID, bando, salud, arma, idPiloto, titan);
		this.velocidad = velocidad;
	}
	
	public BattleRifle(int velocidad, int numUnidad, String bando) {
		super();
		this.velocidad = velocidad;
		this.numUnidad = numUnidad;
		this.bando = bando;
	}
	
	public BattleRifle(int velocidad) {
		super();
		this.velocidad = velocidad;
	}
	
	public BattleRifle() {
		super();
	}
	

	//Metodos Heredados
	@Override
	public void parkour() {
		double vel = this.velocidad * 2;
		System.out.println("Modo Parkour activado, velocidoad= " + vel);
	}

	@Override
	public void correr() {
		double vel = this.velocidad * 1.5;
		System.out.println("Corriendo a una velocidad= " + vel);
	}

	@Override
	public void teleport() {
		System.out.println("Moviendose a base en 6 segundos");
	}
	
	//Metodos Generales
	
	public void cubrirse() {
		System.out.println("Estas a cubierto");
	}

	//Getters, Setters y toString
	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public String toString() {
		return "BattleRifle [velocidad= " + velocidad + ", idPiloto= " + idPiloto + ", numUnidad= " + numUnidad + ", bando= " + bando + ", salud= " + salud + 
				",\n    ARMAinf= " + arma + ",\n    TITAN= " + titan +  "] ";
	}
	
	
	
	
	
	
	
	
	
	
}
	