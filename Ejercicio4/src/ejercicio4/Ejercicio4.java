/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import Entidad.Rectangulo;
import Servidor.ServRectangulo;

/**
 *
 * @author irina
 */
public class Ejercicio4 {

    /*
    Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
    base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
    con los datos del Rectángulo dados por el usuario. También incluirá un método para
    calcular la superficie del rectángulo y un método para calcular el perímetro del
    rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
    asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
    setters y constructores correspondientes.
    */
    public static void main(String[] args) {
        ServRectangulo servidor = new ServRectangulo();
        
        Rectangulo rect1 = servidor.crearRect();
        servidor.area(rect1);
        servidor.perimetro(rect1);
        servidor.dibujarRect(rect1);
        
    }
    
}
