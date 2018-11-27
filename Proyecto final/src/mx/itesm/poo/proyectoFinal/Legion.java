package mx.itesm.poo.proyectoFinal;

public class Legion extends OGRE  implements Volador{
	
	private double escudoExtra;

	public Legion (int numUnidad, String bando, double salud, double escudos, 
			int tamano, Piloto piloto, Arma arma, int velocidad, double fuerzaGolpe, double escudoExtra ) {
		
		super(numUnidad, bando, salud, escudos, tamano, piloto, arma,velocidad, fuerzaGolpe);
		
		// TODO Auto-generated constructor stub
		
		this.escudoExtra = escudoExtra;

	}
	
	//public Legion (int numUnidad, String bando, Piloto piloto) {
	public Legion (int numUnidad, String bando) {
		
		super();
		
		// TODO Auto-generated constructor stub
		this.numUnidad = numUnidad;
		this.bando = bando;
		this.salud = 150;
		this.escudos = 150;
		this.tamano = 1000;
		//this.piloto = piloto;
		this.arma = arma;
		this.velocidad = 100;
		this.fuerzaGolpe = 25;
		this.escudoExtra = 50;

	}
	public void escudoDeTorreta() {
		System.out.println("Tienes Escudo de Torreta");
	}
	
	public double getEscudoExtra() {
		return escudoExtra;
	}

	public void setEscudoExtra(double escudoExtra) {
		this.escudoExtra = escudoExtra;
	}

	public String toString() {
		return "La wea del gatling";
	}

	@Override
	public void volar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pisoton() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean apagarCoohete() {
		// TODO Auto-generated method stub
		return false;
	}

}