//Oscar Zu�iga Lara A01654827
//Fernando Sebastian Silva Miramontes
package mx.itesm.poo.proyectoFinal;

public class Assasin extends Piloto implements Volador{
	//Atributos
	private int velocidad = 20;

	//Constructores
	public Assasin(int numID, String bando, double salud, Arma arma, int idPiloto, Titan titan, int velocidad) {
		super(numID, bando, salud, arma, idPiloto, titan);
		this.velocidad = velocidad;
	}
	
	public Assasin(int velocidad,int numID, String bando) {
		super();
		this.velocidad = velocidad;
		this.numUnidad = numID;
		this.bando = bando;
	}
	
	public Assasin(int velocidad) {
		super();
		this.velocidad = velocidad;
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
		System.out.println("Se raliza danio en radio de 2m");
	}

	@Override
	public boolean apagarCoohete() {
		System.out.println("Apagando cohete");
		return true;
	}
	
	//Metodos Generales
	
	public void apunalar(Piloto objetivo) {
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
		return "Assasin [velocidad= " + velocidad + ", idPiloto= " + idPiloto + ", numUnidad= " + numUnidad + ", bando= " + bando + ", salud= " + salud + 
				",\n    ARMAinf= " + arma + ",\n    TITAN= " + titan +  "] ";
	}


	
	
	
	
	
	
	
	
	
	
}
	