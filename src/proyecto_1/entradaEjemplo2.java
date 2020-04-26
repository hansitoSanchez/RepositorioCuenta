package proyecto_1;

import javax.swing.JOptionPane;

public class entradaEjemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String nombreUsuario = JOptionPane.showInputDialog("introduce tu nombre ");

		String edad = JOptionPane.showInputDialog("introduce tu edad ");

		System.out.println("tu nombre es " + nombreUsuario + " y tu edad es " + edad );
		
	}

}
