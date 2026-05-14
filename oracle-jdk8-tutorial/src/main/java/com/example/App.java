package com.example;

public class App {

	public static void main(String[] args) {
		/**
		 * ¿como crear o instanciar ojetes objetos?
		 * 
		 * invocando o lllamando a un constructor de la clase del tipo de objeto que
		 * queremos crear
		 *
		 * a moso de ejemplo:
		 *
		 * queremeos crear un objeto del tipo persona, para lo cual vamos a llamar o
		 * invocar al constructor de la clase persona
		 *
		 * ¿que es un constructor?
		 *
		 * Es un metodo que tiene el mismo nombre que la clase. Por defecto, todas las
		 * clases tienen un constructor implicito, sin parametros, que te han otorgado
		 * gratuitamente y que lo pierdes en cuanto creas otro constructor
		 * 
		 * para crear o instanciar el objeto el constructor hay que prefijarlo con el
		 * operador new
		 * 
		 */

		/*
		 * En la sentencia que aparece a continuacion, la creacion o instanciacion del
		 * objeto Persona tiene lugar a traves de la sentencia new Persona(), es decir,
		 * a traves de la invocacion del constructor de la clase Persona. Y la variable
		 * persona1 NO ES EL OBJETO, es una referencia, que en algunos lenguajes de
		 * programacion como C++ se le llama un puntero, o apuntador, porque apunta a la
		 * direccion de memoria donde reside el objeto creado Y, tambien, a traves de la
		 * variable persona1 es que puedo acceder a los elementos que estan en la clase
		 * Persona, utilizando el operador punto (.)
		 * 
		 */

		Persona persona1 = new Persona();

		// para mostrar el nombre de la persona
		System.out.println("El nombre de la persona es: " + persona1.nombre);

		Persona persona2 = new Persona("Juan", "martinez", 1.50);

		System.out.println("el nombre de la persona es 2 es: " + persona2.nombre);

		
		
		
	/* Creando objetos estudiante*/	
		
		Estudiante estudiante1 = new Estudiante();
		
		//Mostrando el nombre de estudiante1
		
		System.out.println("El nombre del estudiante es: " +estudiante1.nombre);
		
		// Cambiando el nombre del estudiante
		estudiante1.nombre = "el bicho";
		
		System.out.println("Se ha cambiado el nombre del estudiante a : " + estudiante1.nombre);
		
		/*Para crear un objeto estudiante y en el mismo momento asignarle un nombre, por ejemplo, tiene que existir el constructor */

		
		//declarando una variable
		Estudiante estudiante2;
		
		// crear o instanciar el objeto implica invocar al constructor de la clase
		
		estudiante2 = new Estudiante("pepingo");
		
		System.out.println(estudiante2.nombre);
		
		// estudiante3
		
		Estudiante estudiante3;
		 estudiante3 = new Estudiante("mimi","casimiro", "yiyi", 3, Facultad.JUEGUITOS);
		
		
		
	// declara una variable de tipo double y asignarle el valor 3,14
		
		double xx = 3.14;
		
		String yyyy = "ñiñiñi";
		
		
	}
}