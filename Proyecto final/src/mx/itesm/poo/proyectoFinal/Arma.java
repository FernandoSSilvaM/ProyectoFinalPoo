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
			if(objetivo instanceof Titan) {
				//Esto es reconoce a objetivo como clase "Titan" y usa el metodo setEscudos para bajarle la vida
				//dependiendo si le dispara una infanteria o Titan.
				if(this.boolTitan) {
					((Titan) objetivo).setEscudos(((Titan) objetivo).getEscudos() - this.dano);
					System.out.println("La salud del titan es" + ((Titan) objetivo).getEscudos());
				
				} else {
					((Titan) objetivo).setEscudos(((Titan) objetivo).getEscudos() - (this.dano * 0.5));
					System.out.println("La salud de la infanteria es" + ((Infanteria) objetivo).getVida());
				}
			
			} if(objetivo instanceof Infanteria) {
				if(this.boolTitan) {
					((Infanteria) objetivo).setVida(((Infanteria) objetivo).getVida() - this.dano * 1.5);
					
				} else {
					((Infanteria) objetivo).setVida(((Infanteria) objetivo).getVida() - this.dano);
				}
			
			} else {
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
