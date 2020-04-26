package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class useEmpleado {

	public static void main(String[] args) {
	
		Empleado empleado1 = new Empleado("Cachito", 1100, 1989, 1, 14); 
		
		Empleado empleado2 = new Empleado("Pepito", 100, 1989, 1, 14); 
		
		Empleado empleado3 = new Empleado("kokito", 100, 1989, 1, 14); 
		
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
				
		
		
		Empleado[] misEmpleados = new Empleado[3];
		
		misEmpleados[0] = new Empleado("Hansito ", 85000, 1990, 12, 17);
		misEmpleados[1] = new Empleado("Pepe ", 5000, 1890, 02, 10);
		misEmpleados[2] = new Empleado("KOKITO ", 6000, 2890, 12, 10);
		
		
		
		/*for(int i=0; i<3; i++) {
			misEmpleados[i].subeSueldo(5);
		}*/
		
		
		//bucle for mejorado
		for (Empleado e: misEmpleados) {
			e.subeSueldo(5);
		}
		
		
		//for (int i=0; i<3; i++){
			//buble mejorado
			for (Empleado e: misEmpleados) {
			
			System.out.println("nombre: " + e.dnombre() +" sueldo: " +e.Dsueldo());
		}
		
	}

}


 class Empleado {


		private String nombre2;
		private double sueldofinal;
		private Date altaContrato;
		 	 
	 
	 
	 
	public Empleado(String nombre, double sueldo, int anio, int mes, int dia) {
	
		nombre2 = nombre;
		sueldofinal = sueldo;
		
		GregorianCalendar calendario = new GregorianCalendar (anio, mes-1, dia);		
		altaContrato = calendario.getTime(); 
	}
	
	
	
	
	
	public String dnombre() {//GETTER
		return nombre2;
	}
	
	public double Dsueldo() {//GETTER
		return sueldofinal;
	}	
	
	public Date fcontrato () {//GETTER
		return altaContrato;
	}
	
	
	
	public void subeSueldo ( double porcentaje) {//SETTER
		
		double aumento = sueldofinal*porcentaje/100;
		sueldofinal +=aumento;
	}
	
	
}

 
 
 
 