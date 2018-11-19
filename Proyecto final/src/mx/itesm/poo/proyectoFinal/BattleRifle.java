package mx.itesm.poo.proyectoFinal;

public class BattleRifle extends Piloto {
	//Atributos
	private Arma granada = new Arma(100.0, false, 30, new Mira());

	//Constructores
	
	public BattleRifle() {
		super();
	}

	public BattleRifle(Arma granada, int vida, Arma arma, int velocidad, int numUnidad, String bando, int idPiloto, Titan titan) {
		super(vida, arma, velocidad, numUnidad, bando, idPiloto, titan);
		this.granada = granada;
	}
	
	//Getters, Setters, toString
	public Arma getGranada() {
		return granada;
	}

	public void setGranada(Arma granada) {
		this.granada = granada;
	}

	@Override
	public String toString() {
		return "BattleRifle [granada=" + granada + "]";
	}
	
	
	
}
