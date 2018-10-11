package ventaAuto;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		
		// Generamos un nuevo Auto y lo guardamos en la variable 'bocho'
		Auto bocho = new Auto("Amarillo","VW","Bocho", 3, 999383.3,15000.0, false);
		
		
		bocho.presentate(); // Dejamos que se presente el bocho
		bocho.color = "rojo";	// Cambiamos el color al bocho
		bocho.presentate();		// Se vuele a presentar (con el nuevo color)
		
		System.out.printf("El precio de %s es %s\n",bocho.modelo,bocho.getPrecio()); // Aqui imprimos informacion del bocho
		bocho.setPrecio(20000); // Cambiamos el precio: aqui con el metodo, porque no tenemos acceso directo a 'precio'

		System.out.println("=================================");
		ArrayList<Auto> misCoches = new ArrayList<Auto>();	// Hacemos un array list para todos los coches
		
		misCoches.add(bocho);	// Agregamos el bocho
		misCoches.add(new Auto("Amarillo","Jeep","Wrangler",5,4550.3,55000,true)); // Generamos un nuevo coche y lo agregamos directamente al AL
		
		// Hacemos un loop para que cada coche se 'presente'
		for(Auto a:misCoches) {
			a.presentate();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}