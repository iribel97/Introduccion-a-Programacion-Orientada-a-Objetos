/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author irina
 */
public class Operaciones {
    private double num1;
    private double num2;
    
    //a) Método constructor con todos los atributos pasados por parámetro.
    public Operaciones() {
    }
    
    //b) Metodo constructor sin los atributos pasados por parámetro.
    public Operaciones(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    //c) Métodos get y set.

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
}
