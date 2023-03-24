/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author irina
 */
public class Matemáticas {
    /*
    que tenga como atributos dos números reales con los cuales se realizarán diferentes operaciones matemáticas. 
    La clase deber tener un constructor vacío, parametrizado y get y set.
    */
    private double num1;
    private double num2;
    
    //constructor vacio

    public Matemáticas() {
    }
    
    //constructor parametrizado

    public Matemáticas(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    //Metodos get y set

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
