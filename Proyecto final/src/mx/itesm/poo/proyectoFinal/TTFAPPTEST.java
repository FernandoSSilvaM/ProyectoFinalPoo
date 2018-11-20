package mx.itesm.poo.proyectoFinal;

public class TTFAPPTEST {
	
	public static void main (String[] args) {
		UnidadDeBatalla a = new BattleRifle();
		Legion x = new Legion();
		Infanteria z = (Infanteria) a;
		System.out.println(z.getVida());
		x.getArma().disparar(a);
		System.out.println(z.getVida());
		
	}
}
