import processing.core.PApplet;

public class MainApp extends PApplet{

	public static void main(String[] args) {
		MainApp.main("MainApp");
	}
	
	Logica app;
	
	public void settings(){
		size(800,700);
	}
	
	public void setup(){
		app = new Logica(this);
	}
	
	public void draw(){
		background(255);
		app.ejecutar();
	}
	

}
