/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author irina
 */
public class Cafetera {
    /*
    Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
    (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
    cantidad actual de café que hay en la cafetera).
    */
    
    private int capacidadMax;
    private int cantidadAct;
    
    // Constructor predeterminado o vacío
       public Cafetera() {
    }
    
    //. Constructor con la capacidad máxima y la cantidad actual

    public Cafetera(int capacidadMax, int cantidadAct) {
        this.capacidadMax = capacidadMax;
        this.cantidadAct = cantidadAct;
    }
    
    //Métodos getters y setters.

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public int getCantidadAct() {
        return cantidadAct;
    }

    public void setCantidadAct(int cantidadAct) {
        this.cantidadAct = cantidadAct;
    }
    
 
    
}
