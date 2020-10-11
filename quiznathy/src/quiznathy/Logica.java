package quiznathy;

import java.util.ArrayList;




public class Logica {
	
private Main app;
	
private ArrayList<Figura> figuras;
private int [] posiciones=new int [4];


	
	public Logica(Main app) {
		this.app = app;
		figuras = new ArrayList<Figura>();
		posiciones[0]=100;
		posiciones[1]=200;
		posiciones[2]=300;
		posiciones[3]=400;
		
		
	

		

		

	}
	
	public void pintar() {
		app.background(155);
		for (int i = figuras.size()-1; i >= 0; i--) { 
		     
		    Figura figura = figuras.get(i);
		    figura.pintar();
		    figura.mover();
		}
		
		    
		
	}
	

		
	
	
	public void click() {
		figuras.add(new Figura(app,posiciones[(int)app.random(0,4)], 0, 50));
	}
	
	
}
