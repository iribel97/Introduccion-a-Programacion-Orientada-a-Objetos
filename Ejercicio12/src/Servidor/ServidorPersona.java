package Servidor;

import Entidad.Persona;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class ServidorPersona {
    Scanner leer = new Scanner(System.in);
    /*
    - Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
    */
    
    public Persona crearPersona(){
        Persona person = new Persona();
        System.out.println("INGRESE LA SIGUIENTE INFORMACION");
        System.out.print("Nombre: ");
        person.setNombre(leer.nextLine());
        System.out.println("FECHA DE NACIMIENTO");
        System.out.print("Dia: ");
        int dia = leer.nextInt();
        System.out.print("Mes: ");
        int mes = leer.nextInt();
        System.out.print("Año: ");
        int year = leer.nextInt();
        
        LocalDate fechaN = LocalDate.of(year, mes, dia);
        
        person.setFechaNacimiento(fechaN);
        
        return person;
    }
    
    /*
    - Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
    */
    public long calcularEdad(Persona persona1){
        LocalDate fechaActual = LocalDate.now();

        long edadActual = ChronoUnit.YEARS.between(persona1.getFechaNacimiento(), fechaActual);
        
        return edadActual;
    }
    
    /*
    - Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
    */
    public boolean menorQue(int edad, Persona persona2){
        long edadUsuario = calcularEdad(persona2);
        boolean bandera;
        
        bandera = edad > edadUsuario;
        
        return bandera;
    }
    
    /*
    - Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
    */
    
    public void mostrarPersona(Persona persona3){
        System.out.println("--------------------------------------------------");
        System.out.println("Nombre: " + persona3.getNombre());
        System.out.println("Fecha de Nacimiento: " + persona3.getFechaNacimiento());
    }
}
