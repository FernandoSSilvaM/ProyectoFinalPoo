package mx.itesm.poo.proyectoFinal;

import javax.swing.*;  
import java.awt.event.*;

public class TTF2GUI implements ActionListener, WindowListener{  

	public static void main(String[] args) {  
		
	Legion legion1 = new Legion (1, "Equipo1");
	Legion legion2 = new Legion (2, "Equipo2");
	
    
	JOptionPane.showMessageDialog( null, "Bienvenido a \n TITANFALL 2:" );
    
    
    JOptionPane.showMessageDialog( null, "REGLA 1 \n Cada jugador tiene las mismas unidades con la misma salud"  );
    JOptionPane.showMessageDialog( null, "REGLA 2 \n Cada jugador elige un ataque por turno." );
    JOptionPane.showMessageDialog( null, "REGLA 3 \n Gana el ultimo superviviente." );
	
	


	
JFrame f=new JFrame("TITANFALL 2");//creating instance of JFrame  
 


JTextField blancoEquipo1 = new JTextField("Blanco Equipo Enemigo ");
	blancoEquipo1.setBounds(200, 10, 200, 40);

JTextField blancoEquipo2 = new JTextField("Blanco Equipo Enemigo ");
	blancoEquipo2.setBounds(200, 490, 200, 40);	
	
//BOTONES LEGION
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
JButton tomarArmaLegion2=new JButton("TOMAR ARMA");//creating instance of JButton  
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


f.setSize(1920,1080);//400 width and 500 height  
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible  


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