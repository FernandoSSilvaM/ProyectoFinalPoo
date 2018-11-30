package mx.itesm.poo.proyectoFinal;

import javax.swing.*;  
import java.awt.event.*;


public class GUI {
	Legion legion1 = new Legion (1, "Equipo1");
	Legion legion2 = new Legion (4, "Equipo2");
	
	Assasin Assasin1 = new Assasin (3,2, "Equipo1");
	Assasin Assasin2 = new Assasin (3,5, "Equipo2");
	
	BattleRifle BattleRifle1 = new BattleRifle(2,3, "Equipo1");
	BattleRifle BattleRifle2 = new BattleRifle(2,6,"Equipo2");
	
	
	   	public void INTRODUCCION() {
	   		JOptionPane.showMessageDialog( null, "Bienvenido a \n TITAN	FALL 2:" );
		    

		    JOptionPane.showMessageDialog( null, "REGLA 1 \n Cada jugador tiene las mismas unidades con la misma salud"  );
		    JOptionPane.showMessageDialog( null, "REGLA 2 \n Cada jugador elige un ataque por turno." );
		    JOptionPane.showMessageDialog( null, "REGLA 3 \n Gana el ultimo superviviente." );
			
	   	}
	   	
	   	public void printAfterBattle() {
	   		System.out.println("LEGION 1, Salud: 		" + legion1.getSalud() + "		Escudos:		 " +  
	   				(legion1.getEscudos()) + legion1.getEscudoExtra() + "			Piloto		");
	   		
	   		System.out.println("UNIDAD NUMERO: " + BattleRifle1.getBando() +
	   			 " Salud: "	 + BattleRifle1.getSalud() + "Arma:" +BattleRifle1.getArma() + "TITAN: " + BattleRifle1.getTitan()
	   			 + "Velocidad :" + BattleRifle1.getVelocidad());
	   		
	   		System.out.println("UNIDAD NUMERO " + Assasin1.getNumUnidad() + "Assasin: " + Assasin1.getBando()+ "Salud :" + Assasin1.getSalud() 
	   		+ "ARMA: " + Assasin1.getArma() +  "TITAN: " + Assasin1.getTitan()
  			 + "Velocidad :" + Assasin1.getVelocidad() );
	   		
	   		System.out.println("LEGION 2, Salud: 		" + legion2.getSalud() + "		Escudos:		 " +  
	   				(legion2.getEscudos()) + legion2.getEscudoExtra() + "			Piloto		");
	   		
	   		System.out.println("UNIDAD NUMERO: " + BattleRifle2.getBando() +
	   			 " Salud: "	 + BattleRifle2.getSalud() + "Arma:" +BattleRifle2.getArma() + "TITAN: " + BattleRifle1.getTitan()
	   			 + "Velocidad :" + BattleRifle2.getVelocidad());
	   		
	   		System.out.println("UNIDAD NUMERO " + Assasin2.getNumUnidad() + "Assasin: " + Assasin2.getBando()+ "Salud :" + Assasin2.getSalud() 
	   		+ "ARMA: " + Assasin1.getArma() +  "TITAN: " + Assasin1.getTitan()
  			 + "Velocidad :" + Assasin2.getVelocidad() );
	   	}
	   	
	   	public void popUpEstado() {
	   		JOptionPane.showMessageDialog(null,
	   				"EQUIPO1///////// \n" +
	   				"LEGION 1, Salud: 		" + legion1.getSalud() + "		Escudos:		 " +  
	   				(legion1.getEscudos()) + legion1.getEscudoExtra() + "			Piloto		\n" +
	   				"UNIDAD NUMERO: " + BattleRifle1.getBando() +
		   			 " Salud: "	 + BattleRifle1.getSalud() + "Arma:" +BattleRifle1.getArma() + "TITAN: " + BattleRifle1.getTitan()
		   			 + "Velocidad :" + BattleRifle1.getVelocidad() + "\n" +
		   			"UNIDAD NUMERO " + Assasin1.getNumUnidad() + "Assasin: " + Assasin1.getBando()+ "Salud :" + Assasin1.getSalud() 
			   		+ "ARMA: " + Assasin1.getArma() +  "TITAN: " + Assasin1.getTitan()
		  			 + "Velocidad :" + Assasin1.getVelocidad() + "\n" +
			   		"EQUIPO2///////// \n" +
		  			"LEGION 2, Salud: 		" + legion2.getSalud() + "		Escudos:		 " +  
	   				(legion2.getEscudos()) + legion2.getEscudoExtra() + "			Piloto		\n" +
	   				"UNIDAD NUMERO: " + BattleRifle1.getBando() +
		   			 " Salud: "	 + BattleRifle2.getSalud() + "Arma:" +BattleRifle2.getArma() + "TITAN: " + BattleRifle2.getTitan()
		   			 + "Velocidad :" + BattleRifle2.getVelocidad() + "\n" +
		   			"UNIDAD NUMERO " + Assasin2.getNumUnidad() + "Assasin: " + Assasin2.getBando()+ "Salud :" + Assasin2.getSalud() 
			   		+ "ARMA: " + Assasin1.getArma() +  "TITAN: " + Assasin1.getTitan()
		  			 + "Velocidad :" + Assasin2.getVelocidad());
	   	}
	   	
	   	public void BOTONES () {
	   		
	   		JFrame f=new JFrame("TITANFALL 2");//creating instance of JFrame  
	   		 


	   		JTextField blancoEquipo1 = new JTextField("Blanco Equipo Enemigo ");
	   			blancoEquipo1.setBounds(200, 10, 200, 40);

	   		JTextField blancoEquipo2 = new JTextField("Blanco Equipo Enemigo ");
	   			blancoEquipo2.setBounds(200, 490, 200, 40);	
	   			
	   			
	   		//BOTONES LEGION1
	   		JButton aparecerLegion1=new JButton("APARECER");//creating instance of JButton  
	   			aparecerLegion1.setBounds(200,60,100, 40);//x axis, y axis, width, height  
	   			aparecerLegion1.addActionListener(new ActionListener() {
	   				
	   				@Override
	   				public void actionPerformed(ActionEvent e) {
	   					// TODO Auto-generated method stub
	   					System.out.println("APARECER LEGION1 " + blancoEquipo1.getText());
	   								
	   							printAfterBattle();
	   							popUpEstado();
	   					
	   							}
	   					}
	   			);
	   		JButton caminarLegion1=new JButton("CAMINAR");//creating instance of JButton  
	   			caminarLegion1.setBounds(300,60,100, 40);//x axis, y axis, width, height
	   			caminarLegion1.addActionListener(new ActionListener() {
	   				
	   				@Override
	   				public void actionPerformed(ActionEvent e) {
	   					// TODO Auto-generated method stub
	   					System.out.println("CAMINAR LEGION1");
	   					popUpEstado();
	   				}
	   			});
	   		JButton correrLegion1=new JButton("CORRER");//creating instance of JButton  
	   			correrLegion1.setBounds(400,60,100, 40);//x axis, y axis, width, height
	   			correrLegion1.addActionListener(new ActionListener() {
	   				
	   				@Override
	   				public void actionPerformed(ActionEvent e) {
	   					// TODO Auto-generated method stub
	   					System.out.println("CORRER LEGION1");
	   					popUpEstado();

	   				}
	   			});
	   		JButton tomarArmaLegion1=new JButton("TOMAR ARMA");//creating instance of JButton  
	   			tomarArmaLegion1.setBounds(500,60,150, 40);//x axis, y axis, width, height  
	   			tomarArmaLegion1.addActionListener(new ActionListener() {
	   				
	   				@Override
	   				public void actionPerformed(ActionEvent e) {
	   					// TODO Auto-generated method stub
	   					System.out.println("TomarArmaLegion1");
	   					popUpEstado();

	   				}
	   			});
	   		JButton destruirseLegion1=new JButton("DESTRUIRSE");//creating instance of JButton  
	   			destruirseLegion1.setBounds(650,60,150, 40);//x axis, y axis, width, height  
	   			destruirseLegion1.addActionListener(new ActionListener() {
	   				
	   				@Override
	   				public void actionPerformed(ActionEvent e) {
	   					// TODO Auto-generated method stub
	   					System.out.println("DestruirseLegion1 \n" + legion1.getSalud());
	   					legion1.setSalud(0);
	   					popUpEstado();

	   				}
	   			});
	   		JButton autodestruirseLegion1=new JButton("AUTODESTRUIRSE");//creating instance of JButton  
	   			autodestruirseLegion1.setBounds(800,60,150, 40);//x axis, y axis, width, height  
	   			autodestruirseLegion1.addActionListener(new ActionListener() {
	   				
	   				@Override
	   				public void actionPerformed(ActionEvent e) {
	   					// TODO Auto-generated method stub
	   					System.out.println("autodestruirseLegion1");
	   					popUpEstado();

	   				}
	   			});

	   			////////*******************************************LEGION2
	   			
	   		JButton aparecerLegion2=new JButton("APARECER");//creating instance of JButton  
	   			aparecerLegion2.setBounds(200,540,100, 40);//x axis, y axis, width, height  
	   			aparecerLegion2.addActionListener(new ActionListener() {
	   				
	   				@Override
	   				public void actionPerformed(ActionEvent e) {
	   					// TODO Auto-generated method stub
	   					System.out.println("APARECER LEGION2");
	   					popUpEstado();

	   					
	   							}
	   					}
	   			);
	   		JButton caminarLegion2=new JButton("CAMINAR");//creating instance of JButton  
	   			caminarLegion2.setBounds(300,540,100, 40);//x axis, y axis, width, height
	   			caminarLegion2.addActionListener(new ActionListener() {
	   				
	   				@Override
	   				public void actionPerformed(ActionEvent e) {
	   					// TODO Auto-generated method stub
	   					System.out.println("CAMINAR LEGION2");
	   					popUpEstado();

	   				}
	   			});
	   		JButton correrLegion2=new JButton("CORRER");//creating instance of JButton  
	   			correrLegion2.setBounds(400,540,100, 40);//x axis, y axis, width, height
	   			correrLegion2.addActionListener(new ActionListener() {
	   				
	   				@Override
	   				public void actionPerformed(ActionEvent e) {
	   					// TODO Auto-generated method stub
	   					System.out.println("CORRER LEGION2");
	   					popUpEstado();

	   				}
	   			});
	   		JButton tomarArmaLegion2=new JButton("TOMAR ARMA");//creating instance of JButton  
	   			tomarArmaLegion2.setBounds(500,540,150, 40);//x axis, y axis, width, height  
	   			tomarArmaLegion2.addActionListener(new ActionListener() {
	   				
	   				@Override
	   				public void actionPerformed(ActionEvent e) {
	   					// TODO Auto-generated method stub
	   					System.out.println("TomarArmaLegion2");
	   					popUpEstado();

	   				}
	   			});
	   		JButton destruirseLegion2=new JButton("DESTRUIRSE");//creating instance of JButton  
	   			destruirseLegion2.setBounds(650,540,150, 40);//x axis, y axis, width, height  
	   			destruirseLegion2.addActionListener(new ActionListener() {
	   				
	   				@Override
	   				public void actionPerformed(ActionEvent e) {
	   					// TODO Auto-generated method stub
	   					System.out.println("DestruirseLegion2");
	   					popUpEstado();

	   				}
	   			});
	   		JButton autodestruirseLegion2=new JButton("AUTODESTRUIRSE");//creating instance of JButton  
	   			autodestruirseLegion2.setBounds(800,540,150, 40);//x axis, y axis, width, height  
	   			autodestruirseLegion2.addActionListener(new ActionListener() {
	   				
	   				@Override
	   				public void actionPerformed(ActionEvent e) {
	   					// TODO Auto-generated method stub
	   					System.out.println("autodestruirseLegion2");
	   					popUpEstado();

	   				}
	   			});
	   			

	   		////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	   			
	   		JLabel pilotoAssasin1 = new  JLabel ("Piloto Assasin");
	   			pilotoAssasin1.setBounds(10,100,200,150);
	   			
	   			
	   			
	   		JButton teleportAssasin1 = new JButton("TELEPORT");
	   			teleportAssasin1.setBounds(200,150,100, 40);
	   			teleportAssasin1.addActionListener(new ActionListener() {
	   				
	   				@Override
	   				public void actionPerformed(ActionEvent e) {
	   					// TODO Auto-generated method stub
	   					System.out.println("TELEPORT1");
	   					popUpEstado();

	   				}
	   			});
	   			
	   			
	   		JButton volarAssasin1 = new JButton ("VOLAR");
	   			volarAssasin1.setBounds(300, 150, 100, 40);
	   			volarAssasin1.addActionListener(new ActionListener() {
	   				
	   				@Override
	   				public void actionPerformed(ActionEvent e) {
	   					// TODO Auto-generated method stub
	   					System.out.println("VOLAR1");
	   					popUpEstado();

	   				}
	   			});
	   			
	   		JButton pisotonAssasin1 = new JButton("PISOTON");
	   			pisotonAssasin1.setBounds(400,150,100, 40);
	   			pisotonAssasin1.addActionListener(new ActionListener() {
	   				
	   				@Override
	   				public void actionPerformed(ActionEvent e) {
	   					// TODO Auto-generated method stub
	   					System.out.println("PISOTON1");
	   					popUpEstado();

	   				}
	   			});

	   		JButton apagarCoheteAssasin1 = new JButton("APAGAR COHETE");
	   			apagarCoheteAssasin1.setBounds(500,150,150, 40);
	   			apagarCoheteAssasin1.addActionListener(new ActionListener() {
	   				
	   				@Override
	   				public void actionPerformed(ActionEvent e) {
	   					// TODO Auto-generated method stub
	   					System.out.println("apagarCoheteAssasin1");
	   					popUpEstado();

	   				}
	   			});

	   		JButton apunalarAssasin1 = new JButton("Apunalar");
	   			apunalarAssasin1.setBounds(650,150,150, 40);
	   			apunalarAssasin1.addActionListener(new ActionListener() {
	   				
	   				@Override
	   				public void actionPerformed(ActionEvent e) {
	   					// TODO Auto-generated method stub
	   					System.out.println("apunalarAssasin1");
	   					popUpEstado();

	   				}
	   			});
	   			

	   		JLabel labelPilotoAssasin1 = new JLabel();
	   			labelPilotoAssasin1.setBounds(10,150,1000,150);
	   			labelPilotoAssasin1.setText( "ASSASIN, NUMERO DE UNIDAD: 		" + Assasin1.getNumUnidad());
	   			
	   		//////////////////////////////////////////////////////////////////////////
	   			
	   		JLabel pilotoAssasin2 = new  JLabel ("Piloto Assasin");
	   			pilotoAssasin2.setBounds(10,650,100,40);
	   			
	   			
	   		JButton teleportAssasin2 = new JButton("TELEPORT");
	   			teleportAssasin2.setBounds(200,650,100, 40);
	   			teleportAssasin2.addActionListener(new ActionListener() {
	   				
	   				@Override
	   				public void actionPerformed(ActionEvent e) {
	   					// TODO Auto-generated method stub
	   					System.out.println("TeleportAssasin2");
	   					popUpEstado();

	   				}
	   			});
	   			
	   		JButton volarAssasin2 = new JButton ("VOLAR");
	   			volarAssasin2.setBounds(300, 650, 100, 40);
	   			volarAssasin2.addActionListener(new ActionListener() {
	   				
	   				@Override
	   				public void actionPerformed(ActionEvent e) {
	   					// TODO Auto-generated method stub
	   					System.out.println("VOLAR ASSASIN2");
	   					popUpEstado();

	   				}
	   			});
	   			
	   		JButton pisotonAssasin2 = new JButton("PISOTON");
	   			pisotonAssasin2.setBounds(400,650,100, 40);
	   			pisotonAssasin2.addActionListener(new ActionListener() {
	   				
	   				@Override
	   				public void actionPerformed(ActionEvent e) {
	   					// TODO Auto-generated method stub
	   					System.out.println("PISOTON A2");
	   					popUpEstado();

	   				}
	   			});

	   		JButton apagarCoheteAssasin2 = new JButton("APAGAR COHETE");
	   			apagarCoheteAssasin2.setBounds(500,650,150, 40);
	   			apagarCoheteAssasin2.addActionListener(new ActionListener() {
	   				
	   				@Override
	   				public void actionPerformed(ActionEvent e) {
	   					// TODO Auto-generated method stub
	   					System.out.println("CoheteA2");
	   					popUpEstado();

	   				}
	   			});

	   		JButton apunalarAssasin2 = new JButton("Apunalar");
	   			apunalarAssasin2.setBounds(650,650,150, 40);
	   			apunalarAssasin2.addActionListener(new ActionListener() {
	   				
	   				@Override
	   				public void actionPerformed(ActionEvent e) {
	   					// TODO Auto-generated method stub
	   					System.out.println("ApunlarA2");
	   					popUpEstado();

	   				}
	   			});

	   			
	   		JLabel labelPilotoAssasin2 = new JLabel();
	   			labelPilotoAssasin2.setBounds(10, 700, 1000, 40);
	   			labelPilotoAssasin2.setText( "ASSASIN, NUMERO DE UNIDAD: 		" + Assasin2.getNumUnidad());
	   			
	   		///////////////////////////////////////////////////////////////////////////
	   			
	   		JLabel pilotoBattleRifle1 = new  JLabel ("Piloto Battle Rifle");
	   			pilotoBattleRifle1.setBounds(10,300,100,40);
	   			
	   			
	   		JButton batleRifleParkour1 = new JButton("PARKOUR");
	   			batleRifleParkour1.setBounds(200,300,100, 40);
	   			batleRifleParkour1.addActionListener(new ActionListener() {
	   				
	   				@Override
	   				public void actionPerformed(ActionEvent e) {
	   					// TODO Auto-generated method stub
	   					System.out.println("BattleRifleParkour");
	   					popUpEstado();

	   				}
	   			});
	   			
	   		JButton battleRifleCorrer1 = new JButton ("CORRER");	
	   			battleRifleCorrer1.setBounds(300, 300, 100, 40);
	   			battleRifleCorrer1.addActionListener(new ActionListener() {
	   				
	   				@Override
	   				public void actionPerformed(ActionEvent e) {
	   					// TODO Auto-generated method stub
	   					System.out.println("BattleRifleCorrer1");
	   					popUpEstado();

	   				}
	   			});
	   			

	   		JButton battleRifleCubrirse1 = new JButton("CUBIRSE");
	   			battleRifleCubrirse1.setBounds(400,300,100, 40);
	   			battleRifleCubrirse1.addActionListener(new ActionListener() {
	   				
	   				@Override
	   				public void actionPerformed(ActionEvent e) {
	   					// TODO Auto-generated method stub
	   					System.out.println("BattleRifleCubrirse1");
	   					popUpEstado();

	   				}
	   			});
	   			
	   		JButton battleRifleTeleport1 = new JButton("TELEPORT");
	   			battleRifleTeleport1.setBounds(500,300,150, 40);
	   			battleRifleTeleport1.addActionListener(new ActionListener() {
	   				
	   				@Override
	   				public void actionPerformed(ActionEvent e) {
	   					// TODO Auto-generated method stub
	   					System.out.println("BattleRifleTeleport1");
	   					popUpEstado();

	   				}
	   			});

	   			
	   		JLabel labelBattleRifle11 = new JLabel();
	   			labelBattleRifle11.setBounds(10, 350, 1000, 40);
	   			labelBattleRifle11.setText( "BATTLE RIFLE, NUMERO DE UNIDAD: 		" + BattleRifle1.getNumUnidad() );
	   			
	   			
	   		///////////////////////////////////////////////////////////////////////////
	   			
	   		JLabel pilotoBattleRifle2 = new  JLabel ("Piloto Battle Rifle");
	   			pilotoBattleRifle2.setBounds(10,750,200,40);
	   			
	   		JButton batleRifleParkour2 = new JButton("PARKOUR");
	   			batleRifleParkour2.setBounds(200,750,100, 40);
	   			batleRifleParkour2.addActionListener(new ActionListener() {
	   				
	   				@Override
	   				public void actionPerformed(ActionEvent e) {
	   					// TODO Auto-generated method stub
	   					System.out.println("BattleRifleParkour2");
	   					popUpEstado();

	   				}
	   			});
	   			
	   		JButton battleRifleCorrer2 = new JButton ("CORRER");	
	   			battleRifleCorrer2.setBounds(300, 750, 100, 40);
	   			battleRifleCorrer2.addActionListener(new ActionListener() {
	   				
	   				@Override
	   				public void actionPerformed(ActionEvent e) {
	   					// TODO Auto-generated method stub
	   					System.out.println("BattleRifleCorrer2");
	   					popUpEstado();

	   				}
	   			});

	   		JButton battleRifleCubrirse2 = new JButton("CUBIRSE");
	   			battleRifleCubrirse2.setBounds(400,750,100, 40);
	   			battleRifleCubrirse2.addActionListener(new ActionListener() {
	   				
	   				@Override
	   				public void actionPerformed(ActionEvent e) {
	   					// TODO Auto-generated method stub
	   					System.out.println("BattleRifleCubrirse2");
	   					popUpEstado();

	   				}
	   			});
	   			
	   		JButton battleRifleTeleport2 = new JButton("TELEPORT");
	   			battleRifleTeleport2.setBounds(500,750,150, 40);
	   			battleRifleTeleport2.addActionListener(new ActionListener() {
	   				
	   				@Override
	   				public void actionPerformed(ActionEvent e) {
	   					// TODO Auto-generated method stub
	   					System.out.println("BattleRifleTeleport2");
	   					popUpEstado();

	   				}
	   			});
	   			
	   			
	   		JLabel labelBattleRifle12 = new JLabel();
	   			labelBattleRifle12.setBounds(10,  800, 1000, 40);
	   			labelBattleRifle12.setText( "BATTLE RIFLE, NUMERO DE UNIDAD: 		" + BattleRifle2.getNumUnidad());
	   			
	   			
	   		///////////////////////////////////////////////////////////////////////////


	   		JLabel team1Label =new JLabel("EQUIPO 1");
	   			team1Label.setBounds(10,10,200,40);

	   		JLabel team2Label =new JLabel("EQUIPO 2");
	   			team2Label.setBounds(10,490,200,40);

	   			
	   		JLabel LegionLabel = new JLabel("Legion " + legion1.bando + "\n");
	   			LegionLabel.setBounds(10,50,200,40);
	   		JLabel Legion1LabelEstatus = new JLabel();
	   			Legion1LabelEstatus.setBounds(10, 100, 1000, 40);
	   			Legion1LabelEstatus.setText("LEGION, NUMERO DE UNIDAD: 	"	+ legion1.getNumUnidad());
	   			
	   		JLabel LegionLabel2 = new JLabel("Legion " + legion2.bando);
	   			LegionLabel2.setBounds(10,540,200,40);
	   			
	   		JLabel Legion2LabelEstatus = new JLabel("LEGION, NUMERO DE UNIDAD: 	"	+ legion2.getNumUnidad());
	   			Legion2LabelEstatus.setBounds(10, 590, 1000, 40);

	   			
	   		//////////////////////////////////////////////////////////////
	   			
	   		f.add(team1Label);
	   		f.add(team2Label);

	   		f.add(aparecerLegion1);//adding button in JFrame 
	   		f.add(caminarLegion1);
	   		f.add(correrLegion1);
	   		f.add(tomarArmaLegion1);
	   		f.add(destruirseLegion1);
	   		f.add(autodestruirseLegion1);

	   		f.add(blancoEquipo1);
	   		f.add(blancoEquipo2);

	   		f.add(aparecerLegion2);//adding button in JFrame 
	   		f.add(caminarLegion2);
	   		f.add(correrLegion2);
	   		f.add(tomarArmaLegion2);
	   		f.add(destruirseLegion2);
	   		f.add(autodestruirseLegion2);

	   		f.add(LegionLabel);
	   		f.add(Legion1LabelEstatus);

	   		f.add(LegionLabel2);
	   		f.add(Legion2LabelEstatus);

	   		f.add(pilotoAssasin1);
	   		f.add(teleportAssasin1);
	   		f.add(volarAssasin1);
	   		f.add(pisotonAssasin1);
	   		f.add(apagarCoheteAssasin1);
	   		f.add(apunalarAssasin1);

	   		f.add(labelPilotoAssasin1);



	   		f.add(pilotoAssasin2);
	   		f.add(teleportAssasin2);
	   		f.add(volarAssasin2);
	   		f.add(pisotonAssasin2);
	   		f.add(apagarCoheteAssasin2);
	   		f.add(apunalarAssasin2);

	   		f.add(labelPilotoAssasin2);


	   		f.add(pilotoBattleRifle1);
	   		f.add(batleRifleParkour1);
	   		f.add(battleRifleCorrer1);
	   		f.add(battleRifleTeleport1);
	   		f.add(battleRifleCubrirse1);

	   		f.add(labelBattleRifle11);


	   		f.add(pilotoBattleRifle2);

	   		f.add(battleRifleCorrer2);
	   		f.add(batleRifleParkour2);
	   		f.add(battleRifleCubrirse2);
	   		f.add(battleRifleTeleport2);

	   		f.add(labelBattleRifle12);



	   		f.setSize(1920,1080);//400 width and 500 height  
	   		f.setLayout(null);//using no layout managers  
	   		f.setVisible(true);//making the frame visible  




	   			

	   		
	   	}
		
	
}
