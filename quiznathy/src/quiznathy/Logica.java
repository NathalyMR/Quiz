package quiznathy;

import java.util.ArrayList;




public class Logica {
	
private Main app;
	
private ArrayList<Figura> figuras;
private int [] posiciones=new int [4];
private int [] formas=new int [2];




	
	public Logica(Main app) {
	    
		
		this.app = app;
		figuras = new ArrayList<Figura>();
		posiciones[0]=100;
		posiciones[1]=200;
		posiciones[2]=300;
		posiciones[3]=400;
		formas[0]=0;
		formas [1]=1;
		
		
	
	

		

		

	}
	
	public void pintar() {
		app.background(155);
		for (int i = figuras.size()-1; i >= 0; i--) { 
		     
		    Figura figura = figuras.get(i);
		    figura.pintar();
		    figura.mover();
		    figura.retorno();
		}
		
		    
		
	}
	

		
	
	
	public void click() {
		
	if(figuras.add(new Figura(app,posiciones[(int)app.random(0,4)], 0, 50, formas[(int)app.random(0,2)] ))){
		app.fill(app.random(0,255),app.random(0,255),app.random(0,255));
	}
}

	  }

