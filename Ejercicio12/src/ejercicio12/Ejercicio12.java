/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

import Entidad.Persona;
import Servidor.ServidorPersona;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class Ejercicio12 {

    /*
    Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
- Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
- Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
- Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
- Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        
        ServidorPersona server = new ServidorPersona();
        
        Persona persona = server.crearPersona();
        
        System.out.println("--------------------------------------------------");
        System.out.println(" Su edad es: " + server.calcularEdad(persona));
        System.out.println("--------------------------------------------------");
        System.out.print("Ingrese la edad de otra persona: ");
        int edadPersona2 = scaner.nextInt();
        System.out.println("Es usted menor a la edad que usted ingreso? " + server.menorQue(edadPersona2, persona));
        System.out.println("--------------------------------------------------");
        server.mostrarPersona(persona);
    }
    
}
