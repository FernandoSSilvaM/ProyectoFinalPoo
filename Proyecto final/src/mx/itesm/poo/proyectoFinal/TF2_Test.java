package mx.itesm.poo.proyectoFinal;

public class TF2_Test {
	
	public static void main (String[] args) {
		Legion legion1 = new Legion();
		Legion legion2 = new Legion(300);
		Assasin assasin1 = new Assasin(1010, "POO",100, new Arma(), 95, legion1, 20 );
		BattleRifle battleRifle2 = new BattleRifle();
		battleRifle2.setIdPiloto(11);
	    Arma armaSueloInf = new Arma(30, false, 100, new Mira(new Cristal("Amarillo", 2), 0.0, false));
	    Arma armasueloTitan = new Arma(100, true, 5, new Mira());
		
		assasin1.setTitan((Titan) legion1);

		
		System.out.println("El piloto 1:\n" + assasin1.toString());	
		System.out.println("\nEl titan del piloto 1:\n" + legion1.toString());
		System.out.println("\nEl piloto 2:\n" + battleRifle2.toString());
		
		System.out.println("\nProbando Metodos de Infanteria");
		
		System.out.println("\n----Tomar arma----");
		assasin1.tomarArma(armaSueloInf);
		System.out.println(assasin1.getArma());
		battleRifle2.tomarArma(armasueloTitan);
		
		System.out.println("\n----Aparecer----");
		battleRifle2.aparecer();
		
		System.out.println("\n----Morir----");
		assasin1.morir();
		assasin1.setSalud(0);
		assasin1.morir();
		assasin1.setSalud(100);
		
		System.out.println("\nProbando metodos de Piloto");
		
		System.out.println("----Llamar Titan----");
		battleRifle2.llamarTitan();
		assasin1.llamarTitan();
		
		System.out.println("\n----Ingresar Titan y Manejar Titan----");
		assasin1.manejarTitan(assasin1.ingresarTitan(true));
		
		System.out.println("\n----Parkour y Correr----");
		battleRifle2.parkour();
		battleRifle2.correr();
		
		System.out.println("\n----Teleport----");
		assasin1.teleport();
		battleRifle2.teleport();
		
		System.out.println("\nProbando Metodo de Battle Rifle");
		battleRifle2.cubrirse();
		
		System.out.println("\nProbando Metodos de Assasin");
		
		System.out.println("\n----Apunalar----");
		assasin1.apunalar(battleRifle2);
		
		System.out.println("\n----Volar----");
		assasin1.volar();
		
		System.out.println("\n----Pisoton----");
		assasin1.pisoton();
		
		System.out.println("\n----Apagar Motor----");
		assasin1.apagarCoohete();
		
		
		System.out.println("\nProbando Metodos de Titan");
		
		System.out.println("\n----Aparecer----");
		System.out.println(legion1.aparecer(false));
		
		System.out.println("\n----Correr----");
		legion1.correr();
		
		System.out.println("\n----Especial----");
		legion1.especial();
		
		System.out.println("\n----Tomar Arma----");
		legion1.tomarArma(armaSueloInf);
		legion1.tomarArma(armasueloTitan);
		
		System.out.println("\n----Destruirse y Autodestruirse----");
		legion1.desruirse();
		legion1.autodestruirse();
		
		System.out.println("\nProbando Metodos de OGRE");
		
		System.out.println("\n----Golpear----");
		System.out.println(legion1.getEscudos());
		battleRifle2.setSalud(100);
		legion1.golpear((UnidadDeBatalla) battleRifle2);
		legion2.golpear(legion1);
		System.out.println("Vida: " + battleRifle2.getSalud());
		System.out.println("Escudos: " + legion1.getEscudos() + "   Vida: " + legion1.getSalud());
		
		System.out.println("\nProbando Metodos de Arma");
		
		System.out.println("\n----Recargar----");
		System.out.println(assasin1.arma.recargar());
		assasin1.arma.recargar();
		
		System.out.println("\n---Disparar----");
		System.out.println("Un piloto le dispara a un titan\nVida inicial de Titan: " + legion1.getSalud());
		assasin1.arma.disparar(legion1);
		System.out.println("Un piloto le dispara a otro\n Vida inicial de piloto: " + assasin1.getSalud());
		battleRifle2.arma.disparar(assasin1);
		System.out.println("Vida final: " + assasin1.getSalud());
		
		
	
		
	}
}
