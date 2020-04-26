package proyecto_1;

public class manipulaCadenas {

	public static void main(String[] args) {
	
		String miNombre = "hansito";

	
		
		
		System.out.println("mi name is " + miNombre);

		System.out.println("mi name tiene " + miNombre.length());
		System.out.println("mi primera letra de mi name tiene " + miNombre.charAt(0));
	
	
	int ultimaLetra;
	ultimaLetra = miNombre.length();
	
	System.out.println("mi name is " + miNombre.charAt(ultimaLetra-1));
	
	
	
	String frase = "hoy es un estupendo dia para aprendrer a programar en java";
	
	
	
	//substring
	String fraseResumen = frase.substring(6,15);
	
	System.out.println("mi name is " + fraseResumen);

	
	}

}
