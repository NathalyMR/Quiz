package quiznathy;

import processing.core.PApplet;

public class Figura {
	
	private Main app;
	private int tam, forma;
	private float x, y;
	
	
	
	public Figura(Main app, float x,float y, int tam, int forma) {
		this.app = app;
		this.y = y;
		this.x=x;
		this.tam=tam;
		this.forma=forma;
		
		//tam = (int) this.app.random(5, 40);
		
		
		//this.color = (int) this.app.random(0, 360);
		
		
		//figura= (int) app.random(1,3);
		
		/*switch (figura) {
					
		case 1:
			forma="circulo";
			
			break;	

		case 2:
			forma="cuadrado";
			
			break;
	
		}
	}*/
	}
	
	public void pintar() {
		switch(forma){
		case 0:
		app.rectMode(app.CENTER);
		app.rect(x,y,tam,tam);
		break;
		
		case 1:
			app.ellipse(x,y,tam,tam);
		}
	
	}
	public void retorno() {
		if(y>app.height) {
	    	y=0;
	    }
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	
	public void mover() {
		if(app.mouseX>=x-tam/2 && app.mouseX<x+tam/2 && app.mouseY<=y+tam/2 && app.mouseY>=y-tam/2) {
				
			y+=0;
	}else {
		y++;
	}
	}
}
