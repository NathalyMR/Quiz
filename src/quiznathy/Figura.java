package quiznathy;

import processing.core.PApplet;

public class Figura {
	
	private Main app;
	private int tam;
	private float x, y;
	private String forma;
	
	public Figura(Main app, float x,float y, int tam) {
		this.app = app;
		this.y = y;
		this.x=x;
		this.tam=tam;
		
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
		app.rectMode(app.CENTER);
		app.rect(x,y,tam,tam);
	
		//this.app.fill(color,80,80);
		
		/*switch (forma) {
		
				
		case "circulo":
			app.ellipse(x, y, tam, tam);
			
			break;
			
		case "cuadrado":
			app.rectMode(app.CENTER);
			app.rect(x,y,tam,tam);

			break;
		}*/
		//this.app.fill(this.app.color(0, 0, 80));
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	/*public int getColor() {
		return color;
	}
	
		
	public int getFigura() {
		return figura;
	}
	
	public void setFigura(int figura) {
		this.figura = figura;
	}
	
	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}*/
	
	}
