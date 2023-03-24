/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import Entidad.Libro;
import Servicio.ServerLibro;

/**
 *
 * @author irina
 */
public class Ejercicio1 {

    /*
    Crear un método para cargar un libro pidiendo los datos al usuario y
    luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
    numero de páginas.
     */
    public static void main(String[] args) {
        //Primero instanciar el tipo servicio
        
        ServerLibro sl = new ServerLibro();
        
        //Crear libro
        Libro lib1 = sl.CrearLibro();
        
        //Mostrar libro
        sl.MostrarLibro(lib1);
        
        
        
    }
    
}
