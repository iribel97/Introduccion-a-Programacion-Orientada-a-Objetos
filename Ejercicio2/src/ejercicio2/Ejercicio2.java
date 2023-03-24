/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import Entidad.Circunferencia;
import Servicio.ServCircunferencia;

/**
 *
 * @author irina
 */
public class Ejercicio2 {

    /*
    Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
    tipo real. A continuación, se deben crear los siguientes métodos:
        a) Método constructor que inicialice el radio pasado como parámetro.
        b) Métodos get y set para el atributo radio de la clase Circunferencia.
        c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
        d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
        e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
    */
    public static void main(String[] args) {
        
        //Instanciar servidor
        ServCircunferencia cirS = new ServCircunferencia();
        
        //crear circunferencia
        
        Circunferencia cir1 = cirS.CrearCircunferencia();
        
        //Mostrar Area y Perimetro
        
        cirS.Area(cir1);
        cirS.Perimetro(cir1);
    }
    
}
