/* Estos caracteres, es decir, forward slash (/) seguido de asterisco (*) 
* y lo mismo pero a la inversa para el cierre del comentario, permite 
* escribir, documentar, el proyecto o el codigo que estemos desarrollando.
* 
* Lo que se escribe entre comentarios, el compilador de java no lo toma 
* en cuenta a la hora de compilar el resto de las sentencia de Java que
* aparecen en el proyecto */

//paquete principal
//wasaaaaaa
//;v
package com.example;

/* Una clase en java es una plantilla a partir de la cual se pueden
* crear o instanciar objetos.
* 
* Todo el codigo, es decir , las sentencias (ordenes) del lenguaje java 
* tienen que estar contenidas dentro de una clase 
*
* La plantilla es una estructura MUERTA hasta que se utiliza en el metodo
* main de la clase App
* 
* Lclase, ademas de ser una plantilla sirve como tipo de datos*/

public class Persona {
	
	// a continuacion vamos a especificar o definir lo que caracteriza
	// a una persona, que se le llama de cualquiera de las formas
	// siguientes:
	//1. campos (fields)
	//2. variables miembros de la clase (como en el lenguaje C++)
	//3. atributos
	//4. Variables
	
	/**
	 * Comentario en formato de javadoc. La importancia de escribir los
	 * comentarios en este formatoes es que existe una huerramienta que se le llama
	 * Javadoc, que colecta todos los comentarios que encuentre en este 
	 * formato y crea un documento.
	 */
	
	/**
	 * CONCEPTO DE VARIABLE:
	 * 
	 * Es un identificador, es decir un nombre que hace referencia 
	 * a una ubicacion, direccion, en la memoria RAM del equipo y
	 * en la cual se puede almacenar un valor de un tipo de dato
	 * concreto.
	 * 
	 * El identificador, es decir el nombre de la variable, No puede comenzar
	 * un numero y tampoco puede tener espacios en blanco.
	 * 
	 *  Lo correcto es que el nombre utilice, la notacion llamada camel case,
	 *  que implica que la primera letra sea en minusculas y a partir de ahi
	 *  letra mayuscula cuando haya una inflexion, un cambio.
	 */  
     /*la variable nombre, declara a continuacion, solamente va a permitir 
	 *que se alamacene en ella cadenas de caracteres, es decir, letras
	 *de la A a la Z mayusculas y minusculas, porque antes del nombre
	 *de la variable (nombre) hemos puesto el tipo de dato string
	 *que indica que la variable solamente puede almacenar valores
	 *encerrados enttre comillas dobles*/
	
	String nombre = "ELPEPE";
	String primerApellido = "siuuu";
	double estatura = 1.60; 
	int totalCOCHES = 2;

}
