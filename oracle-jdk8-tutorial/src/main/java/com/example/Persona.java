
package com.example;

public class Persona extends Object {

	/*
	 * Existen 4 modificadores de acceso, para los miembros de una clase
	 * (propiedades y los metodos)
	 * 
	 * 1- Privado del paquete (por defecto) (package private) (default) 2- Privado
	 * (private) 3- Publico (public) 4- Protegido (protected
	 * 
	 * Los modificadores de acceso se ubican a la izquierda del tipo de datos de las
	 * propiedades
	 */

	String nombre = "ELPEPE";

	/*
	 * al elemento que es privado solamente se puede acceder desde la misma clase,
	 * es decir, no se puede acceder a un elemento privado ni a través de una
	 * instancia u objeto de la propia clase
	 * 
	 * una clase bien diseñada es aquella que tiene todas sus propiedades privados
	 * 
	 * ¿Como acceder desde fuera de una clase a un elemento (propiedad o campo)
	 * 
	 * La repuesta a la anterior interrogante es: Mediante metodos publicos
	 * denominados getters (Para leer el valor de la propiedad o campo que es
	 * privado) and setters (Para modificar o asignarle valor a un campo o propiedad
	 * privada)
	 */

	private String primerApellido = "siuuu";

	/*
	 * a continuacion escribimos, manualmente, metodos getters and setters para la
	 * propiedad primerApellido
	 */

	// metodo publico getter

	//public String getPrimerApellido() {
		/*
		 * this es una palabra reservada que es una referencia al objeto actual, al
		 * objeto en curso
		 */
	//	return this.primerApellido;
	//}

	// metodo publico setter, que no devuelve nada (void)
	// y recibe como parametro el valor, o el dato, que queremos asignar a la
	// variable privada

	//public void setPrimerApellido(String primerApellido) {
		
	//	this.primerApellido = primerApellido;
	//}

	
	
	
	double estatura = 1.60;
	
	
	
	
	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	int totalCOCHES = 2;
	genero genero;

	// el modificador final impide que se pueda cambiar el valor de una variable,
	// por lo cual se convierte
	// una variabble a una constante

	static final String PAIS = "ESPAÑA";

	// Costructor sin parametros, que es el constructor por defecto, que se pierde
	// en el momento que creamos otro constructor, pero que se puede crear
	// cuando querramos

	public Persona(String nombre, String primerApellido, double estatura) {
		super();
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.estatura = estatura;

	}

	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

}
