/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extraejer2;

import Entidad.Puntos;
import Servicio.ServPuntos;

/**
 *
 * @author irina
 */
public class ExtraEjer2 {

    /*
    Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
    atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
    usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
    los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
    que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
    calcular la distancia entre dos puntos consulte el siguiente link:
    */
    public static void main(String[] args) {
        // TODO code application logic here
        ServPuntos server = new ServPuntos();
        
        Puntos points2 = server.crearPuntos();
        
        server.calcularDistancia(points2);
    }
    
}
