package ar.com.codoacodo;

public class Auto {
	//	Atributos
	boolean encendido;
	float velocidadActual;	//alt+shift+r renombrar en todos lados
	String marca;
	String modelo;
	int anio;
	float velocidadMaxima;
	// constructores
	Auto(){
		//	constructor por defecto (explicito)
		this.velocidadMaxima = 200;
	}
	Auto(float velocidadMaxima){
		this.velocidadMaxima = velocidadMaxima;
	}
	//	metodos
	void encender(){
		if(!this.encendido) {
			this.encendido = true;
			System.out.println("se ha encendido");
		}else {
			System.out.println("ya esta encendido");
		}
	}
	void apagar(){
		
	}
	void acelerar(){
		if(this.encendido) {
			if(this.velocidadActual < this.velocidadMaxima) {
				System.out.println("acelerando");
				this.velocidadActual++;
			}else {
				System.out.println("se quema el auto");
			}
		}else {
			System.out.println("debe encender el auto");
		}
	}
	void frenar(){
		if(this.encendido) {
			if(this.velocidadActual > 0) {
				this.velocidadActual--;
				System.out.println("frenando");
			}else {
				System.out.println("llegaste a cero");
			}
		}else {
			System.out.println("auto apagado");
		}
	}
	void mostrarInfo() {
		System.out.println("Auto encendido = " + this.encendido);
	}
}
