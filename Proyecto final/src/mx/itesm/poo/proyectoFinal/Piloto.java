//Oscar Zuñiga Lara A01654827
//Fernando Sebastian Silva Miramontes
package mx.itesm.poo.proyectoFinal;

public abstract class Piloto extends Infanteria {
	//Atributos
	protected int idPiloto = 00;
	protected Titan titan = null;
	
	//Constructores
	public Piloto(int numID, String bando, double salud, Arma arma, int idPiloto, Titan titan) {
		super(numID, bando, salud, arma);
		this.idPiloto = idPiloto;
		this.titan = titan;
	}

	public Piloto(int idPiloto, Titan titan) {
		super();
		this.idPiloto = idPiloto;
		this.titan = titan;
	}

	public Piloto() {
		super();
	}
	
	//Metodos Generales
	public boolean ingresarTitan(boolean hayTitan) {
		if(hayTitan) {
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
	
	public void llamarTitan() {
		if(titan == null) {
			System.out.println("No tienes un titan!");

		} else {
		this.titan.aparecer();
		System.out.println("Titan en camino.");
		}
	}
	
	
	public abstract void parkour();
	
	public abstract void correr();
	
	public abstract void teleport();
	
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
		return "Piloto [idPiloto=" + idPiloto + ", titan=" + titan + ", arma=" + arma + ", numUnidad=" + numUnidad
				+ ", bando=" + bando + ", salud=" + salud + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
