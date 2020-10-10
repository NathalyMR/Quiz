package quiznathy;

import java.util.ArrayList;




public class Logica {
	
private Main app;
	
private ArrayList<Figura> figuras;


	
	public Logica(Main app) {
		this.app = app;
		figuras = new ArrayList<Figura>();
		
		
		

		

		

	}
	
	public void pintar() {
		app.background(155);
		for (int i = figuras.size()-1; i >= 0; i--) { 
		     
		    Figura figura = figuras.get(i);
		    figura.pintar();
		}
		
		    
		
	}
	

		
	
	
	public void click() {
		figuras.add(new Figura(app,app.mouseX, app.mouseY, 50));
	}
	
	
}
