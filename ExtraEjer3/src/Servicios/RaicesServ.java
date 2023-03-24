/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class RaicesServ {
    Scanner scaner = new Scanner(System.in);
    
    /**
     * @param raiz
     * @return 
     * - Método getDiscriminante(): devuelve el valor del discriminante (double). El
        discriminante tiene la siguiente formula: (b^2)-4*a*c
     */
    
    public double getDiscriminante(Raices raiz){
        double discriminante = ((Math.pow(raiz.getB(), 2)) - (4*raiz.getA()*raiz.getC()));
        return discriminante;
    }
    
    /**
     * @param x
     * @return 
     * - Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
        que esto ocurra, el discriminante debe ser mayor o igual que 0.
     */
    
    public boolean tieneRaices(double x){
        boolean tieneRs;
        tieneRs = x > 0;
        return tieneRs;
    }
    
    /**
     * @param y
     * @return 
     * - Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
        que esto ocurra, el discriminante debe ser igual que 0.
     */
    
    public boolean tieneRaiz(double y){
        boolean tieneR;
        tieneR = y == 0;
        return tieneR;
    }
    
    /**
     * @param raiz3
     * - Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
        posibles soluciones.
     * @param z
     */
    
    public void obtenerRaices(Raices raiz3, double z){
        boolean result = tieneRaices(z);
        
        double sol1, sol2;
        //(-b±√((b^2)-(4*a*c)))/(2*a)
        if (result == true) {
            sol1 = (- raiz3.getB() + (Math.sqrt(z)))/(2*raiz3.getA());
            sol2 = (- raiz3.getB() - (Math.sqrt(z)))/(2*raiz3.getA());
            System.out.println("   * Solucion 1 = " + sol1);
            System.out.println("   * Solucion 2 = " + sol2);
        }
    }
    
    /**
     * @param raiz4
     * - Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
        Es en el caso en que se tenga una única solución posible.
     * @param z
     */
    
    public void obtenerRaiz(Raices raiz4, double z){
        boolean result = tieneRaiz(z);
        double solucion;
        //(-b/(2*a)
        if (result == true) {
            solucion = (- raiz4.getB()) / (2 * raiz4.getA());
            System.out.println("   * Solucion = " + solucion);
        }
    }
    
    /**
     * @return 
     * - Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
        pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
        obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
        de no existir solución, se mostrará un mensaje.
     */
    
    public Raices calcular(){
        
        
        Raices raiz5 = new Raices();
        
        
        System.out.println("--------------------------------------------------");
        System.out.println("          INGRESE LOS SIGUIENTES VALORES          ");
        System.out.println("--------------------------------------------------");
        System.out.print("   A = ");
        raiz5.setA(scaner.nextDouble());
        System.out.print("   B = ");
        raiz5.setB(scaner.nextDouble());
        System.out.print("   C = ");
        raiz5.setC(scaner.nextDouble());
        System.out.println("--------------------------------------------------");
        double dis = getDiscriminante(raiz5);
        boolean rs = tieneRaices(dis);
        
        boolean r = tieneRaiz(dis);
        
        if (rs == true) {
            System.out.println("          EXISTEN DOS POSIBLES SOLUCIONES         ");
            System.out.println("--------------------------------------------------");
            obtenerRaices(raiz5, dis);
        }else if (r == true) {
            System.out.println("            EXISTE UNA POSIBLE SOLUCION           ");
            System.out.println("--------------------------------------------------");
            obtenerRaiz(raiz5, dis);
        }else{
            System.out.println("NO EXISTE UNA SOLUCION PARA LOS NUMEROS INGRESADOS");
        }
        return raiz5;
    }
}
