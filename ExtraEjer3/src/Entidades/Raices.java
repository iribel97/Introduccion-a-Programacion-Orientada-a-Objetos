/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author irina
 */
public class Raices {
    /*
    Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
    Hay que insertar estos 3 valores para construir el objeto a través de un método
    constructor.
    */
    private double a;
    private double b;
    private double c;
    
    //Constructor sin parametros
    public Raices() {
    }
    
    //Constructor con parametros
    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    //Metodos Getter y Setter
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
}
