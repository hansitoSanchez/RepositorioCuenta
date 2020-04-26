package poo;

public class usoCoche {

	public static void main(String[] args) {
		
		
		//instanciar una clase
		coche leon = new coche();
		coche renault = new coche();
		
		//hay que llamar a la función del SETTER porque ahi esta el valor de la variable color;
		leon.estableceColor("rosita");
		leon.estableAsiento("si");		
		leon.contenidoClimatizador("si");
		
		//System.out.println(leon.datosGenerales());
		//System.out.println( leon.devuelveColor());
		System.out.println( leon.confirmaAsiento());
		System.out.println( leon.devuelveContentClima());
		
		
	}

}
