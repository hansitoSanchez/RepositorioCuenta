package poo;

public class coche {
	
	//encapsular una variable con la palabra private,  no es visible ni modificable
	private int ruedas;
	private int	largo;
	private int	ancho;
	private int	motor;
	private int pesoPlataforma;
	private String color;
 	private int pesoTotal;
	private boolean asientosCuero, climatizador;
	
	
	//metodo constructor
	public coche () {
		ruedas = 4;
		largo= 2000;
		ancho = 300;
		motor = 1600;
		pesoPlataforma =700;
		
	}
	//Getter deuvelve propiedades comúnes
	public String datosGenerales() {
		
		
		return "la plataforma del vehiculo tiene  " + ruedas + ". mide" + largo/1000 + " metros con un ancho " + ancho + " cm y un peso de platadordam de " +pesoPlataforma + "kl";

	}
	
	
	//Setter da el valor 	
	public void estableceColor (String tipoColor) {
		color = tipoColor;
	}
	
	
	
	//Getter devuelve el valor 
	public String devuelveColor () {
		return "el color del coche es " + color;
	}
	
	
	
	
	
	
	//SETTER 
	public void estableAsiento (String material) {
		
		if(material == "si")		
		this.asientosCuero = true;
		else {
			this.asientosCuero = false;
		}
	}
	
	
	//GETTER
	public String confirmaAsiento() {
		
		if(asientosCuero ==true) {
			return "es verdura el asiento es de cuero" ;
		}else {
		
			return "NOO!!! es verdura el asiento no es de cuero" ;
	}
	
	}
	
	
	
	
	//SETTER
	public void contenidoClimatizador (String confirmaClimatizador) {
		
		if (confirmaClimatizador == "si") {
			this.climatizador= true;
		}else {
			this.climatizador= true;
		}
	}	
	
	//GETTER
	public String devuelveContentClima () {
		
		if(climatizador== true) {
		return "enhorabuena champion el coche si tiene clima";
		}else {
		return "oe carajo el coche no tiene"; 
		}	
		
	}
	
	
	
}
