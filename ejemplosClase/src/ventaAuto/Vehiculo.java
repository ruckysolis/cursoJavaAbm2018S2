package ventaAuto;


public class Vehiculo {
// Variables de instancia
	String color;
	String marca;
	String modelo;
	final byte puertas;
	double kilometraje;
	private double precio;
	boolean electrico;
	static int ncoches; //TODO para Juan: remplazar por un array-list
	
	
	// Constructor
	public Vehiculo(String col, String marca, String modelo, int puertas,double km, double p,boolean elec) {
		this.color = col;
		this.marca = marca;
		this.electrico = elec;
		this.kilometraje = km;
		this.modelo = modelo;
		this.puertas = (byte) puertas;
		this.setPrecio(p);
		ncoches++;
		}
	
	// Metodo simple en el cual el auto 'se presenta' => imprime un texto en la consola
	public void presentate() {
		System.out.printf("Marca %s, Modelo: %s, Color: %s, Precio%s\n", this.marca,this.modelo,this.color,this.getPrecio());
		//TODO: Tengo que hacer algo
	}

	public static void contadorCoches() {
		System.out.printf("Hola, hay %s coches\n",ncoches);
	}

	// Metodo public para que otras clases puden tener el valor de precio, que definimos como private
	public double getPrecio() {
		return precio;
	}

	// Metodo para que otras clases puedan modificar el precio
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
