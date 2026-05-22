
/*
 *El alcance o ambito (scope) de los elementos de una clase, que tambien se les llama
* los miembros de una clase, que pueden tanto los campos, variables miembros, propiedades
* o atributos de la clase, como los metodos o funciones miembros de la clase, solamente 
* pueden existir en El Plano de las Clases o en El Plano de las InstanciasEl alcance o ambito (scope) de los elementos de una clase, que tambien se les llama
* los miembros de una clase, que pueden tanto los campos, variables miembros, propiedades
* o atributos de la clase, como los metodos o funciones miembros de la clase, solamente 
* pueden existir en El Plano de las Clases o en El Plano de las Instancias 
* 
* ¿Que quiere decir que un elemento vive en El Plano de las Instancias? 
* 
* Quiere decir que para el elemento exista tiene que ser a traves de un objeto o una 
* instancia de la clase que lo contiene ¿Que quiere decir que un elemento vive en El Plano de las Instancias? 
* 
* Quiere decir que para el elemento exista tiene que ser a traves de un objeto o una 
* instancia de la clase que lo contiene 
* 
*Que quiere decir que un elemento vive en El Plano de las Clases ?
* 
* Quiere decir, que no hace falta crear un objeto, o instancia, de la clase que lo contiene
* para que el elemento tenga vida
* 
* ¿Como distinguir un elemento (variable o metodo) para saber en cual plano existe?
* 
* Rta. Por el modificador static que llevaria delante si se trata de un elemento que 
* vive en El Plano de las Clases, y de lo contrario, es decir, si viviera en el plano de las
* instancias NO llevaria delante el modificador static */

package com.example;

public class App {

	// la variable siguiente es una de instancia, porque no lleva el modificador
	// static

	int variable1 = 5;

	// La siguiente variable es de clase porque lleva delante el modificador static

	static double salario = 3500.25;

	public static void main(String[] args) {

		// Imprimir el valos dela variable, o campo de la clase, variable1

		// Instancia u objeto de la clase contenedora de la variable variable1

		App app = new App();

		/*
		 * A la variable salario puedo acceder sin hacer nada en absoluto, porque es
		 * static y desde un metodo static, como es el metodo main puede acceder a la
		 * misma sin ningun codigo adicional
		 */

		System.out.println(salario);

		/*
		 * ¿Como acceder a una variable static que esta declarada en otra clase, como
		 * podria ser la clase Persona?
		 * 
		 * Utilizando el nombre de la clase como prefijo
		 * 
		 * Y para ejemplificar sopongamos que tenemos una variable, que es una
		 * constante, en la clase parsona, para que todas las personas creadas sean del
		 * mismo pais
		 */

		System.out.println("el pais de todas las personas es: " + Persona.PAIS);
		
		/* Que los enum son eminentemente estaticos, por este motivo, las constantes
		* de un tipo enum se prefijan con el nombre del enumerable */
		

		System.out.println(app.variable1);

		// El codigo anterior esta bien, pero es excesivo, porque declarar una variable
		// para solamente utilizarla una vez es una mala practica de programacion

		System.out.println(new App().variable1);
		
		
		/* Demostrando el modificador de accesprivate*/
		
		//System.out.println(persona1.primerApellido); 
		
		
		Persona persona2 = new Persona();
		
		persona2.getPrimerApellido();
		
		System.out.println(persona2.getPrimerApellido());
		
		 
		// Cambiar el valor de la variable primerApellido, que es privada

		persona2.setPrimerApellido("Machado");

		// Comprobando que el valor de la variable primerApellido ha sido cambiado
		System.out.println(persona2.getPrimerApellido());
		
		app.variable1 = 10;

	}

}