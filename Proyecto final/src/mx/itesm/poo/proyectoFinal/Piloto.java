package mx.itesm.poo.proyectoFinal;

public abstract class Piloto extends Infanteria {
	//Atributos
	protected int idPiloto = 00;
	protected Titan titan;
	
	//Constructores
	public Piloto() {
		super();
	}

	public Piloto(int vida, Arma arma, int velocidad, int numUnidad, String bando, int idPiloto, Titan titan) {
		super(vida, arma, velocidad, numUnidad, bando);
		this.titan = titan;
		this.idPiloto = idPiloto;
	}
	
	//Metodos Generales
	public boolean ingresarTitan(boolean hayTitan, Titan titan) {
		if(hayTitan) {
			titan.setPiloto(this);
			return true;
		
		} else {
			System.out.println("No hay titan!");
			return false;
		}
	}
	
	public void manejarTitan(boolean inTitan) {
		if(inTitan) {
			System.out.println("Manejando titan");
		
		} else {
			System.out.println("No estas en el titan!");
		}
	}
	
	public void parkour() {
		int velPar =  this.velocidad * 4;
		System.out.println("Agilidad aumentada: " + velPar);
	}
	
	public void llamarTitan() {
		this.titan.aparecer(true);
		System.out.println("Titan en camino.");
	}
	
	//Getters, Setters y toString
	public int getIdPiloto() {
		return idPiloto;
	}

	public void setIdPiloto(int idPiloto) {
		this.idPiloto = idPiloto;
	}

	public Titan getTitan() {
		return titan;
	}

	public void setTitan(Titan titan) {
		this.titan = titan;
	}

	@Override
	public String toString() {
		return "Piloto [idPiloto=" + idPiloto + ", titan=" + titan + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
