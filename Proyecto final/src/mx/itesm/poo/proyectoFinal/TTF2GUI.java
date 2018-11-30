package mx.itesm.poo.proyectoFinal;

import javax.swing.*;  
import java.awt.event.*;

public class TTF2GUI implements ActionListener, WindowListener{  

	public static void main(String[] args) {  
		
		/*
		
	Legion legion1 = new Legion (1, "Equipo1");
	Legion legion2 = new Legion (2, "Equipo2");
	
	Assasin Assasin1 = new Assasin (3,3, "Equipo1");
	Assasin Assasin2 = new Assasin (3,4, "Equipo2");
	
	BattleRifle BattleRifle1 = new BattleRifle(2,5, "Equipo1");
	BattleRifle BattleRifle2 = new BattleRifle(2,6,"Equipo2");
	
	*/
	
	GUI GUI = new GUI();
	
	//	GUI.INTRODUCCION();   
	
		GUI.BOTONES();
    /*
	JOptionPane.showMessageDialog( null, "Bienvenido a \n TITANFALL 2:" );
    

    JOptionPane.showMessageDialog( null, "REGLA 1 \n Cada jugador tiene las mismas unidades con la misma salud"  );
    JOptionPane.showMessageDialog( null, "REGLA 2 \n Cada jugador elige un ataque por turno." );
    JOptionPane.showMessageDialog( null, "REGLA 3 \n Gana el ultimo superviviente." );
	*/
	
	/*
	


	
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
		}
	});
JButton correrLegion1=new JButton("CORRER");//creating instance of JButton  
	correrLegion1.setBounds(400,60,100, 40);//x axis, y axis, width, height
	correrLegion1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("CORRER LEGION1");
		}
	});
JButton tomarArmaLegion1=new JButton("TOMAR ARMA");//creating instance of JButton  
	tomarArmaLegion1.setBounds(500,60,150, 40);//x axis, y axis, width, height  
	tomarArmaLegion1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("TomarArmaLegion1");
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
		}
	});
JButton autodestruirseLegion1=new JButton("AUTODESTRUIRSE");//creating instance of JButton  
	autodestruirseLegion1.setBounds(800,60,150, 40);//x axis, y axis, width, height  
	autodestruirseLegion1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("autodestruirseLegion1");
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
		}
	});
JButton correrLegion2=new JButton("CORRER");//creating instance of JButton  
	correrLegion2.setBounds(400,540,100, 40);//x axis, y axis, width, height
	correrLegion2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("CORRER LEGION2");
		}
	});
JButton tomarArmaLe
gion2=new JButton("TOMAR ARMA");//creating instance of JButton  
	tomarArmaLegion2.setBounds(500,540,150, 40);//x axis, y axis, width, height  
	tomarArmaLegion2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("TomarArmaLegion2");
		}
	});
JButton destruirseLegion2=new JButton("DESTRUIRSE");//creating instance of JButton  
	destruirseLegion2.setBounds(650,540,150, 40);//x axis, y axis, width, height  
	destruirseLegion2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("DestruirseLegion2");
		}
	});
JButton autodestruirseLegion2=new JButton("AUTODESTRUIRSE");//creating instance of JButton  
	autodestruirseLegion2.setBounds(800,540,150, 40);//x axis, y axis, width, height  
	autodestruirseLegion2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("autodestruirseLegion2");
		}
	});
	

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
JLabel pilotoAssasin1 = new  JLabel ("Piloto Assasin");
	pilotoAssasin1.setBounds(10,100,200,150);
	
	
JButton teleportAssasin1 = new JButton("TELEPORT");
	teleportAssasin1.setBounds(200,150,100, 40);
	
JButton volarAssasin1 = new JButton ("VOLAR");
	volarAssasin1.setBounds(300, 150, 100, 40);
	
JButton pisotonAssasin1 = new JButton("PISOTON");
	pisotonAssasin1.setBounds(400,150,100, 40);

JButton apagarCoheteAssasin1 = new JButton("APAGAR COHETE");
	apagarCoheteAssasin1.setBounds(500,150,150, 40);

JButton apunalarAssasin1 = new JButton("Apunalar");
	apunalarAssasin1.setBounds(650,150,150, 40);
	

JLabel labelPilotoAssasin1 = new JLabel();
	labelPilotoAssasin1.setBounds(10,150,1000,150);
	labelPilotoAssasin1.setText( "Salud:			." + legion1.getSalud() + "		Escudos:		 ." +  
	(legion1.getEscudos()) + legion1.getEscudoExtra() + ".			Piloto		.");
	
//////////////////////////////////////////////////////////////////////////
	
JLabel pilotoAssasin2 = new  JLabel ("Piloto Assasin");
	pilotoAssasin2.setBounds(10,650,100,40);
	
	
JButton teleportAssasin2 = new JButton("TELEPORT");
	teleportAssasin2.setBounds(200,650,100, 40);
	
JButton volarAssasin2 = new JButton ("VOLAR");
	volarAssasin2.setBounds(300, 650, 100, 40);
	
JButton pisotonAssasin2 = new JButton("PISOTON");
	pisotonAssasin2.setBounds(400,650,100, 40);

JButton apagarCoheteAssasin2 = new JButton("APAGAR COHETE");
	apagarCoheteAssasin2.setBounds(500,650,150, 40);

JButton apunalarAssasin2 = new JButton("Apunalar");
	apunalarAssasin2.setBounds(650,650,150, 40);

	
JLabel labelPilotoAssasin2 = new JLabel();
	labelPilotoAssasin2.setBounds(10, 700, 1000, 40);
	labelPilotoAssasin2.setText( "Salud:			." + legion1.getSalud() + "		Escudos:		 ." +  
	(legion1.getEscudos()) + legion1.getEscudoExtra() + ".			Piloto		.");
	
///////////////////////////////////////////////////////////////////////////
	
JLabel pilotoBattleRifle1 = new  JLabel ("Piloto Battle Rifle");
	pilotoBattleRifle1.setBounds(10,300,100,40);
	
	
JButton batleRifleParkour1 = new JButton("PARKOUR");
	batleRifleParkour1.setBounds(200,300,100, 40);
	
JButton battleRifleCorrer1 = new JButton ("CORRER");	
	battleRifleCorrer1.setBounds(300, 300, 100, 40);

JButton battleRifleCubrirse1 = new JButton("CUBIRSE");
	battleRifleCubrirse1.setBounds(400,300,100, 40);
	
JButton battleRifleTeleport1 = new JButton("TELEPORT");
	battleRifleTeleport1.setBounds(500,300,150, 40);

	
JLabel labelBattleRifle11 = new JLabel();
	labelBattleRifle11.setBounds(10, 350, 1000, 40);
	labelBattleRifle11.setText( "Salud:			." + legion1.getSalud() + "		Escudos:		 ." +  
	(legion1.getEscudos()) + legion1.getEscudoExtra() + ".			Piloto		.");
	
	
///////////////////////////////////////////////////////////////////////////
	
JLabel pilotoBattleRifle2 = new  JLabel ("Piloto Battle Rifle");
	pilotoBattleRifle2.setBounds(10,750,200,40);
	
JButton batleRifleParkour2 = new JButton("PARKOUR");
	batleRifleParkour2.setBounds(200,750,100, 40);
	
JButton battleRifleCorrer2 = new JButton ("CORRER");	
	battleRifleCorrer2.setBounds(300, 750, 100, 40);

JButton battleRifleCubrirse2 = new JButton("CUBIRSE");
	battleRifleCubrirse2.setBounds(400,750,100, 40);
	
JButton battleRifleTeleport2 = new JButton("TELEPORT");
	battleRifleTeleport2.setBounds(500,750,150, 40);
	
	
JLabel labelBattleRifle12 = new JLabel();
	labelBattleRifle12.setBounds(10,  800, 1000, 40);
	labelBattleRifle12.setText( "Salud:			." + legion1.getSalud() + "		Escudos:		 ." +  
	(legion1.getEscudos()) + legion1.getEscudoExtra() + ".			Piloto		.");
	
	
///////////////////////////////////////////////////////////////////////////


JLabel team1Label =new JLabel("EQUIPO 1");
	team1Label.setBounds(10,10,200,40);

JLabel team2Label =new JLabel("EQUIPO 2");
	team2Label.setBounds(10,490,200,40);

	
JLabel LegionLabel = new JLabel("Legion " + legion1.bando + "\n");
	LegionLabel.setBounds(10,50,200,40);
JLabel Legion1LabelEstatus = new JLabel();
	Legion1LabelEstatus.setBounds(10, 100, 1000, 40);
	Legion1LabelEstatus.setText( "Salud:			." + legion1.getSalud() + "		Escudos:		 ." +  (legion1.getEscudos()) + legion1.getEscudoExtra() + ".			Piloto		.");
	
	
JLabel LegionLabel2 = new JLabel("Legion " + legion2.bando + "\n" + legion2.getSalud());
	LegionLabel2.setBounds(10,540,200,40);
JLabel Legion2LabelEstatus = new JLabel("Salud: 		" + legion2.getSalud() + "		Escudos:		 " +  (legion2.getEscudos()) + legion2.getEscudoExtra() + "			Piloto		") ;
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

Blanco Equipo Enemigo 

f.setSize(1920,1080);//400 width and 500 height  
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible  




	*/

	}

private static JLabel JLabel(String string) {
		// TODO Auto-generated method stub
		return null;
	}

@Override
public void windowActivated(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
	}

@Override
public void windowClosed(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
	}

@Override
public void windowClosing(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
	}

@Override
public void windowDeactivated(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
	}

@Override
public void windowDeiconified(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
	}

@Override
public void windowIconified(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
	}

@Override
public void windowOpened(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
	}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
	}  
}  	 