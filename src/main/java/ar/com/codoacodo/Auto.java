package ar.com.codoacodo;

public class Auto {
	//	Atributos
	boolean encendido;
	float velocidad;
	String marca;
	String modelo;
	int anio;
	// constructores
	Auto(){
		//	constructor por defecto (explicito)
		encendido = false;
	}
	//	metodos
	void encender(){
		if(encendido == false) {
			encendido = true;
		}
	}
	void apagar(){
		
	}
	void acelerar(){
		
	}
	void frenar(){
		
	}
	void mostrarInfo() {
		System.out.println("Auto encendido = " + encendido);
	}
}
