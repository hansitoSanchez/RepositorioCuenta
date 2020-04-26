package poo;

public class pruebas {

	public static void main(String[] args) {
		
		
		empleados empleado1 = new empleados("PAquito");
		empleados empleado2 = new empleados("ACUNDUN");

		
		empleado2.cambiaSeccion("contabilidad");
		empleado1.cambiarNombre("kokito");
		
		
		System.out.println(empleado1.devuelveSeccion());
		
		System.out.println(empleado2.devuelveSeccion());
		
	}

}


class empleados {
	
	private String nombre;
	private String seccion;
	
	
	
	public empleados (String nombre2) {
		nombre= nombre2;		
		seccion="administracion";
	}
	
	
	
	public void cambiaSeccion (String seccion3) {//SETTER
		seccion = seccion3;
	}
	
	
	
	public void cambiarNombre (String nombre) {//SETTER
		this.nombre= nombre;
	}
	
	
	
	public String devuelveSeccion () {//GETTER
		return  "el nombre es  : " +nombre +  " y la seccion es " + seccion;
	}
	
	
	
}