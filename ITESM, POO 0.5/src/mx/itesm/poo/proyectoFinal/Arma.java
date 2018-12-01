package mx.itesm.poo.proyectoFinal;

public class Arma {
	//Atributos
	private int dano =  1;
	private boolean boolTitan = true;
	private int cargadorMax = 10;
	private int cargadorAhora = this.cargadorMax;
	private Mira mira = new Mira();
	
	//Constructores ¿
	public Arma() {
		// TODO Auto-generated constructor stub
	}

	public Arma(int dano, boolean boolTitan, int cargadorMax, Mira mira) {
		this.dano = dano;
		this.boolTitan = boolTitan;
		this.cargadorMax = cargadorMax;
		this.mira = mira;
	}
	
	//Metodos Generales
	public boolean disparar(UnidadDeBatalla objetivo) {
		
		if(this.cargadorAhora > 0) {
			this.cargadorAhora -= 1;
			System.out.println("BANG!");
			if(objetivo instanceof Titan) { // Le disparo a un Titan?
				if(this.boolTitan) {  //Soy un Titan
					if(((Titan) objetivo).getEscudos() <= 0) { //Tiene escudos
						objetivo.setSalud(objetivo.getSalud() - this.dano);
						System.out.println("Daño a Titan sin escudos!!, su salud ahora es:" + objetivo.getSalud());
					
					} else { //No tiene Escudos
						((Titan) objetivo).setEscudos(((Titan) objetivo).getEscudos() - this.dano);
						System.out.println("Daño al escudo del titan; escudo actual: " +((Titan) objetivo).getEscudos());
					}
					
				} else { //No soy un Titan
					if(((Titan) objetivo).getEscudos() <= 0) { //Tiene escudos
						objetivo.setSalud(objetivo.getSalud() - this.dano * 0.5);
						System.out.println("Daño a Titan sin escudos!!, su salud ahora es:" + objetivo.getSalud());
					
					} else { //No tiene escudos
						((Titan) objetivo).setEscudos(((Titan) objetivo).getEscudos() - this.dano * 0.5);
						System.out.println("Daño al escudo del titan; escudo actual: " +((Titan) objetivo).getEscudos());
					}
				}
			
			} if(objetivo instanceof Infanteria) { //Le disparo a una Infanteria?
				if(this.boolTitan) { //soy un Titan
					((Infanteria) objetivo).setSalud(((Infanteria) objetivo).getSalud() - this.dano * 2);
					
				} else { // No soy un titan
					((Infanteria) objetivo).setSalud(((Infanteria) objetivo).getSalud() - this.dano);
				}
			
			} else { // Deberia ser una excepcion, pero no quiero serlo :3
				System.out.println("Que ostras eres?");
			}
			
			return true;
		
		} else {
			System.out.println("Sin balas!");
			return false;
		}
		 
	}
	
	public boolean recargar() {
		
		if(this.cargadorAhora == this.cargadorMax) {
			System.out.println("Cargaador lleno");
			return false;
		
		} else {
			this.setCargadorAhora(this.cargadorMax);
			return true;
		}
	}

	//Getters, Setters y toString
	public double getDano() {
		return dano;
	}

	public void setDano(double dano) {
		this.dano = (int) dano;
	}

	public boolean isBoolTitan() {
		return boolTitan;
	}

	public void setBoolTitan(boolean boolTitan) {
		this.boolTitan = boolTitan;
	}
	
	public int getCargadorAhora() {
		return cargadorAhora;
	}

	public void setCargadorAhora(int cargadorAhora) {
		this.cargadorAhora = cargadorAhora;
	}
	

	public int getCargadorMax() {
		return cargadorMax;
	}

	public void setCargadorMax(int cargadorMax) {
		this.cargadorMax = cargadorMax;
	}

	public Mira getMira() {
		return mira;
	}

	public void setMira(Mira mira) {
		this.mira = mira;
	}

	@Override
	public String toString() {
		return "Arma [daño=" + dano + ", boolTitan=" + boolTitan + ", cargadorAhora=" + cargadorAhora + ", cargadorMax="
				+ cargadorMax + ", mira=" + mira + "]";
	}
	
	



}
